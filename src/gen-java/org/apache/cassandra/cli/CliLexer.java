// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g 2011-04-27 16:34:51

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CliLexer extends Lexer {
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
    public static final int ARRAY=36;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int NODE_ADD_KEYSPACE=20;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int EXIT=47;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int NODE_THRIFT_DEL=18;
    public static final int T__83=83;
    public static final int SEMICOLON=41;
    public static final int KEYSPACES=50;
    public static final int CONDITIONS=35;
    public static final int T__85=85;
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
    public static final int KEYSPACE=46;
    public static final int NODE_DEL_COLUMN_FAMILY=22;
    public static final int NODE_KEY_RANGE=40;
    public static final int StringLiteral=66;
    public static final int NODE_HELP=9;
    public static final int CONFIG=72;
    public static final int DROP=56;
    public static final int NODE_ADD_COLUMN_FAMILY=19;
    public static final int IntegerLiteral=64;
    public static final int NODE_COLUMN_ACCESS=28;

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


    // delegates
    // delegators

    public CliLexer() {;} 
    public CliLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CliLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g"; }

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:28:7: ( '/' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:28:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:29:7: ( 'CLUSTER' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:29:9: 'CLUSTER'
            {
            match("CLUSTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:30:7: ( 'CLUSTER NAME' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:30:9: 'CLUSTER NAME'
            {
            match("CLUSTER NAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:31:7: ( '?' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:31:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:32:7: ( 'AS' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:32:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:33:7: ( 'WHERE' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:33:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:34:7: ( '=' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:34:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:35:7: ( '>' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:35:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:36:7: ( '<' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:36:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:37:7: ( '>=' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:37:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:38:7: ( '<=' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:38:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:39:7: ( '[' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:39:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:40:7: ( ',' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:40:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:41:7: ( ']' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:41:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:42:7: ( '{' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:42:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:43:7: ( '}' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:43:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:44:7: ( ':' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:44:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:45:7: ( '(' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:45:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:46:7: ( ')' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:46:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:47:7: ( '.' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:47:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "CONFIG"
    public final void mCONFIG() throws RecognitionException {
        try {
            int _type = CONFIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:508:7: ( 'CONFIG' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:508:14: 'CONFIG'
            {
            match("CONFIG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONFIG"

    // $ANTLR start "CONNECT"
    public final void mCONNECT() throws RecognitionException {
        try {
            int _type = CONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:509:8: ( 'CONNECT' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:509:14: 'CONNECT'
            {
            match("CONNECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONNECT"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:510:6: ( 'COUNT' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:510:14: 'COUNT'
            {
            match("COUNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "DEL"
    public final void mDEL() throws RecognitionException {
        try {
            int _type = DEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:511:4: ( 'DEL' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:511:14: 'DEL'
            {
            match("DEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEL"

    // $ANTLR start "DESCRIBE"
    public final void mDESCRIBE() throws RecognitionException {
        try {
            int _type = DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:512:9: ( 'DESCRIBE' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:512:14: 'DESCRIBE'
            {
            match("DESCRIBE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESCRIBE"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:513:4: ( 'USE' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:513:14: 'USE'
            {
            match("USE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:514:4: ( 'GET' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:514:14: 'GET'
            {
            match("GET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "HELP"
    public final void mHELP() throws RecognitionException {
        try {
            int _type = HELP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:515:5: ( 'HELP' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:515:14: 'HELP'
            {
            match("HELP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HELP"

    // $ANTLR start "EXIT"
    public final void mEXIT() throws RecognitionException {
        try {
            int _type = EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:516:5: ( 'EXIT' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:516:14: 'EXIT'
            {
            match("EXIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT"

    // $ANTLR start "FILE"
    public final void mFILE() throws RecognitionException {
        try {
            int _type = FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:517:5: ( 'FILE' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:517:14: 'FILE'
            {
            match("FILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILE"

    // $ANTLR start "QUIT"
    public final void mQUIT() throws RecognitionException {
        try {
            int _type = QUIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:518:5: ( 'QUIT' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:518:14: 'QUIT'
            {
            match("QUIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUIT"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:519:4: ( 'SET' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:519:14: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "SHOW"
    public final void mSHOW() throws RecognitionException {
        try {
            int _type = SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:520:5: ( 'SHOW' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:520:14: 'SHOW'
            {
            match("SHOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHOW"

    // $ANTLR start "KEYSPACE"
    public final void mKEYSPACE() throws RecognitionException {
        try {
            int _type = KEYSPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:521:9: ( 'KEYSPACE' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:521:14: 'KEYSPACE'
            {
            match("KEYSPACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYSPACE"

    // $ANTLR start "KEYSPACES"
    public final void mKEYSPACES() throws RecognitionException {
        try {
            int _type = KEYSPACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:522:10: ( 'KEYSPACES' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:522:14: 'KEYSPACES'
            {
            match("KEYSPACES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYSPACES"

    // $ANTLR start "API_VERSION"
    public final void mAPI_VERSION() throws RecognitionException {
        try {
            int _type = API_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:523:12: ( 'API VERSION' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:523:14: 'API VERSION'
            {
            match("API VERSION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "API_VERSION"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:524:7: ( 'CREATE' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:524:14: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:525:5: ( 'DROP' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:525:14: 'DROP'
            {
            match("DROP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "COLUMN"
    public final void mCOLUMN() throws RecognitionException {
        try {
            int _type = COLUMN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:526:7: ( 'COLUMN' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:526:14: 'COLUMN'
            {
            match("COLUMN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLUMN"

    // $ANTLR start "FAMILY"
    public final void mFAMILY() throws RecognitionException {
        try {
            int _type = FAMILY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:527:7: ( 'FAMILY' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:527:14: 'FAMILY'
            {
            match("FAMILY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FAMILY"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:528:5: ( 'WITH' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:528:14: 'WITH'
            {
            match("WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:529:4: ( 'AND' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:529:14: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:530:7: ( 'UPDATE' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:530:14: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "LIST"
    public final void mLIST() throws RecognitionException {
        try {
            int _type = LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:531:5: ( 'LIST' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:531:14: 'LIST'
            {
            match("LIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:532:6: ( 'LIMIT' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:532:14: 'LIMIT'
            {
            match("LIMIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "TRUNCATE"
    public final void mTRUNCATE() throws RecognitionException {
        try {
            int _type = TRUNCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:533:9: ( 'TRUNCATE' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:533:14: 'TRUNCATE'
            {
            match("TRUNCATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUNCATE"

    // $ANTLR start "ASSUME"
    public final void mASSUME() throws RecognitionException {
        try {
            int _type = ASSUME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:534:7: ( 'ASSUME' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:534:14: 'ASSUME'
            {
            match("ASSUME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSUME"

    // $ANTLR start "TTL"
    public final void mTTL() throws RecognitionException {
        try {
            int _type = TTL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:535:4: ( 'TTL' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:535:14: 'TTL'
            {
            match("TTL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TTL"

    // $ANTLR start "IP_ADDRESS"
    public final void mIP_ADDRESS() throws RecognitionException {
        try {
            int _type = IP_ADDRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:538:5: ( IntegerLiteral '.' IntegerLiteral '.' IntegerLiteral '.' IntegerLiteral )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:538:7: IntegerLiteral '.' IntegerLiteral '.' IntegerLiteral '.' IntegerLiteral
            {
            mIntegerLiteral(); 
            match('.'); 
            mIntegerLiteral(); 
            match('.'); 
            mIntegerLiteral(); 
            match('.'); 
            mIntegerLiteral(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP_ADDRESS"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:544:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:550:5: ( '0' .. '9' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:550:7: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Alnum"
    public final void mAlnum() throws RecognitionException {
        try {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:555:5: ( Letter | Digit )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Alnum"

    // $ANTLR start "IntegerLiteral"
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:561:4: ( ( Digit )+ )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:561:6: ( Digit )+
            {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:561:6: ( Digit )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:561:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IntegerLiteral"

    // $ANTLR start "DoubleLiteral"
    public final void mDoubleLiteral() throws RecognitionException {
        try {
            int _type = DoubleLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:565:4: ( ( Digit )+ '.' ( Digit )+ )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:565:6: ( Digit )+ '.' ( Digit )+
            {
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:565:6: ( Digit )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:565:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:565:17: ( Digit )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:565:17: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DoubleLiteral"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:568:5: ( ( Letter | Alnum ) ( Alnum | '_' | '-' )* )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:568:7: ( Letter | Alnum ) ( Alnum | '_' | '-' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:568:24: ( Alnum | '_' | '-' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:573:5: ( '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )* )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:574:5: '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )*
            {
            match('\''); 
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:574:10: (~ '\\'' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:574:11: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\''); 
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:574:24: ( '\\'' (~ '\\'' )* '\\'' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\'') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:574:26: '\\'' (~ '\\'' )* '\\''
            	    {
            	    match('\''); 
            	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:574:31: (~ '\\'' )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='\uFFFF')) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:574:32: ~ '\\''
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:582:5: ( ';' )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:582:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:586:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:586:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:590:5: ( '--' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='-') ) {
                alt10=1;
            }
            else if ( (LA10_0=='/') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:590:7: '--' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("--"); 

                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:590:12: (~ ( '\\n' | '\\r' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:590:13: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:591:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:591:12: ( options {greedy=false; } : . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='*') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1=='/') ) {
                                alt9=2;
                            }
                            else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:591:39: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match("*/"); 

                     _channel=HIDDEN; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:8: ( T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | CONFIG | CONNECT | COUNT | DEL | DESCRIBE | USE | GET | HELP | EXIT | FILE | QUIT | SET | SHOW | KEYSPACE | KEYSPACES | API_VERSION | CREATE | DROP | COLUMN | FAMILY | WITH | AND | UPDATE | LIST | LIMIT | TRUNCATE | ASSUME | TTL | IP_ADDRESS | IntegerLiteral | DoubleLiteral | Identifier | StringLiteral | SEMICOLON | WS | COMMENT )
        int alt11=56;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:10: T__80
                {
                mT__80(); 

                }
                break;
            case 2 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:16: T__81
                {
                mT__81(); 

                }
                break;
            case 3 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:22: T__82
                {
                mT__82(); 

                }
                break;
            case 4 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:28: T__83
                {
                mT__83(); 

                }
                break;
            case 5 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:34: T__84
                {
                mT__84(); 

                }
                break;
            case 6 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:40: T__85
                {
                mT__85(); 

                }
                break;
            case 7 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:46: T__86
                {
                mT__86(); 

                }
                break;
            case 8 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:52: T__87
                {
                mT__87(); 

                }
                break;
            case 9 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:58: T__88
                {
                mT__88(); 

                }
                break;
            case 10 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:64: T__89
                {
                mT__89(); 

                }
                break;
            case 11 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:70: T__90
                {
                mT__90(); 

                }
                break;
            case 12 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:76: T__91
                {
                mT__91(); 

                }
                break;
            case 13 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:82: T__92
                {
                mT__92(); 

                }
                break;
            case 14 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:88: T__93
                {
                mT__93(); 

                }
                break;
            case 15 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:94: T__94
                {
                mT__94(); 

                }
                break;
            case 16 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:100: T__95
                {
                mT__95(); 

                }
                break;
            case 17 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:106: T__96
                {
                mT__96(); 

                }
                break;
            case 18 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:112: T__97
                {
                mT__97(); 

                }
                break;
            case 19 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:118: T__98
                {
                mT__98(); 

                }
                break;
            case 20 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:124: T__99
                {
                mT__99(); 

                }
                break;
            case 21 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:130: CONFIG
                {
                mCONFIG(); 

                }
                break;
            case 22 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:137: CONNECT
                {
                mCONNECT(); 

                }
                break;
            case 23 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:145: COUNT
                {
                mCOUNT(); 

                }
                break;
            case 24 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:151: DEL
                {
                mDEL(); 

                }
                break;
            case 25 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:155: DESCRIBE
                {
                mDESCRIBE(); 

                }
                break;
            case 26 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:164: USE
                {
                mUSE(); 

                }
                break;
            case 27 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:168: GET
                {
                mGET(); 

                }
                break;
            case 28 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:172: HELP
                {
                mHELP(); 

                }
                break;
            case 29 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:177: EXIT
                {
                mEXIT(); 

                }
                break;
            case 30 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:182: FILE
                {
                mFILE(); 

                }
                break;
            case 31 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:187: QUIT
                {
                mQUIT(); 

                }
                break;
            case 32 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:192: SET
                {
                mSET(); 

                }
                break;
            case 33 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:196: SHOW
                {
                mSHOW(); 

                }
                break;
            case 34 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:201: KEYSPACE
                {
                mKEYSPACE(); 

                }
                break;
            case 35 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:210: KEYSPACES
                {
                mKEYSPACES(); 

                }
                break;
            case 36 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:220: API_VERSION
                {
                mAPI_VERSION(); 

                }
                break;
            case 37 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:232: CREATE
                {
                mCREATE(); 

                }
                break;
            case 38 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:239: DROP
                {
                mDROP(); 

                }
                break;
            case 39 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:244: COLUMN
                {
                mCOLUMN(); 

                }
                break;
            case 40 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:251: FAMILY
                {
                mFAMILY(); 

                }
                break;
            case 41 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:258: WITH
                {
                mWITH(); 

                }
                break;
            case 42 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:263: AND
                {
                mAND(); 

                }
                break;
            case 43 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:267: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 44 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:274: LIST
                {
                mLIST(); 

                }
                break;
            case 45 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:279: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 46 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:285: TRUNCATE
                {
                mTRUNCATE(); 

                }
                break;
            case 47 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:294: ASSUME
                {
                mASSUME(); 

                }
                break;
            case 48 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:301: TTL
                {
                mTTL(); 

                }
                break;
            case 49 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:305: IP_ADDRESS
                {
                mIP_ADDRESS(); 

                }
                break;
            case 50 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:316: IntegerLiteral
                {
                mIntegerLiteral(); 

                }
                break;
            case 51 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:331: DoubleLiteral
                {
                mDoubleLiteral(); 

                }
                break;
            case 52 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:345: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 53 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:356: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 54 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:370: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 55 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:380: WS
                {
                mWS(); 

                }
                break;
            case 56 :
                // /home/kane/apache-cassandra-0.7.4-src/src/java/org/apache/cassandra/cli/Cli.g:1:383: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\43\1\36\1\uffff\2\36\1\uffff\1\55\1\57\11\uffff\13\36"+
        "\1\100\6\uffff\3\36\1\111\4\36\4\uffff\20\36\1\uffff\1\100\1\uffff"+
        "\6\36\1\uffff\1\36\1\151\2\36\1\154\2\36\1\157\1\36\1\161\5\36\1"+
        "\167\5\36\1\175\1\176\7\36\2\uffff\1\36\1\u0088\1\uffff\1\36\1\u008a"+
        "\1\uffff\1\36\1\uffff\1\u008c\1\u008d\1\u008e\1\36\1\u0090\1\uffff"+
        "\1\u0091\1\36\1\u0093\2\36\3\uffff\3\36\1\u0099\3\36\1\u009d\1\uffff"+
        "\1\36\1\uffff\1\36\3\uffff\1\36\2\uffff\1\36\1\uffff\1\u00a2\2\36"+
        "\1\u00a5\1\36\1\uffff\1\u00a7\1\u00a8\1\u00a9\1\uffff\1\36\1\u00ab"+
        "\1\u00ac\1\36\1\uffff\1\36\1\u00b0\1\uffff\1\u00b1\3\uffff\1\36"+
        "\2\uffff\2\36\3\uffff\1\u00b5\1\u00b7\1\u00b8\1\uffff\1\u00b9\3"+
        "\uffff";
    static final String DFA11_eofS =
        "\u00ba\uffff";
    static final String DFA11_minS =
        "\1\11\1\52\1\114\1\uffff\1\116\1\110\1\uffff\2\75\11\uffff\1\105"+
        "\1\120\2\105\1\130\1\101\1\125\2\105\1\111\1\122\1\55\6\uffff\1"+
        "\125\1\114\1\105\1\55\1\111\1\104\1\105\1\124\4\uffff\1\114\1\117"+
        "\1\105\1\104\1\124\1\114\1\111\1\114\1\115\1\111\1\124\1\117\1\131"+
        "\1\115\1\125\1\114\1\uffff\1\55\1\60\1\123\1\106\1\116\1\125\1\101"+
        "\1\125\1\uffff\1\40\1\55\1\122\1\110\1\55\1\103\1\120\1\55\1\101"+
        "\1\55\1\120\1\124\1\105\1\111\1\124\1\55\1\127\1\123\1\124\1\111"+
        "\1\116\1\55\1\56\1\124\1\111\1\105\1\124\1\115\1\124\1\115\2\uffff"+
        "\1\105\1\55\1\uffff\1\122\1\55\1\uffff\1\124\1\uffff\3\55\1\114"+
        "\1\55\1\uffff\1\55\1\120\1\55\1\124\1\103\3\uffff\1\105\1\107\1"+
        "\103\1\55\1\116\2\105\1\55\1\uffff\1\111\1\uffff\1\105\3\uffff\1"+
        "\131\2\uffff\1\101\1\uffff\1\55\1\101\1\122\1\55\1\124\1\uffff\3"+
        "\55\1\uffff\1\102\2\55\1\103\1\uffff\1\124\1\40\1\uffff\1\55\3\uffff"+
        "\1\105\2\uffff\2\105\3\uffff\3\55\1\uffff\1\55\3\uffff";
    static final String DFA11_maxS =
        "\1\175\1\52\1\122\1\uffff\1\123\1\111\1\uffff\2\75\11\uffff\1\122"+
        "\1\123\2\105\1\130\1\111\1\125\1\110\1\105\1\111\1\124\1\172\6\uffff"+
        "\2\125\1\105\1\172\1\111\1\104\1\105\1\124\4\uffff\1\123\1\117\1"+
        "\105\1\104\1\124\1\114\1\111\1\114\1\115\1\111\1\124\1\117\1\131"+
        "\1\123\1\125\1\114\1\uffff\1\172\1\71\1\123\2\116\1\125\1\101\1"+
        "\125\1\uffff\1\40\1\172\1\122\1\110\1\172\1\103\1\120\1\172\1\101"+
        "\1\172\1\120\1\124\1\105\1\111\1\124\1\172\1\127\1\123\1\124\1\111"+
        "\1\116\1\172\1\71\1\124\1\111\1\105\1\124\1\115\1\124\1\115\2\uffff"+
        "\1\105\1\172\1\uffff\1\122\1\172\1\uffff\1\124\1\uffff\3\172\1\114"+
        "\1\172\1\uffff\1\172\1\120\1\172\1\124\1\103\3\uffff\1\105\1\107"+
        "\1\103\1\172\1\116\2\105\1\172\1\uffff\1\111\1\uffff\1\105\3\uffff"+
        "\1\131\2\uffff\1\101\1\uffff\1\172\1\101\1\122\1\172\1\124\1\uffff"+
        "\3\172\1\uffff\1\102\2\172\1\103\1\uffff\1\124\1\172\1\uffff\1\172"+
        "\3\uffff\1\105\2\uffff\2\105\3\uffff\3\172\1\uffff\1\172\3\uffff";
    static final String DFA11_acceptS =
        "\3\uffff\1\4\2\uffff\1\7\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1"+
        "\22\1\23\1\24\14\uffff\1\64\1\65\1\66\1\67\1\70\1\1\10\uffff\1\12"+
        "\1\10\1\13\1\11\20\uffff\1\62\10\uffff\1\5\36\uffff\1\44\1\52\2"+
        "\uffff\1\30\2\uffff\1\32\1\uffff\1\33\5\uffff\1\40\5\uffff\1\60"+
        "\1\63\1\61\10\uffff\1\51\1\uffff\1\46\1\uffff\1\34\1\35\1\36\1\uffff"+
        "\1\37\1\41\1\uffff\1\54\5\uffff\1\27\3\uffff\1\6\4\uffff\1\55\2"+
        "\uffff\1\25\1\uffff\1\47\1\45\1\57\1\uffff\1\53\1\50\2\uffff\1\3"+
        "\1\2\1\26\3\uffff\1\31\1\uffff\1\42\1\56\1\43";
    static final String DFA11_specialS =
        "\u00ba\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\6\uffff\1\37\1\17\1\20\2\uffff"+
            "\1\12\1\42\1\21\1\1\12\35\1\16\1\40\1\10\1\6\1\7\1\3\1\uffff"+
            "\1\4\1\36\1\2\1\22\1\26\1\27\1\24\1\25\2\36\1\32\1\33\4\36\1"+
            "\30\1\36\1\31\1\34\1\23\1\36\1\5\3\36\1\11\1\uffff\1\13\3\uffff"+
            "\32\36\1\14\1\uffff\1\15",
            "\1\42",
            "\1\44\2\uffff\1\45\2\uffff\1\46",
            "",
            "\1\51\1\uffff\1\50\2\uffff\1\47",
            "\1\52\1\53",
            "",
            "\1\54",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\14\uffff\1\61",
            "\1\63\2\uffff\1\62",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\70\7\uffff\1\67",
            "\1\71",
            "\1\72\2\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76\1\uffff\1\77",
            "\1\36\1\102\1\uffff\12\101\7\uffff\32\36\4\uffff\1\36\1\uffff"+
            "\32\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\106\1\uffff\1\104\6\uffff\1\105",
            "\1\107",
            "\1\36\2\uffff\12\36\7\uffff\22\36\1\110\7\36\4\uffff\1\36\1"+
            "\uffff\32\36",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "\1\116\6\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\135\5\uffff\1\134",
            "\1\136",
            "\1\137",
            "",
            "\1\36\1\102\1\uffff\12\101\7\uffff\32\36\4\uffff\1\36\1\uffff"+
            "\32\36",
            "\12\140",
            "\1\141",
            "\1\142\7\uffff\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\152",
            "\1\153",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\155",
            "\1\156",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\160",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\177\1\uffff\12\140",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "\1\u0087",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u0089",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u008b",
            "",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u008f",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0092",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u009e",
            "",
            "\1\u009f",
            "",
            "",
            "",
            "\1\u00a0",
            "",
            "",
            "\1\u00a1",
            "",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a3",
            "\1\u00a4",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a6",
            "",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00aa",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af\14\uffff\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff"+
            "\1\36\1\uffff\32\36",
            "",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\1\u00b2",
            "",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\36\2\uffff\12\36\7\uffff\22\36\1\u00b6\7\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\36\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | CONFIG | CONNECT | COUNT | DEL | DESCRIBE | USE | GET | HELP | EXIT | FILE | QUIT | SET | SHOW | KEYSPACE | KEYSPACES | API_VERSION | CREATE | DROP | COLUMN | FAMILY | WITH | AND | UPDATE | LIST | LIMIT | TRUNCATE | ASSUME | TTL | IP_ADDRESS | IntegerLiteral | DoubleLiteral | Identifier | StringLiteral | SEMICOLON | WS | COMMENT );";
        }
    }
 

}