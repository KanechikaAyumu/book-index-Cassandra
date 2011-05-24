/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// ANTLR Grammar for the Cassandra Command Line Interface (CLI).

grammar Cli;

options {
    output=AST;
    ASTLabelType=CommonTree;
    backtrack=true;
}

//
// Nodes in the AST
//
tokens {
    //
    // Top-level nodes. These typically correspond to
    // various top-level CLI statements.
    //
    NODE_CONNECT;
    NODE_DESCRIBE_TABLE;
    NODE_DESCRIBE_CLUSTER;
    NODE_USE_TABLE;
    NODE_EXIT;
    NODE_HELP;
    NODE_NO_OP;
    NODE_SHOW_CLUSTER_NAME;
    NODE_SHOW_VERSION;
    NODE_SHOW_KEYSPACES;
    NODE_THRIFT_GET;
    NODE_THRIFT_GET_WITH_CONDITIONS;
    NODE_THRIFT_SET;
    NODE_THRIFT_COUNT;
    NODE_THRIFT_DEL;
    NODE_ADD_COLUMN_FAMILY;
    NODE_ADD_KEYSPACE;
    NODE_DEL_KEYSPACE;
    NODE_DEL_COLUMN_FAMILY;
    NODE_UPDATE_KEYSPACE;
    NODE_UPDATE_COLUMN_FAMILY;
    NODE_LIST;
    NODE_TRUNCATE;
    NODE_ASSUME;

    // Internal Nodes.
    NODE_COLUMN_ACCESS;
    NODE_ID_LIST;
    NODE_NEW_CF_ACCESS;
    NODE_NEW_KEYSPACE_ACCESS;
    
    CONVERT_TO_TYPE;
    FUNCTION_CALL;
    CONDITION;
    CONDITIONS;
    ARRAY;
    HASH;
    PAIR;

    NODE_LIMIT;
    NODE_KEY_RANGE;
}

@parser::header {
package org.apache.cassandra.cli;
}

@lexer::header {
package org.apache.cassandra.cli;
}

@lexer::members
{
    public void reportError(RecognitionException e) 
    {
        StringBuilder errorMessage = new StringBuilder("Syntax error at position " + e.charPositionInLine + ": ");

        if (e instanceof NoViableAltException)
        {
            int index = e.charPositionInLine;
            String error = this.input.substring(index, index);
            String statement = this.input.substring(0, this.input.size() - 1);

            errorMessage.append("unexpected \"" + error + "\" for `" + statement + "`.");
        }
        else
        {
            errorMessage.append(this.getErrorMessage(e, this.getTokenNames()));
        }

        throw new RuntimeException(errorMessage.toString());
    }
}

@parser::members
{
    public void reportError(RecognitionException e) 
    {
        String errorMessage;

        if (e instanceof NoViableAltException)
        {
            errorMessage = "Command not found: `" + this.input + "`. Type 'help' or '?' for help.";
        }
        else
        {
            errorMessage = "Syntax error at position " + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames());
        }

        throw new RuntimeException(errorMessage);
    }
}

//
// Parser Section
//

// the root node
root: statement SEMICOLON? EOF -> statement;

statement
    : connectStatement
    | exitStatement
    | countStatement
    | describeTable
    | describeCluster
    | addKeyspace
    | addColumnFamily
    | updateKeyspace
    | updateColumnFamily
    | delColumnFamily
    | delKeyspace
    | useKeyspace
    | delStatement
    | getStatement
    | helpStatement
    | setStatement
    | showStatement
    | listStatement
    | truncateStatement
    | assumeStatement
    | -> ^(NODE_NO_OP)
    ;

connectStatement
    : CONNECT host '/' port (username password)?
        -> ^(NODE_CONNECT host port (username password)?)
    | CONNECT ip_address '/' port (username password)?
        -> ^(NODE_CONNECT ip_address port (username password)?)
    ;

