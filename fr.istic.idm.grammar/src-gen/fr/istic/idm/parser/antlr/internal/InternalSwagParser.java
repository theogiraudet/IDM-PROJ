package fr.istic.idm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.istic.idm.services.SwagGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSwagParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'['", "']'", "'*'", "'='", "'?'", "'..'", "','", "'null'", "'true'", "'false'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSwagParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSwagParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSwagParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSwag.g"; }



     	private SwagGrammarAccess grammarAccess;

        public InternalSwagParser(TokenStream input, SwagGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Path";
       	}

       	@Override
       	protected SwagGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePath"
    // InternalSwag.g:64:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalSwag.g:64:45: (iv_rulePath= rulePath EOF )
            // InternalSwag.g:65:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalSwag.g:71:1: rulePath returns [EObject current=null] : ( () ( ( (lv_nodes_1_0= ruleNode ) ) (otherlv_2= '.' ( (lv_nodes_3_0= ruleNode ) ) )* )? ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_nodes_1_0 = null;

        EObject lv_nodes_3_0 = null;



        	enterRule();

        try {
            // InternalSwag.g:77:2: ( ( () ( ( (lv_nodes_1_0= ruleNode ) ) (otherlv_2= '.' ( (lv_nodes_3_0= ruleNode ) ) )* )? ) )
            // InternalSwag.g:78:2: ( () ( ( (lv_nodes_1_0= ruleNode ) ) (otherlv_2= '.' ( (lv_nodes_3_0= ruleNode ) ) )* )? )
            {
            // InternalSwag.g:78:2: ( () ( ( (lv_nodes_1_0= ruleNode ) ) (otherlv_2= '.' ( (lv_nodes_3_0= ruleNode ) ) )* )? )
            // InternalSwag.g:79:3: () ( ( (lv_nodes_1_0= ruleNode ) ) (otherlv_2= '.' ( (lv_nodes_3_0= ruleNode ) ) )* )?
            {
            // InternalSwag.g:79:3: ()
            // InternalSwag.g:80:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPathAccess().getPathAction_0(),
              					current);
              			
            }

            }

            // InternalSwag.g:86:3: ( ( (lv_nodes_1_0= ruleNode ) ) (otherlv_2= '.' ( (lv_nodes_3_0= ruleNode ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSwag.g:87:4: ( (lv_nodes_1_0= ruleNode ) ) (otherlv_2= '.' ( (lv_nodes_3_0= ruleNode ) ) )*
                    {
                    // InternalSwag.g:87:4: ( (lv_nodes_1_0= ruleNode ) )
                    // InternalSwag.g:88:5: (lv_nodes_1_0= ruleNode )
                    {
                    // InternalSwag.g:88:5: (lv_nodes_1_0= ruleNode )
                    // InternalSwag.g:89:6: lv_nodes_1_0= ruleNode
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPathAccess().getNodesNodeParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_nodes_1_0=ruleNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPathRule());
                      						}
                      						add(
                      							current,
                      							"nodes",
                      							lv_nodes_1_0,
                      							"fr.istic.idm.Swag.Node");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSwag.g:106:4: (otherlv_2= '.' ( (lv_nodes_3_0= ruleNode ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSwag.g:107:5: otherlv_2= '.' ( (lv_nodes_3_0= ruleNode ) )
                    	    {
                    	    otherlv_2=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getPathAccess().getFullStopKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSwag.g:111:5: ( (lv_nodes_3_0= ruleNode ) )
                    	    // InternalSwag.g:112:6: (lv_nodes_3_0= ruleNode )
                    	    {
                    	    // InternalSwag.g:112:6: (lv_nodes_3_0= ruleNode )
                    	    // InternalSwag.g:113:7: lv_nodes_3_0= ruleNode
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPathAccess().getNodesNodeParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_3);
                    	    lv_nodes_3_0=ruleNode();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPathRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"nodes",
                    	      								lv_nodes_3_0,
                    	      								"fr.istic.idm.Swag.Node");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleNode"
    // InternalSwag.g:136:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalSwag.g:136:45: (iv_ruleNode= ruleNode EOF )
            // InternalSwag.g:137:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalSwag.g:143:1: ruleNode returns [EObject current=null] : (this_ArrayNode_0= ruleArrayNode | this_BasicNode_1= ruleBasicNode ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayNode_0 = null;

        EObject this_BasicNode_1 = null;



        	enterRule();

        try {
            // InternalSwag.g:149:2: ( (this_ArrayNode_0= ruleArrayNode | this_BasicNode_1= ruleBasicNode ) )
            // InternalSwag.g:150:2: (this_ArrayNode_0= ruleArrayNode | this_BasicNode_1= ruleBasicNode )
            {
            // InternalSwag.g:150:2: (this_ArrayNode_0= ruleArrayNode | this_BasicNode_1= ruleBasicNode )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==12) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==11||(LA3_1>=15 && LA3_1<=16)) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_STRING) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==11||(LA3_2>=15 && LA3_2<=16)) ) {
                    alt3=2;
                }
                else if ( (LA3_2==12) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSwag.g:151:3: this_ArrayNode_0= ruleArrayNode
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNodeAccess().getArrayNodeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayNode_0=ruleArrayNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayNode_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSwag.g:160:3: this_BasicNode_1= ruleBasicNode
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNodeAccess().getBasicNodeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicNode_1=ruleBasicNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BasicNode_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleBasicNode"
    // InternalSwag.g:172:1: entryRuleBasicNode returns [EObject current=null] : iv_ruleBasicNode= ruleBasicNode EOF ;
    public final EObject entryRuleBasicNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicNode = null;


        try {
            // InternalSwag.g:172:50: (iv_ruleBasicNode= ruleBasicNode EOF )
            // InternalSwag.g:173:2: iv_ruleBasicNode= ruleBasicNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicNode=ruleBasicNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicNode"


    // $ANTLR start "ruleBasicNode"
    // InternalSwag.g:179:1: ruleBasicNode returns [EObject current=null] : ( () ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleBasicNode() throws RecognitionException {
        EObject current = null;

        Token lv_str_1_1=null;
        Token lv_str_1_2=null;


        	enterRule();

        try {
            // InternalSwag.g:185:2: ( ( () ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) ) ) )
            // InternalSwag.g:186:2: ( () ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) ) )
            {
            // InternalSwag.g:186:2: ( () ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) ) )
            // InternalSwag.g:187:3: () ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) )
            {
            // InternalSwag.g:187:3: ()
            // InternalSwag.g:188:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBasicNodeAccess().getBasicNodeAction_0(),
              					current);
              			
            }

            }

            // InternalSwag.g:194:3: ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) )
            // InternalSwag.g:195:4: ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) )
            {
            // InternalSwag.g:195:4: ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) )
            // InternalSwag.g:196:5: (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING )
            {
            // InternalSwag.g:196:5: (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSwag.g:197:6: lv_str_1_1= RULE_ID
                    {
                    lv_str_1_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_str_1_1, grammarAccess.getBasicNodeAccess().getStrIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBasicNodeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"str",
                      							lv_str_1_1,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSwag.g:212:6: lv_str_1_2= RULE_STRING
                    {
                    lv_str_1_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_str_1_2, grammarAccess.getBasicNodeAccess().getStrSTRINGTerminalRuleCall_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBasicNodeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"str",
                      							lv_str_1_2,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicNode"


    // $ANTLR start "entryRuleArrayNode"
    // InternalSwag.g:233:1: entryRuleArrayNode returns [EObject current=null] : iv_ruleArrayNode= ruleArrayNode EOF ;
    public final EObject entryRuleArrayNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayNode = null;


        try {
            // InternalSwag.g:233:50: (iv_ruleArrayNode= ruleArrayNode EOF )
            // InternalSwag.g:234:2: iv_ruleArrayNode= ruleArrayNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayNode=ruleArrayNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayNode"


    // $ANTLR start "ruleArrayNode"
    // InternalSwag.g:240:1: ruleArrayNode returns [EObject current=null] : ( () ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleListFilter ) )? otherlv_4= ']' ) ;
    public final EObject ruleArrayNode() throws RecognitionException {
        EObject current = null;

        Token lv_str_1_1=null;
        Token lv_str_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_filter_3_0 = null;



        	enterRule();

        try {
            // InternalSwag.g:246:2: ( ( () ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleListFilter ) )? otherlv_4= ']' ) )
            // InternalSwag.g:247:2: ( () ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleListFilter ) )? otherlv_4= ']' )
            {
            // InternalSwag.g:247:2: ( () ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleListFilter ) )? otherlv_4= ']' )
            // InternalSwag.g:248:3: () ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleListFilter ) )? otherlv_4= ']'
            {
            // InternalSwag.g:248:3: ()
            // InternalSwag.g:249:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayNodeAccess().getArrayNodeAction_0(),
              					current);
              			
            }

            }

            // InternalSwag.g:255:3: ( ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) ) )
            // InternalSwag.g:256:4: ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) )
            {
            // InternalSwag.g:256:4: ( (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING ) )
            // InternalSwag.g:257:5: (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING )
            {
            // InternalSwag.g:257:5: (lv_str_1_1= RULE_ID | lv_str_1_2= RULE_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSwag.g:258:6: lv_str_1_1= RULE_ID
                    {
                    lv_str_1_1=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_str_1_1, grammarAccess.getArrayNodeAccess().getStrIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArrayNodeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"str",
                      							lv_str_1_1,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSwag.g:273:6: lv_str_1_2= RULE_STRING
                    {
                    lv_str_1_2=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_str_1_2, grammarAccess.getArrayNodeAccess().getStrSTRINGTerminalRuleCall_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArrayNodeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"str",
                      							lv_str_1_2,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArrayNodeAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalSwag.g:294:3: ( (lv_filter_3_0= ruleListFilter ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||(LA6_0>=14 && LA6_0<=17)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSwag.g:295:4: (lv_filter_3_0= ruleListFilter )
                    {
                    // InternalSwag.g:295:4: (lv_filter_3_0= ruleListFilter )
                    // InternalSwag.g:296:5: lv_filter_3_0= ruleListFilter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArrayNodeAccess().getFilterListFilterParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_filter_3_0=ruleListFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getArrayNodeRule());
                      					}
                      					set(
                      						current,
                      						"filter",
                      						lv_filter_3_0,
                      						"fr.istic.idm.Swag.ListFilter");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getArrayNodeAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayNode"


    // $ANTLR start "entryRuleFilter"
    // InternalSwag.g:321:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalSwag.g:321:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalSwag.g:322:2: iv_ruleFilter= ruleFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalSwag.g:328:1: ruleFilter returns [EObject current=null] : (this_BoundFilter_0= ruleBoundFilter | this_IndexFilter_1= ruleIndexFilter | this_PathFilter_2= rulePathFilter | this_AllFilter_3= ruleAllFilter ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_BoundFilter_0 = null;

        EObject this_IndexFilter_1 = null;

        EObject this_PathFilter_2 = null;

        EObject this_AllFilter_3 = null;



        	enterRule();

        try {
            // InternalSwag.g:334:2: ( (this_BoundFilter_0= ruleBoundFilter | this_IndexFilter_1= ruleIndexFilter | this_PathFilter_2= rulePathFilter | this_AllFilter_3= ruleAllFilter ) )
            // InternalSwag.g:335:2: (this_BoundFilter_0= ruleBoundFilter | this_IndexFilter_1= ruleIndexFilter | this_PathFilter_2= rulePathFilter | this_AllFilter_3= ruleAllFilter )
            {
            // InternalSwag.g:335:2: (this_BoundFilter_0= ruleBoundFilter | this_IndexFilter_1= ruleIndexFilter | this_PathFilter_2= rulePathFilter | this_AllFilter_3= ruleAllFilter )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==17) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||LA7_1==13||LA7_1==18) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case 15:
            case 16:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSwag.g:336:3: this_BoundFilter_0= ruleBoundFilter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterAccess().getBoundFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoundFilter_0=ruleBoundFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoundFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSwag.g:345:3: this_IndexFilter_1= ruleIndexFilter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterAccess().getIndexFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IndexFilter_1=ruleIndexFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IndexFilter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSwag.g:354:3: this_PathFilter_2= rulePathFilter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterAccess().getPathFilterParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PathFilter_2=rulePathFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PathFilter_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSwag.g:363:3: this_AllFilter_3= ruleAllFilter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterAccess().getAllFilterParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AllFilter_3=ruleAllFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AllFilter_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleAllFilter"
    // InternalSwag.g:375:1: entryRuleAllFilter returns [EObject current=null] : iv_ruleAllFilter= ruleAllFilter EOF ;
    public final EObject entryRuleAllFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllFilter = null;


        try {
            // InternalSwag.g:375:50: (iv_ruleAllFilter= ruleAllFilter EOF )
            // InternalSwag.g:376:2: iv_ruleAllFilter= ruleAllFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAllFilter=ruleAllFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllFilter"


    // $ANTLR start "ruleAllFilter"
    // InternalSwag.g:382:1: ruleAllFilter returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleAllFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSwag.g:388:2: ( ( () otherlv_1= '*' ) )
            // InternalSwag.g:389:2: ( () otherlv_1= '*' )
            {
            // InternalSwag.g:389:2: ( () otherlv_1= '*' )
            // InternalSwag.g:390:3: () otherlv_1= '*'
            {
            // InternalSwag.g:390:3: ()
            // InternalSwag.g:391:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAllFilterAccess().getAllFilterAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAllFilterAccess().getAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllFilter"


    // $ANTLR start "entryRulePathFilter"
    // InternalSwag.g:405:1: entryRulePathFilter returns [EObject current=null] : iv_rulePathFilter= rulePathFilter EOF ;
    public final EObject entryRulePathFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathFilter = null;


        try {
            // InternalSwag.g:405:51: (iv_rulePathFilter= rulePathFilter EOF )
            // InternalSwag.g:406:2: iv_rulePathFilter= rulePathFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePathFilter=rulePathFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathFilter"


    // $ANTLR start "rulePathFilter"
    // InternalSwag.g:412:1: rulePathFilter returns [EObject current=null] : ( ( ( ruleExistFilter )=>this_ExistFilter_0= ruleExistFilter ) | this_EqualFilter_1= ruleEqualFilter ) ;
    public final EObject rulePathFilter() throws RecognitionException {
        EObject current = null;

        EObject this_ExistFilter_0 = null;

        EObject this_EqualFilter_1 = null;



        	enterRule();

        try {
            // InternalSwag.g:418:2: ( ( ( ( ruleExistFilter )=>this_ExistFilter_0= ruleExistFilter ) | this_EqualFilter_1= ruleEqualFilter ) )
            // InternalSwag.g:419:2: ( ( ( ruleExistFilter )=>this_ExistFilter_0= ruleExistFilter ) | this_EqualFilter_1= ruleEqualFilter )
            {
            // InternalSwag.g:419:2: ( ( ( ruleExistFilter )=>this_ExistFilter_0= ruleExistFilter ) | this_EqualFilter_1= ruleEqualFilter )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred1_InternalSwag()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_STRING) ) {
                int LA8_2 = input.LA(2);

                if ( (synpred1_InternalSwag()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==16) && (synpred1_InternalSwag())) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSwag.g:420:3: ( ( ruleExistFilter )=>this_ExistFilter_0= ruleExistFilter )
                    {
                    // InternalSwag.g:420:3: ( ( ruleExistFilter )=>this_ExistFilter_0= ruleExistFilter )
                    // InternalSwag.g:421:4: ( ruleExistFilter )=>this_ExistFilter_0= ruleExistFilter
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPathFilterAccess().getExistFilterParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ExistFilter_0=ruleExistFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ExistFilter_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSwag.g:432:3: this_EqualFilter_1= ruleEqualFilter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPathFilterAccess().getEqualFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EqualFilter_1=ruleEqualFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EqualFilter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathFilter"


    // $ANTLR start "entryRuleEqualFilter"
    // InternalSwag.g:444:1: entryRuleEqualFilter returns [EObject current=null] : iv_ruleEqualFilter= ruleEqualFilter EOF ;
    public final EObject entryRuleEqualFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualFilter = null;


        try {
            // InternalSwag.g:444:52: (iv_ruleEqualFilter= ruleEqualFilter EOF )
            // InternalSwag.g:445:2: iv_ruleEqualFilter= ruleEqualFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualFilter=ruleEqualFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualFilter"


    // $ANTLR start "ruleEqualFilter"
    // InternalSwag.g:451:1: ruleEqualFilter returns [EObject current=null] : ( () ( (lv_path_1_0= rulePath ) ) otherlv_2= '=' ( (lv_value_3_0= ruleJsonValue ) ) ) ;
    public final EObject ruleEqualFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_path_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSwag.g:457:2: ( ( () ( (lv_path_1_0= rulePath ) ) otherlv_2= '=' ( (lv_value_3_0= ruleJsonValue ) ) ) )
            // InternalSwag.g:458:2: ( () ( (lv_path_1_0= rulePath ) ) otherlv_2= '=' ( (lv_value_3_0= ruleJsonValue ) ) )
            {
            // InternalSwag.g:458:2: ( () ( (lv_path_1_0= rulePath ) ) otherlv_2= '=' ( (lv_value_3_0= ruleJsonValue ) ) )
            // InternalSwag.g:459:3: () ( (lv_path_1_0= rulePath ) ) otherlv_2= '=' ( (lv_value_3_0= ruleJsonValue ) )
            {
            // InternalSwag.g:459:3: ()
            // InternalSwag.g:460:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEqualFilterAccess().getEqualFilterAction_0(),
              					current);
              			
            }

            }

            // InternalSwag.g:466:3: ( (lv_path_1_0= rulePath ) )
            // InternalSwag.g:467:4: (lv_path_1_0= rulePath )
            {
            // InternalSwag.g:467:4: (lv_path_1_0= rulePath )
            // InternalSwag.g:468:5: lv_path_1_0= rulePath
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualFilterAccess().getPathPathParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_path_1_0=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEqualFilterRule());
              					}
              					set(
              						current,
              						"path",
              						lv_path_1_0,
              						"fr.istic.idm.Swag.Path");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEqualFilterAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalSwag.g:489:3: ( (lv_value_3_0= ruleJsonValue ) )
            // InternalSwag.g:490:4: (lv_value_3_0= ruleJsonValue )
            {
            // InternalSwag.g:490:4: (lv_value_3_0= ruleJsonValue )
            // InternalSwag.g:491:5: lv_value_3_0= ruleJsonValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualFilterAccess().getValueJsonValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleJsonValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEqualFilterRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"fr.istic.idm.Swag.JsonValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualFilter"


    // $ANTLR start "entryRuleExistFilter"
    // InternalSwag.g:512:1: entryRuleExistFilter returns [EObject current=null] : iv_ruleExistFilter= ruleExistFilter EOF ;
    public final EObject entryRuleExistFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistFilter = null;


        try {
            // InternalSwag.g:512:52: (iv_ruleExistFilter= ruleExistFilter EOF )
            // InternalSwag.g:513:2: iv_ruleExistFilter= ruleExistFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExistFilter=ruleExistFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistFilter"


    // $ANTLR start "ruleExistFilter"
    // InternalSwag.g:519:1: ruleExistFilter returns [EObject current=null] : ( () ( (lv_path_1_0= rulePath ) ) otherlv_2= '?' ) ;
    public final EObject ruleExistFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalSwag.g:525:2: ( ( () ( (lv_path_1_0= rulePath ) ) otherlv_2= '?' ) )
            // InternalSwag.g:526:2: ( () ( (lv_path_1_0= rulePath ) ) otherlv_2= '?' )
            {
            // InternalSwag.g:526:2: ( () ( (lv_path_1_0= rulePath ) ) otherlv_2= '?' )
            // InternalSwag.g:527:3: () ( (lv_path_1_0= rulePath ) ) otherlv_2= '?'
            {
            // InternalSwag.g:527:3: ()
            // InternalSwag.g:528:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExistFilterAccess().getExistFilterAction_0(),
              					current);
              			
            }

            }

            // InternalSwag.g:534:3: ( (lv_path_1_0= rulePath ) )
            // InternalSwag.g:535:4: (lv_path_1_0= rulePath )
            {
            // InternalSwag.g:535:4: (lv_path_1_0= rulePath )
            // InternalSwag.g:536:5: lv_path_1_0= rulePath
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExistFilterAccess().getPathPathParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_path_1_0=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExistFilterRule());
              					}
              					set(
              						current,
              						"path",
              						lv_path_1_0,
              						"fr.istic.idm.Swag.Path");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExistFilterAccess().getQuestionMarkKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistFilter"


    // $ANTLR start "entryRuleIndexFilter"
    // InternalSwag.g:561:1: entryRuleIndexFilter returns [EObject current=null] : iv_ruleIndexFilter= ruleIndexFilter EOF ;
    public final EObject entryRuleIndexFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexFilter = null;


        try {
            // InternalSwag.g:561:52: (iv_ruleIndexFilter= ruleIndexFilter EOF )
            // InternalSwag.g:562:2: iv_ruleIndexFilter= ruleIndexFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndexFilter=ruleIndexFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexFilter"


    // $ANTLR start "ruleIndexFilter"
    // InternalSwag.g:568:1: ruleIndexFilter returns [EObject current=null] : ( () ( (lv_index_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIndexFilter() throws RecognitionException {
        EObject current = null;

        Token lv_index_1_0=null;


        	enterRule();

        try {
            // InternalSwag.g:574:2: ( ( () ( (lv_index_1_0= RULE_INT ) ) ) )
            // InternalSwag.g:575:2: ( () ( (lv_index_1_0= RULE_INT ) ) )
            {
            // InternalSwag.g:575:2: ( () ( (lv_index_1_0= RULE_INT ) ) )
            // InternalSwag.g:576:3: () ( (lv_index_1_0= RULE_INT ) )
            {
            // InternalSwag.g:576:3: ()
            // InternalSwag.g:577:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndexFilterAccess().getIndexFilterAction_0(),
              					current);
              			
            }

            }

            // InternalSwag.g:583:3: ( (lv_index_1_0= RULE_INT ) )
            // InternalSwag.g:584:4: (lv_index_1_0= RULE_INT )
            {
            // InternalSwag.g:584:4: (lv_index_1_0= RULE_INT )
            // InternalSwag.g:585:5: lv_index_1_0= RULE_INT
            {
            lv_index_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_index_1_0, grammarAccess.getIndexFilterAccess().getIndexINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIndexFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"index",
              						lv_index_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexFilter"


    // $ANTLR start "entryRuleBoundFilter"
    // InternalSwag.g:605:1: entryRuleBoundFilter returns [EObject current=null] : iv_ruleBoundFilter= ruleBoundFilter EOF ;
    public final EObject entryRuleBoundFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundFilter = null;


        try {
            // InternalSwag.g:605:52: (iv_ruleBoundFilter= ruleBoundFilter EOF )
            // InternalSwag.g:606:2: iv_ruleBoundFilter= ruleBoundFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoundFilter=ruleBoundFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoundFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoundFilter"


    // $ANTLR start "ruleBoundFilter"
    // InternalSwag.g:612:1: ruleBoundFilter returns [EObject current=null] : ( ( () ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )? ) ) | (otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleBoundFilter() throws RecognitionException {
        EObject current = null;

        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;
        Token lv_max_5_0=null;


        	enterRule();

        try {
            // InternalSwag.g:618:2: ( ( ( () ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )? ) ) | (otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) ) ) )
            // InternalSwag.g:619:2: ( ( () ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )? ) ) | (otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) ) )
            {
            // InternalSwag.g:619:2: ( ( () ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )? ) ) | (otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSwag.g:620:3: ( () ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )? ) )
                    {
                    // InternalSwag.g:620:3: ( () ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )? ) )
                    // InternalSwag.g:621:4: () ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )? )
                    {
                    // InternalSwag.g:621:4: ()
                    // InternalSwag.g:622:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBoundFilterAccess().getBoundFilterAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSwag.g:628:4: ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )? )
                    // InternalSwag.g:629:5: ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )?
                    {
                    // InternalSwag.g:629:5: ( (lv_min_1_0= RULE_INT ) )
                    // InternalSwag.g:630:6: (lv_min_1_0= RULE_INT )
                    {
                    // InternalSwag.g:630:6: (lv_min_1_0= RULE_INT )
                    // InternalSwag.g:631:7: lv_min_1_0= RULE_INT
                    {
                    lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_min_1_0, grammarAccess.getBoundFilterAccess().getMinINTTerminalRuleCall_0_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getBoundFilterRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"min",
                      								lv_min_1_0,
                      								"org.eclipse.xtext.common.Terminals.INT");
                      						
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getBoundFilterAccess().getFullStopFullStopKeyword_0_1_1());
                      				
                    }
                    // InternalSwag.g:651:5: ( (lv_max_3_0= RULE_INT ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSwag.g:652:6: (lv_max_3_0= RULE_INT )
                            {
                            // InternalSwag.g:652:6: (lv_max_3_0= RULE_INT )
                            // InternalSwag.g:653:7: lv_max_3_0= RULE_INT
                            {
                            lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_max_3_0, grammarAccess.getBoundFilterAccess().getMaxINTTerminalRuleCall_0_1_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBoundFilterRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"max",
                              								lv_max_3_0,
                              								"org.eclipse.xtext.common.Terminals.INT");
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSwag.g:672:3: (otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) )
                    {
                    // InternalSwag.g:672:3: (otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) ) )
                    // InternalSwag.g:673:4: otherlv_4= '..' ( (lv_max_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getBoundFilterAccess().getFullStopFullStopKeyword_1_0());
                      			
                    }
                    // InternalSwag.g:677:4: ( (lv_max_5_0= RULE_INT ) )
                    // InternalSwag.g:678:5: (lv_max_5_0= RULE_INT )
                    {
                    // InternalSwag.g:678:5: (lv_max_5_0= RULE_INT )
                    // InternalSwag.g:679:6: lv_max_5_0= RULE_INT
                    {
                    lv_max_5_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_max_5_0, grammarAccess.getBoundFilterAccess().getMaxINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBoundFilterRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"max",
                      							lv_max_5_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoundFilter"


    // $ANTLR start "entryRuleListFilter"
    // InternalSwag.g:700:1: entryRuleListFilter returns [EObject current=null] : iv_ruleListFilter= ruleListFilter EOF ;
    public final EObject entryRuleListFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListFilter = null;


        try {
            // InternalSwag.g:700:51: (iv_ruleListFilter= ruleListFilter EOF )
            // InternalSwag.g:701:2: iv_ruleListFilter= ruleListFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListFilter=ruleListFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListFilter"


    // $ANTLR start "ruleListFilter"
    // InternalSwag.g:707:1: ruleListFilter returns [EObject current=null] : ( () ( (lv_filter_1_0= ruleFilter ) ) (otherlv_2= ',' ( (lv_filter_3_0= ruleFilter ) ) )* ) ;
    public final EObject ruleListFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_filter_1_0 = null;

        EObject lv_filter_3_0 = null;



        	enterRule();

        try {
            // InternalSwag.g:713:2: ( ( () ( (lv_filter_1_0= ruleFilter ) ) (otherlv_2= ',' ( (lv_filter_3_0= ruleFilter ) ) )* ) )
            // InternalSwag.g:714:2: ( () ( (lv_filter_1_0= ruleFilter ) ) (otherlv_2= ',' ( (lv_filter_3_0= ruleFilter ) ) )* )
            {
            // InternalSwag.g:714:2: ( () ( (lv_filter_1_0= ruleFilter ) ) (otherlv_2= ',' ( (lv_filter_3_0= ruleFilter ) ) )* )
            // InternalSwag.g:715:3: () ( (lv_filter_1_0= ruleFilter ) ) (otherlv_2= ',' ( (lv_filter_3_0= ruleFilter ) ) )*
            {
            // InternalSwag.g:715:3: ()
            // InternalSwag.g:716:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListFilterAccess().getListFilterAction_0(),
              					current);
              			
            }

            }

            // InternalSwag.g:722:3: ( (lv_filter_1_0= ruleFilter ) )
            // InternalSwag.g:723:4: (lv_filter_1_0= ruleFilter )
            {
            // InternalSwag.g:723:4: (lv_filter_1_0= ruleFilter )
            // InternalSwag.g:724:5: lv_filter_1_0= ruleFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListFilterAccess().getFilterFilterParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_filter_1_0=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListFilterRule());
              					}
              					add(
              						current,
              						"filter",
              						lv_filter_1_0,
              						"fr.istic.idm.Swag.Filter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSwag.g:741:3: (otherlv_2= ',' ( (lv_filter_3_0= ruleFilter ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSwag.g:742:4: otherlv_2= ',' ( (lv_filter_3_0= ruleFilter ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getListFilterAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalSwag.g:746:4: ( (lv_filter_3_0= ruleFilter ) )
            	    // InternalSwag.g:747:5: (lv_filter_3_0= ruleFilter )
            	    {
            	    // InternalSwag.g:747:5: (lv_filter_3_0= ruleFilter )
            	    // InternalSwag.g:748:6: lv_filter_3_0= ruleFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getListFilterAccess().getFilterFilterParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_filter_3_0=ruleFilter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getListFilterRule());
            	      						}
            	      						add(
            	      							current,
            	      							"filter",
            	      							lv_filter_3_0,
            	      							"fr.istic.idm.Swag.Filter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListFilter"


    // $ANTLR start "entryRuleJsonValue"
    // InternalSwag.g:770:1: entryRuleJsonValue returns [EObject current=null] : iv_ruleJsonValue= ruleJsonValue EOF ;
    public final EObject entryRuleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonValue = null;


        try {
            // InternalSwag.g:770:50: (iv_ruleJsonValue= ruleJsonValue EOF )
            // InternalSwag.g:771:2: iv_ruleJsonValue= ruleJsonValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJsonValue=ruleJsonValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonValue"


    // $ANTLR start "ruleJsonValue"
    // InternalSwag.g:777:1: ruleJsonValue returns [EObject current=null] : (this_JsonBoolean_0= ruleJsonBoolean | this_JsonNumber_1= ruleJsonNumber | this_JsonNull_2= ruleJsonNull | this_JsonString_3= ruleJsonString ) ;
    public final EObject ruleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject this_JsonBoolean_0 = null;

        EObject this_JsonNumber_1 = null;

        EObject this_JsonNull_2 = null;

        EObject this_JsonString_3 = null;



        	enterRule();

        try {
            // InternalSwag.g:783:2: ( (this_JsonBoolean_0= ruleJsonBoolean | this_JsonNumber_1= ruleJsonNumber | this_JsonNull_2= ruleJsonNull | this_JsonString_3= ruleJsonString ) )
            // InternalSwag.g:784:2: (this_JsonBoolean_0= ruleJsonBoolean | this_JsonNumber_1= ruleJsonNumber | this_JsonNull_2= ruleJsonNull | this_JsonString_3= ruleJsonString )
            {
            // InternalSwag.g:784:2: (this_JsonBoolean_0= ruleJsonBoolean | this_JsonNumber_1= ruleJsonNumber | this_JsonNull_2= ruleJsonNull | this_JsonString_3= ruleJsonString )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
                {
                alt12=2;
                }
                break;
            case 19:
                {
                alt12=3;
                }
                break;
            case RULE_STRING:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSwag.g:785:3: this_JsonBoolean_0= ruleJsonBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getJsonBooleanParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JsonBoolean_0=ruleJsonBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonBoolean_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSwag.g:794:3: this_JsonNumber_1= ruleJsonNumber
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getJsonNumberParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JsonNumber_1=ruleJsonNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonNumber_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSwag.g:803:3: this_JsonNull_2= ruleJsonNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getJsonNullParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JsonNull_2=ruleJsonNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonNull_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSwag.g:812:3: this_JsonString_3= ruleJsonString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getJsonStringParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JsonString_3=ruleJsonString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonString_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonValue"


    // $ANTLR start "entryRuleJsonNull"
    // InternalSwag.g:824:1: entryRuleJsonNull returns [EObject current=null] : iv_ruleJsonNull= ruleJsonNull EOF ;
    public final EObject entryRuleJsonNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonNull = null;


        try {
            // InternalSwag.g:824:49: (iv_ruleJsonNull= ruleJsonNull EOF )
            // InternalSwag.g:825:2: iv_ruleJsonNull= ruleJsonNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJsonNull=ruleJsonNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonNull"


    // $ANTLR start "ruleJsonNull"
    // InternalSwag.g:831:1: ruleJsonNull returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleJsonNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSwag.g:837:2: ( ( () otherlv_1= 'null' ) )
            // InternalSwag.g:838:2: ( () otherlv_1= 'null' )
            {
            // InternalSwag.g:838:2: ( () otherlv_1= 'null' )
            // InternalSwag.g:839:3: () otherlv_1= 'null'
            {
            // InternalSwag.g:839:3: ()
            // InternalSwag.g:840:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJsonNullAccess().getJsonNullAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonNullAccess().getNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonNull"


    // $ANTLR start "entryRuleJsonNumber"
    // InternalSwag.g:854:1: entryRuleJsonNumber returns [EObject current=null] : iv_ruleJsonNumber= ruleJsonNumber EOF ;
    public final EObject entryRuleJsonNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonNumber = null;


        try {
            // InternalSwag.g:854:51: (iv_ruleJsonNumber= ruleJsonNumber EOF )
            // InternalSwag.g:855:2: iv_ruleJsonNumber= ruleJsonNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJsonNumber=ruleJsonNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonNumber"


    // $ANTLR start "ruleJsonNumber"
    // InternalSwag.g:861:1: ruleJsonNumber returns [EObject current=null] : ( () ( (lv_number_1_0= RULE_INT ) ) (otherlv_2= '.' this_INT_3= RULE_INT )? ) ;
    public final EObject ruleJsonNumber() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;
        Token otherlv_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalSwag.g:867:2: ( ( () ( (lv_number_1_0= RULE_INT ) ) (otherlv_2= '.' this_INT_3= RULE_INT )? ) )
            // InternalSwag.g:868:2: ( () ( (lv_number_1_0= RULE_INT ) ) (otherlv_2= '.' this_INT_3= RULE_INT )? )
            {
            // InternalSwag.g:868:2: ( () ( (lv_number_1_0= RULE_INT ) ) (otherlv_2= '.' this_INT_3= RULE_INT )? )
            // InternalSwag.g:869:3: () ( (lv_number_1_0= RULE_INT ) ) (otherlv_2= '.' this_INT_3= RULE_INT )?
            {
            // InternalSwag.g:869:3: ()
            // InternalSwag.g:870:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJsonNumberAccess().getJsonNumberAction_0(),
              					current);
              			
            }

            }

            // InternalSwag.g:876:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalSwag.g:877:4: (lv_number_1_0= RULE_INT )
            {
            // InternalSwag.g:877:4: (lv_number_1_0= RULE_INT )
            // InternalSwag.g:878:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_number_1_0, grammarAccess.getJsonNumberAccess().getNumberINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJsonNumberRule());
              					}
              					setWithLastConsumed(
              						current,
              						"number",
              						lv_number_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalSwag.g:894:3: (otherlv_2= '.' this_INT_3= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSwag.g:895:4: otherlv_2= '.' this_INT_3= RULE_INT
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getJsonNumberAccess().getFullStopKeyword_2_0());
                      			
                    }
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_3, grammarAccess.getJsonNumberAccess().getINTTerminalRuleCall_2_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonNumber"


    // $ANTLR start "entryRuleJsonBoolean"
    // InternalSwag.g:908:1: entryRuleJsonBoolean returns [EObject current=null] : iv_ruleJsonBoolean= ruleJsonBoolean EOF ;
    public final EObject entryRuleJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonBoolean = null;


        try {
            // InternalSwag.g:908:52: (iv_ruleJsonBoolean= ruleJsonBoolean EOF )
            // InternalSwag.g:909:2: iv_ruleJsonBoolean= ruleJsonBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJsonBoolean=ruleJsonBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonBoolean"


    // $ANTLR start "ruleJsonBoolean"
    // InternalSwag.g:915:1: ruleJsonBoolean returns [EObject current=null] : ( () ( ( (lv_bool_1_1= 'true' | lv_bool_1_2= 'false' ) ) ) ) ;
    public final EObject ruleJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_bool_1_1=null;
        Token lv_bool_1_2=null;


        	enterRule();

        try {
            // InternalSwag.g:921:2: ( ( () ( ( (lv_bool_1_1= 'true' | lv_bool_1_2= 'false' ) ) ) ) )
            // InternalSwag.g:922:2: ( () ( ( (lv_bool_1_1= 'true' | lv_bool_1_2= 'false' ) ) ) )
            {
            // InternalSwag.g:922:2: ( () ( ( (lv_bool_1_1= 'true' | lv_bool_1_2= 'false' ) ) ) )
            // InternalSwag.g:923:3: () ( ( (lv_bool_1_1= 'true' | lv_bool_1_2= 'false' ) ) )
            {
            // InternalSwag.g:923:3: ()
            // InternalSwag.g:924:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJsonBooleanAccess().getJsonBooleanAction_0(),
              					current);
              			
            }

            }

            // InternalSwag.g:930:3: ( ( (lv_bool_1_1= 'true' | lv_bool_1_2= 'false' ) ) )
            // InternalSwag.g:931:4: ( (lv_bool_1_1= 'true' | lv_bool_1_2= 'false' ) )
            {
            // InternalSwag.g:931:4: ( (lv_bool_1_1= 'true' | lv_bool_1_2= 'false' ) )
            // InternalSwag.g:932:5: (lv_bool_1_1= 'true' | lv_bool_1_2= 'false' )
            {
            // InternalSwag.g:932:5: (lv_bool_1_1= 'true' | lv_bool_1_2= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==21) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSwag.g:933:6: lv_bool_1_1= 'true'
                    {
                    lv_bool_1_1=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_bool_1_1, grammarAccess.getJsonBooleanAccess().getBoolTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getJsonBooleanRule());
                      						}
                      						setWithLastConsumed(current, "bool", lv_bool_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSwag.g:944:6: lv_bool_1_2= 'false'
                    {
                    lv_bool_1_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_bool_1_2, grammarAccess.getJsonBooleanAccess().getBoolFalseKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getJsonBooleanRule());
                      						}
                      						setWithLastConsumed(current, "bool", lv_bool_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonBoolean"


    // $ANTLR start "entryRuleJsonString"
    // InternalSwag.g:961:1: entryRuleJsonString returns [EObject current=null] : iv_ruleJsonString= ruleJsonString EOF ;
    public final EObject entryRuleJsonString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonString = null;


        try {
            // InternalSwag.g:961:51: (iv_ruleJsonString= ruleJsonString EOF )
            // InternalSwag.g:962:2: iv_ruleJsonString= ruleJsonString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJsonString=ruleJsonString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonString"


    // $ANTLR start "ruleJsonString"
    // InternalSwag.g:968:1: ruleJsonString returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleJsonString() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSwag.g:974:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalSwag.g:975:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalSwag.g:975:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalSwag.g:976:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalSwag.g:976:3: ()
            // InternalSwag.g:977:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJsonStringAccess().getJsonStringAction_0(),
              					current);
              			
            }

            }

            // InternalSwag.g:983:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalSwag.g:984:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalSwag.g:984:4: (lv_value_1_0= RULE_STRING )
            // InternalSwag.g:985:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getJsonStringAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJsonStringRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonString"

    // $ANTLR start synpred1_InternalSwag
    public final void synpred1_InternalSwag_fragment() throws RecognitionException {   
        // InternalSwag.g:421:4: ( ruleExistFilter )
        // InternalSwag.g:421:5: ruleExistFilter
        {
        pushFollow(FOLLOW_2);
        ruleExistFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSwag

    // Delegated rules

    public final boolean synpred1_InternalSwag() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSwag_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003E070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000380060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000003C070L});

}