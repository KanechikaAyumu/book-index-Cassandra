// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g 2011-04-27 16:34:50

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

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
public class CliParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NODE_CONNECT", "NODE_DESCRIBE_TABLE", "NODE_DESCRIBE_CLUSTER", "NODE_USE_TABLE", "NODE_EXIT", "NODE_HELP", "NODE_NO_OP", "NODE_SHOW_CLUSTER_NAME", "NODE_SHOW_VERSION", "NODE_SHOW_KEYSPACES", "NODE_THRIFT_GET", "NODE_THRIFT_GET_WITH_CONDITIONS", "NODE_THRIFT_SET", "NODE_THRIFT_COUNT", "NODE_THRIFT_DEL", "NODE_ADD_COLUMN_FAMILY", "NODE_ADD_KEYSPACE", "NODE_DEL_KEYSPACE", "NODE_DEL_COLUMN_FAMILY", "NODE_UPDATE_KEYSPACE", "NODE_UPDATE_COLUMN_FAMILY", "NODE_LIST", "NODE_TRUNCATE", "NODE_ASSUME", "NODE_COLUMN_ACCESS", "NODE_ID_LIST", "NODE_NEW_CF_ACCESS", "NODE_NEW_KEYSPACE_ACCESS", "CONVERT_TO_TYPE", "FUNCTION_CALL", "CONDITION", "CONDITIONS", "ARRAY", "HASH", "PAIR", "NODE_LIMIT", "NODE_KEY_RANGE", "SEMICOLON", "CONNECT", "HELP", "USE", "DESCRIBE", "KEYSPACE", "EXIT", "QUIT", "SHOW", "KEYSPACES", "API_VERSION", "CREATE", "UPDATE", "COLUMN", "FAMILY", "DROP", "GET", "SET", "DEL", "COUNT", "LIST", "TRUNCATE", "ASSUME", "IntegerLiteral", "Identifier", "StringLiteral", "WITH", "TTL", "AND", "DoubleLiteral", "IP_ADDRESS", "CONFIG", "FILE", "LIMIT", "Letter", "Digit", "Alnum", "WS", "COMMENT", "'/'", "'CLUSTER'", "'CLUSTER NAME'", "'?'", "'AS'", "'WHERE'", "'='", "'>'", "'<'", "'>='", "'<='", "'['", "','", "']'", "'{'", "'}'", "':'", "'('", "')'", "'.'"
    };
    public static final int NODE_THRIFT_GET_WITH_CONDITIONS=15;
    public static final int TTL=68;
    public static final int NODE_SHOW_KEYSPACES=13;
    public static final int CONDITION=34;
    public static final int COUNT=60;
    public static final int EOF=-1;
    public static final int Identifier=65;
    public static final int NODE_UPDATE_COLUMN_FAMILY=24;
    public static final int NODE_USE_TABLE=7;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int NODE_DEL_KEYSPACE=21;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int CREATE=52;
    public static final int NODE_CONNECT=4;
    public static final int T__90=90;
    public static final int CONNECT=42;
    public static final int FAMILY=55;
    public static final int GET=57;
    public static final int NODE_DESCRIBE_TABLE=5;
    public static final int COMMENT=79;
    public static final int SHOW=49;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int ARRAY=36;
    public static final int NODE_ADD_KEYSPACE=20;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int EXIT=47;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int NODE_THRIFT_DEL=18;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int SEMICOLON=41;
    public static final int KEYSPACES=50;
    public static final int T__85=85;
    public static final int CONDITIONS=35;
    public static final int FILE=73;
    public static final int T__84=84;
    public static final int NODE_LIMIT=39;
    public static final int LIST=61;
    public static final int T__87=87;
    public static final int NODE_DESCRIBE_CLUSTER=6;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int IP_ADDRESS=71;
    public static final int NODE_THRIFT_SET=16;
    public static final int NODE_NO_OP=10;
    public static final int NODE_ID_LIST=29;
    public static final int WS=78;
    public static final int ASSUME=63;
    public static final int NODE_THRIFT_COUNT=17;
    public static final int DESCRIBE=45;
    public static final int Alnum=77;
    public static final int NODE_SHOW_CLUSTER_NAME=11;
    public static final int USE=44;
    public static final int FUNCTION_CALL=33;
    public static final int Letter=75;
    public static final int DoubleLiteral=70;
    public static final int HELP=43;
    public static final int NODE_EXIT=8;
    public static final int LIMIT=74;
    public static final int DEL=59;
    public static final int NODE_LIST=25;
    public static final int UPDATE=53;
    public static final int NODE_UPDATE_KEYSPACE=23;
    public static final int NODE_NEW_CF_ACCESS=30;
    public static final int AND=69;
    public static final int QUIT=48;
    public static final int NODE_TRUNCATE=26;
    public static final int NODE_SHOW_VERSION=12;
    public static final int NODE_NEW_KEYSPACE_ACCESS=31;
    public static final int TRUNCATE=62;
    public static final int COLUMN=54;
    public static final int PAIR=38;
    public static final int WITH=67;
    public static final int HASH=37;
    public static final int SET=58;
    public static final int Digit=76;
    public static final int API_VERSION=51;
    public static final int NODE_ASSUME=27;
    public static final int CONVERT_TO_TYPE=32;
    public static final int NODE_THRIFT_GET=14;
    public static final int NODE_DEL_COLUMN_FAMILY=22;
    public static final int NODE_KEY_RANGE=40;
    public static final int KEYSPACE=46;
    public static final int StringLiteral=66;
    public static final int NODE_HELP=9;
    public static final int CONFIG=72;
    public static final int DROP=56;
    public static final int NODE_ADD_COLUMN_FAMILY=19;
    public static final int IntegerLiteral=64;
    public static final int NODE_COLUMN_ACCESS=28;

    // delegates
    // delegators


        public CliParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CliParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CliParser.tokenNames; }
    public String getGrammarFileName() { return "/home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g"; }


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


    public static class root_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:135:1: root : statement ( SEMICOLON )? EOF -> statement ;
    public final CliParser.root_return root() throws RecognitionException {
        CliParser.root_return retval = new CliParser.root_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMICOLON2=null;
        Token EOF3=null;
        CliParser.statement_return statement1 = null;


        CommonTree SEMICOLON2_tree=null;
        CommonTree EOF3_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:135:5: ( statement ( SEMICOLON )? EOF -> statement )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:135:7: statement ( SEMICOLON )? EOF
            {
            pushFollow(FOLLOW_statement_in_root386);
            statement1=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:135:17: ( SEMICOLON )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: SEMICOLON
                    {
                    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_root388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON2);


                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root391); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 135:32: -> statement
            {
                adaptor.addChild(root_0, stream_statement.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:137:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | showStatement | listStatement | truncateStatement | assumeStatement | -> ^( NODE_NO_OP ) );
    public final CliParser.statement_return statement() throws RecognitionException {
        CliParser.statement_return retval = new CliParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.connectStatement_return connectStatement4 = null;

        CliParser.exitStatement_return exitStatement5 = null;

        CliParser.countStatement_return countStatement6 = null;

        CliParser.describeTable_return describeTable7 = null;

        CliParser.describeCluster_return describeCluster8 = null;

        CliParser.addKeyspace_return addKeyspace9 = null;

        CliParser.addColumnFamily_return addColumnFamily10 = null;

        CliParser.updateKeyspace_return updateKeyspace11 = null;

        CliParser.updateColumnFamily_return updateColumnFamily12 = null;

        CliParser.delColumnFamily_return delColumnFamily13 = null;

        CliParser.delKeyspace_return delKeyspace14 = null;

        CliParser.useKeyspace_return useKeyspace15 = null;

        CliParser.delStatement_return delStatement16 = null;

        CliParser.getStatement_return getStatement17 = null;

        CliParser.helpStatement_return helpStatement18 = null;

        CliParser.setStatement_return setStatement19 = null;

        CliParser.showStatement_return showStatement20 = null;

        CliParser.listStatement_return listStatement21 = null;

        CliParser.truncateStatement_return truncateStatement22 = null;

        CliParser.assumeStatement_return assumeStatement23 = null;



        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:138:5: ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | showStatement | listStatement | truncateStatement | assumeStatement | -> ^( NODE_NO_OP ) )
            int alt2=21;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:138:7: connectStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_connectStatement_in_statement407);
                    connectStatement4=connectStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connectStatement4.getTree());

                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:139:7: exitStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exitStatement_in_statement415);
                    exitStatement5=exitStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exitStatement5.getTree());

                    }
                    break;
                case 3 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:140:7: countStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_countStatement_in_statement423);
                    countStatement6=countStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStatement6.getTree());

                    }
                    break;
                case 4 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:141:7: describeTable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeTable_in_statement431);
                    describeTable7=describeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeTable7.getTree());

                    }
                    break;
                case 5 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:142:7: describeCluster
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeCluster_in_statement439);
                    describeCluster8=describeCluster();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeCluster8.getTree());

                    }
                    break;
                case 6 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:143:7: addKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addKeyspace_in_statement447);
                    addKeyspace9=addKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addKeyspace9.getTree());

                    }
                    break;
                case 7 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:144:7: addColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addColumnFamily_in_statement455);
                    addColumnFamily10=addColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addColumnFamily10.getTree());

                    }
                    break;
                case 8 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:145:7: updateKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateKeyspace_in_statement463);
                    updateKeyspace11=updateKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateKeyspace11.getTree());

                    }
                    break;
                case 9 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:146:7: updateColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateColumnFamily_in_statement471);
                    updateColumnFamily12=updateColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateColumnFamily12.getTree());

                    }
                    break;
                case 10 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:147:7: delColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delColumnFamily_in_statement479);
                    delColumnFamily13=delColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delColumnFamily13.getTree());

                    }
                    break;
                case 11 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:148:7: delKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delKeyspace_in_statement487);
                    delKeyspace14=delKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delKeyspace14.getTree());

                    }
                    break;
                case 12 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:149:7: useKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_useKeyspace_in_statement495);
                    useKeyspace15=useKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, useKeyspace15.getTree());

                    }
                    break;
                case 13 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:150:7: delStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delStatement_in_statement503);
                    delStatement16=delStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delStatement16.getTree());

                    }
                    break;
                case 14 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:151:7: getStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_getStatement_in_statement511);
                    getStatement17=getStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, getStatement17.getTree());

                    }
                    break;
                case 15 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:152:7: helpStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_helpStatement_in_statement519);
                    helpStatement18=helpStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, helpStatement18.getTree());

                    }
                    break;
                case 16 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:153:7: setStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setStatement_in_statement527);
                    setStatement19=setStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setStatement19.getTree());

                    }
                    break;
                case 17 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:154:7: showStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showStatement_in_statement535);
                    showStatement20=showStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showStatement20.getTree());

                    }
                    break;
                case 18 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:155:7: listStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_listStatement_in_statement543);
                    listStatement21=listStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, listStatement21.getTree());

                    }
                    break;
                case 19 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:156:7: truncateStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_truncateStatement_in_statement551);
                    truncateStatement22=truncateStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, truncateStatement22.getTree());

                    }
                    break;
                case 20 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:157:7: assumeStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assumeStatement_in_statement559);
                    assumeStatement23=assumeStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assumeStatement23.getTree());

                    }
                    break;
                case 21 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:158:7: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 158:7: -> ^( NODE_NO_OP )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:158:10: ^( NODE_NO_OP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NO_OP, "NODE_NO_OP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class connectStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "connectStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:161:1: connectStatement : ( CONNECT host '/' port ( username password )? -> ^( NODE_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( NODE_CONNECT ip_address port ( username password )? ) );
    public final CliParser.connectStatement_return connectStatement() throws RecognitionException {
        CliParser.connectStatement_return retval = new CliParser.connectStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONNECT24=null;
        Token char_literal26=null;
        Token CONNECT30=null;
        Token char_literal32=null;
        CliParser.host_return host25 = null;

        CliParser.port_return port27 = null;

        CliParser.username_return username28 = null;

        CliParser.password_return password29 = null;

        CliParser.ip_address_return ip_address31 = null;

        CliParser.port_return port33 = null;

        CliParser.username_return username34 = null;

        CliParser.password_return password35 = null;


        CommonTree CONNECT24_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree CONNECT30_tree=null;
        CommonTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_port=new RewriteRuleSubtreeStream(adaptor,"rule port");
        RewriteRuleSubtreeStream stream_ip_address=new RewriteRuleSubtreeStream(adaptor,"rule ip_address");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_host=new RewriteRuleSubtreeStream(adaptor,"rule host");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:162:5: ( CONNECT host '/' port ( username password )? -> ^( NODE_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( NODE_CONNECT ip_address port ( username password )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CONNECT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==IP_ADDRESS) ) {
                    alt5=2;
                }
                else if ( (LA5_1==Identifier) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:162:7: CONNECT host '/' port ( username password )?
                    {
                    CONNECT24=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT24);

                    pushFollow(FOLLOW_host_in_connectStatement590);
                    host25=host();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_host.add(host25.getTree());
                    char_literal26=(Token)match(input,80,FOLLOW_80_in_connectStatement592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(char_literal26);

                    pushFollow(FOLLOW_port_in_connectStatement594);
                    port27=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port27.getTree());
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:162:29: ( username password )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==Identifier) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:162:30: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement597);
                            username28=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username28.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement599);
                            password29=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password29.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: password, host, port, username
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 163:9: -> ^( NODE_CONNECT host port ( username password )? )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:163:12: ^( NODE_CONNECT host port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_host.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:163:37: ( username password )?
                        if ( stream_password.hasNext()||stream_username.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_password.reset();
                        stream_username.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:164:7: CONNECT ip_address '/' port ( username password )?
                    {
                    CONNECT30=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT30);

                    pushFollow(FOLLOW_ip_address_in_connectStatement636);
                    ip_address31=ip_address();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ip_address.add(ip_address31.getTree());
                    char_literal32=(Token)match(input,80,FOLLOW_80_in_connectStatement638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(char_literal32);

                    pushFollow(FOLLOW_port_in_connectStatement640);
                    port33=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port33.getTree());
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:164:35: ( username password )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Identifier) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:164:36: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement643);
                            username34=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username34.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement645);
                            password35=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password35.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: port, password, ip_address, username
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 165:9: -> ^( NODE_CONNECT ip_address port ( username password )? )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:165:12: ^( NODE_CONNECT ip_address port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_ip_address.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:165:43: ( username password )?
                        if ( stream_password.hasNext()||stream_username.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_password.reset();
                        stream_username.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "connectStatement"

    public static class helpStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "helpStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:168:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );
    public final CliParser.helpStatement_return helpStatement() throws RecognitionException {
        CliParser.helpStatement_return retval = new CliParser.helpStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HELP36=null;
        Token HELP37=null;
        Token HELP38=null;
        Token CONNECT39=null;
        Token HELP40=null;
        Token USE41=null;
        Token HELP42=null;
        Token DESCRIBE43=null;
        Token KEYSPACE44=null;
        Token HELP45=null;
        Token DESCRIBE46=null;
        Token string_literal47=null;
        Token HELP48=null;
        Token EXIT49=null;
        Token HELP50=null;
        Token QUIT51=null;
        Token HELP52=null;
        Token SHOW53=null;
        Token string_literal54=null;
        Token HELP55=null;
        Token SHOW56=null;
        Token KEYSPACES57=null;
        Token HELP58=null;
        Token SHOW59=null;
        Token API_VERSION60=null;
        Token HELP61=null;
        Token CREATE62=null;
        Token KEYSPACE63=null;
        Token HELP64=null;
        Token UPDATE65=null;
        Token KEYSPACE66=null;
        Token HELP67=null;
        Token CREATE68=null;
        Token COLUMN69=null;
        Token FAMILY70=null;
        Token HELP71=null;
        Token UPDATE72=null;
        Token COLUMN73=null;
        Token FAMILY74=null;
        Token HELP75=null;
        Token DROP76=null;
        Token KEYSPACE77=null;
        Token HELP78=null;
        Token DROP79=null;
        Token COLUMN80=null;
        Token FAMILY81=null;
        Token HELP82=null;
        Token GET83=null;
        Token HELP84=null;
        Token SET85=null;
        Token HELP86=null;
        Token DEL87=null;
        Token HELP88=null;
        Token COUNT89=null;
        Token HELP90=null;
        Token LIST91=null;
        Token HELP92=null;
        Token TRUNCATE93=null;
        Token HELP94=null;
        Token ASSUME95=null;
        Token HELP96=null;
        Token char_literal97=null;

        CommonTree HELP36_tree=null;
        CommonTree HELP37_tree=null;
        CommonTree HELP38_tree=null;
        CommonTree CONNECT39_tree=null;
        CommonTree HELP40_tree=null;
        CommonTree USE41_tree=null;
        CommonTree HELP42_tree=null;
        CommonTree DESCRIBE43_tree=null;
        CommonTree KEYSPACE44_tree=null;
        CommonTree HELP45_tree=null;
        CommonTree DESCRIBE46_tree=null;
        CommonTree string_literal47_tree=null;
        CommonTree HELP48_tree=null;
        CommonTree EXIT49_tree=null;
        CommonTree HELP50_tree=null;
        CommonTree QUIT51_tree=null;
        CommonTree HELP52_tree=null;
        CommonTree SHOW53_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree HELP55_tree=null;
        CommonTree SHOW56_tree=null;
        CommonTree KEYSPACES57_tree=null;
        CommonTree HELP58_tree=null;
        CommonTree SHOW59_tree=null;
        CommonTree API_VERSION60_tree=null;
        CommonTree HELP61_tree=null;
        CommonTree CREATE62_tree=null;
        CommonTree KEYSPACE63_tree=null;
        CommonTree HELP64_tree=null;
        CommonTree UPDATE65_tree=null;
        CommonTree KEYSPACE66_tree=null;
        CommonTree HELP67_tree=null;
        CommonTree CREATE68_tree=null;
        CommonTree COLUMN69_tree=null;
        CommonTree FAMILY70_tree=null;
        CommonTree HELP71_tree=null;
        CommonTree UPDATE72_tree=null;
        CommonTree COLUMN73_tree=null;
        CommonTree FAMILY74_tree=null;
        CommonTree HELP75_tree=null;
        CommonTree DROP76_tree=null;
        CommonTree KEYSPACE77_tree=null;
        CommonTree HELP78_tree=null;
        CommonTree DROP79_tree=null;
        CommonTree COLUMN80_tree=null;
        CommonTree FAMILY81_tree=null;
        CommonTree HELP82_tree=null;
        CommonTree GET83_tree=null;
        CommonTree HELP84_tree=null;
        CommonTree SET85_tree=null;
        CommonTree HELP86_tree=null;
        CommonTree DEL87_tree=null;
        CommonTree HELP88_tree=null;
        CommonTree COUNT89_tree=null;
        CommonTree HELP90_tree=null;
        CommonTree LIST91_tree=null;
        CommonTree HELP92_tree=null;
        CommonTree TRUNCATE93_tree=null;
        CommonTree HELP94_tree=null;
        CommonTree ASSUME95_tree=null;
        CommonTree HELP96_tree=null;
        CommonTree char_literal97_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_HELP=new RewriteRuleTokenStream(adaptor,"token HELP");
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_API_VERSION=new RewriteRuleTokenStream(adaptor,"token API_VERSION");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:169:5: ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) )
            int alt6=25;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:169:7: HELP HELP
                    {
                    HELP36=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP36);

                    HELP37=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP37);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 170:9: -> ^( NODE_HELP NODE_HELP )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:170:12: ^( NODE_HELP NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:171:7: HELP CONNECT
                    {
                    HELP38=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP38);

                    CONNECT39=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_helpStatement718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT39);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 172:9: -> ^( NODE_HELP NODE_CONNECT )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:172:12: ^( NODE_HELP NODE_CONNECT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:173:7: HELP USE
                    {
                    HELP40=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP40);

                    USE41=(Token)match(input,USE,FOLLOW_USE_in_helpStatement745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE.add(USE41);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 174:9: -> ^( NODE_HELP NODE_USE_TABLE )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:174:12: ^( NODE_HELP NODE_USE_TABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:175:7: HELP DESCRIBE KEYSPACE
                    {
                    HELP42=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP42);

                    DESCRIBE43=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE43);

                    KEYSPACE44=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 176:9: -> ^( NODE_HELP NODE_DESCRIBE_TABLE )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:176:12: ^( NODE_HELP NODE_DESCRIBE_TABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DESCRIBE_TABLE, "NODE_DESCRIBE_TABLE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:177:7: HELP DESCRIBE 'CLUSTER'
                    {
                    HELP45=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP45);

                    DESCRIBE46=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE46);

                    string_literal47=(Token)match(input,81,FOLLOW_81_in_helpStatement803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(string_literal47);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 178:9: -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:178:12: ^( NODE_HELP NODE_DESCRIBE_CLUSTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DESCRIBE_CLUSTER, "NODE_DESCRIBE_CLUSTER"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:179:7: HELP EXIT
                    {
                    HELP48=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP48);

                    EXIT49=(Token)match(input,EXIT,FOLLOW_EXIT_in_helpStatement829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT49);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 180:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:180:12: ^( NODE_HELP NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:181:7: HELP QUIT
                    {
                    HELP50=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP50);

                    QUIT51=(Token)match(input,QUIT,FOLLOW_QUIT_in_helpStatement856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 182:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:182:12: ^( NODE_HELP NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:183:7: HELP SHOW 'CLUSTER NAME'
                    {
                    HELP52=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement881); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP52);

                    SHOW53=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement883); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW53);

                    string_literal54=(Token)match(input,82,FOLLOW_82_in_helpStatement885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(string_literal54);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 184:9: -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:184:12: ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:185:7: HELP SHOW KEYSPACES
                    {
                    HELP55=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP55);

                    SHOW56=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW56);

                    KEYSPACES57=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_helpStatement913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES57);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 186:9: -> ^( NODE_HELP NODE_SHOW_KEYSPACES )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:186:12: ^( NODE_HELP NODE_SHOW_KEYSPACES )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_KEYSPACES, "NODE_SHOW_KEYSPACES"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:187:7: HELP SHOW API_VERSION
                    {
                    HELP58=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP58);

                    SHOW59=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW59);

                    API_VERSION60=(Token)match(input,API_VERSION,FOLLOW_API_VERSION_in_helpStatement942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_API_VERSION.add(API_VERSION60);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 188:9: -> ^( NODE_HELP NODE_SHOW_VERSION )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:188:12: ^( NODE_HELP NODE_SHOW_VERSION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:189:7: HELP CREATE KEYSPACE
                    {
                    HELP61=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement966); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP61);

                    CREATE62=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE62);

                    KEYSPACE63=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement970); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:9: -> ^( NODE_HELP NODE_ADD_KEYSPACE )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:190:12: ^( NODE_HELP NODE_ADD_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ADD_KEYSPACE, "NODE_ADD_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:191:7: HELP UPDATE KEYSPACE
                    {
                    HELP64=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP64);

                    UPDATE65=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE65);

                    KEYSPACE66=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 192:9: -> ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:192:12: ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_UPDATE_KEYSPACE, "NODE_UPDATE_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:193:7: HELP CREATE COLUMN FAMILY
                    {
                    HELP67=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP67);

                    CREATE68=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement1025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE68);

                    COLUMN69=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1027); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN69);

                    FAMILY70=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 194:9: -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:194:12: ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ADD_COLUMN_FAMILY, "NODE_ADD_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:195:7: HELP UPDATE COLUMN FAMILY
                    {
                    HELP71=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP71);

                    UPDATE72=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement1056); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE72);

                    COLUMN73=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN73);

                    FAMILY74=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 196:9: -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:196:12: ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_UPDATE_COLUMN_FAMILY, "NODE_UPDATE_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:197:7: HELP DROP KEYSPACE
                    {
                    HELP75=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP75);

                    DROP76=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP76);

                    KEYSPACE77=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1088); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 198:9: -> ^( NODE_HELP NODE_DEL_KEYSPACE )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:198:12: ^( NODE_HELP NODE_DEL_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DEL_KEYSPACE, "NODE_DEL_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:199:7: HELP DROP COLUMN FAMILY
                    {
                    HELP78=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP78);

                    DROP79=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP79);

                    COLUMN80=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN80);

                    FAMILY81=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:9: -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:200:12: ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DEL_COLUMN_FAMILY, "NODE_DEL_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:201:7: HELP GET
                    {
                    HELP82=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1144); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP82);

                    GET83=(Token)match(input,GET,FOLLOW_GET_in_helpStatement1146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET83);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 202:9: -> ^( NODE_HELP NODE_THRIFT_GET )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:202:12: ^( NODE_HELP NODE_THRIFT_GET )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:203:7: HELP SET
                    {
                    HELP84=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP84);

                    SET85=(Token)match(input,SET,FOLLOW_SET_in_helpStatement1173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SET.add(SET85);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:9: -> ^( NODE_HELP NODE_THRIFT_SET )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:204:12: ^( NODE_HELP NODE_THRIFT_SET )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:205:7: HELP DEL
                    {
                    HELP86=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1198); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP86);

                    DEL87=(Token)match(input,DEL,FOLLOW_DEL_in_helpStatement1200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEL.add(DEL87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:9: -> ^( NODE_HELP NODE_THRIFT_DEL )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:206:12: ^( NODE_HELP NODE_THRIFT_DEL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_DEL, "NODE_THRIFT_DEL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:207:7: HELP COUNT
                    {
                    HELP88=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1225); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP88);

                    COUNT89=(Token)match(input,COUNT,FOLLOW_COUNT_in_helpStatement1227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COUNT.add(COUNT89);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 208:9: -> ^( NODE_HELP NODE_THRIFT_COUNT )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:208:12: ^( NODE_HELP NODE_THRIFT_COUNT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_COUNT, "NODE_THRIFT_COUNT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:209:7: HELP LIST
                    {
                    HELP90=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP90);

                    LIST91=(Token)match(input,LIST,FOLLOW_LIST_in_helpStatement1254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIST.add(LIST91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:9: -> ^( NODE_HELP NODE_LIST )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:210:12: ^( NODE_HELP NODE_LIST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:211:7: HELP TRUNCATE
                    {
                    HELP92=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP92);

                    TRUNCATE93=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_helpStatement1281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE93);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:9: -> ^( NODE_HELP NODE_TRUNCATE )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:212:12: ^( NODE_HELP NODE_TRUNCATE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_TRUNCATE, "NODE_TRUNCATE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:213:7: HELP ASSUME
                    {
                    HELP94=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP94);

                    ASSUME95=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_helpStatement1307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME95);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:9: -> ^( NODE_HELP NODE_ASSUME )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:214:12: ^( NODE_HELP NODE_ASSUME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ASSUME, "NODE_ASSUME"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:215:7: HELP
                    {
                    HELP96=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP96);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 216:9: -> ^( NODE_HELP )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:216:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:217:7: '?'
                    {
                    char_literal97=(Token)match(input,83,FOLLOW_83_in_helpStatement1354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_83.add(char_literal97);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 218:9: -> ^( NODE_HELP )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:218:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "helpStatement"

    public static class exitStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exitStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:221:1: exitStatement : ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) );
    public final CliParser.exitStatement_return exitStatement() throws RecognitionException {
        CliParser.exitStatement_return retval = new CliParser.exitStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUIT98=null;
        Token EXIT99=null;

        CommonTree QUIT98_tree=null;
        CommonTree EXIT99_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:222:5: ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==QUIT) ) {
                alt7=1;
            }
            else if ( (LA7_0==EXIT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:222:7: QUIT
                    {
                    QUIT98=(Token)match(input,QUIT,FOLLOW_QUIT_in_exitStatement1389); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT98);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 222:12: -> ^( NODE_EXIT )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:222:15: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:223:7: EXIT
                    {
                    EXIT99=(Token)match(input,EXIT,FOLLOW_EXIT_in_exitStatement1403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT99);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 223:12: -> ^( NODE_EXIT )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:223:15: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exitStatement"

    public static class getStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:226:1: getStatement : ( GET columnFamilyExpr ( 'AS' typeIdentifier )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerLiteral )* -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* ) );
    public final CliParser.getStatement_return getStatement() throws RecognitionException {
        CliParser.getStatement_return retval = new CliParser.getStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token GET100=null;
        Token string_literal102=null;
        Token GET104=null;
        Token string_literal106=null;
        Token string_literal108=null;
        Token string_literal110=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr101 = null;

        CliParser.typeIdentifier_return typeIdentifier103 = null;

        CliParser.columnFamily_return columnFamily105 = null;

        CliParser.getCondition_return getCondition107 = null;

        CliParser.getCondition_return getCondition109 = null;


        CommonTree limit_tree=null;
        CommonTree GET100_tree=null;
        CommonTree string_literal102_tree=null;
        CommonTree GET104_tree=null;
        CommonTree string_literal106_tree=null;
        CommonTree string_literal108_tree=null;
        CommonTree string_literal110_tree=null;
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_IntegerLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerLiteral");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_typeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule typeIdentifier");
        RewriteRuleSubtreeStream stream_getCondition=new RewriteRuleSubtreeStream(adaptor,"rule getCondition");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:227:5: ( GET columnFamilyExpr ( 'AS' typeIdentifier )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerLiteral )* -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==GET) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==Identifier) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==91) ) {
                        alt11=1;
                    }
                    else if ( (LA11_2==85) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:227:7: GET columnFamilyExpr ( 'AS' typeIdentifier )?
                    {
                    GET100=(Token)match(input,GET,FOLLOW_GET_in_getStatement1426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET100);

                    pushFollow(FOLLOW_columnFamilyExpr_in_getStatement1428);
                    columnFamilyExpr101=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr101.getTree());
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:227:28: ( 'AS' typeIdentifier )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==84) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:227:29: 'AS' typeIdentifier
                            {
                            string_literal102=(Token)match(input,84,FOLLOW_84_in_getStatement1431); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_84.add(string_literal102);

                            pushFollow(FOLLOW_typeIdentifier_in_getStatement1433);
                            typeIdentifier103=typeIdentifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeIdentifier.add(typeIdentifier103.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: columnFamilyExpr, typeIdentifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:9: -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:228:12: ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:228:47: ( ^( CONVERT_TO_TYPE typeIdentifier ) )?
                        if ( stream_typeIdentifier.hasNext() ) {
                            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:228:49: ^( CONVERT_TO_TYPE typeIdentifier )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONVERT_TO_TYPE, "CONVERT_TO_TYPE"), root_2);

                            adaptor.addChild(root_2, stream_typeIdentifier.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_typeIdentifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:229:7: GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerLiteral )*
                    {
                    GET104=(Token)match(input,GET,FOLLOW_GET_in_getStatement1471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET104);

                    pushFollow(FOLLOW_columnFamily_in_getStatement1473);
                    columnFamily105=columnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily105.getTree());
                    string_literal106=(Token)match(input,85,FOLLOW_85_in_getStatement1475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_85.add(string_literal106);

                    pushFollow(FOLLOW_getCondition_in_getStatement1477);
                    getCondition107=getCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_getCondition.add(getCondition107.getTree());
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:229:45: ( 'AND' getCondition )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==AND) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:229:46: 'AND' getCondition
                    	    {
                    	    string_literal108=(Token)match(input,AND,FOLLOW_AND_in_getStatement1480); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_AND.add(string_literal108);

                    	    pushFollow(FOLLOW_getCondition_in_getStatement1482);
                    	    getCondition109=getCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_getCondition.add(getCondition109.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:229:67: ( 'LIMIT' limit= IntegerLiteral )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==LIMIT) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:229:68: 'LIMIT' limit= IntegerLiteral
                    	    {
                    	    string_literal110=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_getStatement1487); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LIMIT.add(string_literal110);

                    	    limit=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_getStatement1491); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_IntegerLiteral.add(limit);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: limit, getCondition, columnFamily
                    // token labels: limit
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 230:9: -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* )
                    {
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:230:12: ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET_WITH_CONDITIONS, "NODE_THRIFT_GET_WITH_CONDITIONS"), root_1);

                        adaptor.addChild(root_1, stream_columnFamily.nextTree());
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:230:59: ^( CONDITIONS ( getCondition )+ )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITIONS, "CONDITIONS"), root_2);

                        if ( !(stream_getCondition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_getCondition.hasNext() ) {
                            adaptor.addChild(root_2, stream_getCondition.nextTree());

                        }
                        stream_getCondition.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:230:87: ( ^( NODE_LIMIT $limit) )*
                        while ( stream_limit.hasNext() ) {
                            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:230:87: ^( NODE_LIMIT $limit)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                            adaptor.addChild(root_2, stream_limit.nextNode());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_limit.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getStatement"

    public static class getCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getCondition"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:233:1: getCondition : columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) ;
    public final CliParser.getCondition_return getCondition() throws RecognitionException {
        CliParser.getCondition_return retval = new CliParser.getCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.columnOrSuperColumn_return columnOrSuperColumn111 = null;

        CliParser.operator_return operator112 = null;

        CliParser.value_return value113 = null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:234:5: ( columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:234:7: columnOrSuperColumn operator value
            {
            pushFollow(FOLLOW_columnOrSuperColumn_in_getCondition1542);
            columnOrSuperColumn111=columnOrSuperColumn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(columnOrSuperColumn111.getTree());
            pushFollow(FOLLOW_operator_in_getCondition1544);
            operator112=operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operator.add(operator112.getTree());
            pushFollow(FOLLOW_value_in_getCondition1546);
            value113=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value113.getTree());


            // AST REWRITE
            // elements: operator, columnOrSuperColumn, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 235:9: -> ^( CONDITION operator columnOrSuperColumn value )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:235:12: ^( CONDITION operator columnOrSuperColumn value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_operator.nextTree());
                adaptor.addChild(root_1, stream_columnOrSuperColumn.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getCondition"

    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:238:1: operator : ( '=' | '>' | '<' | '>=' | '<=' );
    public final CliParser.operator_return operator() throws RecognitionException {
        CliParser.operator_return retval = new CliParser.operator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set114=null;

        CommonTree set114_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:239:5: ( '=' | '>' | '<' | '>=' | '<=' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set114=(Token)input.LT(1);
            if ( (input.LA(1)>=86 && input.LA(1)<=90) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set114));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class typeIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeIdentifier"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:242:1: typeIdentifier : ( Identifier | StringLiteral | IntegerLiteral );
    public final CliParser.typeIdentifier_return typeIdentifier() throws RecognitionException {
        CliParser.typeIdentifier_return retval = new CliParser.typeIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set115=null;

        CommonTree set115_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:243:5: ( Identifier | StringLiteral | IntegerLiteral )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set115=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set115));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeIdentifier"

    public static class setStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:246:1: setStatement : SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= value )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) ;
    public final CliParser.setStatement_return setStatement() throws RecognitionException {
        CliParser.setStatement_return retval = new CliParser.setStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SET116=null;
        Token char_literal118=null;
        Token WITH119=null;
        Token TTL120=null;
        Token char_literal121=null;
        CliParser.value_return objectValue = null;

        CliParser.value_return ttlValue = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr117 = null;


        CommonTree SET116_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree WITH119_tree=null;
        CommonTree TTL120_tree=null;
        CommonTree char_literal121_tree=null;
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleTokenStream stream_TTL=new RewriteRuleTokenStream(adaptor,"token TTL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:247:5: ( SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= value )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:247:7: SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= value )?
            {
            SET116=(Token)match(input,SET,FOLLOW_SET_in_setStatement1642); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET116);

            pushFollow(FOLLOW_columnFamilyExpr_in_setStatement1644);
            columnFamilyExpr117=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr117.getTree());
            char_literal118=(Token)match(input,86,FOLLOW_86_in_setStatement1646); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(char_literal118);

            pushFollow(FOLLOW_value_in_setStatement1650);
            objectValue=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(objectValue.getTree());
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:247:50: ( WITH TTL '=' ttlValue= value )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==WITH) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:247:51: WITH TTL '=' ttlValue= value
                    {
                    WITH119=(Token)match(input,WITH,FOLLOW_WITH_in_setStatement1653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WITH.add(WITH119);

                    TTL120=(Token)match(input,TTL,FOLLOW_TTL_in_setStatement1655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TTL.add(TTL120);

                    char_literal121=(Token)match(input,86,FOLLOW_86_in_setStatement1657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal121);

                    pushFollow(FOLLOW_value_in_setStatement1661);
                    ttlValue=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(ttlValue.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: objectValue, columnFamilyExpr, ttlValue
            // token labels: 
            // rule labels: retval, ttlValue, objectValue
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ttlValue=new RewriteRuleSubtreeStream(adaptor,"rule ttlValue",ttlValue!=null?ttlValue.tree:null);
            RewriteRuleSubtreeStream stream_objectValue=new RewriteRuleSubtreeStream(adaptor,"rule objectValue",objectValue!=null?objectValue.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 248:9: -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:248:12: ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                adaptor.addChild(root_1, stream_objectValue.nextTree());
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:248:60: ( $ttlValue)?
                if ( stream_ttlValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_ttlValue.nextTree());

                }
                stream_ttlValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setStatement"

    public static class countStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "countStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:251:1: countStatement : COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) ;
    public final CliParser.countStatement_return countStatement() throws RecognitionException {
        CliParser.countStatement_return retval = new CliParser.countStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COUNT122=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr123 = null;


        CommonTree COUNT122_tree=null;
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:252:5: ( COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:252:7: COUNT columnFamilyExpr
            {
            COUNT122=(Token)match(input,COUNT,FOLLOW_COUNT_in_countStatement1707); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COUNT.add(COUNT122);

            pushFollow(FOLLOW_columnFamilyExpr_in_countStatement1709);
            columnFamilyExpr123=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr123.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 253:9: -> ^( NODE_THRIFT_COUNT columnFamilyExpr )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:253:12: ^( NODE_THRIFT_COUNT columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_COUNT, "NODE_THRIFT_COUNT"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "countStatement"

    public static class delStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:256:1: delStatement : DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) ;
    public final CliParser.delStatement_return delStatement() throws RecognitionException {
        CliParser.delStatement_return retval = new CliParser.delStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEL124=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr125 = null;


        CommonTree DEL124_tree=null;
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:257:5: ( DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:257:7: DEL columnFamilyExpr
            {
            DEL124=(Token)match(input,DEL,FOLLOW_DEL_in_delStatement1743); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEL.add(DEL124);

            pushFollow(FOLLOW_columnFamilyExpr_in_delStatement1745);
            columnFamilyExpr125=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr125.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 258:9: -> ^( NODE_THRIFT_DEL columnFamilyExpr )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:258:12: ^( NODE_THRIFT_DEL columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_DEL, "NODE_THRIFT_DEL"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delStatement"

    public static class showStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:261:1: showStatement : ( showClusterName | showVersion | showKeyspaces );
    public final CliParser.showStatement_return showStatement() throws RecognitionException {
        CliParser.showStatement_return retval = new CliParser.showStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.showClusterName_return showClusterName126 = null;

        CliParser.showVersion_return showVersion127 = null;

        CliParser.showKeyspaces_return showKeyspaces128 = null;



        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:262:5: ( showClusterName | showVersion | showKeyspaces )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==SHOW) ) {
                switch ( input.LA(2) ) {
                case 82:
                    {
                    alt13=1;
                    }
                    break;
                case API_VERSION:
                    {
                    alt13=2;
                    }
                    break;
                case KEYSPACES:
                    {
                    alt13=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:262:7: showClusterName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showClusterName_in_showStatement1779);
                    showClusterName126=showClusterName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showClusterName126.getTree());

                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:263:7: showVersion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showVersion_in_showStatement1787);
                    showVersion127=showVersion();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showVersion127.getTree());

                    }
                    break;
                case 3 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:264:7: showKeyspaces
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showKeyspaces_in_showStatement1795);
                    showKeyspaces128=showKeyspaces();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showKeyspaces128.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showStatement"

    public static class listStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:267:1: listStatement : LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerLiteral )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? ) ;
    public final CliParser.listStatement_return listStatement() throws RecognitionException {
        CliParser.listStatement_return retval = new CliParser.listStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token LIST129=null;
        Token string_literal132=null;
        CliParser.columnFamily_return columnFamily130 = null;

        CliParser.keyRangeExpr_return keyRangeExpr131 = null;


        CommonTree limit_tree=null;
        CommonTree LIST129_tree=null;
        CommonTree string_literal132_tree=null;
        RewriteRuleTokenStream stream_IntegerLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerLiteral");
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_keyRangeExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyRangeExpr");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:268:5: ( LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerLiteral )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:268:7: LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerLiteral )?
            {
            LIST129=(Token)match(input,LIST,FOLLOW_LIST_in_listStatement1812); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIST.add(LIST129);

            pushFollow(FOLLOW_columnFamily_in_listStatement1814);
            columnFamily130=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily130.getTree());
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:268:25: ( keyRangeExpr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==91) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: keyRangeExpr
                    {
                    pushFollow(FOLLOW_keyRangeExpr_in_listStatement1816);
                    keyRangeExpr131=keyRangeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyRangeExpr.add(keyRangeExpr131.getTree());

                    }
                    break;

            }

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:268:39: ( 'LIMIT' limit= IntegerLiteral )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LIMIT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:268:40: 'LIMIT' limit= IntegerLiteral
                    {
                    string_literal132=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_listStatement1820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIMIT.add(string_literal132);

                    limit=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_listStatement1824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IntegerLiteral.add(limit);


                    }
                    break;

            }



            // AST REWRITE
            // elements: keyRangeExpr, limit, columnFamily
            // token labels: limit
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 269:9: -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:269:12: ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:269:37: ( keyRangeExpr )?
                if ( stream_keyRangeExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyRangeExpr.nextTree());

                }
                stream_keyRangeExpr.reset();
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:269:51: ( ^( NODE_LIMIT $limit) )?
                if ( stream_limit.hasNext() ) {
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:269:51: ^( NODE_LIMIT $limit)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_limit.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listStatement"

    public static class truncateStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "truncateStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:272:1: truncateStatement : TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) ;
    public final CliParser.truncateStatement_return truncateStatement() throws RecognitionException {
        CliParser.truncateStatement_return retval = new CliParser.truncateStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TRUNCATE133=null;
        CliParser.columnFamily_return columnFamily134 = null;


        CommonTree TRUNCATE133_tree=null;
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:273:5: ( TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:273:7: TRUNCATE columnFamily
            {
            TRUNCATE133=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_truncateStatement1870); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE133);

            pushFollow(FOLLOW_columnFamily_in_truncateStatement1872);
            columnFamily134=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily134.getTree());


            // AST REWRITE
            // elements: columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 274:9: -> ^( NODE_TRUNCATE columnFamily )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:274:12: ^( NODE_TRUNCATE columnFamily )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_TRUNCATE, "NODE_TRUNCATE"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "truncateStatement"

    public static class assumeStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assumeStatement"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:277:1: assumeStatement : ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType) ;
    public final CliParser.assumeStatement_return assumeStatement() throws RecognitionException {
        CliParser.assumeStatement_return retval = new CliParser.assumeStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token assumptionElement=null;
        Token defaultType=null;
        Token ASSUME135=null;
        Token string_literal137=null;
        CliParser.columnFamily_return columnFamily136 = null;


        CommonTree assumptionElement_tree=null;
        CommonTree defaultType_tree=null;
        CommonTree ASSUME135_tree=null;
        CommonTree string_literal137_tree=null;
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:278:5: ( ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:278:7: ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier
            {
            ASSUME135=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_assumeStatement1905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME135);

            pushFollow(FOLLOW_columnFamily_in_assumeStatement1907);
            columnFamily136=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily136.getTree());
            assumptionElement=(Token)match(input,Identifier,FOLLOW_Identifier_in_assumeStatement1911); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(assumptionElement);

            string_literal137=(Token)match(input,84,FOLLOW_84_in_assumeStatement1913); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_84.add(string_literal137);

            defaultType=(Token)match(input,Identifier,FOLLOW_Identifier_in_assumeStatement1917); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(defaultType);



            // AST REWRITE
            // elements: assumptionElement, columnFamily, defaultType
            // token labels: defaultType, assumptionElement
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_defaultType=new RewriteRuleTokenStream(adaptor,"token defaultType",defaultType);
            RewriteRuleTokenStream stream_assumptionElement=new RewriteRuleTokenStream(adaptor,"token assumptionElement",assumptionElement);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 279:9: -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType)
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:279:12: ^( NODE_ASSUME columnFamily $assumptionElement $defaultType)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ASSUME, "NODE_ASSUME"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_assumptionElement.nextNode());
                adaptor.addChild(root_1, stream_defaultType.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assumeStatement"

    public static class showClusterName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showClusterName"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:282:1: showClusterName : SHOW 'CLUSTER NAME' -> ^( NODE_SHOW_CLUSTER_NAME ) ;
    public final CliParser.showClusterName_return showClusterName() throws RecognitionException {
        CliParser.showClusterName_return retval = new CliParser.showClusterName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW138=null;
        Token string_literal139=null;

        CommonTree SHOW138_tree=null;
        CommonTree string_literal139_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:283:5: ( SHOW 'CLUSTER NAME' -> ^( NODE_SHOW_CLUSTER_NAME ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:283:7: SHOW 'CLUSTER NAME'
            {
            SHOW138=(Token)match(input,SHOW,FOLLOW_SHOW_in_showClusterName1956); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW138);

            string_literal139=(Token)match(input,82,FOLLOW_82_in_showClusterName1958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_82.add(string_literal139);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 284:9: -> ^( NODE_SHOW_CLUSTER_NAME )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:284:12: ^( NODE_SHOW_CLUSTER_NAME )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showClusterName"

    public static class addKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addKeyspace"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:287:1: addKeyspace : CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.addKeyspace_return addKeyspace() throws RecognitionException {
        CliParser.addKeyspace_return retval = new CliParser.addKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE140=null;
        Token KEYSPACE141=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr142 = null;


        CommonTree CREATE140_tree=null;
        CommonTree KEYSPACE141_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:288:5: ( CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:288:7: CREATE KEYSPACE keyValuePairExpr
            {
            CREATE140=(Token)match(input,CREATE,FOLLOW_CREATE_in_addKeyspace1989); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE140);

            KEYSPACE141=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_addKeyspace1991); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE141);

            pushFollow(FOLLOW_keyValuePairExpr_in_addKeyspace1993);
            keyValuePairExpr142=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr142.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 289:9: -> ^( NODE_ADD_KEYSPACE keyValuePairExpr )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:289:12: ^( NODE_ADD_KEYSPACE keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ADD_KEYSPACE, "NODE_ADD_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addKeyspace"

    public static class addColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addColumnFamily"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:292:1: addColumnFamily : CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.addColumnFamily_return addColumnFamily() throws RecognitionException {
        CliParser.addColumnFamily_return retval = new CliParser.addColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE143=null;
        Token COLUMN144=null;
        Token FAMILY145=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr146 = null;


        CommonTree CREATE143_tree=null;
        CommonTree COLUMN144_tree=null;
        CommonTree FAMILY145_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:293:5: ( CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:293:7: CREATE COLUMN FAMILY keyValuePairExpr
            {
            CREATE143=(Token)match(input,CREATE,FOLLOW_CREATE_in_addColumnFamily2027); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE143);

            COLUMN144=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_addColumnFamily2029); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN144);

            FAMILY145=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_addColumnFamily2031); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY145);

            pushFollow(FOLLOW_keyValuePairExpr_in_addColumnFamily2033);
            keyValuePairExpr146=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr146.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 294:9: -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:294:12: ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ADD_COLUMN_FAMILY, "NODE_ADD_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addColumnFamily"

    public static class updateKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateKeyspace"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:297:1: updateKeyspace : UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.updateKeyspace_return updateKeyspace() throws RecognitionException {
        CliParser.updateKeyspace_return retval = new CliParser.updateKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE147=null;
        Token KEYSPACE148=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr149 = null;


        CommonTree UPDATE147_tree=null;
        CommonTree KEYSPACE148_tree=null;
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:298:5: ( UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:298:7: UPDATE KEYSPACE keyValuePairExpr
            {
            UPDATE147=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateKeyspace2067); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE147);

            KEYSPACE148=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_updateKeyspace2069); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE148);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateKeyspace2071);
            keyValuePairExpr149=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr149.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 299:9: -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:299:12: ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_UPDATE_KEYSPACE, "NODE_UPDATE_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateKeyspace"

    public static class updateColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateColumnFamily"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:302:1: updateColumnFamily : UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.updateColumnFamily_return updateColumnFamily() throws RecognitionException {
        CliParser.updateColumnFamily_return retval = new CliParser.updateColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE150=null;
        Token COLUMN151=null;
        Token FAMILY152=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr153 = null;


        CommonTree UPDATE150_tree=null;
        CommonTree COLUMN151_tree=null;
        CommonTree FAMILY152_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:303:5: ( UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:303:7: UPDATE COLUMN FAMILY keyValuePairExpr
            {
            UPDATE150=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateColumnFamily2104); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE150);

            COLUMN151=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_updateColumnFamily2106); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN151);

            FAMILY152=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_updateColumnFamily2108); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY152);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateColumnFamily2110);
            keyValuePairExpr153=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr153.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 304:9: -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:304:12: ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_UPDATE_COLUMN_FAMILY, "NODE_UPDATE_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateColumnFamily"

    public static class delKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delKeyspace"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:307:1: delKeyspace : DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) ;
    public final CliParser.delKeyspace_return delKeyspace() throws RecognitionException {
        CliParser.delKeyspace_return retval = new CliParser.delKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP154=null;
        Token KEYSPACE155=null;
        CliParser.keyspace_return keyspace156 = null;


        CommonTree DROP154_tree=null;
        CommonTree KEYSPACE155_tree=null;
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:308:5: ( DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:308:7: DROP KEYSPACE keyspace
            {
            DROP154=(Token)match(input,DROP,FOLLOW_DROP_in_delKeyspace2143); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP154);

            KEYSPACE155=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_delKeyspace2145); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE155);

            pushFollow(FOLLOW_keyspace_in_delKeyspace2147);
            keyspace156=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace156.getTree());


            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 309:9: -> ^( NODE_DEL_KEYSPACE keyspace )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:309:12: ^( NODE_DEL_KEYSPACE keyspace )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DEL_KEYSPACE, "NODE_DEL_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delKeyspace"

    public static class delColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delColumnFamily"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:312:1: delColumnFamily : DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) ;
    public final CliParser.delColumnFamily_return delColumnFamily() throws RecognitionException {
        CliParser.delColumnFamily_return retval = new CliParser.delColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP157=null;
        Token COLUMN158=null;
        Token FAMILY159=null;
        CliParser.columnFamily_return columnFamily160 = null;


        CommonTree DROP157_tree=null;
        CommonTree COLUMN158_tree=null;
        CommonTree FAMILY159_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:313:5: ( DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:313:7: DROP COLUMN FAMILY columnFamily
            {
            DROP157=(Token)match(input,DROP,FOLLOW_DROP_in_delColumnFamily2181); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP157);

            COLUMN158=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_delColumnFamily2183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN158);

            FAMILY159=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_delColumnFamily2185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY159);

            pushFollow(FOLLOW_columnFamily_in_delColumnFamily2187);
            columnFamily160=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily160.getTree());


            // AST REWRITE
            // elements: columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 314:9: -> ^( NODE_DEL_COLUMN_FAMILY columnFamily )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:314:12: ^( NODE_DEL_COLUMN_FAMILY columnFamily )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DEL_COLUMN_FAMILY, "NODE_DEL_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delColumnFamily"

    public static class showVersion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showVersion"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:317:1: showVersion : SHOW API_VERSION -> ^( NODE_SHOW_VERSION ) ;
    public final CliParser.showVersion_return showVersion() throws RecognitionException {
        CliParser.showVersion_return retval = new CliParser.showVersion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW161=null;
        Token API_VERSION162=null;

        CommonTree SHOW161_tree=null;
        CommonTree API_VERSION162_tree=null;
        RewriteRuleTokenStream stream_API_VERSION=new RewriteRuleTokenStream(adaptor,"token API_VERSION");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:318:5: ( SHOW API_VERSION -> ^( NODE_SHOW_VERSION ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:318:7: SHOW API_VERSION
            {
            SHOW161=(Token)match(input,SHOW,FOLLOW_SHOW_in_showVersion2221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW161);

            API_VERSION162=(Token)match(input,API_VERSION,FOLLOW_API_VERSION_in_showVersion2223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_API_VERSION.add(API_VERSION162);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 319:9: -> ^( NODE_SHOW_VERSION )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:319:12: ^( NODE_SHOW_VERSION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showVersion"

    public static class showKeyspaces_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showKeyspaces"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:322:1: showKeyspaces : SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) ;
    public final CliParser.showKeyspaces_return showKeyspaces() throws RecognitionException {
        CliParser.showKeyspaces_return retval = new CliParser.showKeyspaces_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW163=null;
        Token KEYSPACES164=null;

        CommonTree SHOW163_tree=null;
        CommonTree KEYSPACES164_tree=null;
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:323:5: ( SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:323:7: SHOW KEYSPACES
            {
            SHOW163=(Token)match(input,SHOW,FOLLOW_SHOW_in_showKeyspaces2254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW163);

            KEYSPACES164=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_showKeyspaces2256); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES164);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 324:9: -> ^( NODE_SHOW_KEYSPACES )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:324:12: ^( NODE_SHOW_KEYSPACES )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_KEYSPACES, "NODE_SHOW_KEYSPACES"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showKeyspaces"

    public static class describeTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeTable"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:327:1: describeTable : DESCRIBE KEYSPACE ( keyspace )? -> ^( NODE_DESCRIBE_TABLE ( keyspace )? ) ;
    public final CliParser.describeTable_return describeTable() throws RecognitionException {
        CliParser.describeTable_return retval = new CliParser.describeTable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE165=null;
        Token KEYSPACE166=null;
        CliParser.keyspace_return keyspace167 = null;


        CommonTree DESCRIBE165_tree=null;
        CommonTree KEYSPACE166_tree=null;
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:328:5: ( DESCRIBE KEYSPACE ( keyspace )? -> ^( NODE_DESCRIBE_TABLE ( keyspace )? ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:328:7: DESCRIBE KEYSPACE ( keyspace )?
            {
            DESCRIBE165=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeTable2288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE165);

            KEYSPACE166=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_describeTable2290); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE166);

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:328:25: ( keyspace )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Identifier) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:328:26: keyspace
                    {
                    pushFollow(FOLLOW_keyspace_in_describeTable2293);
                    keyspace167=keyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyspace.add(keyspace167.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 329:9: -> ^( NODE_DESCRIBE_TABLE ( keyspace )? )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:329:12: ^( NODE_DESCRIBE_TABLE ( keyspace )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_TABLE, "NODE_DESCRIBE_TABLE"), root_1);

                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:329:34: ( keyspace )?
                if ( stream_keyspace.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyspace.nextTree());

                }
                stream_keyspace.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeTable"

    public static class describeCluster_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeCluster"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:332:1: describeCluster : DESCRIBE 'CLUSTER' -> ^( NODE_DESCRIBE_CLUSTER ) ;
    public final CliParser.describeCluster_return describeCluster() throws RecognitionException {
        CliParser.describeCluster_return retval = new CliParser.describeCluster_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE168=null;
        Token string_literal169=null;

        CommonTree DESCRIBE168_tree=null;
        CommonTree string_literal169_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:333:5: ( DESCRIBE 'CLUSTER' -> ^( NODE_DESCRIBE_CLUSTER ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:333:7: DESCRIBE 'CLUSTER'
            {
            DESCRIBE168=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeCluster2335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE168);

            string_literal169=(Token)match(input,81,FOLLOW_81_in_describeCluster2337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(string_literal169);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 334:9: -> ^( NODE_DESCRIBE_CLUSTER )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:334:12: ^( NODE_DESCRIBE_CLUSTER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_CLUSTER, "NODE_DESCRIBE_CLUSTER"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeCluster"

    public static class useKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "useKeyspace"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:337:1: useKeyspace : USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) ;
    public final CliParser.useKeyspace_return useKeyspace() throws RecognitionException {
        CliParser.useKeyspace_return retval = new CliParser.useKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token USE170=null;
        CliParser.keyspace_return keyspace171 = null;

        CliParser.username_return username172 = null;

        CliParser.password_return password173 = null;


        CommonTree USE170_tree=null;
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:338:5: ( USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:338:7: USE keyspace ( username )? ( password )?
            {
            USE170=(Token)match(input,USE,FOLLOW_USE_in_useKeyspace2368); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_USE.add(USE170);

            pushFollow(FOLLOW_keyspace_in_useKeyspace2370);
            keyspace171=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace171.getTree());
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:338:20: ( username )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Identifier) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:338:22: username
                    {
                    pushFollow(FOLLOW_username_in_useKeyspace2374);
                    username172=username();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_username.add(username172.getTree());

                    }
                    break;

            }

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:338:34: ( password )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==StringLiteral) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:338:36: password
                    {
                    pushFollow(FOLLOW_password_in_useKeyspace2381);
                    password173=password();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_password.add(password173.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: username, password, keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 339:9: -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:339:12: ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:339:38: ( username )?
                if ( stream_username.hasNext() ) {
                    adaptor.addChild(root_1, stream_username.nextTree());

                }
                stream_username.reset();
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:339:52: ( password )?
                if ( stream_password.hasNext() ) {
                    adaptor.addChild(root_1, stream_password.nextTree());

                }
                stream_password.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "useKeyspace"

    public static class keyValuePairExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePairExpr"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:343:1: keyValuePairExpr : objectName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* ) ;
    public final CliParser.keyValuePairExpr_return keyValuePairExpr() throws RecognitionException {
        CliParser.keyValuePairExpr_return retval = new CliParser.keyValuePairExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND175=null;
        Token WITH176=null;
        CliParser.objectName_return objectName174 = null;

        CliParser.keyValuePair_return keyValuePair177 = null;


        CommonTree AND175_tree=null;
        CommonTree WITH176_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_objectName=new RewriteRuleSubtreeStream(adaptor,"rule objectName");
        RewriteRuleSubtreeStream stream_keyValuePair=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePair");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:344:5: ( objectName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:344:7: objectName ( ( AND | WITH ) keyValuePair )*
            {
            pushFollow(FOLLOW_objectName_in_keyValuePairExpr2433);
            objectName174=objectName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_objectName.add(objectName174.getTree());
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:344:18: ( ( AND | WITH ) keyValuePair )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==WITH||LA20_0==AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:344:20: ( AND | WITH ) keyValuePair
            	    {
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:344:20: ( AND | WITH )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==AND) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==WITH) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:344:21: AND
            	            {
            	            AND175=(Token)match(input,AND,FOLLOW_AND_in_keyValuePairExpr2438); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_AND.add(AND175);


            	            }
            	            break;
            	        case 2 :
            	            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:344:27: WITH
            	            {
            	            WITH176=(Token)match(input,WITH,FOLLOW_WITH_in_keyValuePairExpr2442); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_WITH.add(WITH176);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_keyValuePair_in_keyValuePairExpr2445);
            	    keyValuePair177=keyValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_keyValuePair.add(keyValuePair177.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);



            // AST REWRITE
            // elements: objectName, keyValuePair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 345:9: -> ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:345:12: ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NEW_KEYSPACE_ACCESS, "NODE_NEW_KEYSPACE_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_objectName.nextTree());
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:345:50: ( keyValuePair )*
                while ( stream_keyValuePair.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyValuePair.nextTree());

                }
                stream_keyValuePair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePairExpr"

    public static class keyValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePair"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:348:1: keyValuePair : attr_name '=' attrValue -> attr_name attrValue ;
    public final CliParser.keyValuePair_return keyValuePair() throws RecognitionException {
        CliParser.keyValuePair_return retval = new CliParser.keyValuePair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal179=null;
        CliParser.attr_name_return attr_name178 = null;

        CliParser.attrValue_return attrValue180 = null;


        CommonTree char_literal179_tree=null;
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_attr_name=new RewriteRuleSubtreeStream(adaptor,"rule attr_name");
        RewriteRuleSubtreeStream stream_attrValue=new RewriteRuleSubtreeStream(adaptor,"rule attrValue");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:349:5: ( attr_name '=' attrValue -> attr_name attrValue )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:349:7: attr_name '=' attrValue
            {
            pushFollow(FOLLOW_attr_name_in_keyValuePair2503);
            attr_name178=attr_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attr_name.add(attr_name178.getTree());
            char_literal179=(Token)match(input,86,FOLLOW_86_in_keyValuePair2505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(char_literal179);

            pushFollow(FOLLOW_attrValue_in_keyValuePair2507);
            attrValue180=attrValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attrValue.add(attrValue180.getTree());


            // AST REWRITE
            // elements: attrValue, attr_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 350:6: -> attr_name attrValue
            {
                adaptor.addChild(root_0, stream_attr_name.nextTree());
                adaptor.addChild(root_0, stream_attrValue.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePair"

    public static class attrValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValue"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:353:1: attrValue : ( arrayConstruct | attrValueString | attrValueInt | attrValueDouble );
    public final CliParser.attrValue_return attrValue() throws RecognitionException {
        CliParser.attrValue_return retval = new CliParser.attrValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.arrayConstruct_return arrayConstruct181 = null;

        CliParser.attrValueString_return attrValueString182 = null;

        CliParser.attrValueInt_return attrValueInt183 = null;

        CliParser.attrValueDouble_return attrValueDouble184 = null;



        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:354:5: ( arrayConstruct | attrValueString | attrValueInt | attrValueDouble )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt21=1;
                }
                break;
            case Identifier:
            case StringLiteral:
                {
                alt21=2;
                }
                break;
            case IntegerLiteral:
                {
                alt21=3;
                }
                break;
            case DoubleLiteral:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:354:7: arrayConstruct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayConstruct_in_attrValue2536);
                    arrayConstruct181=arrayConstruct();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayConstruct181.getTree());

                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:355:7: attrValueString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueString_in_attrValue2544);
                    attrValueString182=attrValueString();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueString182.getTree());

                    }
                    break;
                case 3 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:356:7: attrValueInt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueInt_in_attrValue2552);
                    attrValueInt183=attrValueInt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueInt183.getTree());

                    }
                    break;
                case 4 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:357:7: attrValueDouble
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueDouble_in_attrValue2560);
                    attrValueDouble184=attrValueDouble();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueDouble184.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValue"

    public static class arrayConstruct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayConstruct"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:361:1: arrayConstruct : '[' ( hashConstruct ( ',' )? )+ ']' -> ^( ARRAY ( hashConstruct )+ ) ;
    public final CliParser.arrayConstruct_return arrayConstruct() throws RecognitionException {
        CliParser.arrayConstruct_return retval = new CliParser.arrayConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal185=null;
        Token char_literal187=null;
        Token char_literal188=null;
        CliParser.hashConstruct_return hashConstruct186 = null;


        CommonTree char_literal185_tree=null;
        CommonTree char_literal187_tree=null;
        CommonTree char_literal188_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_hashConstruct=new RewriteRuleSubtreeStream(adaptor,"rule hashConstruct");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:362:5: ( '[' ( hashConstruct ( ',' )? )+ ']' -> ^( ARRAY ( hashConstruct )+ ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:362:7: '[' ( hashConstruct ( ',' )? )+ ']'
            {
            char_literal185=(Token)match(input,91,FOLLOW_91_in_arrayConstruct2579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_91.add(char_literal185);

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:362:11: ( hashConstruct ( ',' )? )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==94) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:362:12: hashConstruct ( ',' )?
            	    {
            	    pushFollow(FOLLOW_hashConstruct_in_arrayConstruct2582);
            	    hashConstruct186=hashConstruct();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashConstruct.add(hashConstruct186.getTree());
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:362:26: ( ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==92) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: ','
            	            {
            	            char_literal187=(Token)match(input,92,FOLLOW_92_in_arrayConstruct2584); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_92.add(char_literal187);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            char_literal188=(Token)match(input,93,FOLLOW_93_in_arrayConstruct2589); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal188);



            // AST REWRITE
            // elements: hashConstruct
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 363:9: -> ^( ARRAY ( hashConstruct )+ )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:363:12: ^( ARRAY ( hashConstruct )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                if ( !(stream_hashConstruct.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hashConstruct.hasNext() ) {
                    adaptor.addChild(root_1, stream_hashConstruct.nextTree());

                }
                stream_hashConstruct.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayConstruct"

    public static class hashConstruct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashConstruct"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:366:1: hashConstruct : '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) ;
    public final CliParser.hashConstruct_return hashConstruct() throws RecognitionException {
        CliParser.hashConstruct_return retval = new CliParser.hashConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal189=null;
        Token char_literal191=null;
        Token char_literal193=null;
        CliParser.hashElementPair_return hashElementPair190 = null;

        CliParser.hashElementPair_return hashElementPair192 = null;


        CommonTree char_literal189_tree=null;
        CommonTree char_literal191_tree=null;
        CommonTree char_literal193_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_hashElementPair=new RewriteRuleSubtreeStream(adaptor,"rule hashElementPair");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:367:5: ( '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:367:7: '{' hashElementPair ( ',' hashElementPair )* '}'
            {
            char_literal189=(Token)match(input,94,FOLLOW_94_in_hashConstruct2627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_94.add(char_literal189);

            pushFollow(FOLLOW_hashElementPair_in_hashConstruct2629);
            hashElementPair190=hashElementPair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair190.getTree());
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:367:27: ( ',' hashElementPair )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==92) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:367:28: ',' hashElementPair
            	    {
            	    char_literal191=(Token)match(input,92,FOLLOW_92_in_hashConstruct2632); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_92.add(char_literal191);

            	    pushFollow(FOLLOW_hashElementPair_in_hashConstruct2634);
            	    hashElementPair192=hashElementPair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair192.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal193=(Token)match(input,95,FOLLOW_95_in_hashConstruct2638); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_95.add(char_literal193);



            // AST REWRITE
            // elements: hashElementPair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 368:9: -> ^( HASH ( hashElementPair )+ )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:368:12: ^( HASH ( hashElementPair )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HASH, "HASH"), root_1);

                if ( !(stream_hashElementPair.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hashElementPair.hasNext() ) {
                    adaptor.addChild(root_1, stream_hashElementPair.nextTree());

                }
                stream_hashElementPair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hashConstruct"

    public static class hashElementPair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashElementPair"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:371:1: hashElementPair : rowKey ':' value -> ^( PAIR rowKey value ) ;
    public final CliParser.hashElementPair_return hashElementPair() throws RecognitionException {
        CliParser.hashElementPair_return retval = new CliParser.hashElementPair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal195=null;
        CliParser.rowKey_return rowKey194 = null;

        CliParser.value_return value196 = null;


        CommonTree char_literal195_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:372:5: ( rowKey ':' value -> ^( PAIR rowKey value ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:372:7: rowKey ':' value
            {
            pushFollow(FOLLOW_rowKey_in_hashElementPair2674);
            rowKey194=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey194.getTree());
            char_literal195=(Token)match(input,96,FOLLOW_96_in_hashElementPair2676); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_96.add(char_literal195);

            pushFollow(FOLLOW_value_in_hashElementPair2678);
            value196=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value196.getTree());


            // AST REWRITE
            // elements: rowKey, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 373:9: -> ^( PAIR rowKey value )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:373:12: ^( PAIR rowKey value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAIR, "PAIR"), root_1);

                adaptor.addChild(root_1, stream_rowKey.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hashElementPair"

    public static class columnFamilyExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamilyExpr"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:376:1: columnFamilyExpr : columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) ;
    public final CliParser.columnFamilyExpr_return columnFamilyExpr() throws RecognitionException {
        CliParser.columnFamilyExpr_return retval = new CliParser.columnFamilyExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal198=null;
        Token char_literal200=null;
        Token char_literal201=null;
        Token char_literal202=null;
        Token char_literal203=null;
        Token char_literal204=null;
        CliParser.columnOrSuperColumn_return column = null;

        CliParser.columnOrSuperColumn_return super_column = null;

        CliParser.columnFamily_return columnFamily197 = null;

        CliParser.rowKey_return rowKey199 = null;


        CommonTree char_literal198_tree=null;
        CommonTree char_literal200_tree=null;
        CommonTree char_literal201_tree=null;
        CommonTree char_literal202_tree=null;
        CommonTree char_literal203_tree=null;
        CommonTree char_literal204_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:377:5: ( columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:377:7: columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            {
            pushFollow(FOLLOW_columnFamily_in_columnFamilyExpr2713);
            columnFamily197=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily197.getTree());
            char_literal198=(Token)match(input,91,FOLLOW_91_in_columnFamilyExpr2715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_91.add(char_literal198);

            pushFollow(FOLLOW_rowKey_in_columnFamilyExpr2717);
            rowKey199=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey199.getTree());
            char_literal200=(Token)match(input,93,FOLLOW_93_in_columnFamilyExpr2719); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal200);

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:378:9: ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==91) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:378:11: '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )?
                    {
                    char_literal201=(Token)match(input,91,FOLLOW_91_in_columnFamilyExpr2732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal201);

                    pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2736);
                    column=columnOrSuperColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(column.getTree());
                    char_literal202=(Token)match(input,93,FOLLOW_93_in_columnFamilyExpr2738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal202);

                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:379:13: ( '[' super_column= columnOrSuperColumn ']' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==91) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:379:14: '[' super_column= columnOrSuperColumn ']'
                            {
                            char_literal203=(Token)match(input,91,FOLLOW_91_in_columnFamilyExpr2754); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_91.add(char_literal203);

                            pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2758);
                            super_column=columnOrSuperColumn();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(super_column.getTree());
                            char_literal204=(Token)match(input,93,FOLLOW_93_in_columnFamilyExpr2760); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_93.add(char_literal204);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: rowKey, columnFamily, super_column, column
            // token labels: 
            // rule labels: retval, column, super_column
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column=new RewriteRuleSubtreeStream(adaptor,"rule column",column!=null?column.tree:null);
            RewriteRuleSubtreeStream stream_super_column=new RewriteRuleSubtreeStream(adaptor,"rule super_column",super_column!=null?super_column.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 381:7: -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:381:10: ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_COLUMN_ACCESS, "NODE_COLUMN_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_rowKey.nextTree());
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:381:51: ( $column ( $super_column)? )?
                if ( stream_super_column.hasNext()||stream_column.hasNext() ) {
                    adaptor.addChild(root_1, stream_column.nextTree());
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:381:60: ( $super_column)?
                    if ( stream_super_column.hasNext() ) {
                        adaptor.addChild(root_1, stream_super_column.nextTree());

                    }
                    stream_super_column.reset();

                }
                stream_super_column.reset();
                stream_column.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamilyExpr"

    public static class keyRangeExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyRangeExpr"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:384:1: keyRangeExpr : '[' ( ( startKey )? ':' ( endKey )? )? ']' -> ^( NODE_KEY_RANGE ( startKey )? ( endKey )? ) ;
    public final CliParser.keyRangeExpr_return keyRangeExpr() throws RecognitionException {
        CliParser.keyRangeExpr_return retval = new CliParser.keyRangeExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal205=null;
        Token char_literal207=null;
        Token char_literal209=null;
        CliParser.startKey_return startKey206 = null;

        CliParser.endKey_return endKey208 = null;


        CommonTree char_literal205_tree=null;
        CommonTree char_literal207_tree=null;
        CommonTree char_literal209_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_endKey=new RewriteRuleSubtreeStream(adaptor,"rule endKey");
        RewriteRuleSubtreeStream stream_startKey=new RewriteRuleSubtreeStream(adaptor,"rule startKey");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:385:5: ( '[' ( ( startKey )? ':' ( endKey )? )? ']' -> ^( NODE_KEY_RANGE ( startKey )? ( endKey )? ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:385:10: '[' ( ( startKey )? ':' ( endKey )? )? ']'
            {
            char_literal205=(Token)match(input,91,FOLLOW_91_in_keyRangeExpr2823); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_91.add(char_literal205);

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:385:14: ( ( startKey )? ':' ( endKey )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=Identifier && LA29_0<=StringLiteral)||LA29_0==96) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:385:16: ( startKey )? ':' ( endKey )?
                    {
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:385:16: ( startKey )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=Identifier && LA27_0<=StringLiteral)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: startKey
                            {
                            pushFollow(FOLLOW_startKey_in_keyRangeExpr2827);
                            startKey206=startKey();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_startKey.add(startKey206.getTree());

                            }
                            break;

                    }

                    char_literal207=(Token)match(input,96,FOLLOW_96_in_keyRangeExpr2830); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal207);

                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:385:30: ( endKey )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=Identifier && LA28_0<=StringLiteral)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: endKey
                            {
                            pushFollow(FOLLOW_endKey_in_keyRangeExpr2832);
                            endKey208=endKey();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_endKey.add(endKey208.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal209=(Token)match(input,93,FOLLOW_93_in_keyRangeExpr2838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal209);



            // AST REWRITE
            // elements: endKey, startKey
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 386:7: -> ^( NODE_KEY_RANGE ( startKey )? ( endKey )? )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:386:10: ^( NODE_KEY_RANGE ( startKey )? ( endKey )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_KEY_RANGE, "NODE_KEY_RANGE"), root_1);

                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:386:27: ( startKey )?
                if ( stream_startKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_startKey.nextTree());

                }
                stream_startKey.reset();
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:386:37: ( endKey )?
                if ( stream_endKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_endKey.nextTree());

                }
                stream_endKey.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyRangeExpr"

    public static class columnName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnName"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:389:1: columnName : Identifier ;
    public final CliParser.columnName_return columnName() throws RecognitionException {
        CliParser.columnName_return retval = new CliParser.columnName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier210=null;

        CommonTree Identifier210_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:390:2: ( Identifier )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:390:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier210=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnName2870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier210_tree = (CommonTree)adaptor.create(Identifier210);
            adaptor.addChild(root_0, Identifier210_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnName"

    public static class attr_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attr_name"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:393:1: attr_name : Identifier ;
    public final CliParser.attr_name_return attr_name() throws RecognitionException {
        CliParser.attr_name_return retval = new CliParser.attr_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier211=null;

        CommonTree Identifier211_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:394:2: ( Identifier )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:394:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier211=(Token)match(input,Identifier,FOLLOW_Identifier_in_attr_name2881); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier211_tree = (CommonTree)adaptor.create(Identifier211);
            adaptor.addChild(root_0, Identifier211_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attr_name"

    public static class attrValueString_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueString"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:397:1: attrValueString : ( Identifier | StringLiteral ) ;
    public final CliParser.attrValueString_return attrValueString() throws RecognitionException {
        CliParser.attrValueString_return retval = new CliParser.attrValueString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set212=null;

        CommonTree set212_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:398:2: ( ( Identifier | StringLiteral ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:398:4: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set212=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set212));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueString"

    public static class attrValueInt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueInt"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:401:1: attrValueInt : IntegerLiteral ;
    public final CliParser.attrValueInt_return attrValueInt() throws RecognitionException {
        CliParser.attrValueInt_return retval = new CliParser.attrValueInt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral213=null;

        CommonTree IntegerLiteral213_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:402:2: ( IntegerLiteral )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:402:4: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral213=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_attrValueInt2915); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral213_tree = (CommonTree)adaptor.create(IntegerLiteral213);
            adaptor.addChild(root_0, IntegerLiteral213_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueInt"

    public static class attrValueDouble_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueDouble"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:405:1: attrValueDouble : DoubleLiteral ;
    public final CliParser.attrValueDouble_return attrValueDouble() throws RecognitionException {
        CliParser.attrValueDouble_return retval = new CliParser.attrValueDouble_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DoubleLiteral214=null;

        CommonTree DoubleLiteral214_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:406:2: ( DoubleLiteral )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:406:4: DoubleLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            DoubleLiteral214=(Token)match(input,DoubleLiteral,FOLLOW_DoubleLiteral_in_attrValueDouble2926); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DoubleLiteral214_tree = (CommonTree)adaptor.create(DoubleLiteral214);
            adaptor.addChild(root_0, DoubleLiteral214_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueDouble"

    public static class objectName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectName"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:409:1: objectName : Identifier ;
    public final CliParser.objectName_return objectName() throws RecognitionException {
        CliParser.objectName_return retval = new CliParser.objectName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier215=null;

        CommonTree Identifier215_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:410:2: ( Identifier )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:410:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier215=(Token)match(input,Identifier,FOLLOW_Identifier_in_objectName2939); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier215_tree = (CommonTree)adaptor.create(Identifier215);
            adaptor.addChild(root_0, Identifier215_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectName"

    public static class keyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyspace"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:413:1: keyspace : Identifier ;
    public final CliParser.keyspace_return keyspace() throws RecognitionException {
        CliParser.keyspace_return retval = new CliParser.keyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier216=null;

        CommonTree Identifier216_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:414:2: ( Identifier )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:414:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier216=(Token)match(input,Identifier,FOLLOW_Identifier_in_keyspace2950); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier216_tree = (CommonTree)adaptor.create(Identifier216);
            adaptor.addChild(root_0, Identifier216_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyspace"

    public static class replica_placement_strategy_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "replica_placement_strategy"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:417:1: replica_placement_strategy : StringLiteral ;
    public final CliParser.replica_placement_strategy_return replica_placement_strategy() throws RecognitionException {
        CliParser.replica_placement_strategy_return retval = new CliParser.replica_placement_strategy_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral217=null;

        CommonTree StringLiteral217_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:418:2: ( StringLiteral )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:418:4: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral217=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_replica_placement_strategy2961); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral217_tree = (CommonTree)adaptor.create(StringLiteral217);
            adaptor.addChild(root_0, StringLiteral217_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "replica_placement_strategy"

    public static class replication_factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "replication_factor"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:421:1: replication_factor : IntegerLiteral ;
    public final CliParser.replication_factor_return replication_factor() throws RecognitionException {
        CliParser.replication_factor_return retval = new CliParser.replication_factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral218=null;

        CommonTree IntegerLiteral218_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:422:2: ( IntegerLiteral )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:422:4: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral218=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_replication_factor2972); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral218_tree = (CommonTree)adaptor.create(IntegerLiteral218);
            adaptor.addChild(root_0, IntegerLiteral218_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "replication_factor"

    public static class keyspaceNewName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyspaceNewName"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:425:1: keyspaceNewName : Identifier ;
    public final CliParser.keyspaceNewName_return keyspaceNewName() throws RecognitionException {
        CliParser.keyspaceNewName_return retval = new CliParser.keyspaceNewName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier219=null;

        CommonTree Identifier219_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:426:2: ( Identifier )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:426:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier219=(Token)match(input,Identifier,FOLLOW_Identifier_in_keyspaceNewName2983); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier219_tree = (CommonTree)adaptor.create(Identifier219);
            adaptor.addChild(root_0, Identifier219_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyspaceNewName"

    public static class comparator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparator"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:429:1: comparator : StringLiteral ;
    public final CliParser.comparator_return comparator() throws RecognitionException {
        CliParser.comparator_return retval = new CliParser.comparator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral220=null;

        CommonTree StringLiteral220_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:430:2: ( StringLiteral )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:430:4: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral220=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_comparator2994); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral220_tree = (CommonTree)adaptor.create(StringLiteral220);
            adaptor.addChild(root_0, StringLiteral220_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparator"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:433:1: command : Identifier ;
    public final CliParser.command_return command() throws RecognitionException {
        CliParser.command_return retval = new CliParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier221=null;

        CommonTree Identifier221_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:433:9: ( Identifier )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:433:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier221=(Token)match(input,Identifier,FOLLOW_Identifier_in_command3010); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier221_tree = (CommonTree)adaptor.create(Identifier221);
            adaptor.addChild(root_0, Identifier221_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class newColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newColumnFamily"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:436:1: newColumnFamily : Identifier ;
    public final CliParser.newColumnFamily_return newColumnFamily() throws RecognitionException {
        CliParser.newColumnFamily_return retval = new CliParser.newColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier222=null;

        CommonTree Identifier222_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:437:2: ( Identifier )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:437:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier222=(Token)match(input,Identifier,FOLLOW_Identifier_in_newColumnFamily3021); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier222_tree = (CommonTree)adaptor.create(Identifier222);
            adaptor.addChild(root_0, Identifier222_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newColumnFamily"

    public static class username_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "username"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:440:1: username : Identifier ;
    public final CliParser.username_return username() throws RecognitionException {
        CliParser.username_return retval = new CliParser.username_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier223=null;

        CommonTree Identifier223_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:440:9: ( Identifier )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:440:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier223=(Token)match(input,Identifier,FOLLOW_Identifier_in_username3030); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier223_tree = (CommonTree)adaptor.create(Identifier223);
            adaptor.addChild(root_0, Identifier223_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"

    public static class password_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "password"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:443:1: password : StringLiteral ;
    public final CliParser.password_return password() throws RecognitionException {
        CliParser.password_return retval = new CliParser.password_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral224=null;

        CommonTree StringLiteral224_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:443:9: ( StringLiteral )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:443:11: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral224=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_password3039); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral224_tree = (CommonTree)adaptor.create(StringLiteral224);
            adaptor.addChild(root_0, StringLiteral224_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "password"

    public static class columnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamily"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:446:1: columnFamily : Identifier ;
    public final CliParser.columnFamily_return columnFamily() throws RecognitionException {
        CliParser.columnFamily_return retval = new CliParser.columnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier225=null;

        CommonTree Identifier225_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:447:2: ( Identifier )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:447:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier225=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnFamily3050); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier225_tree = (CommonTree)adaptor.create(Identifier225);
            adaptor.addChild(root_0, Identifier225_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamily"

    public static class rowKey_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rowKey"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:450:1: rowKey : ( Identifier | StringLiteral | IntegerLiteral | functionCall ) ;
    public final CliParser.rowKey_return rowKey() throws RecognitionException {
        CliParser.rowKey_return retval = new CliParser.rowKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier226=null;
        Token StringLiteral227=null;
        Token IntegerLiteral228=null;
        CliParser.functionCall_return functionCall229 = null;


        CommonTree Identifier226_tree=null;
        CommonTree StringLiteral227_tree=null;
        CommonTree IntegerLiteral228_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:451:5: ( ( Identifier | StringLiteral | IntegerLiteral | functionCall ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:451:8: ( Identifier | StringLiteral | IntegerLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:451:8: ( Identifier | StringLiteral | IntegerLiteral | functionCall )
            int alt30=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==97) ) {
                    alt30=4;
                }
                else if ( (LA30_1==93||LA30_1==96) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                alt30=2;
                }
                break;
            case IntegerLiteral:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:451:9: Identifier
                    {
                    Identifier226=(Token)match(input,Identifier,FOLLOW_Identifier_in_rowKey3067); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier226_tree = (CommonTree)adaptor.create(Identifier226);
                    adaptor.addChild(root_0, Identifier226_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:451:22: StringLiteral
                    {
                    StringLiteral227=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_rowKey3071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral227_tree = (CommonTree)adaptor.create(StringLiteral227);
                    adaptor.addChild(root_0, StringLiteral227_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:451:38: IntegerLiteral
                    {
                    IntegerLiteral228=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_rowKey3075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral228_tree = (CommonTree)adaptor.create(IntegerLiteral228);
                    adaptor.addChild(root_0, IntegerLiteral228_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:451:55: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_rowKey3079);
                    functionCall229=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall229.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rowKey"

    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:454:1: value : ( Identifier | IntegerLiteral | StringLiteral | functionCall ) ;
    public final CliParser.value_return value() throws RecognitionException {
        CliParser.value_return retval = new CliParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier230=null;
        Token IntegerLiteral231=null;
        Token StringLiteral232=null;
        CliParser.functionCall_return functionCall233 = null;


        CommonTree Identifier230_tree=null;
        CommonTree IntegerLiteral231_tree=null;
        CommonTree StringLiteral232_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:455:5: ( ( Identifier | IntegerLiteral | StringLiteral | functionCall ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:455:7: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:455:7: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            int alt31=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==97) ) {
                    alt31=4;
                }
                else if ( (LA31_1==EOF||LA31_1==SEMICOLON||LA31_1==WITH||LA31_1==AND||LA31_1==LIMIT||LA31_1==92||LA31_1==95) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerLiteral:
                {
                alt31=2;
                }
                break;
            case StringLiteral:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:455:8: Identifier
                    {
                    Identifier230=(Token)match(input,Identifier,FOLLOW_Identifier_in_value3096); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier230_tree = (CommonTree)adaptor.create(Identifier230);
                    adaptor.addChild(root_0, Identifier230_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:455:21: IntegerLiteral
                    {
                    IntegerLiteral231=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_value3100); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral231_tree = (CommonTree)adaptor.create(IntegerLiteral231);
                    adaptor.addChild(root_0, IntegerLiteral231_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:455:38: StringLiteral
                    {
                    StringLiteral232=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_value3104); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral232_tree = (CommonTree)adaptor.create(StringLiteral232);
                    adaptor.addChild(root_0, StringLiteral232_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:455:54: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_value3108);
                    functionCall233=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall233.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:458:1: functionCall : functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) ;
    public final CliParser.functionCall_return functionCall() throws RecognitionException {
        CliParser.functionCall_return retval = new CliParser.functionCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token functionName=null;
        Token char_literal234=null;
        Token char_literal236=null;
        CliParser.functionArgument_return functionArgument235 = null;


        CommonTree functionName_tree=null;
        CommonTree char_literal234_tree=null;
        CommonTree char_literal236_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionArgument=new RewriteRuleSubtreeStream(adaptor,"rule functionArgument");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:459:5: (functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:459:7: functionName= Identifier '(' ( functionArgument )? ')'
            {
            functionName=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall3126); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(functionName);

            char_literal234=(Token)match(input,97,FOLLOW_97_in_functionCall3128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_97.add(char_literal234);

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:459:35: ( functionArgument )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=IntegerLiteral && LA32_0<=StringLiteral)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: functionArgument
                    {
                    pushFollow(FOLLOW_functionArgument_in_functionCall3130);
                    functionArgument235=functionArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionArgument.add(functionArgument235.getTree());

                    }
                    break;

            }

            char_literal236=(Token)match(input,98,FOLLOW_98_in_functionCall3133); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_98.add(char_literal236);



            // AST REWRITE
            // elements: functionArgument, functionName
            // token labels: functionName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_functionName=new RewriteRuleTokenStream(adaptor,"token functionName",functionName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 460:9: -> ^( FUNCTION_CALL $functionName ( functionArgument )? )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:460:12: ^( FUNCTION_CALL $functionName ( functionArgument )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                adaptor.addChild(root_1, stream_functionName.nextNode());
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:460:42: ( functionArgument )?
                if ( stream_functionArgument.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionArgument.nextTree());

                }
                stream_functionArgument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class functionArgument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionArgument"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:463:1: functionArgument : ( Identifier | StringLiteral | IntegerLiteral );
    public final CliParser.functionArgument_return functionArgument() throws RecognitionException {
        CliParser.functionArgument_return retval = new CliParser.functionArgument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set237=null;

        CommonTree set237_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:464:5: ( Identifier | StringLiteral | IntegerLiteral )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set237=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set237));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionArgument"

    public static class startKey_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "startKey"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:467:1: startKey : ( Identifier | StringLiteral ) ;
    public final CliParser.startKey_return startKey() throws RecognitionException {
        CliParser.startKey_return retval = new CliParser.startKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set238=null;

        CommonTree set238_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:468:5: ( ( Identifier | StringLiteral ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:468:7: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set238=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set238));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "startKey"

    public static class endKey_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endKey"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:471:1: endKey : ( Identifier | StringLiteral ) ;
    public final CliParser.endKey_return endKey() throws RecognitionException {
        CliParser.endKey_return retval = new CliParser.endKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set239=null;

        CommonTree set239_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:472:5: ( ( Identifier | StringLiteral ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:472:7: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set239=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set239));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "endKey"

    public static class columnOrSuperColumn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnOrSuperColumn"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:475:1: columnOrSuperColumn : ( Identifier | IntegerLiteral | StringLiteral | functionCall ) ;
    public final CliParser.columnOrSuperColumn_return columnOrSuperColumn() throws RecognitionException {
        CliParser.columnOrSuperColumn_return retval = new CliParser.columnOrSuperColumn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier240=null;
        Token IntegerLiteral241=null;
        Token StringLiteral242=null;
        CliParser.functionCall_return functionCall243 = null;


        CommonTree Identifier240_tree=null;
        CommonTree IntegerLiteral241_tree=null;
        CommonTree StringLiteral242_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:476:2: ( ( Identifier | IntegerLiteral | StringLiteral | functionCall ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:476:4: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:476:4: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            int alt33=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==97) ) {
                    alt33=4;
                }
                else if ( ((LA33_1>=86 && LA33_1<=90)||LA33_1==93) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerLiteral:
                {
                alt33=2;
                }
                break;
            case StringLiteral:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:476:5: Identifier
                    {
                    Identifier240=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnOrSuperColumn3235); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier240_tree = (CommonTree)adaptor.create(Identifier240);
                    adaptor.addChild(root_0, Identifier240_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:476:18: IntegerLiteral
                    {
                    IntegerLiteral241=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_columnOrSuperColumn3239); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral241_tree = (CommonTree)adaptor.create(IntegerLiteral241);
                    adaptor.addChild(root_0, IntegerLiteral241_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:476:35: StringLiteral
                    {
                    StringLiteral242=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_columnOrSuperColumn3243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral242_tree = (CommonTree)adaptor.create(StringLiteral242);
                    adaptor.addChild(root_0, StringLiteral242_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:476:51: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_columnOrSuperColumn3247);
                    functionCall243=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall243.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnOrSuperColumn"

    public static class host_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:479:1: host : host_name -> ^( NODE_ID_LIST host_name ) ;
    public final CliParser.host_return host() throws RecognitionException {
        CliParser.host_return retval = new CliParser.host_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.host_name_return host_name244 = null;


        RewriteRuleSubtreeStream stream_host_name=new RewriteRuleSubtreeStream(adaptor,"rule host_name");
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:480:5: ( host_name -> ^( NODE_ID_LIST host_name ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:480:7: host_name
            {
            pushFollow(FOLLOW_host_name_in_host3263);
            host_name244=host_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_host_name.add(host_name244.getTree());


            // AST REWRITE
            // elements: host_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 481:9: -> ^( NODE_ID_LIST host_name )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:481:12: ^( NODE_ID_LIST host_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_host_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host"

    public static class host_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host_name"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:484:1: host_name : Identifier ( '.' Identifier )* ;
    public final CliParser.host_name_return host_name() throws RecognitionException {
        CliParser.host_name_return retval = new CliParser.host_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier245=null;
        Token char_literal246=null;
        Token Identifier247=null;

        CommonTree Identifier245_tree=null;
        CommonTree char_literal246_tree=null;
        CommonTree Identifier247_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:485:2: ( Identifier ( '.' Identifier )* )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:485:4: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier245=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name3290); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier245_tree = (CommonTree)adaptor.create(Identifier245);
            adaptor.addChild(root_0, Identifier245_tree);
            }
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:485:15: ( '.' Identifier )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==99) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:485:16: '.' Identifier
            	    {
            	    char_literal246=(Token)match(input,99,FOLLOW_99_in_host_name3293); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal246_tree = (CommonTree)adaptor.create(char_literal246);
            	    adaptor.addChild(root_0, char_literal246_tree);
            	    }
            	    Identifier247=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name3295); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier247_tree = (CommonTree)adaptor.create(Identifier247);
            	    adaptor.addChild(root_0, Identifier247_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host_name"

    public static class ip_address_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip_address"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:488:1: ip_address : IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) ;
    public final CliParser.ip_address_return ip_address() throws RecognitionException {
        CliParser.ip_address_return retval = new CliParser.ip_address_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IP_ADDRESS248=null;

        CommonTree IP_ADDRESS248_tree=null;
        RewriteRuleTokenStream stream_IP_ADDRESS=new RewriteRuleTokenStream(adaptor,"token IP_ADDRESS");

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:489:2: ( IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:489:4: IP_ADDRESS
            {
            IP_ADDRESS248=(Token)match(input,IP_ADDRESS,FOLLOW_IP_ADDRESS_in_ip_address3309); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IP_ADDRESS.add(IP_ADDRESS248);



            // AST REWRITE
            // elements: IP_ADDRESS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 490:6: -> ^( NODE_ID_LIST IP_ADDRESS )
            {
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:490:9: ^( NODE_ID_LIST IP_ADDRESS )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_IP_ADDRESS.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ip_address"

    public static class port_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port"
    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:494:1: port : IntegerLiteral ;
    public final CliParser.port_return port() throws RecognitionException {
        CliParser.port_return retval = new CliParser.port_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral249=null;

        CommonTree IntegerLiteral249_tree=null;

        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:495:5: ( IntegerLiteral )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:495:7: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral249=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_port3339); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral249_tree = (CommonTree)adaptor.create(IntegerLiteral249);
            adaptor.addChild(root_0, IntegerLiteral249_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA2_eotS =
        "\32\uffff";
    static final String DFA2_eofS =
        "\1\21\31\uffff";
    static final String DFA2_minS =
        "\1\51\3\uffff\4\56\22\uffff";
    static final String DFA2_maxS =
        "\1\123\3\uffff\1\121\3\66\22\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\4\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
        "\1\23\1\24\1\25\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA2_specialS =
        "\32\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\21\1\1\1\13\1\10\1\4\1\uffff\2\2\1\15\2\uffff\1\5\1\6\2\uffff"+
            "\1\7\1\12\1\14\1\11\1\3\1\16\1\17\1\20\23\uffff\1\13",
            "",
            "",
            "",
            "\1\22\42\uffff\1\23",
            "\1\24\7\uffff\1\25",
            "\1\26\7\uffff\1\27",
            "\1\31\7\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "137:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | showStatement | listStatement | truncateStatement | assumeStatement | -> ^( NODE_NO_OP ) );";
        }
    }
    static final String DFA6_eotS =
        "\40\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\24\36\uffff";
    static final String DFA6_minS =
        "\1\53\1\51\4\uffff\1\56\2\uffff\1\62\3\56\23\uffff";
    static final String DFA6_maxS =
        "\1\123\1\77\4\uffff\1\121\2\uffff\1\122\3\66\23\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\31\1\1\1\2\1\3\1\uffff\1\6\1\7\4\uffff\1\21\1\22\1\23"+
        "\1\24\1\25\1\26\1\27\1\30\1\4\1\5\1\10\1\11\1\12\1\13\1\15\1\14"+
        "\1\16\1\17\1\20";
    static final String DFA6_specialS =
        "\40\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\47\uffff\1\2",
            "\1\24\1\4\1\3\1\5\1\6\1\uffff\1\7\1\10\1\11\2\uffff\1\12\1"+
            "\13\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
            "",
            "",
            "",
            "",
            "\1\25\42\uffff\1\26",
            "",
            "",
            "\1\30\1\31\36\uffff\1\27",
            "\1\32\7\uffff\1\33",
            "\1\34\7\uffff\1\35",
            "\1\36\7\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "168:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_root386 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_root388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connectStatement_in_statement407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitStatement_in_statement415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStatement_in_statement423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeTable_in_statement431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeCluster_in_statement439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addKeyspace_in_statement447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addColumnFamily_in_statement455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateKeyspace_in_statement463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateColumnFamily_in_statement471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delColumnFamily_in_statement479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delKeyspace_in_statement487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useKeyspace_in_statement495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delStatement_in_statement503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getStatement_in_statement511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_helpStatement_in_statement519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setStatement_in_statement527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showStatement_in_statement535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listStatement_in_statement543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_statement551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assumeStatement_in_statement559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_connectStatement590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_connectStatement592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_port_in_connectStatement594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_username_in_connectStatement597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_password_in_connectStatement599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ip_address_in_connectStatement636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_connectStatement638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_port_in_connectStatement640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_username_in_connectStatement643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_password_in_connectStatement645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement689 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_HELP_in_helpStatement691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement716 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_CONNECT_in_helpStatement718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement743 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_USE_in_helpStatement745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement770 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement772 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement799 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_helpStatement803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement827 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_EXIT_in_helpStatement829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement854 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_QUIT_in_helpStatement856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement881 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_helpStatement885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement909 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement911 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_KEYSPACES_in_helpStatement913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement938 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement940 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_API_VERSION_in_helpStatement942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement966 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement968 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement995 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement997 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1023 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement1025 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1027 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1054 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement1056 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1058 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1084 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1086 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1113 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1115 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1117 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1144 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_GET_in_helpStatement1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1171 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_SET_in_helpStatement1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1198 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_DEL_in_helpStatement1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1225 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COUNT_in_helpStatement1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1252 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LIST_in_helpStatement1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1279 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_TRUNCATE_in_helpStatement1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1305 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ASSUME_in_helpStatement1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_helpStatement1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIT_in_exitStatement1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exitStatement1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_getStatement1428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_getStatement1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_typeIdentifier_in_getStatement1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_getStatement1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_getStatement1475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_getCondition_in_getStatement1477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000420L});
    public static final BitSet FOLLOW_AND_in_getStatement1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_getCondition_in_getStatement1482 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000420L});
    public static final BitSet FOLLOW_LIMIT_in_getStatement1487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IntegerLiteral_in_getStatement1491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_getCondition1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_operator_in_getCondition1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_value_in_getCondition1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeIdentifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setStatement1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_setStatement1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_setStatement1646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_value_in_setStatement1650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_WITH_in_setStatement1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_TTL_in_setStatement1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_setStatement1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_value_in_setStatement1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_countStatement1707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_countStatement1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEL_in_delStatement1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_delStatement1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showClusterName_in_showStatement1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showVersion_in_showStatement1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showKeyspaces_in_showStatement1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_listStatement1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_listStatement1814 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000400L});
    public static final BitSet FOLLOW_keyRangeExpr_in_listStatement1816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_LIMIT_in_listStatement1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IntegerLiteral_in_listStatement1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUNCATE_in_truncateStatement1870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_truncateStatement1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSUME_in_assumeStatement1905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_assumeStatement1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assumeStatement1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_assumeStatement1913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assumeStatement1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showClusterName1956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_showClusterName1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addKeyspace1989 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_addKeyspace1991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addKeyspace1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addColumnFamily2027 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_addColumnFamily2029 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_addColumnFamily2031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addColumnFamily2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateKeyspace2067 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_updateKeyspace2069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateKeyspace2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateColumnFamily2104 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_updateColumnFamily2106 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_updateColumnFamily2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateColumnFamily2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delKeyspace2143 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_delKeyspace2145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyspace_in_delKeyspace2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delColumnFamily2181 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_delColumnFamily2183 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_delColumnFamily2185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_delColumnFamily2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showVersion2221 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_API_VERSION_in_showVersion2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showKeyspaces2254 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_KEYSPACES_in_showKeyspaces2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeTable2288 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_describeTable2290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyspace_in_describeTable2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeCluster2335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_describeCluster2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_useKeyspace2368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyspace_in_useKeyspace2370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_username_in_useKeyspace2374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_password_in_useKeyspace2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectName_in_keyValuePairExpr2433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000028L});
    public static final BitSet FOLLOW_AND_in_keyValuePairExpr2438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_keyValuePairExpr2442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_keyValuePairExpr2445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000028L});
    public static final BitSet FOLLOW_attr_name_in_keyValuePair2503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_keyValuePair2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000047L});
    public static final BitSet FOLLOW_attrValue_in_keyValuePair2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayConstruct_in_attrValue2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueString_in_attrValue2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueInt_in_attrValue2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueDouble_in_attrValue2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_arrayConstruct2579 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_hashConstruct_in_arrayConstruct2582 = new BitSet(new long[]{0x0000000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_92_in_arrayConstruct2584 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_93_in_arrayConstruct2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_hashConstruct2627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct2629 = new BitSet(new long[]{0x0000000000000000L,0x0000000090000000L});
    public static final BitSet FOLLOW_92_in_hashConstruct2632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct2634 = new BitSet(new long[]{0x0000000000000000L,0x0000000090000000L});
    public static final BitSet FOLLOW_95_in_hashConstruct2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rowKey_in_hashElementPair2674 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_hashElementPair2676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_value_in_hashElementPair2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_columnFamilyExpr2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_columnFamilyExpr2715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_rowKey_in_columnFamilyExpr2717 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_columnFamilyExpr2719 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_columnFamilyExpr2732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2736 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_columnFamilyExpr2738 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_columnFamilyExpr2754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2758 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_columnFamilyExpr2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_keyRangeExpr2823 = new BitSet(new long[]{0x0000000000000000L,0x0000000120000006L});
    public static final BitSet FOLLOW_startKey_in_keyRangeExpr2827 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_keyRangeExpr2830 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000006L});
    public static final BitSet FOLLOW_endKey_in_keyRangeExpr2832 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_keyRangeExpr2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnName2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_attr_name2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrValueString2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_attrValueInt2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleLiteral_in_attrValueDouble2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_objectName2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_keyspace2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_replica_placement_strategy2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_replication_factor2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_keyspaceNewName2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_comparator2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_command3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_newColumnFamily3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_username3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_password3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnFamily3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_rowKey3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_rowKey3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_rowKey3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_rowKey3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_value3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_value3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_value3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_value3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionCall3126 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_functionCall3128 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000007L});
    public static final BitSet FOLLOW_functionArgument_in_functionCall3130 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_functionCall3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_functionArgument0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_startKey3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_endKey3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnOrSuperColumn3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_columnOrSuperColumn3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_columnOrSuperColumn3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_columnOrSuperColumn3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_name_in_host3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_host_name3290 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_host_name3293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_host_name3295 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_IP_ADDRESS_in_ip_address3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_port3339 = new BitSet(new long[]{0x0000000000000002L});

}