helpStatement
    : HELP HELP 
        -> ^(NODE_HELP NODE_HELP)
    | HELP CONNECT 
        -> ^(NODE_HELP NODE_CONNECT)
    | HELP USE 
        -> ^(NODE_HELP NODE_USE_TABLE)
    | HELP DESCRIBE KEYSPACE 
        -> ^(NODE_HELP NODE_DESCRIBE_TABLE)
    | HELP DESCRIBE 'CLUSTER'
        -> ^(NODE_HELP NODE_DESCRIBE_CLUSTER)
    | HELP EXIT 
        -> ^(NODE_HELP NODE_EXIT)
    | HELP QUIT 
        -> ^(NODE_HELP NODE_EXIT)
    | HELP SHOW 'CLUSTER NAME'
        -> ^(NODE_HELP NODE_SHOW_CLUSTER_NAME)
    | HELP SHOW KEYSPACES 
        -> ^(NODE_HELP NODE_SHOW_KEYSPACES)
    | HELP SHOW API_VERSION
        -> ^(NODE_HELP NODE_SHOW_VERSION)
    | HELP CREATE KEYSPACE 
        -> ^(NODE_HELP NODE_ADD_KEYSPACE)
    | HELP UPDATE KEYSPACE
        -> ^(NODE_HELP NODE_UPDATE_KEYSPACE)
    | HELP CREATE COLUMN FAMILY 
        -> ^(NODE_HELP NODE_ADD_COLUMN_FAMILY)
    | HELP UPDATE COLUMN FAMILY
        -> ^(NODE_HELP NODE_UPDATE_COLUMN_FAMILY)
    | HELP DROP KEYSPACE 
        -> ^(NODE_HELP NODE_DEL_KEYSPACE)
    | HELP DROP COLUMN FAMILY 
        -> ^(NODE_HELP NODE_DEL_COLUMN_FAMILY)
    | HELP GET 
        -> ^(NODE_HELP NODE_THRIFT_GET)
    | HELP SET 
        -> ^(NODE_HELP NODE_THRIFT_SET)
    | HELP DEL 
        -> ^(NODE_HELP NODE_THRIFT_DEL)
    | HELP COUNT 
        -> ^(NODE_HELP NODE_THRIFT_COUNT)
    | HELP LIST 
        -> ^(NODE_HELP NODE_LIST)
    | HELP TRUNCATE
        -> ^(NODE_HELP NODE_TRUNCATE)
    | HELP ASSUME
        -> ^(NODE_HELP NODE_ASSUME)
    | HELP 
        -> ^(NODE_HELP)
    | '?'    
        -> ^(NODE_HELP)
    ;

exitStatement
    : QUIT -> ^(NODE_EXIT)
    | EXIT -> ^(NODE_EXIT)
    ;

getStatement
    : GET columnFamilyExpr ('AS' typeIdentifier)?
        -> ^(NODE_THRIFT_GET columnFamilyExpr ( ^(CONVERT_TO_TYPE typeIdentifier) )? )
    | GET columnFamily 'WHERE' getCondition ('AND' getCondition)* ('LIMIT' limit=IntegerLiteral)*
        -> ^(NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^(CONDITIONS getCondition+) ^(NODE_LIMIT $limit)*) 
    ;

getCondition
    : columnOrSuperColumn operator value
        -> ^(CONDITION operator columnOrSuperColumn value)
    ;

operator
    : '=' | '>' | '<' | '>=' | '<='
    ;

typeIdentifier
    : Identifier | StringLiteral | IntegerLiteral 
    ;

setStatement
    : SET columnFamilyExpr '=' objectValue=value (WITH TTL '=' ttlValue=value)?
        -> ^(NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue )?)
    ;

countStatement
    : COUNT columnFamilyExpr 
        -> ^(NODE_THRIFT_COUNT columnFamilyExpr)
    ;

delStatement
    : DEL columnFamilyExpr 
        -> ^(NODE_THRIFT_DEL columnFamilyExpr)
    ;

showStatement
    : showClusterName
    | showVersion
    | showKeyspaces
    ;

listStatement
    : LIST columnFamily keyRangeExpr? ('LIMIT' limit=IntegerLiteral)?
        -> ^(NODE_LIST columnFamily keyRangeExpr? ^(NODE_LIMIT $limit)?)
    ;

truncateStatement
    : TRUNCATE columnFamily
        -> ^(NODE_TRUNCATE columnFamily)
    ;

assumeStatement
    : ASSUME columnFamily assumptionElement=Identifier 'AS' defaultType=Identifier
        -> ^(NODE_ASSUME columnFamily $assumptionElement $defaultType)
    ;

showClusterName
    : SHOW 'CLUSTER NAME'
        -> ^(NODE_SHOW_CLUSTER_NAME)
    ;

addKeyspace
    : CREATE KEYSPACE keyValuePairExpr 
        -> ^(NODE_ADD_KEYSPACE keyValuePairExpr)
    ;

addColumnFamily
    : CREATE COLUMN FAMILY keyValuePairExpr 
        -> ^(NODE_ADD_COLUMN_FAMILY keyValuePairExpr)
    ;

updateKeyspace
    : UPDATE KEYSPACE keyValuePairExpr
        -> ^(NODE_UPDATE_KEYSPACE keyValuePairExpr)
    ;

updateColumnFamily
    : UPDATE COLUMN FAMILY keyValuePairExpr
        -> ^(NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr)
    ;

delKeyspace
    : DROP KEYSPACE keyspace 
        -> ^(NODE_DEL_KEYSPACE keyspace)
    ;

delColumnFamily
    : DROP COLUMN FAMILY columnFamily 
        -> ^(NODE_DEL_COLUMN_FAMILY columnFamily)
    ;

showVersion
    : SHOW API_VERSION
        -> ^(NODE_SHOW_VERSION)
    ;

showKeyspaces
    : SHOW KEYSPACES 
        -> ^(NODE_SHOW_KEYSPACES)
    ;

describeTable
    : DESCRIBE KEYSPACE (keyspace)?
        -> ^(NODE_DESCRIBE_TABLE (keyspace)?)
    ;
    
describeCluster
    : DESCRIBE 'CLUSTER'
        -> ^(NODE_DESCRIBE_CLUSTER)
    ;

useKeyspace
    : USE keyspace ( username )? ( password )? 
        -> ^(NODE_USE_TABLE keyspace ( username )? ( password )?)
    ;


keyValuePairExpr
    : objectName ( (AND | WITH) keyValuePair )* 
        -> ^(NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* )
    ;
            
keyValuePair 
    : attr_name '=' attrValue 
    	-> attr_name attrValue
    ;

attrValue
    : arrayConstruct
    | attrValueString
    | attrValueInt
    | attrValueDouble
    ;


arrayConstruct 
    : '[' (hashConstruct ','?)+ ']'
        -> ^(ARRAY (hashConstruct)+)
    ; 

hashConstruct 
    : '{' hashElementPair (',' hashElementPair)* '}'
        -> ^(HASH (hashElementPair)+)
    ;

hashElementPair
    : rowKey ':' value
        -> ^(PAIR rowKey value)
    ;

columnFamilyExpr
    : columnFamily '[' rowKey ']' 
        ( '[' column=columnOrSuperColumn ']' 
            ('[' super_column=columnOrSuperColumn ']')? 
        )?
      -> ^(NODE_COLUMN_ACCESS columnFamily rowKey ($column ($super_column)? )?)
    ;

keyRangeExpr
    :    '[' ( startKey? ':' endKey? )? ']'
      -> ^(NODE_KEY_RANGE startKey? endKey?)
    ;

columnName
	: Identifier
	;

attr_name
	: Identifier
	;

attrValueString
	: (Identifier | StringLiteral)
	;
      
attrValueInt
	: IntegerLiteral
	;

attrValueDouble
	: DoubleLiteral
	;
  
objectName
	: Identifier
	;

keyspace
	: Identifier
	;

replica_placement_strategy
	: StringLiteral
	;

replication_factor
	: IntegerLiteral
	;

keyspaceNewName
	: Identifier
	;

comparator
	: StringLiteral
	;
      
command	: Identifier
	;

newColumnFamily
	: Identifier
	;

username: Identifier
	;

password: StringLiteral
	;

columnFamily
	: Identifier
	;

rowKey	
    :  (Identifier | StringLiteral | IntegerLiteral | functionCall)
	;

value	
    : (Identifier | IntegerLiteral | StringLiteral | functionCall)
	;

functionCall 
    : functionName=Identifier '(' functionArgument? ')'
        -> ^(FUNCTION_CALL $functionName functionArgument?)
    ;

functionArgument 
    : Identifier | StringLiteral | IntegerLiteral
    ;

startKey
    : (Identifier | StringLiteral)
	;

endKey	
    : (Identifier | StringLiteral)
	;

columnOrSuperColumn
	: (Identifier | IntegerLiteral | StringLiteral | functionCall)
	;

host	
    : host_name
        -> ^(NODE_ID_LIST host_name)
	;

host_name
	: Identifier ('.' Identifier)*
	;
	
ip_address
	: IP_ADDRESS 
	    -> ^(NODE_ID_LIST IP_ADDRESS)
	;


port	
    : IntegerLiteral
	;

//
// Lexer Section
//

//
// Keywords (in alphabetical order for convenience)
//
// CLI is case-insensitive with respect to these keywords.
// However, they MUST be listed in upper case here.
// 
CONFIG:      'CONFIG';
CONNECT:     'CONNECT';
COUNT:       'COUNT';
DEL:         'DEL';
DESCRIBE:    'DESCRIBE';
USE:         'USE';
GET:         'GET';
HELP:        'HELP';
EXIT:        'EXIT';
FILE:        'FILE';
QUIT:        'QUIT';
SET:         'SET';
SHOW:        'SHOW';
KEYSPACE:    'KEYSPACE';
KEYSPACES:   'KEYSPACES';
API_VERSION: 'API VERSION';
CREATE:      'CREATE';
DROP:        'DROP';
COLUMN:      'COLUMN';
FAMILY:      'FAMILY';
WITH:        'WITH';
AND:         'AND';
UPDATE:      'UPDATE';
LIST:        'LIST';
LIMIT:       'LIMIT';
TRUNCATE:    'TRUNCATE';
ASSUME:      'ASSUME';
TTL:         'TTL';

IP_ADDRESS 
    : IntegerLiteral '.' IntegerLiteral '.' IntegerLiteral '.' IntegerLiteral
    ;

// private syntactic rules
fragment
Letter
    : 'a'..'z' 
    | 'A'..'Z'
    ;

fragment
Digit
    : '0'..'9'
    ;

fragment
Alnum
    : Letter
    | Digit
    ;

// syntactic Elements
IntegerLiteral
   : Digit+
   ;
   
DoubleLiteral
   : Digit+ '.' Digit+;

Identifier
    : (Letter | Alnum) (Alnum | '_' | '-' )*
    ;

// literals
StringLiteral
    :
    '\'' (~'\'')* '\'' ( '\'' (~'\'')* '\'' )*
    ;

//
// syntactic elements
//

SEMICOLON
    : ';'
    ;

WS
    :  (' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}  // whitepace
    ;

COMMENT 
    : '--' (~('\n'|'\r'))*                     { $channel=HIDDEN; }
    | '/*' (options {greedy=false;} : .)* '*/' { $channel=HIDDEN; }
    ;
