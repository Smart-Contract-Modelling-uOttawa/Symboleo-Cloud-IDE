package symboleoci.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import symboleoci.services.SymboleociGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSymboleociParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Domain'", "';'", "'endDomain'", "'isA'", "'with'", "','", "'Enumeration'", "'('", "')'", "'NUMBER'", "'STRING'", "'DATE'", "'ASSET'", "'EVENT'", "'ROLE'", "'SITUATION'", "'CONTRACT'", "'Contract'", "'Declarations'", "'Preconditions'", "'Postconditions'", "'Obligations'", "'SurvivingObls'", "'Powers'", "'Constraints'", "'endContract'", "':='", "':'", "'->'", "'O'", "'OR'", "'AND'", "'NOT'", "'within'", "'exists'", "'|'", "'forAll'", "'TRUE'", "'FALSE'", "'occurs'", "'happens'", "'CannotBeAssigned'", "'['", "']'", "'UNNAMED_INTERVAL'", "'SECONDS'", "'MINUTES'", "'HOURS'", "'DAYS'", "'WEEKS'", "'MONTHS'", "'QUARTERS'", "'YEARS'", "'BEFORE'", "'AFTER'", "'AT'", "'WITHIN'", "'+'", "'-'", "'UNNAMED_POINT'", "'pTRIGGERED'", "'pACTIVATED'", "'pSUSPENDED'", "'pRESUMED'", "'pEXERTED'", "'pEXPIRED'", "'pTERMINATED'", "'cACTIVATED'", "'cSUSPENDED'", "'cRESUMED'", "'cFULFILLED_ACTIVE_OBLS'", "'cREVOKED_PARTY'", "'cASSIGNED_PARTY'", "'cTERMINATED'", "'oTRIGGERED'", "'oACTIVATED'", "'oSUSPENDED'", "'oRESUMED'", "'oDISCHARGED'", "'oEXPIRED'", "'oFULFILLED'", "'oVIOLATED'", "'oTERMINATED'", "'oCREATE'", "'oINEFFECT'", "'oSUSPENSION'", "'oSUCCESSFUL_TERMINATION'", "'oUNSUCCESSFUL_TERMINATION'", "'oVIOLATION'", "'oFULFILLMENT'", "'oDISCHARGE'", "'cFORM'", "'cINEFFECT'", "'cSUSPENSION'", "'cSUCCESSFUL_TERMINATION'", "'cUNSECCESSFUL_TERMINATION'", "'cUNASSIGN'", "'P'", "'pCREATE'", "'pINEFFECT'", "'pSUSPENSION'", "'pSUCCESSFUL_TERMINATION'", "'pUNSUCCESSFUL_TERMINATION'", "'self.'", "'obligation.instance'", "'power.instance'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSymboleociParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSymboleociParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSymboleociParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSymboleoci.g"; }



     	private SymboleociGrammarAccess grammarAccess;

        public InternalSymboleociParser(TokenStream input, SymboleociGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ContractSpec";
       	}

       	@Override
       	protected SymboleociGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContractSpec"
    // InternalSymboleoci.g:64:1: entryRuleContractSpec returns [EObject current=null] : iv_ruleContractSpec= ruleContractSpec EOF ;
    public final EObject entryRuleContractSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractSpec = null;


        try {
            // InternalSymboleoci.g:64:53: (iv_ruleContractSpec= ruleContractSpec EOF )
            // InternalSymboleoci.g:65:2: iv_ruleContractSpec= ruleContractSpec EOF
            {
             newCompositeNode(grammarAccess.getContractSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContractSpec=ruleContractSpec();

            state._fsp--;

             current =iv_ruleContractSpec; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContractSpec"


    // $ANTLR start "ruleContractSpec"
    // InternalSymboleoci.g:71:1: ruleContractSpec returns [EObject current=null] : ( ( (lv_domainSpecs_0_0= ruleDomainSpec ) ) ( (lv_contracts_1_0= ruleContract ) ) ) ;
    public final EObject ruleContractSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_domainSpecs_0_0 = null;

        EObject lv_contracts_1_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:77:2: ( ( ( (lv_domainSpecs_0_0= ruleDomainSpec ) ) ( (lv_contracts_1_0= ruleContract ) ) ) )
            // InternalSymboleoci.g:78:2: ( ( (lv_domainSpecs_0_0= ruleDomainSpec ) ) ( (lv_contracts_1_0= ruleContract ) ) )
            {
            // InternalSymboleoci.g:78:2: ( ( (lv_domainSpecs_0_0= ruleDomainSpec ) ) ( (lv_contracts_1_0= ruleContract ) ) )
            // InternalSymboleoci.g:79:3: ( (lv_domainSpecs_0_0= ruleDomainSpec ) ) ( (lv_contracts_1_0= ruleContract ) )
            {
            // InternalSymboleoci.g:79:3: ( (lv_domainSpecs_0_0= ruleDomainSpec ) )
            // InternalSymboleoci.g:80:4: (lv_domainSpecs_0_0= ruleDomainSpec )
            {
            // InternalSymboleoci.g:80:4: (lv_domainSpecs_0_0= ruleDomainSpec )
            // InternalSymboleoci.g:81:5: lv_domainSpecs_0_0= ruleDomainSpec
            {

            					newCompositeNode(grammarAccess.getContractSpecAccess().getDomainSpecsDomainSpecParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_domainSpecs_0_0=ruleDomainSpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractSpecRule());
            					}
            					add(
            						current,
            						"domainSpecs",
            						lv_domainSpecs_0_0,
            						"symboleoci.Symboleoci.DomainSpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSymboleoci.g:98:3: ( (lv_contracts_1_0= ruleContract ) )
            // InternalSymboleoci.g:99:4: (lv_contracts_1_0= ruleContract )
            {
            // InternalSymboleoci.g:99:4: (lv_contracts_1_0= ruleContract )
            // InternalSymboleoci.g:100:5: lv_contracts_1_0= ruleContract
            {

            					newCompositeNode(grammarAccess.getContractSpecAccess().getContractsContractParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_contracts_1_0=ruleContract();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractSpecRule());
            					}
            					add(
            						current,
            						"contracts",
            						lv_contracts_1_0,
            						"symboleoci.Symboleoci.Contract");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContractSpec"


    // $ANTLR start "entryRuleDomainSpec"
    // InternalSymboleoci.g:121:1: entryRuleDomainSpec returns [EObject current=null] : iv_ruleDomainSpec= ruleDomainSpec EOF ;
    public final EObject entryRuleDomainSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpec = null;


        try {
            // InternalSymboleoci.g:121:51: (iv_ruleDomainSpec= ruleDomainSpec EOF )
            // InternalSymboleoci.g:122:2: iv_ruleDomainSpec= ruleDomainSpec EOF
            {
             newCompositeNode(grammarAccess.getDomainSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainSpec=ruleDomainSpec();

            state._fsp--;

             current =iv_ruleDomainSpec; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomainSpec"


    // $ANTLR start "ruleDomainSpec"
    // InternalSymboleoci.g:128:1: ruleDomainSpec returns [EObject current=null] : (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dConcepts_2_0= ruleDConcept ) ) otherlv_3= ';' )+ ( (lv_ctypes_4_0= ruleCType ) )? otherlv_5= 'endDomain' ) ;
    public final EObject ruleDomainSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dConcepts_2_0 = null;

        EObject lv_ctypes_4_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:134:2: ( (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dConcepts_2_0= ruleDConcept ) ) otherlv_3= ';' )+ ( (lv_ctypes_4_0= ruleCType ) )? otherlv_5= 'endDomain' ) )
            // InternalSymboleoci.g:135:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dConcepts_2_0= ruleDConcept ) ) otherlv_3= ';' )+ ( (lv_ctypes_4_0= ruleCType ) )? otherlv_5= 'endDomain' )
            {
            // InternalSymboleoci.g:135:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dConcepts_2_0= ruleDConcept ) ) otherlv_3= ';' )+ ( (lv_ctypes_4_0= ruleCType ) )? otherlv_5= 'endDomain' )
            // InternalSymboleoci.g:136:3: otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dConcepts_2_0= ruleDConcept ) ) otherlv_3= ';' )+ ( (lv_ctypes_4_0= ruleCType ) )? otherlv_5= 'endDomain'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainSpecAccess().getDomainKeyword_0());
            		
            // InternalSymboleoci.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSymboleoci.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSymboleoci.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalSymboleoci.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainSpecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSymboleoci.g:158:3: ( ( (lv_dConcepts_2_0= ruleDConcept ) ) otherlv_3= ';' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==14) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalSymboleoci.g:159:4: ( (lv_dConcepts_2_0= ruleDConcept ) ) otherlv_3= ';'
            	    {
            	    // InternalSymboleoci.g:159:4: ( (lv_dConcepts_2_0= ruleDConcept ) )
            	    // InternalSymboleoci.g:160:5: (lv_dConcepts_2_0= ruleDConcept )
            	    {
            	    // InternalSymboleoci.g:160:5: (lv_dConcepts_2_0= ruleDConcept )
            	    // InternalSymboleoci.g:161:6: lv_dConcepts_2_0= ruleDConcept
            	    {

            	    						newCompositeNode(grammarAccess.getDomainSpecAccess().getDConceptsDConceptParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_dConcepts_2_0=ruleDConcept();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDomainSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dConcepts",
            	    							lv_dConcepts_2_0,
            	    							"symboleoci.Symboleoci.DConcept");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDomainSpecAccess().getSemicolonKeyword_2_1());
            	    			

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

            // InternalSymboleoci.g:183:3: ( (lv_ctypes_4_0= ruleCType ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=20 && LA2_0<=27)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSymboleoci.g:184:4: (lv_ctypes_4_0= ruleCType )
                    {
                    // InternalSymboleoci.g:184:4: (lv_ctypes_4_0= ruleCType )
                    // InternalSymboleoci.g:185:5: lv_ctypes_4_0= ruleCType
                    {

                    					newCompositeNode(grammarAccess.getDomainSpecAccess().getCtypesCTypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_ctypes_4_0=ruleCType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDomainSpecRule());
                    					}
                    					add(
                    						current,
                    						"ctypes",
                    						lv_ctypes_4_0,
                    						"symboleoci.Symboleoci.CType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainSpecAccess().getEndDomainKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainSpec"


    // $ANTLR start "entryRuleDConcept"
    // InternalSymboleoci.g:210:1: entryRuleDConcept returns [EObject current=null] : iv_ruleDConcept= ruleDConcept EOF ;
    public final EObject entryRuleDConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConcept = null;


        try {
            // InternalSymboleoci.g:210:49: (iv_ruleDConcept= ruleDConcept EOF )
            // InternalSymboleoci.g:211:2: iv_ruleDConcept= ruleDConcept EOF
            {
             newCompositeNode(grammarAccess.getDConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDConcept=ruleDConcept();

            state._fsp--;

             current =iv_ruleDConcept; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDConcept"


    // $ANTLR start "ruleDConcept"
    // InternalSymboleoci.g:217:1: ruleDConcept returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'isA' ( (lv_conceptTypes_2_0= ruleCType ) ) ) (otherlv_3= 'with' )? ( ( (lv_attributes_4_0= ruleAtt ) ) otherlv_5= ',' )* ( (lv_attributes_6_0= ruleAtt ) )? ) | ( ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'isA' otherlv_9= 'Enumeration' otherlv_10= '(' ( ( (lv_enumerationItems_11_0= ruleenumItem ) ) otherlv_12= ',' )* ( (lv_enumerationItems_13_0= ruleenumItem ) ) otherlv_14= ')' ) ) ;
    public final EObject ruleDConcept() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_conceptTypes_2_0 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_enumerationItems_11_0 = null;

        EObject lv_enumerationItems_13_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:223:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'isA' ( (lv_conceptTypes_2_0= ruleCType ) ) ) (otherlv_3= 'with' )? ( ( (lv_attributes_4_0= ruleAtt ) ) otherlv_5= ',' )* ( (lv_attributes_6_0= ruleAtt ) )? ) | ( ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'isA' otherlv_9= 'Enumeration' otherlv_10= '(' ( ( (lv_enumerationItems_11_0= ruleenumItem ) ) otherlv_12= ',' )* ( (lv_enumerationItems_13_0= ruleenumItem ) ) otherlv_14= ')' ) ) )
            // InternalSymboleoci.g:224:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'isA' ( (lv_conceptTypes_2_0= ruleCType ) ) ) (otherlv_3= 'with' )? ( ( (lv_attributes_4_0= ruleAtt ) ) otherlv_5= ',' )* ( (lv_attributes_6_0= ruleAtt ) )? ) | ( ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'isA' otherlv_9= 'Enumeration' otherlv_10= '(' ( ( (lv_enumerationItems_11_0= ruleenumItem ) ) otherlv_12= ',' )* ( (lv_enumerationItems_13_0= ruleenumItem ) ) otherlv_14= ')' ) )
            {
            // InternalSymboleoci.g:224:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'isA' ( (lv_conceptTypes_2_0= ruleCType ) ) ) (otherlv_3= 'with' )? ( ( (lv_attributes_4_0= ruleAtt ) ) otherlv_5= ',' )* ( (lv_attributes_6_0= ruleAtt ) )? ) | ( ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'isA' otherlv_9= 'Enumeration' otherlv_10= '(' ( ( (lv_enumerationItems_11_0= ruleenumItem ) ) otherlv_12= ',' )* ( (lv_enumerationItems_13_0= ruleenumItem ) ) otherlv_14= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==14) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==17) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==RULE_ID||(LA7_2>=20 && LA7_2<=27)) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSymboleoci.g:225:3: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'isA' ( (lv_conceptTypes_2_0= ruleCType ) ) ) (otherlv_3= 'with' )? ( ( (lv_attributes_4_0= ruleAtt ) ) otherlv_5= ',' )* ( (lv_attributes_6_0= ruleAtt ) )? )
                    {
                    // InternalSymboleoci.g:225:3: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'isA' ( (lv_conceptTypes_2_0= ruleCType ) ) ) (otherlv_3= 'with' )? ( ( (lv_attributes_4_0= ruleAtt ) ) otherlv_5= ',' )* ( (lv_attributes_6_0= ruleAtt ) )? )
                    // InternalSymboleoci.g:226:4: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'isA' ( (lv_conceptTypes_2_0= ruleCType ) ) ) (otherlv_3= 'with' )? ( ( (lv_attributes_4_0= ruleAtt ) ) otherlv_5= ',' )* ( (lv_attributes_6_0= ruleAtt ) )?
                    {
                    // InternalSymboleoci.g:226:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalSymboleoci.g:227:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalSymboleoci.g:227:5: (lv_name_0_0= RULE_ID )
                    // InternalSymboleoci.g:228:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getDConceptAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDConceptRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSymboleoci.g:244:4: (otherlv_1= 'isA' ( (lv_conceptTypes_2_0= ruleCType ) ) )
                    // InternalSymboleoci.g:245:5: otherlv_1= 'isA' ( (lv_conceptTypes_2_0= ruleCType ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_9); 

                    					newLeafNode(otherlv_1, grammarAccess.getDConceptAccess().getIsAKeyword_0_1_0());
                    				
                    // InternalSymboleoci.g:249:5: ( (lv_conceptTypes_2_0= ruleCType ) )
                    // InternalSymboleoci.g:250:6: (lv_conceptTypes_2_0= ruleCType )
                    {
                    // InternalSymboleoci.g:250:6: (lv_conceptTypes_2_0= ruleCType )
                    // InternalSymboleoci.g:251:7: lv_conceptTypes_2_0= ruleCType
                    {

                    							newCompositeNode(grammarAccess.getDConceptAccess().getConceptTypesCTypeParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_conceptTypes_2_0=ruleCType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDConceptRule());
                    							}
                    							add(
                    								current,
                    								"conceptTypes",
                    								lv_conceptTypes_2_0,
                    								"symboleoci.Symboleoci.CType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalSymboleoci.g:269:4: (otherlv_3= 'with' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==15) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSymboleoci.g:270:5: otherlv_3= 'with'
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_11); 

                            					newLeafNode(otherlv_3, grammarAccess.getDConceptAccess().getWithKeyword_0_2());
                            				

                            }
                            break;

                    }

                    // InternalSymboleoci.g:275:4: ( ( (lv_attributes_4_0= ruleAtt ) ) otherlv_5= ',' )*
                    loop4:
                    do {
                        int alt4=2;
                        alt4 = dfa4.predict(input);
                        switch (alt4) {
                    	case 1 :
                    	    // InternalSymboleoci.g:276:5: ( (lv_attributes_4_0= ruleAtt ) ) otherlv_5= ','
                    	    {
                    	    // InternalSymboleoci.g:276:5: ( (lv_attributes_4_0= ruleAtt ) )
                    	    // InternalSymboleoci.g:277:6: (lv_attributes_4_0= ruleAtt )
                    	    {
                    	    // InternalSymboleoci.g:277:6: (lv_attributes_4_0= ruleAtt )
                    	    // InternalSymboleoci.g:278:7: lv_attributes_4_0= ruleAtt
                    	    {

                    	    							newCompositeNode(grammarAccess.getDConceptAccess().getAttributesAttParserRuleCall_0_3_0_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_attributes_4_0=ruleAtt();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDConceptRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_4_0,
                    	    								"symboleoci.Symboleoci.Att");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDConceptAccess().getCommaKeyword_0_3_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalSymboleoci.g:300:4: ( (lv_attributes_6_0= ruleAtt ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSymboleoci.g:301:5: (lv_attributes_6_0= ruleAtt )
                            {
                            // InternalSymboleoci.g:301:5: (lv_attributes_6_0= ruleAtt )
                            // InternalSymboleoci.g:302:6: lv_attributes_6_0= ruleAtt
                            {

                            						newCompositeNode(grammarAccess.getDConceptAccess().getAttributesAttParserRuleCall_0_4_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_attributes_6_0=ruleAtt();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getDConceptRule());
                            						}
                            						add(
                            							current,
                            							"attributes",
                            							lv_attributes_6_0,
                            							"symboleoci.Symboleoci.Att");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:321:3: ( ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'isA' otherlv_9= 'Enumeration' otherlv_10= '(' ( ( (lv_enumerationItems_11_0= ruleenumItem ) ) otherlv_12= ',' )* ( (lv_enumerationItems_13_0= ruleenumItem ) ) otherlv_14= ')' )
                    {
                    // InternalSymboleoci.g:321:3: ( ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'isA' otherlv_9= 'Enumeration' otherlv_10= '(' ( ( (lv_enumerationItems_11_0= ruleenumItem ) ) otherlv_12= ',' )* ( (lv_enumerationItems_13_0= ruleenumItem ) ) otherlv_14= ')' )
                    // InternalSymboleoci.g:322:4: ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'isA' otherlv_9= 'Enumeration' otherlv_10= '(' ( ( (lv_enumerationItems_11_0= ruleenumItem ) ) otherlv_12= ',' )* ( (lv_enumerationItems_13_0= ruleenumItem ) ) otherlv_14= ')'
                    {
                    // InternalSymboleoci.g:322:4: ( (lv_name_7_0= RULE_ID ) )
                    // InternalSymboleoci.g:323:5: (lv_name_7_0= RULE_ID )
                    {
                    // InternalSymboleoci.g:323:5: (lv_name_7_0= RULE_ID )
                    // InternalSymboleoci.g:324:6: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_7_0, grammarAccess.getDConceptAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDConceptRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getDConceptAccess().getIsAKeyword_1_1());
                    			
                    otherlv_9=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getDConceptAccess().getEnumerationKeyword_1_2());
                    			
                    otherlv_10=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getDConceptAccess().getLeftParenthesisKeyword_1_3());
                    			
                    // InternalSymboleoci.g:352:4: ( ( (lv_enumerationItems_11_0= ruleenumItem ) ) otherlv_12= ',' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==16) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSymboleoci.g:353:5: ( (lv_enumerationItems_11_0= ruleenumItem ) ) otherlv_12= ','
                    	    {
                    	    // InternalSymboleoci.g:353:5: ( (lv_enumerationItems_11_0= ruleenumItem ) )
                    	    // InternalSymboleoci.g:354:6: (lv_enumerationItems_11_0= ruleenumItem )
                    	    {
                    	    // InternalSymboleoci.g:354:6: (lv_enumerationItems_11_0= ruleenumItem )
                    	    // InternalSymboleoci.g:355:7: lv_enumerationItems_11_0= ruleenumItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getDConceptAccess().getEnumerationItemsEnumItemParserRuleCall_1_4_0_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_enumerationItems_11_0=ruleenumItem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDConceptRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"enumerationItems",
                    	    								lv_enumerationItems_11_0,
                    	    								"symboleoci.Symboleoci.enumItem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDConceptAccess().getCommaKeyword_1_4_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalSymboleoci.g:377:4: ( (lv_enumerationItems_13_0= ruleenumItem ) )
                    // InternalSymboleoci.g:378:5: (lv_enumerationItems_13_0= ruleenumItem )
                    {
                    // InternalSymboleoci.g:378:5: (lv_enumerationItems_13_0= ruleenumItem )
                    // InternalSymboleoci.g:379:6: lv_enumerationItems_13_0= ruleenumItem
                    {

                    						newCompositeNode(grammarAccess.getDConceptAccess().getEnumerationItemsEnumItemParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_enumerationItems_13_0=ruleenumItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDConceptRule());
                    						}
                    						add(
                    							current,
                    							"enumerationItems",
                    							lv_enumerationItems_13_0,
                    							"symboleoci.Symboleoci.enumItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getDConceptAccess().getRightParenthesisKeyword_1_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDConcept"


    // $ANTLR start "entryRuleenumItem"
    // InternalSymboleoci.g:405:1: entryRuleenumItem returns [EObject current=null] : iv_ruleenumItem= ruleenumItem EOF ;
    public final EObject entryRuleenumItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumItem = null;


        try {
            // InternalSymboleoci.g:405:49: (iv_ruleenumItem= ruleenumItem EOF )
            // InternalSymboleoci.g:406:2: iv_ruleenumItem= ruleenumItem EOF
            {
             newCompositeNode(grammarAccess.getEnumItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleenumItem=ruleenumItem();

            state._fsp--;

             current =iv_ruleenumItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleenumItem"


    // $ANTLR start "ruleenumItem"
    // InternalSymboleoci.g:412:1: ruleenumItem returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleenumItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:418:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSymboleoci.g:419:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSymboleoci.g:419:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSymboleoci.g:420:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSymboleoci.g:420:3: ()
            // InternalSymboleoci.g:421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumItemAccess().getEnumItemAction_0(),
            					current);
            			

            }

            // InternalSymboleoci.g:427:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSymboleoci.g:428:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSymboleoci.g:428:4: (lv_name_1_0= RULE_ID )
            // InternalSymboleoci.g:429:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenumItem"


    // $ANTLR start "entryRuleCType"
    // InternalSymboleoci.g:449:1: entryRuleCType returns [EObject current=null] : iv_ruleCType= ruleCType EOF ;
    public final EObject entryRuleCType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCType = null;


        try {
            // InternalSymboleoci.g:449:46: (iv_ruleCType= ruleCType EOF )
            // InternalSymboleoci.g:450:2: iv_ruleCType= ruleCType EOF
            {
             newCompositeNode(grammarAccess.getCTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCType=ruleCType();

            state._fsp--;

             current =iv_ruleCType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCType"


    // $ANTLR start "ruleCType"
    // InternalSymboleoci.g:456:1: ruleCType returns [EObject current=null] : (this_DomainType_0= ruleDomainType | ( () ruleOntoCType ) | ( () ruleBasicType ) ) ;
    public final EObject ruleCType() throws RecognitionException {
        EObject current = null;

        EObject this_DomainType_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:462:2: ( (this_DomainType_0= ruleDomainType | ( () ruleOntoCType ) | ( () ruleBasicType ) ) )
            // InternalSymboleoci.g:463:2: (this_DomainType_0= ruleDomainType | ( () ruleOntoCType ) | ( () ruleBasicType ) )
            {
            // InternalSymboleoci.g:463:2: (this_DomainType_0= ruleDomainType | ( () ruleOntoCType ) | ( () ruleBasicType ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt8=2;
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSymboleoci.g:464:3: this_DomainType_0= ruleDomainType
                    {

                    			newCompositeNode(grammarAccess.getCTypeAccess().getDomainTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DomainType_0=ruleDomainType();

                    state._fsp--;


                    			current = this_DomainType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:473:3: ( () ruleOntoCType )
                    {
                    // InternalSymboleoci.g:473:3: ( () ruleOntoCType )
                    // InternalSymboleoci.g:474:4: () ruleOntoCType
                    {
                    // InternalSymboleoci.g:474:4: ()
                    // InternalSymboleoci.g:475:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCTypeAccess().getCTypeAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getCTypeAccess().getOntoCTypeParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleOntoCType();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:490:3: ( () ruleBasicType )
                    {
                    // InternalSymboleoci.g:490:3: ( () ruleBasicType )
                    // InternalSymboleoci.g:491:4: () ruleBasicType
                    {
                    // InternalSymboleoci.g:491:4: ()
                    // InternalSymboleoci.g:492:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCTypeAccess().getCTypeAction_2_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getCTypeAccess().getBasicTypeParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCType"


    // $ANTLR start "entryRuleDomainType"
    // InternalSymboleoci.g:510:1: entryRuleDomainType returns [EObject current=null] : iv_ruleDomainType= ruleDomainType EOF ;
    public final EObject entryRuleDomainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainType = null;


        try {
            // InternalSymboleoci.g:510:51: (iv_ruleDomainType= ruleDomainType EOF )
            // InternalSymboleoci.g:511:2: iv_ruleDomainType= ruleDomainType EOF
            {
             newCompositeNode(grammarAccess.getDomainTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainType=ruleDomainType();

            state._fsp--;

             current =iv_ruleDomainType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomainType"


    // $ANTLR start "ruleDomainType"
    // InternalSymboleoci.g:517:1: ruleDomainType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDomainType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:523:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSymboleoci.g:524:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSymboleoci.g:524:2: ( (otherlv_0= RULE_ID ) )
            // InternalSymboleoci.g:525:3: (otherlv_0= RULE_ID )
            {
            // InternalSymboleoci.g:525:3: (otherlv_0= RULE_ID )
            // InternalSymboleoci.g:526:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDomainTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getDomainTypeAccess().getDtypesDConceptCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainType"


    // $ANTLR start "entryRuleBasicType"
    // InternalSymboleoci.g:540:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // InternalSymboleoci.g:540:49: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalSymboleoci.g:541:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalSymboleoci.g:547:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NUMBER' | kw= 'STRING' | kw= 'DATE' ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:553:2: ( (kw= 'NUMBER' | kw= 'STRING' | kw= 'DATE' ) )
            // InternalSymboleoci.g:554:2: (kw= 'NUMBER' | kw= 'STRING' | kw= 'DATE' )
            {
            // InternalSymboleoci.g:554:2: (kw= 'NUMBER' | kw= 'STRING' | kw= 'DATE' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSymboleoci.g:555:3: kw= 'NUMBER'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getNUMBERKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:561:3: kw= 'STRING'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getSTRINGKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:567:3: kw= 'DATE'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getDATEKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleOntoCType"
    // InternalSymboleoci.g:576:1: entryRuleOntoCType returns [String current=null] : iv_ruleOntoCType= ruleOntoCType EOF ;
    public final String entryRuleOntoCType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOntoCType = null;


        try {
            // InternalSymboleoci.g:576:49: (iv_ruleOntoCType= ruleOntoCType EOF )
            // InternalSymboleoci.g:577:2: iv_ruleOntoCType= ruleOntoCType EOF
            {
             newCompositeNode(grammarAccess.getOntoCTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntoCType=ruleOntoCType();

            state._fsp--;

             current =iv_ruleOntoCType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOntoCType"


    // $ANTLR start "ruleOntoCType"
    // InternalSymboleoci.g:583:1: ruleOntoCType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ASSET' | kw= 'EVENT' | kw= 'ROLE' | kw= 'SITUATION' | kw= 'CONTRACT' ) ;
    public final AntlrDatatypeRuleToken ruleOntoCType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:589:2: ( (kw= 'ASSET' | kw= 'EVENT' | kw= 'ROLE' | kw= 'SITUATION' | kw= 'CONTRACT' ) )
            // InternalSymboleoci.g:590:2: (kw= 'ASSET' | kw= 'EVENT' | kw= 'ROLE' | kw= 'SITUATION' | kw= 'CONTRACT' )
            {
            // InternalSymboleoci.g:590:2: (kw= 'ASSET' | kw= 'EVENT' | kw= 'ROLE' | kw= 'SITUATION' | kw= 'CONTRACT' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            case 27:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSymboleoci.g:591:3: kw= 'ASSET'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOntoCTypeAccess().getASSETKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:597:3: kw= 'EVENT'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOntoCTypeAccess().getEVENTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:603:3: kw= 'ROLE'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOntoCTypeAccess().getROLEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:609:3: kw= 'SITUATION'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOntoCTypeAccess().getSITUATIONKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:615:3: kw= 'CONTRACT'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOntoCTypeAccess().getCONTRACTKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOntoCType"


    // $ANTLR start "entryRuleContract"
    // InternalSymboleoci.g:624:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalSymboleoci.g:624:49: (iv_ruleContract= ruleContract EOF )
            // InternalSymboleoci.g:625:2: iv_ruleContract= ruleContract EOF
            {
             newCompositeNode(grammarAccess.getContractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContract=ruleContract();

            state._fsp--;

             current =iv_ruleContract; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalSymboleoci.g:631:1: ruleContract returns [EObject current=null] : (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParam ) ) otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleParam ) ) otherlv_6= ')' (otherlv_7= 'Declarations' ( ( (lv_declarations_8_0= ruleDeclar ) ) otherlv_9= ';' )* )? (otherlv_10= 'Preconditions' ( ( (lv_propositions_11_0= ruleProp ) ) otherlv_12= ';' )* )? (otherlv_13= 'Postconditions' ( ( (lv_propositions_14_0= ruleProp ) ) otherlv_15= ';' )* )? otherlv_16= 'Obligations' ( ( (lv_obligations_17_0= ruleObl ) ) otherlv_18= ';' )+ (otherlv_19= 'SurvivingObls' ( ( (lv_obligations_20_0= ruleObl ) ) otherlv_21= ';' )* )? (otherlv_22= 'Powers' ( ( (lv_powers_23_0= rulePow ) ) otherlv_24= ';' )* )? (otherlv_25= 'Constraints' ( ( (lv_propositions_26_0= ruleProp ) ) otherlv_27= ';' )* )? otherlv_28= 'endContract' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_declarations_8_0 = null;

        EObject lv_propositions_11_0 = null;

        EObject lv_propositions_14_0 = null;

        EObject lv_obligations_17_0 = null;

        EObject lv_obligations_20_0 = null;

        EObject lv_powers_23_0 = null;

        EObject lv_propositions_26_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:637:2: ( (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParam ) ) otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleParam ) ) otherlv_6= ')' (otherlv_7= 'Declarations' ( ( (lv_declarations_8_0= ruleDeclar ) ) otherlv_9= ';' )* )? (otherlv_10= 'Preconditions' ( ( (lv_propositions_11_0= ruleProp ) ) otherlv_12= ';' )* )? (otherlv_13= 'Postconditions' ( ( (lv_propositions_14_0= ruleProp ) ) otherlv_15= ';' )* )? otherlv_16= 'Obligations' ( ( (lv_obligations_17_0= ruleObl ) ) otherlv_18= ';' )+ (otherlv_19= 'SurvivingObls' ( ( (lv_obligations_20_0= ruleObl ) ) otherlv_21= ';' )* )? (otherlv_22= 'Powers' ( ( (lv_powers_23_0= rulePow ) ) otherlv_24= ';' )* )? (otherlv_25= 'Constraints' ( ( (lv_propositions_26_0= ruleProp ) ) otherlv_27= ';' )* )? otherlv_28= 'endContract' ) )
            // InternalSymboleoci.g:638:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParam ) ) otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleParam ) ) otherlv_6= ')' (otherlv_7= 'Declarations' ( ( (lv_declarations_8_0= ruleDeclar ) ) otherlv_9= ';' )* )? (otherlv_10= 'Preconditions' ( ( (lv_propositions_11_0= ruleProp ) ) otherlv_12= ';' )* )? (otherlv_13= 'Postconditions' ( ( (lv_propositions_14_0= ruleProp ) ) otherlv_15= ';' )* )? otherlv_16= 'Obligations' ( ( (lv_obligations_17_0= ruleObl ) ) otherlv_18= ';' )+ (otherlv_19= 'SurvivingObls' ( ( (lv_obligations_20_0= ruleObl ) ) otherlv_21= ';' )* )? (otherlv_22= 'Powers' ( ( (lv_powers_23_0= rulePow ) ) otherlv_24= ';' )* )? (otherlv_25= 'Constraints' ( ( (lv_propositions_26_0= ruleProp ) ) otherlv_27= ';' )* )? otherlv_28= 'endContract' )
            {
            // InternalSymboleoci.g:638:2: (otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParam ) ) otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleParam ) ) otherlv_6= ')' (otherlv_7= 'Declarations' ( ( (lv_declarations_8_0= ruleDeclar ) ) otherlv_9= ';' )* )? (otherlv_10= 'Preconditions' ( ( (lv_propositions_11_0= ruleProp ) ) otherlv_12= ';' )* )? (otherlv_13= 'Postconditions' ( ( (lv_propositions_14_0= ruleProp ) ) otherlv_15= ';' )* )? otherlv_16= 'Obligations' ( ( (lv_obligations_17_0= ruleObl ) ) otherlv_18= ';' )+ (otherlv_19= 'SurvivingObls' ( ( (lv_obligations_20_0= ruleObl ) ) otherlv_21= ';' )* )? (otherlv_22= 'Powers' ( ( (lv_powers_23_0= rulePow ) ) otherlv_24= ';' )* )? (otherlv_25= 'Constraints' ( ( (lv_propositions_26_0= ruleProp ) ) otherlv_27= ';' )* )? otherlv_28= 'endContract' )
            // InternalSymboleoci.g:639:3: otherlv_0= 'Contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParam ) ) otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleParam ) ) otherlv_6= ')' (otherlv_7= 'Declarations' ( ( (lv_declarations_8_0= ruleDeclar ) ) otherlv_9= ';' )* )? (otherlv_10= 'Preconditions' ( ( (lv_propositions_11_0= ruleProp ) ) otherlv_12= ';' )* )? (otherlv_13= 'Postconditions' ( ( (lv_propositions_14_0= ruleProp ) ) otherlv_15= ';' )* )? otherlv_16= 'Obligations' ( ( (lv_obligations_17_0= ruleObl ) ) otherlv_18= ';' )+ (otherlv_19= 'SurvivingObls' ( ( (lv_obligations_20_0= ruleObl ) ) otherlv_21= ';' )* )? (otherlv_22= 'Powers' ( ( (lv_powers_23_0= rulePow ) ) otherlv_24= ';' )* )? (otherlv_25= 'Constraints' ( ( (lv_propositions_26_0= ruleProp ) ) otherlv_27= ';' )* )? otherlv_28= 'endContract'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
            		
            // InternalSymboleoci.g:643:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSymboleoci.g:644:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSymboleoci.g:644:4: (lv_name_1_0= RULE_ID )
            // InternalSymboleoci.g:645:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContractAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContractRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSymboleoci.g:665:3: ( ( (lv_parameters_3_0= ruleParam ) ) otherlv_4= ',' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==38) ) {
                        switch ( input.LA(3) ) {
                        case RULE_ID:
                            {
                            int LA11_3 = input.LA(4);

                            if ( (LA11_3==16) ) {
                                alt11=1;
                            }


                            }
                            break;
                        case 20:
                            {
                            int LA11_4 = input.LA(4);

                            if ( (LA11_4==16) ) {
                                alt11=1;
                            }


                            }
                            break;
                        case 21:
                            {
                            int LA11_5 = input.LA(4);

                            if ( (LA11_5==16) ) {
                                alt11=1;
                            }


                            }
                            break;
                        case 22:
                            {
                            int LA11_6 = input.LA(4);

                            if ( (LA11_6==16) ) {
                                alt11=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalSymboleoci.g:666:4: ( (lv_parameters_3_0= ruleParam ) ) otherlv_4= ','
            	    {
            	    // InternalSymboleoci.g:666:4: ( (lv_parameters_3_0= ruleParam ) )
            	    // InternalSymboleoci.g:667:5: (lv_parameters_3_0= ruleParam )
            	    {
            	    // InternalSymboleoci.g:667:5: (lv_parameters_3_0= ruleParam )
            	    // InternalSymboleoci.g:668:6: lv_parameters_3_0= ruleParam
            	    {

            	    						newCompositeNode(grammarAccess.getContractAccess().getParametersParamParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_parameters_3_0=ruleParam();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_3_0,
            	    							"symboleoci.Symboleoci.Param");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getContractAccess().getCommaKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // InternalSymboleoci.g:690:3: ( (lv_parameters_5_0= ruleParam ) )
            // InternalSymboleoci.g:691:4: (lv_parameters_5_0= ruleParam )
            {
            // InternalSymboleoci.g:691:4: (lv_parameters_5_0= ruleParam )
            // InternalSymboleoci.g:692:5: lv_parameters_5_0= ruleParam
            {

            					newCompositeNode(grammarAccess.getContractAccess().getParametersParamParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_parameters_5_0=ruleParam();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContractRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_5_0,
            						"symboleoci.Symboleoci.Param");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getContractAccess().getRightParenthesisKeyword_5());
            		
            // InternalSymboleoci.g:713:3: (otherlv_7= 'Declarations' ( ( (lv_declarations_8_0= ruleDeclar ) ) otherlv_9= ';' )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSymboleoci.g:714:4: otherlv_7= 'Declarations' ( ( (lv_declarations_8_0= ruleDeclar ) ) otherlv_9= ';' )*
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getContractAccess().getDeclarationsKeyword_6_0());
                    			
                    // InternalSymboleoci.g:718:4: ( ( (lv_declarations_8_0= ruleDeclar ) ) otherlv_9= ';' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSymboleoci.g:719:5: ( (lv_declarations_8_0= ruleDeclar ) ) otherlv_9= ';'
                    	    {
                    	    // InternalSymboleoci.g:719:5: ( (lv_declarations_8_0= ruleDeclar ) )
                    	    // InternalSymboleoci.g:720:6: (lv_declarations_8_0= ruleDeclar )
                    	    {
                    	    // InternalSymboleoci.g:720:6: (lv_declarations_8_0= ruleDeclar )
                    	    // InternalSymboleoci.g:721:7: lv_declarations_8_0= ruleDeclar
                    	    {

                    	    							newCompositeNode(grammarAccess.getContractAccess().getDeclarationsDeclarParserRuleCall_6_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_declarations_8_0=ruleDeclar();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContractRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"declarations",
                    	    								lv_declarations_8_0,
                    	    								"symboleoci.Symboleoci.Declar");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_9=(Token)match(input,12,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getContractAccess().getSemicolonKeyword_6_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSymboleoci.g:744:3: (otherlv_10= 'Preconditions' ( ( (lv_propositions_11_0= ruleProp ) ) otherlv_12= ';' )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSymboleoci.g:745:4: otherlv_10= 'Preconditions' ( ( (lv_propositions_11_0= ruleProp ) ) otherlv_12= ';' )*
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getContractAccess().getPreconditionsKeyword_7_0());
                    			
                    // InternalSymboleoci.g:749:4: ( ( (lv_propositions_11_0= ruleProp ) ) otherlv_12= ';' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==18||LA14_0==43||LA14_0==45||(LA14_0>=47 && LA14_0<=51)||(LA14_0>=70 && LA14_0<=107)||(LA14_0>=109 && LA14_0<=113)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSymboleoci.g:750:5: ( (lv_propositions_11_0= ruleProp ) ) otherlv_12= ';'
                    	    {
                    	    // InternalSymboleoci.g:750:5: ( (lv_propositions_11_0= ruleProp ) )
                    	    // InternalSymboleoci.g:751:6: (lv_propositions_11_0= ruleProp )
                    	    {
                    	    // InternalSymboleoci.g:751:6: (lv_propositions_11_0= ruleProp )
                    	    // InternalSymboleoci.g:752:7: lv_propositions_11_0= ruleProp
                    	    {

                    	    							newCompositeNode(grammarAccess.getContractAccess().getPropositionsPropParserRuleCall_7_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_propositions_11_0=ruleProp();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContractRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"propositions",
                    	    								lv_propositions_11_0,
                    	    								"symboleoci.Symboleoci.Prop");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,12,FOLLOW_18); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getContractAccess().getSemicolonKeyword_7_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSymboleoci.g:775:3: (otherlv_13= 'Postconditions' ( ( (lv_propositions_14_0= ruleProp ) ) otherlv_15= ';' )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSymboleoci.g:776:4: otherlv_13= 'Postconditions' ( ( (lv_propositions_14_0= ruleProp ) ) otherlv_15= ';' )*
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getContractAccess().getPostconditionsKeyword_8_0());
                    			
                    // InternalSymboleoci.g:780:4: ( ( (lv_propositions_14_0= ruleProp ) ) otherlv_15= ';' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==18||LA16_0==43||LA16_0==45||(LA16_0>=47 && LA16_0<=51)||(LA16_0>=70 && LA16_0<=107)||(LA16_0>=109 && LA16_0<=113)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSymboleoci.g:781:5: ( (lv_propositions_14_0= ruleProp ) ) otherlv_15= ';'
                    	    {
                    	    // InternalSymboleoci.g:781:5: ( (lv_propositions_14_0= ruleProp ) )
                    	    // InternalSymboleoci.g:782:6: (lv_propositions_14_0= ruleProp )
                    	    {
                    	    // InternalSymboleoci.g:782:6: (lv_propositions_14_0= ruleProp )
                    	    // InternalSymboleoci.g:783:7: lv_propositions_14_0= ruleProp
                    	    {

                    	    							newCompositeNode(grammarAccess.getContractAccess().getPropositionsPropParserRuleCall_8_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_propositions_14_0=ruleProp();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContractRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"propositions",
                    	    								lv_propositions_14_0,
                    	    								"symboleoci.Symboleoci.Prop");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_15=(Token)match(input,12,FOLLOW_19); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getContractAccess().getSemicolonKeyword_8_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_16, grammarAccess.getContractAccess().getObligationsKeyword_9());
            		
            // InternalSymboleoci.g:810:3: ( ( (lv_obligations_17_0= ruleObl ) ) otherlv_18= ';' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSymboleoci.g:811:4: ( (lv_obligations_17_0= ruleObl ) ) otherlv_18= ';'
            	    {
            	    // InternalSymboleoci.g:811:4: ( (lv_obligations_17_0= ruleObl ) )
            	    // InternalSymboleoci.g:812:5: (lv_obligations_17_0= ruleObl )
            	    {
            	    // InternalSymboleoci.g:812:5: (lv_obligations_17_0= ruleObl )
            	    // InternalSymboleoci.g:813:6: lv_obligations_17_0= ruleObl
            	    {

            	    						newCompositeNode(grammarAccess.getContractAccess().getObligationsOblParserRuleCall_10_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_obligations_17_0=ruleObl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"obligations",
            	    							lv_obligations_17_0,
            	    							"symboleoci.Symboleoci.Obl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_18=(Token)match(input,12,FOLLOW_20); 

            	    				newLeafNode(otherlv_18, grammarAccess.getContractAccess().getSemicolonKeyword_10_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalSymboleoci.g:835:3: (otherlv_19= 'SurvivingObls' ( ( (lv_obligations_20_0= ruleObl ) ) otherlv_21= ';' )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSymboleoci.g:836:4: otherlv_19= 'SurvivingObls' ( ( (lv_obligations_20_0= ruleObl ) ) otherlv_21= ';' )*
                    {
                    otherlv_19=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_19, grammarAccess.getContractAccess().getSurvivingOblsKeyword_11_0());
                    			
                    // InternalSymboleoci.g:840:4: ( ( (lv_obligations_20_0= ruleObl ) ) otherlv_21= ';' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSymboleoci.g:841:5: ( (lv_obligations_20_0= ruleObl ) ) otherlv_21= ';'
                    	    {
                    	    // InternalSymboleoci.g:841:5: ( (lv_obligations_20_0= ruleObl ) )
                    	    // InternalSymboleoci.g:842:6: (lv_obligations_20_0= ruleObl )
                    	    {
                    	    // InternalSymboleoci.g:842:6: (lv_obligations_20_0= ruleObl )
                    	    // InternalSymboleoci.g:843:7: lv_obligations_20_0= ruleObl
                    	    {

                    	    							newCompositeNode(grammarAccess.getContractAccess().getObligationsOblParserRuleCall_11_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_obligations_20_0=ruleObl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContractRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"obligations",
                    	    								lv_obligations_20_0,
                    	    								"symboleoci.Symboleoci.Obl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_21=(Token)match(input,12,FOLLOW_21); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getContractAccess().getSemicolonKeyword_11_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSymboleoci.g:866:3: (otherlv_22= 'Powers' ( ( (lv_powers_23_0= rulePow ) ) otherlv_24= ';' )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSymboleoci.g:867:4: otherlv_22= 'Powers' ( ( (lv_powers_23_0= rulePow ) ) otherlv_24= ';' )*
                    {
                    otherlv_22=(Token)match(input,34,FOLLOW_22); 

                    				newLeafNode(otherlv_22, grammarAccess.getContractAccess().getPowersKeyword_12_0());
                    			
                    // InternalSymboleoci.g:871:4: ( ( (lv_powers_23_0= rulePow ) ) otherlv_24= ';' )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSymboleoci.g:872:5: ( (lv_powers_23_0= rulePow ) ) otherlv_24= ';'
                    	    {
                    	    // InternalSymboleoci.g:872:5: ( (lv_powers_23_0= rulePow ) )
                    	    // InternalSymboleoci.g:873:6: (lv_powers_23_0= rulePow )
                    	    {
                    	    // InternalSymboleoci.g:873:6: (lv_powers_23_0= rulePow )
                    	    // InternalSymboleoci.g:874:7: lv_powers_23_0= rulePow
                    	    {

                    	    							newCompositeNode(grammarAccess.getContractAccess().getPowersPowParserRuleCall_12_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_powers_23_0=rulePow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContractRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"powers",
                    	    								lv_powers_23_0,
                    	    								"symboleoci.Symboleoci.Pow");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_24=(Token)match(input,12,FOLLOW_22); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getContractAccess().getSemicolonKeyword_12_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSymboleoci.g:897:3: (otherlv_25= 'Constraints' ( ( (lv_propositions_26_0= ruleProp ) ) otherlv_27= ';' )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSymboleoci.g:898:4: otherlv_25= 'Constraints' ( ( (lv_propositions_26_0= ruleProp ) ) otherlv_27= ';' )*
                    {
                    otherlv_25=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_25, grammarAccess.getContractAccess().getConstraintsKeyword_13_0());
                    			
                    // InternalSymboleoci.g:902:4: ( ( (lv_propositions_26_0= ruleProp ) ) otherlv_27= ';' )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==18||LA23_0==43||LA23_0==45||(LA23_0>=47 && LA23_0<=51)||(LA23_0>=70 && LA23_0<=107)||(LA23_0>=109 && LA23_0<=113)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSymboleoci.g:903:5: ( (lv_propositions_26_0= ruleProp ) ) otherlv_27= ';'
                    	    {
                    	    // InternalSymboleoci.g:903:5: ( (lv_propositions_26_0= ruleProp ) )
                    	    // InternalSymboleoci.g:904:6: (lv_propositions_26_0= ruleProp )
                    	    {
                    	    // InternalSymboleoci.g:904:6: (lv_propositions_26_0= ruleProp )
                    	    // InternalSymboleoci.g:905:7: lv_propositions_26_0= ruleProp
                    	    {

                    	    							newCompositeNode(grammarAccess.getContractAccess().getPropositionsPropParserRuleCall_13_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_propositions_26_0=ruleProp();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContractRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"propositions",
                    	    								lv_propositions_26_0,
                    	    								"symboleoci.Symboleoci.Prop");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_27=(Token)match(input,12,FOLLOW_23); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getContractAccess().getSemicolonKeyword_13_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_28=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getContractAccess().getEndContractKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRuleAtt"
    // InternalSymboleoci.g:936:1: entryRuleAtt returns [EObject current=null] : iv_ruleAtt= ruleAtt EOF ;
    public final EObject entryRuleAtt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtt = null;


        try {
            // InternalSymboleoci.g:936:44: (iv_ruleAtt= ruleAtt EOF )
            // InternalSymboleoci.g:937:2: iv_ruleAtt= ruleAtt EOF
            {
             newCompositeNode(grammarAccess.getAttRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtt=ruleAtt();

            state._fsp--;

             current =iv_ruleAtt; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtt"


    // $ANTLR start "ruleAtt"
    // InternalSymboleoci.g:943:1: ruleAtt returns [EObject current=null] : this_Pair_0= rulePair ;
    public final EObject ruleAtt() throws RecognitionException {
        EObject current = null;

        EObject this_Pair_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:949:2: (this_Pair_0= rulePair )
            // InternalSymboleoci.g:950:2: this_Pair_0= rulePair
            {

            		newCompositeNode(grammarAccess.getAttAccess().getPairParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Pair_0=rulePair();

            state._fsp--;


            		current = this_Pair_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtt"


    // $ANTLR start "entryRuleParam"
    // InternalSymboleoci.g:961:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalSymboleoci.g:961:46: (iv_ruleParam= ruleParam EOF )
            // InternalSymboleoci.g:962:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalSymboleoci.g:968:1: ruleParam returns [EObject current=null] : this_DeclarPair_0= ruleDeclarPair ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        EObject this_DeclarPair_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:974:2: (this_DeclarPair_0= ruleDeclarPair )
            // InternalSymboleoci.g:975:2: this_DeclarPair_0= ruleDeclarPair
            {

            		newCompositeNode(grammarAccess.getParamAccess().getDeclarPairParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_DeclarPair_0=ruleDeclarPair();

            state._fsp--;


            		current = this_DeclarPair_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleDeclar"
    // InternalSymboleoci.g:986:1: entryRuleDeclar returns [EObject current=null] : iv_ruleDeclar= ruleDeclar EOF ;
    public final EObject entryRuleDeclar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclar = null;


        try {
            // InternalSymboleoci.g:986:47: (iv_ruleDeclar= ruleDeclar EOF )
            // InternalSymboleoci.g:987:2: iv_ruleDeclar= ruleDeclar EOF
            {
             newCompositeNode(grammarAccess.getDeclarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclar=ruleDeclar();

            state._fsp--;

             current =iv_ruleDeclar; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclar"


    // $ANTLR start "ruleDeclar"
    // InternalSymboleoci.g:993:1: ruleDeclar returns [EObject current=null] : (this_DeclarPair_0= ruleDeclarPair otherlv_1= 'with' ( ( (lv_names_2_0= ruleName ) ) otherlv_3= ':=' ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( ( (lv_names_6_0= ruleName ) ) otherlv_7= ':=' ( (lv_names_8_0= ruleName ) ) ) ) ;
    public final EObject ruleDeclar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_DeclarPair_0 = null;

        EObject lv_names_2_0 = null;

        EObject lv_names_4_0 = null;

        EObject lv_names_6_0 = null;

        EObject lv_names_8_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:999:2: ( (this_DeclarPair_0= ruleDeclarPair otherlv_1= 'with' ( ( (lv_names_2_0= ruleName ) ) otherlv_3= ':=' ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( ( (lv_names_6_0= ruleName ) ) otherlv_7= ':=' ( (lv_names_8_0= ruleName ) ) ) ) )
            // InternalSymboleoci.g:1000:2: (this_DeclarPair_0= ruleDeclarPair otherlv_1= 'with' ( ( (lv_names_2_0= ruleName ) ) otherlv_3= ':=' ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( ( (lv_names_6_0= ruleName ) ) otherlv_7= ':=' ( (lv_names_8_0= ruleName ) ) ) )
            {
            // InternalSymboleoci.g:1000:2: (this_DeclarPair_0= ruleDeclarPair otherlv_1= 'with' ( ( (lv_names_2_0= ruleName ) ) otherlv_3= ':=' ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( ( (lv_names_6_0= ruleName ) ) otherlv_7= ':=' ( (lv_names_8_0= ruleName ) ) ) )
            // InternalSymboleoci.g:1001:3: this_DeclarPair_0= ruleDeclarPair otherlv_1= 'with' ( ( (lv_names_2_0= ruleName ) ) otherlv_3= ':=' ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( ( (lv_names_6_0= ruleName ) ) otherlv_7= ':=' ( (lv_names_8_0= ruleName ) ) )
            {

            			newCompositeNode(grammarAccess.getDeclarAccess().getDeclarPairParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_DeclarPair_0=ruleDeclarPair();

            state._fsp--;


            			current = this_DeclarPair_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarAccess().getWithKeyword_1());
            		
            // InternalSymboleoci.g:1013:3: ( ( (lv_names_2_0= ruleName ) ) otherlv_3= ':=' ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==37) ) {
                        int LA25_2 = input.LA(3);

                        if ( (LA25_2==RULE_ID) ) {
                            int LA25_3 = input.LA(4);

                            if ( (LA25_3==16) ) {
                                alt25=1;
                            }


                        }


                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalSymboleoci.g:1014:4: ( (lv_names_2_0= ruleName ) ) otherlv_3= ':=' ( (lv_names_4_0= ruleName ) ) otherlv_5= ','
            	    {
            	    // InternalSymboleoci.g:1014:4: ( (lv_names_2_0= ruleName ) )
            	    // InternalSymboleoci.g:1015:5: (lv_names_2_0= ruleName )
            	    {
            	    // InternalSymboleoci.g:1015:5: (lv_names_2_0= ruleName )
            	    // InternalSymboleoci.g:1016:6: lv_names_2_0= ruleName
            	    {

            	    						newCompositeNode(grammarAccess.getDeclarAccess().getNamesNameParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_names_2_0=ruleName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclarRule());
            	    						}
            	    						add(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"symboleoci.Symboleoci.Name");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,37,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeclarAccess().getColonEqualsSignKeyword_2_1());
            	    			
            	    // InternalSymboleoci.g:1037:4: ( (lv_names_4_0= ruleName ) )
            	    // InternalSymboleoci.g:1038:5: (lv_names_4_0= ruleName )
            	    {
            	    // InternalSymboleoci.g:1038:5: (lv_names_4_0= ruleName )
            	    // InternalSymboleoci.g:1039:6: lv_names_4_0= ruleName
            	    {

            	    						newCompositeNode(grammarAccess.getDeclarAccess().getNamesNameParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_names_4_0=ruleName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclarRule());
            	    						}
            	    						add(
            	    							current,
            	    							"names",
            	    							lv_names_4_0,
            	    							"symboleoci.Symboleoci.Name");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDeclarAccess().getCommaKeyword_2_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalSymboleoci.g:1061:3: ( ( (lv_names_6_0= ruleName ) ) otherlv_7= ':=' ( (lv_names_8_0= ruleName ) ) )
            // InternalSymboleoci.g:1062:4: ( (lv_names_6_0= ruleName ) ) otherlv_7= ':=' ( (lv_names_8_0= ruleName ) )
            {
            // InternalSymboleoci.g:1062:4: ( (lv_names_6_0= ruleName ) )
            // InternalSymboleoci.g:1063:5: (lv_names_6_0= ruleName )
            {
            // InternalSymboleoci.g:1063:5: (lv_names_6_0= ruleName )
            // InternalSymboleoci.g:1064:6: lv_names_6_0= ruleName
            {

            						newCompositeNode(grammarAccess.getDeclarAccess().getNamesNameParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_25);
            lv_names_6_0=ruleName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDeclarRule());
            						}
            						add(
            							current,
            							"names",
            							lv_names_6_0,
            							"symboleoci.Symboleoci.Name");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_7=(Token)match(input,37,FOLLOW_4); 

            				newLeafNode(otherlv_7, grammarAccess.getDeclarAccess().getColonEqualsSignKeyword_3_1());
            			
            // InternalSymboleoci.g:1085:4: ( (lv_names_8_0= ruleName ) )
            // InternalSymboleoci.g:1086:5: (lv_names_8_0= ruleName )
            {
            // InternalSymboleoci.g:1086:5: (lv_names_8_0= ruleName )
            // InternalSymboleoci.g:1087:6: lv_names_8_0= ruleName
            {

            						newCompositeNode(grammarAccess.getDeclarAccess().getNamesNameParserRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_2);
            lv_names_8_0=ruleName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDeclarRule());
            						}
            						add(
            							current,
            							"names",
            							lv_names_8_0,
            							"symboleoci.Symboleoci.Name");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclar"


    // $ANTLR start "entryRuleDeclarPair"
    // InternalSymboleoci.g:1109:1: entryRuleDeclarPair returns [EObject current=null] : iv_ruleDeclarPair= ruleDeclarPair EOF ;
    public final EObject entryRuleDeclarPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarPair = null;


        try {
            // InternalSymboleoci.g:1109:51: (iv_ruleDeclarPair= ruleDeclarPair EOF )
            // InternalSymboleoci.g:1110:2: iv_ruleDeclarPair= ruleDeclarPair EOF
            {
             newCompositeNode(grammarAccess.getDeclarPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarPair=ruleDeclarPair();

            state._fsp--;

             current =iv_ruleDeclarPair; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarPair"


    // $ANTLR start "ruleDeclarPair"
    // InternalSymboleoci.g:1116:1: ruleDeclarPair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeNames_2_0= ruleTypeName ) ) ) ;
    public final EObject ruleDeclarPair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeNames_2_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:1122:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeNames_2_0= ruleTypeName ) ) ) )
            // InternalSymboleoci.g:1123:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeNames_2_0= ruleTypeName ) ) )
            {
            // InternalSymboleoci.g:1123:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeNames_2_0= ruleTypeName ) ) )
            // InternalSymboleoci.g:1124:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeNames_2_0= ruleTypeName ) )
            {
            // InternalSymboleoci.g:1124:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSymboleoci.g:1125:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSymboleoci.g:1125:4: (lv_name_0_0= RULE_ID )
            // InternalSymboleoci.g:1126:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDeclarPairAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarPairAccess().getColonKeyword_1());
            		
            // InternalSymboleoci.g:1146:3: ( (lv_typeNames_2_0= ruleTypeName ) )
            // InternalSymboleoci.g:1147:4: (lv_typeNames_2_0= ruleTypeName )
            {
            // InternalSymboleoci.g:1147:4: (lv_typeNames_2_0= ruleTypeName )
            // InternalSymboleoci.g:1148:5: lv_typeNames_2_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getDeclarPairAccess().getTypeNamesTypeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeNames_2_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarPairRule());
            					}
            					add(
            						current,
            						"typeNames",
            						lv_typeNames_2_0,
            						"symboleoci.Symboleoci.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarPair"


    // $ANTLR start "entryRulePair"
    // InternalSymboleoci.g:1169:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalSymboleoci.g:1169:45: (iv_rulePair= rulePair EOF )
            // InternalSymboleoci.g:1170:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalSymboleoci.g:1176:1: rulePair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_types_2_0= ruleCType ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:1182:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_types_2_0= ruleCType ) ) ) )
            // InternalSymboleoci.g:1183:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_types_2_0= ruleCType ) ) )
            {
            // InternalSymboleoci.g:1183:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_types_2_0= ruleCType ) ) )
            // InternalSymboleoci.g:1184:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_types_2_0= ruleCType ) )
            {
            // InternalSymboleoci.g:1184:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSymboleoci.g:1185:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSymboleoci.g:1185:4: (lv_name_0_0= RULE_ID )
            // InternalSymboleoci.g:1186:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPairAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPairAccess().getColonKeyword_1());
            		
            // InternalSymboleoci.g:1206:3: ( (lv_types_2_0= ruleCType ) )
            // InternalSymboleoci.g:1207:4: (lv_types_2_0= ruleCType )
            {
            // InternalSymboleoci.g:1207:4: (lv_types_2_0= ruleCType )
            // InternalSymboleoci.g:1208:5: lv_types_2_0= ruleCType
            {

            					newCompositeNode(grammarAccess.getPairAccess().getTypesCTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_types_2_0=ruleCType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPairRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_2_0,
            						"symboleoci.Symboleoci.CType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleTypeName"
    // InternalSymboleoci.g:1229:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // InternalSymboleoci.g:1229:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalSymboleoci.g:1230:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalSymboleoci.g:1236:1: ruleTypeName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () ruleBasicType ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:1242:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () ruleBasicType ) ) )
            // InternalSymboleoci.g:1243:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( () ruleBasicType ) )
            {
            // InternalSymboleoci.g:1243:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( () ruleBasicType ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=20 && LA26_0<=22)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSymboleoci.g:1244:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalSymboleoci.g:1244:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalSymboleoci.g:1245:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalSymboleoci.g:1245:4: (lv_name_0_0= RULE_ID )
                    // InternalSymboleoci.g:1246:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getTypeNameAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:1263:3: ( () ruleBasicType )
                    {
                    // InternalSymboleoci.g:1263:3: ( () ruleBasicType )
                    // InternalSymboleoci.g:1264:4: () ruleBasicType
                    {
                    // InternalSymboleoci.g:1264:4: ()
                    // InternalSymboleoci.g:1265:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeNameAccess().getTypeNameAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getTypeNameAccess().getBasicTypeParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleObl"
    // InternalSymboleoci.g:1283:1: entryRuleObl returns [EObject current=null] : iv_ruleObl= ruleObl EOF ;
    public final EObject entryRuleObl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObl = null;


        try {
            // InternalSymboleoci.g:1283:44: (iv_ruleObl= ruleObl EOF )
            // InternalSymboleoci.g:1284:2: iv_ruleObl= ruleObl EOF
            {
             newCompositeNode(grammarAccess.getOblRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObl=ruleObl();

            state._fsp--;

             current =iv_ruleObl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObl"


    // $ANTLR start "ruleObl"
    // InternalSymboleoci.g:1290:1: ruleObl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )? otherlv_4= 'O' otherlv_5= '(' ( (lv_roles_6_0= ruleName ) ) otherlv_7= ',' ( (lv_roles_8_0= ruleName ) ) otherlv_9= ',' ( (lv_antecedent_10_0= ruleProp ) ) otherlv_11= ',' ( (lv_consequent_12_0= ruleProp ) ) otherlv_13= ')' ) ;
    public final EObject ruleObl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_trigger_2_0 = null;

        EObject lv_roles_6_0 = null;

        EObject lv_roles_8_0 = null;

        EObject lv_antecedent_10_0 = null;

        EObject lv_consequent_12_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:1296:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )? otherlv_4= 'O' otherlv_5= '(' ( (lv_roles_6_0= ruleName ) ) otherlv_7= ',' ( (lv_roles_8_0= ruleName ) ) otherlv_9= ',' ( (lv_antecedent_10_0= ruleProp ) ) otherlv_11= ',' ( (lv_consequent_12_0= ruleProp ) ) otherlv_13= ')' ) )
            // InternalSymboleoci.g:1297:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )? otherlv_4= 'O' otherlv_5= '(' ( (lv_roles_6_0= ruleName ) ) otherlv_7= ',' ( (lv_roles_8_0= ruleName ) ) otherlv_9= ',' ( (lv_antecedent_10_0= ruleProp ) ) otherlv_11= ',' ( (lv_consequent_12_0= ruleProp ) ) otherlv_13= ')' )
            {
            // InternalSymboleoci.g:1297:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )? otherlv_4= 'O' otherlv_5= '(' ( (lv_roles_6_0= ruleName ) ) otherlv_7= ',' ( (lv_roles_8_0= ruleName ) ) otherlv_9= ',' ( (lv_antecedent_10_0= ruleProp ) ) otherlv_11= ',' ( (lv_consequent_12_0= ruleProp ) ) otherlv_13= ')' )
            // InternalSymboleoci.g:1298:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )? otherlv_4= 'O' otherlv_5= '(' ( (lv_roles_6_0= ruleName ) ) otherlv_7= ',' ( (lv_roles_8_0= ruleName ) ) otherlv_9= ',' ( (lv_antecedent_10_0= ruleProp ) ) otherlv_11= ',' ( (lv_consequent_12_0= ruleProp ) ) otherlv_13= ')'
            {
            // InternalSymboleoci.g:1298:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSymboleoci.g:1299:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSymboleoci.g:1299:4: (lv_name_0_0= RULE_ID )
            // InternalSymboleoci.g:1300:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOblAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOblRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getOblAccess().getColonKeyword_1());
            		
            // InternalSymboleoci.g:1320:3: ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_INT)||LA27_0==18||LA27_0==43||LA27_0==45||(LA27_0>=47 && LA27_0<=51)||(LA27_0>=70 && LA27_0<=107)||(LA27_0>=109 && LA27_0<=113)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSymboleoci.g:1321:4: ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->'
                    {
                    // InternalSymboleoci.g:1321:4: ( (lv_trigger_2_0= ruleProp ) )
                    // InternalSymboleoci.g:1322:5: (lv_trigger_2_0= ruleProp )
                    {
                    // InternalSymboleoci.g:1322:5: (lv_trigger_2_0= ruleProp )
                    // InternalSymboleoci.g:1323:6: lv_trigger_2_0= ruleProp
                    {

                    						newCompositeNode(grammarAccess.getOblAccess().getTriggerPropParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_trigger_2_0=ruleProp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOblRule());
                    						}
                    						set(
                    							current,
                    							"trigger",
                    							lv_trigger_2_0,
                    							"symboleoci.Symboleoci.Prop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getOblAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getOblAccess().getOKeyword_3());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getOblAccess().getLeftParenthesisKeyword_4());
            		
            // InternalSymboleoci.g:1353:3: ( (lv_roles_6_0= ruleName ) )
            // InternalSymboleoci.g:1354:4: (lv_roles_6_0= ruleName )
            {
            // InternalSymboleoci.g:1354:4: (lv_roles_6_0= ruleName )
            // InternalSymboleoci.g:1355:5: lv_roles_6_0= ruleName
            {

            					newCompositeNode(grammarAccess.getOblAccess().getRolesNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_roles_6_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOblRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_6_0,
            						"symboleoci.Symboleoci.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getOblAccess().getCommaKeyword_6());
            		
            // InternalSymboleoci.g:1376:3: ( (lv_roles_8_0= ruleName ) )
            // InternalSymboleoci.g:1377:4: (lv_roles_8_0= ruleName )
            {
            // InternalSymboleoci.g:1377:4: (lv_roles_8_0= ruleName )
            // InternalSymboleoci.g:1378:5: lv_roles_8_0= ruleName
            {

            					newCompositeNode(grammarAccess.getOblAccess().getRolesNameParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_roles_8_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOblRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_8_0,
            						"symboleoci.Symboleoci.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_9, grammarAccess.getOblAccess().getCommaKeyword_8());
            		
            // InternalSymboleoci.g:1399:3: ( (lv_antecedent_10_0= ruleProp ) )
            // InternalSymboleoci.g:1400:4: (lv_antecedent_10_0= ruleProp )
            {
            // InternalSymboleoci.g:1400:4: (lv_antecedent_10_0= ruleProp )
            // InternalSymboleoci.g:1401:5: lv_antecedent_10_0= ruleProp
            {

            					newCompositeNode(grammarAccess.getOblAccess().getAntecedentPropParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_antecedent_10_0=ruleProp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOblRule());
            					}
            					set(
            						current,
            						"antecedent",
            						lv_antecedent_10_0,
            						"symboleoci.Symboleoci.Prop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_11, grammarAccess.getOblAccess().getCommaKeyword_10());
            		
            // InternalSymboleoci.g:1422:3: ( (lv_consequent_12_0= ruleProp ) )
            // InternalSymboleoci.g:1423:4: (lv_consequent_12_0= ruleProp )
            {
            // InternalSymboleoci.g:1423:4: (lv_consequent_12_0= ruleProp )
            // InternalSymboleoci.g:1424:5: lv_consequent_12_0= ruleProp
            {

            					newCompositeNode(grammarAccess.getOblAccess().getConsequentPropParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_15);
            lv_consequent_12_0=ruleProp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOblRule());
            					}
            					set(
            						current,
            						"consequent",
            						lv_consequent_12_0,
            						"symboleoci.Symboleoci.Prop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getOblAccess().getRightParenthesisKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObl"


    // $ANTLR start "entryRuleProp"
    // InternalSymboleoci.g:1449:1: entryRuleProp returns [EObject current=null] : iv_ruleProp= ruleProp EOF ;
    public final EObject entryRuleProp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProp = null;


        try {
            // InternalSymboleoci.g:1449:45: (iv_ruleProp= ruleProp EOF )
            // InternalSymboleoci.g:1450:2: iv_ruleProp= ruleProp EOF
            {
             newCompositeNode(grammarAccess.getPropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProp=ruleProp();

            state._fsp--;

             current =iv_ruleProp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProp"


    // $ANTLR start "ruleProp"
    // InternalSymboleoci.g:1456:1: ruleProp returns [EObject current=null] : ( ( (lv_junctions_0_0= ruleJunc ) ) (otherlv_1= 'OR' ( (lv_junctions_2_0= ruleJunc ) ) )* ) ;
    public final EObject ruleProp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_junctions_0_0 = null;

        EObject lv_junctions_2_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:1462:2: ( ( ( (lv_junctions_0_0= ruleJunc ) ) (otherlv_1= 'OR' ( (lv_junctions_2_0= ruleJunc ) ) )* ) )
            // InternalSymboleoci.g:1463:2: ( ( (lv_junctions_0_0= ruleJunc ) ) (otherlv_1= 'OR' ( (lv_junctions_2_0= ruleJunc ) ) )* )
            {
            // InternalSymboleoci.g:1463:2: ( ( (lv_junctions_0_0= ruleJunc ) ) (otherlv_1= 'OR' ( (lv_junctions_2_0= ruleJunc ) ) )* )
            // InternalSymboleoci.g:1464:3: ( (lv_junctions_0_0= ruleJunc ) ) (otherlv_1= 'OR' ( (lv_junctions_2_0= ruleJunc ) ) )*
            {
            // InternalSymboleoci.g:1464:3: ( (lv_junctions_0_0= ruleJunc ) )
            // InternalSymboleoci.g:1465:4: (lv_junctions_0_0= ruleJunc )
            {
            // InternalSymboleoci.g:1465:4: (lv_junctions_0_0= ruleJunc )
            // InternalSymboleoci.g:1466:5: lv_junctions_0_0= ruleJunc
            {

            					newCompositeNode(grammarAccess.getPropAccess().getJunctionsJuncParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_junctions_0_0=ruleJunc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropRule());
            					}
            					add(
            						current,
            						"junctions",
            						lv_junctions_0_0,
            						"symboleoci.Symboleoci.Junc");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSymboleoci.g:1483:3: (otherlv_1= 'OR' ( (lv_junctions_2_0= ruleJunc ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==41) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSymboleoci.g:1484:4: otherlv_1= 'OR' ( (lv_junctions_2_0= ruleJunc ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_30); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPropAccess().getORKeyword_1_0());
            	    			
            	    // InternalSymboleoci.g:1488:4: ( (lv_junctions_2_0= ruleJunc ) )
            	    // InternalSymboleoci.g:1489:5: (lv_junctions_2_0= ruleJunc )
            	    {
            	    // InternalSymboleoci.g:1489:5: (lv_junctions_2_0= ruleJunc )
            	    // InternalSymboleoci.g:1490:6: lv_junctions_2_0= ruleJunc
            	    {

            	    						newCompositeNode(grammarAccess.getPropAccess().getJunctionsJuncParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_junctions_2_0=ruleJunc();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPropRule());
            	    						}
            	    						add(
            	    							current,
            	    							"junctions",
            	    							lv_junctions_2_0,
            	    							"symboleoci.Symboleoci.Junc");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProp"


    // $ANTLR start "entryRuleJunc"
    // InternalSymboleoci.g:1512:1: entryRuleJunc returns [EObject current=null] : iv_ruleJunc= ruleJunc EOF ;
    public final EObject entryRuleJunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunc = null;


        try {
            // InternalSymboleoci.g:1512:45: (iv_ruleJunc= ruleJunc EOF )
            // InternalSymboleoci.g:1513:2: iv_ruleJunc= ruleJunc EOF
            {
             newCompositeNode(grammarAccess.getJuncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJunc=ruleJunc();

            state._fsp--;

             current =iv_ruleJunc; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJunc"


    // $ANTLR start "ruleJunc"
    // InternalSymboleoci.g:1519:1: ruleJunc returns [EObject current=null] : ( ( (lv_negativeAtoms_0_0= ruleNeg ) ) (otherlv_1= 'AND' ( (lv_negativeAtoms_2_0= ruleNeg ) ) )* ) ;
    public final EObject ruleJunc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_negativeAtoms_0_0 = null;

        EObject lv_negativeAtoms_2_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:1525:2: ( ( ( (lv_negativeAtoms_0_0= ruleNeg ) ) (otherlv_1= 'AND' ( (lv_negativeAtoms_2_0= ruleNeg ) ) )* ) )
            // InternalSymboleoci.g:1526:2: ( ( (lv_negativeAtoms_0_0= ruleNeg ) ) (otherlv_1= 'AND' ( (lv_negativeAtoms_2_0= ruleNeg ) ) )* )
            {
            // InternalSymboleoci.g:1526:2: ( ( (lv_negativeAtoms_0_0= ruleNeg ) ) (otherlv_1= 'AND' ( (lv_negativeAtoms_2_0= ruleNeg ) ) )* )
            // InternalSymboleoci.g:1527:3: ( (lv_negativeAtoms_0_0= ruleNeg ) ) (otherlv_1= 'AND' ( (lv_negativeAtoms_2_0= ruleNeg ) ) )*
            {
            // InternalSymboleoci.g:1527:3: ( (lv_negativeAtoms_0_0= ruleNeg ) )
            // InternalSymboleoci.g:1528:4: (lv_negativeAtoms_0_0= ruleNeg )
            {
            // InternalSymboleoci.g:1528:4: (lv_negativeAtoms_0_0= ruleNeg )
            // InternalSymboleoci.g:1529:5: lv_negativeAtoms_0_0= ruleNeg
            {

            					newCompositeNode(grammarAccess.getJuncAccess().getNegativeAtomsNegParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_negativeAtoms_0_0=ruleNeg();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJuncRule());
            					}
            					add(
            						current,
            						"negativeAtoms",
            						lv_negativeAtoms_0_0,
            						"symboleoci.Symboleoci.Neg");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSymboleoci.g:1546:3: (otherlv_1= 'AND' ( (lv_negativeAtoms_2_0= ruleNeg ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSymboleoci.g:1547:4: otherlv_1= 'AND' ( (lv_negativeAtoms_2_0= ruleNeg ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_30); 

            	    				newLeafNode(otherlv_1, grammarAccess.getJuncAccess().getANDKeyword_1_0());
            	    			
            	    // InternalSymboleoci.g:1551:4: ( (lv_negativeAtoms_2_0= ruleNeg ) )
            	    // InternalSymboleoci.g:1552:5: (lv_negativeAtoms_2_0= ruleNeg )
            	    {
            	    // InternalSymboleoci.g:1552:5: (lv_negativeAtoms_2_0= ruleNeg )
            	    // InternalSymboleoci.g:1553:6: lv_negativeAtoms_2_0= ruleNeg
            	    {

            	    						newCompositeNode(grammarAccess.getJuncAccess().getNegativeAtomsNegParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_negativeAtoms_2_0=ruleNeg();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJuncRule());
            	    						}
            	    						add(
            	    							current,
            	    							"negativeAtoms",
            	    							lv_negativeAtoms_2_0,
            	    							"symboleoci.Symboleoci.Neg");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJunc"


    // $ANTLR start "entryRuleNeg"
    // InternalSymboleoci.g:1575:1: entryRuleNeg returns [EObject current=null] : iv_ruleNeg= ruleNeg EOF ;
    public final EObject entryRuleNeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeg = null;


        try {
            // InternalSymboleoci.g:1575:44: (iv_ruleNeg= ruleNeg EOF )
            // InternalSymboleoci.g:1576:2: iv_ruleNeg= ruleNeg EOF
            {
             newCompositeNode(grammarAccess.getNegRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeg=ruleNeg();

            state._fsp--;

             current =iv_ruleNeg; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeg"


    // $ANTLR start "ruleNeg"
    // InternalSymboleoci.g:1582:1: ruleNeg returns [EObject current=null] : ( (otherlv_0= 'NOT' )? ( (lv_atomicExpressions_1_0= ruleAtom ) ) ) ;
    public final EObject ruleNeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_atomicExpressions_1_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:1588:2: ( ( (otherlv_0= 'NOT' )? ( (lv_atomicExpressions_1_0= ruleAtom ) ) ) )
            // InternalSymboleoci.g:1589:2: ( (otherlv_0= 'NOT' )? ( (lv_atomicExpressions_1_0= ruleAtom ) ) )
            {
            // InternalSymboleoci.g:1589:2: ( (otherlv_0= 'NOT' )? ( (lv_atomicExpressions_1_0= ruleAtom ) ) )
            // InternalSymboleoci.g:1590:3: (otherlv_0= 'NOT' )? ( (lv_atomicExpressions_1_0= ruleAtom ) )
            {
            // InternalSymboleoci.g:1590:3: (otherlv_0= 'NOT' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSymboleoci.g:1591:4: otherlv_0= 'NOT'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_0, grammarAccess.getNegAccess().getNOTKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSymboleoci.g:1596:3: ( (lv_atomicExpressions_1_0= ruleAtom ) )
            // InternalSymboleoci.g:1597:4: (lv_atomicExpressions_1_0= ruleAtom )
            {
            // InternalSymboleoci.g:1597:4: (lv_atomicExpressions_1_0= ruleAtom )
            // InternalSymboleoci.g:1598:5: lv_atomicExpressions_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getNegAccess().getAtomicExpressionsAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_atomicExpressions_1_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegRule());
            					}
            					add(
            						current,
            						"atomicExpressions",
            						lv_atomicExpressions_1_0,
            						"symboleoci.Symboleoci.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeg"


    // $ANTLR start "entryRuleAtom"
    // InternalSymboleoci.g:1619:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSymboleoci.g:1619:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSymboleoci.g:1620:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSymboleoci.g:1626:1: ruleAtom returns [EObject current=null] : ( ( (lv_eventPropositions_0_0= ruleEventProp ) ) | ( (lv_situationPropositions_1_0= ruleSitProp ) ) | ( ( (lv_shortHandNames_2_0= ruleName ) ) otherlv_3= '(' ( ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( (lv_names_6_0= ruleName ) ) (otherlv_7= ',' ( (lv_points_8_0= rulePoint ) ) )* (otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) )* otherlv_11= ')' ) | ( ( (lv_points_12_0= rulePoint ) ) otherlv_13= 'within' ( (lv_intervals_14_0= ruleInterval ) ) ) | (otherlv_15= '(' ( (lv_propositions_16_0= ruleProp ) ) otherlv_17= ')' ) | (otherlv_18= 'exists' ( (lv_varName_19_0= ruleName ) ) otherlv_20= '|' ( (lv_setExps_21_0= ruleSetExp ) ) otherlv_22= '(' ( (lv_metaconstraints_23_0= ruleMetaConst ) ) otherlv_24= ')' ) | (otherlv_25= 'forAll' ( (lv_varName_26_0= ruleName ) ) otherlv_27= '|' ( (lv_setExps_28_0= ruleSetExp ) ) otherlv_29= '(' ( (lv_metaconstraints_30_0= ruleMetaConst ) ) otherlv_31= ')' ) | ( () otherlv_33= 'TRUE' ) | ( () otherlv_35= 'FALSE' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        EObject lv_eventPropositions_0_0 = null;

        EObject lv_situationPropositions_1_0 = null;

        EObject lv_shortHandNames_2_0 = null;

        EObject lv_names_4_0 = null;

        EObject lv_names_6_0 = null;

        EObject lv_points_8_0 = null;

        EObject lv_intervals_10_0 = null;

        EObject lv_points_12_0 = null;

        EObject lv_intervals_14_0 = null;

        EObject lv_propositions_16_0 = null;

        EObject lv_varName_19_0 = null;

        AntlrDatatypeRuleToken lv_setExps_21_0 = null;

        AntlrDatatypeRuleToken lv_metaconstraints_23_0 = null;

        EObject lv_varName_26_0 = null;

        AntlrDatatypeRuleToken lv_setExps_28_0 = null;

        AntlrDatatypeRuleToken lv_metaconstraints_30_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:1632:2: ( ( ( (lv_eventPropositions_0_0= ruleEventProp ) ) | ( (lv_situationPropositions_1_0= ruleSitProp ) ) | ( ( (lv_shortHandNames_2_0= ruleName ) ) otherlv_3= '(' ( ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( (lv_names_6_0= ruleName ) ) (otherlv_7= ',' ( (lv_points_8_0= rulePoint ) ) )* (otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) )* otherlv_11= ')' ) | ( ( (lv_points_12_0= rulePoint ) ) otherlv_13= 'within' ( (lv_intervals_14_0= ruleInterval ) ) ) | (otherlv_15= '(' ( (lv_propositions_16_0= ruleProp ) ) otherlv_17= ')' ) | (otherlv_18= 'exists' ( (lv_varName_19_0= ruleName ) ) otherlv_20= '|' ( (lv_setExps_21_0= ruleSetExp ) ) otherlv_22= '(' ( (lv_metaconstraints_23_0= ruleMetaConst ) ) otherlv_24= ')' ) | (otherlv_25= 'forAll' ( (lv_varName_26_0= ruleName ) ) otherlv_27= '|' ( (lv_setExps_28_0= ruleSetExp ) ) otherlv_29= '(' ( (lv_metaconstraints_30_0= ruleMetaConst ) ) otherlv_31= ')' ) | ( () otherlv_33= 'TRUE' ) | ( () otherlv_35= 'FALSE' ) ) )
            // InternalSymboleoci.g:1633:2: ( ( (lv_eventPropositions_0_0= ruleEventProp ) ) | ( (lv_situationPropositions_1_0= ruleSitProp ) ) | ( ( (lv_shortHandNames_2_0= ruleName ) ) otherlv_3= '(' ( ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( (lv_names_6_0= ruleName ) ) (otherlv_7= ',' ( (lv_points_8_0= rulePoint ) ) )* (otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) )* otherlv_11= ')' ) | ( ( (lv_points_12_0= rulePoint ) ) otherlv_13= 'within' ( (lv_intervals_14_0= ruleInterval ) ) ) | (otherlv_15= '(' ( (lv_propositions_16_0= ruleProp ) ) otherlv_17= ')' ) | (otherlv_18= 'exists' ( (lv_varName_19_0= ruleName ) ) otherlv_20= '|' ( (lv_setExps_21_0= ruleSetExp ) ) otherlv_22= '(' ( (lv_metaconstraints_23_0= ruleMetaConst ) ) otherlv_24= ')' ) | (otherlv_25= 'forAll' ( (lv_varName_26_0= ruleName ) ) otherlv_27= '|' ( (lv_setExps_28_0= ruleSetExp ) ) otherlv_29= '(' ( (lv_metaconstraints_30_0= ruleMetaConst ) ) otherlv_31= ')' ) | ( () otherlv_33= 'TRUE' ) | ( () otherlv_35= 'FALSE' ) )
            {
            // InternalSymboleoci.g:1633:2: ( ( (lv_eventPropositions_0_0= ruleEventProp ) ) | ( (lv_situationPropositions_1_0= ruleSitProp ) ) | ( ( (lv_shortHandNames_2_0= ruleName ) ) otherlv_3= '(' ( ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( (lv_names_6_0= ruleName ) ) (otherlv_7= ',' ( (lv_points_8_0= rulePoint ) ) )* (otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) )* otherlv_11= ')' ) | ( ( (lv_points_12_0= rulePoint ) ) otherlv_13= 'within' ( (lv_intervals_14_0= ruleInterval ) ) ) | (otherlv_15= '(' ( (lv_propositions_16_0= ruleProp ) ) otherlv_17= ')' ) | (otherlv_18= 'exists' ( (lv_varName_19_0= ruleName ) ) otherlv_20= '|' ( (lv_setExps_21_0= ruleSetExp ) ) otherlv_22= '(' ( (lv_metaconstraints_23_0= ruleMetaConst ) ) otherlv_24= ')' ) | (otherlv_25= 'forAll' ( (lv_varName_26_0= ruleName ) ) otherlv_27= '|' ( (lv_setExps_28_0= ruleSetExp ) ) otherlv_29= '(' ( (lv_metaconstraints_30_0= ruleMetaConst ) ) otherlv_31= ')' ) | ( () otherlv_33= 'TRUE' ) | ( () otherlv_35= 'FALSE' ) )
            int alt34=9;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalSymboleoci.g:1634:3: ( (lv_eventPropositions_0_0= ruleEventProp ) )
                    {
                    // InternalSymboleoci.g:1634:3: ( (lv_eventPropositions_0_0= ruleEventProp ) )
                    // InternalSymboleoci.g:1635:4: (lv_eventPropositions_0_0= ruleEventProp )
                    {
                    // InternalSymboleoci.g:1635:4: (lv_eventPropositions_0_0= ruleEventProp )
                    // InternalSymboleoci.g:1636:5: lv_eventPropositions_0_0= ruleEventProp
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getEventPropositionsEventPropParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_eventPropositions_0_0=ruleEventProp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					add(
                    						current,
                    						"eventPropositions",
                    						lv_eventPropositions_0_0,
                    						"symboleoci.Symboleoci.EventProp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:1654:3: ( (lv_situationPropositions_1_0= ruleSitProp ) )
                    {
                    // InternalSymboleoci.g:1654:3: ( (lv_situationPropositions_1_0= ruleSitProp ) )
                    // InternalSymboleoci.g:1655:4: (lv_situationPropositions_1_0= ruleSitProp )
                    {
                    // InternalSymboleoci.g:1655:4: (lv_situationPropositions_1_0= ruleSitProp )
                    // InternalSymboleoci.g:1656:5: lv_situationPropositions_1_0= ruleSitProp
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getSituationPropositionsSitPropParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_situationPropositions_1_0=ruleSitProp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					add(
                    						current,
                    						"situationPropositions",
                    						lv_situationPropositions_1_0,
                    						"symboleoci.Symboleoci.SitProp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:1674:3: ( ( (lv_shortHandNames_2_0= ruleName ) ) otherlv_3= '(' ( ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( (lv_names_6_0= ruleName ) ) (otherlv_7= ',' ( (lv_points_8_0= rulePoint ) ) )* (otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) )* otherlv_11= ')' )
                    {
                    // InternalSymboleoci.g:1674:3: ( ( (lv_shortHandNames_2_0= ruleName ) ) otherlv_3= '(' ( ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( (lv_names_6_0= ruleName ) ) (otherlv_7= ',' ( (lv_points_8_0= rulePoint ) ) )* (otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) )* otherlv_11= ')' )
                    // InternalSymboleoci.g:1675:4: ( (lv_shortHandNames_2_0= ruleName ) ) otherlv_3= '(' ( ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( (lv_names_6_0= ruleName ) ) (otherlv_7= ',' ( (lv_points_8_0= rulePoint ) ) )* (otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) )* otherlv_11= ')'
                    {
                    // InternalSymboleoci.g:1675:4: ( (lv_shortHandNames_2_0= ruleName ) )
                    // InternalSymboleoci.g:1676:5: (lv_shortHandNames_2_0= ruleName )
                    {
                    // InternalSymboleoci.g:1676:5: (lv_shortHandNames_2_0= ruleName )
                    // InternalSymboleoci.g:1677:6: lv_shortHandNames_2_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getShortHandNamesNameParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_shortHandNames_2_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"shortHandNames",
                    							lv_shortHandNames_2_0,
                    							"symboleoci.Symboleoci.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSymboleoci.g:1698:4: ( ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            int LA31_1 = input.LA(2);

                            if ( (LA31_1==16) ) {
                                int LA31_2 = input.LA(3);

                                if ( (LA31_2==RULE_ID) ) {
                                    alt31=1;
                                }


                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSymboleoci.g:1699:5: ( (lv_names_4_0= ruleName ) ) otherlv_5= ','
                    	    {
                    	    // InternalSymboleoci.g:1699:5: ( (lv_names_4_0= ruleName ) )
                    	    // InternalSymboleoci.g:1700:6: (lv_names_4_0= ruleName )
                    	    {
                    	    // InternalSymboleoci.g:1700:6: (lv_names_4_0= ruleName )
                    	    // InternalSymboleoci.g:1701:7: lv_names_4_0= ruleName
                    	    {

                    	    							newCompositeNode(grammarAccess.getAtomAccess().getNamesNameParserRuleCall_2_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_names_4_0=ruleName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAtomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"names",
                    	    								lv_names_4_0,
                    	    								"symboleoci.Symboleoci.Name");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAtomAccess().getCommaKeyword_2_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // InternalSymboleoci.g:1723:4: ( (lv_names_6_0= ruleName ) )
                    // InternalSymboleoci.g:1724:5: (lv_names_6_0= ruleName )
                    {
                    // InternalSymboleoci.g:1724:5: (lv_names_6_0= ruleName )
                    // InternalSymboleoci.g:1725:6: lv_names_6_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getNamesNameParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_names_6_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"names",
                    							lv_names_6_0,
                    							"symboleoci.Symboleoci.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:1742:4: (otherlv_7= ',' ( (lv_points_8_0= rulePoint ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        alt32 = dfa32.predict(input);
                        switch (alt32) {
                    	case 1 :
                    	    // InternalSymboleoci.g:1743:5: otherlv_7= ',' ( (lv_points_8_0= rulePoint ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_34); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAtomAccess().getCommaKeyword_2_4_0());
                    	    				
                    	    // InternalSymboleoci.g:1747:5: ( (lv_points_8_0= rulePoint ) )
                    	    // InternalSymboleoci.g:1748:6: (lv_points_8_0= rulePoint )
                    	    {
                    	    // InternalSymboleoci.g:1748:6: (lv_points_8_0= rulePoint )
                    	    // InternalSymboleoci.g:1749:7: lv_points_8_0= rulePoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getAtomAccess().getPointsPointParserRuleCall_2_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_points_8_0=rulePoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAtomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"points",
                    	    								lv_points_8_0,
                    	    								"symboleoci.Symboleoci.Point");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // InternalSymboleoci.g:1767:4: (otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==16) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalSymboleoci.g:1768:5: otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_35); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAtomAccess().getCommaKeyword_2_5_0());
                    	    				
                    	    // InternalSymboleoci.g:1772:5: ( (lv_intervals_10_0= ruleInterval ) )
                    	    // InternalSymboleoci.g:1773:6: (lv_intervals_10_0= ruleInterval )
                    	    {
                    	    // InternalSymboleoci.g:1773:6: (lv_intervals_10_0= ruleInterval )
                    	    // InternalSymboleoci.g:1774:7: lv_intervals_10_0= ruleInterval
                    	    {

                    	    							newCompositeNode(grammarAccess.getAtomAccess().getIntervalsIntervalParserRuleCall_2_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_intervals_10_0=ruleInterval();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAtomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"intervals",
                    	    								lv_intervals_10_0,
                    	    								"symboleoci.Symboleoci.Interval");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_6());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:1798:3: ( ( (lv_points_12_0= rulePoint ) ) otherlv_13= 'within' ( (lv_intervals_14_0= ruleInterval ) ) )
                    {
                    // InternalSymboleoci.g:1798:3: ( ( (lv_points_12_0= rulePoint ) ) otherlv_13= 'within' ( (lv_intervals_14_0= ruleInterval ) ) )
                    // InternalSymboleoci.g:1799:4: ( (lv_points_12_0= rulePoint ) ) otherlv_13= 'within' ( (lv_intervals_14_0= ruleInterval ) )
                    {
                    // InternalSymboleoci.g:1799:4: ( (lv_points_12_0= rulePoint ) )
                    // InternalSymboleoci.g:1800:5: (lv_points_12_0= rulePoint )
                    {
                    // InternalSymboleoci.g:1800:5: (lv_points_12_0= rulePoint )
                    // InternalSymboleoci.g:1801:6: lv_points_12_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getPointsPointParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_points_12_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"points",
                    							lv_points_12_0,
                    							"symboleoci.Symboleoci.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_13, grammarAccess.getAtomAccess().getWithinKeyword_3_1());
                    			
                    // InternalSymboleoci.g:1822:4: ( (lv_intervals_14_0= ruleInterval ) )
                    // InternalSymboleoci.g:1823:5: (lv_intervals_14_0= ruleInterval )
                    {
                    // InternalSymboleoci.g:1823:5: (lv_intervals_14_0= ruleInterval )
                    // InternalSymboleoci.g:1824:6: lv_intervals_14_0= ruleInterval
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getIntervalsIntervalParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_intervals_14_0=ruleInterval();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"intervals",
                    							lv_intervals_14_0,
                    							"symboleoci.Symboleoci.Interval");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:1843:3: (otherlv_15= '(' ( (lv_propositions_16_0= ruleProp ) ) otherlv_17= ')' )
                    {
                    // InternalSymboleoci.g:1843:3: (otherlv_15= '(' ( (lv_propositions_16_0= ruleProp ) ) otherlv_17= ')' )
                    // InternalSymboleoci.g:1844:4: otherlv_15= '(' ( (lv_propositions_16_0= ruleProp ) ) otherlv_17= ')'
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_15, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalSymboleoci.g:1848:4: ( (lv_propositions_16_0= ruleProp ) )
                    // InternalSymboleoci.g:1849:5: (lv_propositions_16_0= ruleProp )
                    {
                    // InternalSymboleoci.g:1849:5: (lv_propositions_16_0= ruleProp )
                    // InternalSymboleoci.g:1850:6: lv_propositions_16_0= ruleProp
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getPropositionsPropParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_propositions_16_0=ruleProp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"propositions",
                    							lv_propositions_16_0,
                    							"symboleoci.Symboleoci.Prop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getAtomAccess().getRightParenthesisKeyword_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSymboleoci.g:1873:3: (otherlv_18= 'exists' ( (lv_varName_19_0= ruleName ) ) otherlv_20= '|' ( (lv_setExps_21_0= ruleSetExp ) ) otherlv_22= '(' ( (lv_metaconstraints_23_0= ruleMetaConst ) ) otherlv_24= ')' )
                    {
                    // InternalSymboleoci.g:1873:3: (otherlv_18= 'exists' ( (lv_varName_19_0= ruleName ) ) otherlv_20= '|' ( (lv_setExps_21_0= ruleSetExp ) ) otherlv_22= '(' ( (lv_metaconstraints_23_0= ruleMetaConst ) ) otherlv_24= ')' )
                    // InternalSymboleoci.g:1874:4: otherlv_18= 'exists' ( (lv_varName_19_0= ruleName ) ) otherlv_20= '|' ( (lv_setExps_21_0= ruleSetExp ) ) otherlv_22= '(' ( (lv_metaconstraints_23_0= ruleMetaConst ) ) otherlv_24= ')'
                    {
                    otherlv_18=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getAtomAccess().getExistsKeyword_5_0());
                    			
                    // InternalSymboleoci.g:1878:4: ( (lv_varName_19_0= ruleName ) )
                    // InternalSymboleoci.g:1879:5: (lv_varName_19_0= ruleName )
                    {
                    // InternalSymboleoci.g:1879:5: (lv_varName_19_0= ruleName )
                    // InternalSymboleoci.g:1880:6: lv_varName_19_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getVarNameNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_varName_19_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"varName",
                    							lv_varName_19_0,
                    							"symboleoci.Symboleoci.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,46,FOLLOW_38); 

                    				newLeafNode(otherlv_20, grammarAccess.getAtomAccess().getVerticalLineKeyword_5_2());
                    			
                    // InternalSymboleoci.g:1901:4: ( (lv_setExps_21_0= ruleSetExp ) )
                    // InternalSymboleoci.g:1902:5: (lv_setExps_21_0= ruleSetExp )
                    {
                    // InternalSymboleoci.g:1902:5: (lv_setExps_21_0= ruleSetExp )
                    // InternalSymboleoci.g:1903:6: lv_setExps_21_0= ruleSetExp
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getSetExpsSetExpParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_setExps_21_0=ruleSetExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"setExps",
                    							lv_setExps_21_0,
                    							"symboleoci.Symboleoci.SetExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,18,FOLLOW_39); 

                    				newLeafNode(otherlv_22, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_5_4());
                    			
                    // InternalSymboleoci.g:1924:4: ( (lv_metaconstraints_23_0= ruleMetaConst ) )
                    // InternalSymboleoci.g:1925:5: (lv_metaconstraints_23_0= ruleMetaConst )
                    {
                    // InternalSymboleoci.g:1925:5: (lv_metaconstraints_23_0= ruleMetaConst )
                    // InternalSymboleoci.g:1926:6: lv_metaconstraints_23_0= ruleMetaConst
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getMetaconstraintsMetaConstParserRuleCall_5_5_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_metaconstraints_23_0=ruleMetaConst();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"metaconstraints",
                    							lv_metaconstraints_23_0,
                    							"symboleoci.Symboleoci.MetaConst");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getAtomAccess().getRightParenthesisKeyword_5_6());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSymboleoci.g:1949:3: (otherlv_25= 'forAll' ( (lv_varName_26_0= ruleName ) ) otherlv_27= '|' ( (lv_setExps_28_0= ruleSetExp ) ) otherlv_29= '(' ( (lv_metaconstraints_30_0= ruleMetaConst ) ) otherlv_31= ')' )
                    {
                    // InternalSymboleoci.g:1949:3: (otherlv_25= 'forAll' ( (lv_varName_26_0= ruleName ) ) otherlv_27= '|' ( (lv_setExps_28_0= ruleSetExp ) ) otherlv_29= '(' ( (lv_metaconstraints_30_0= ruleMetaConst ) ) otherlv_31= ')' )
                    // InternalSymboleoci.g:1950:4: otherlv_25= 'forAll' ( (lv_varName_26_0= ruleName ) ) otherlv_27= '|' ( (lv_setExps_28_0= ruleSetExp ) ) otherlv_29= '(' ( (lv_metaconstraints_30_0= ruleMetaConst ) ) otherlv_31= ')'
                    {
                    otherlv_25=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_25, grammarAccess.getAtomAccess().getForAllKeyword_6_0());
                    			
                    // InternalSymboleoci.g:1954:4: ( (lv_varName_26_0= ruleName ) )
                    // InternalSymboleoci.g:1955:5: (lv_varName_26_0= ruleName )
                    {
                    // InternalSymboleoci.g:1955:5: (lv_varName_26_0= ruleName )
                    // InternalSymboleoci.g:1956:6: lv_varName_26_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getVarNameNameParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_varName_26_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"varName",
                    							lv_varName_26_0,
                    							"symboleoci.Symboleoci.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,46,FOLLOW_38); 

                    				newLeafNode(otherlv_27, grammarAccess.getAtomAccess().getVerticalLineKeyword_6_2());
                    			
                    // InternalSymboleoci.g:1977:4: ( (lv_setExps_28_0= ruleSetExp ) )
                    // InternalSymboleoci.g:1978:5: (lv_setExps_28_0= ruleSetExp )
                    {
                    // InternalSymboleoci.g:1978:5: (lv_setExps_28_0= ruleSetExp )
                    // InternalSymboleoci.g:1979:6: lv_setExps_28_0= ruleSetExp
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getSetExpsSetExpParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_setExps_28_0=ruleSetExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"setExps",
                    							lv_setExps_28_0,
                    							"symboleoci.Symboleoci.SetExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,18,FOLLOW_39); 

                    				newLeafNode(otherlv_29, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_6_4());
                    			
                    // InternalSymboleoci.g:2000:4: ( (lv_metaconstraints_30_0= ruleMetaConst ) )
                    // InternalSymboleoci.g:2001:5: (lv_metaconstraints_30_0= ruleMetaConst )
                    {
                    // InternalSymboleoci.g:2001:5: (lv_metaconstraints_30_0= ruleMetaConst )
                    // InternalSymboleoci.g:2002:6: lv_metaconstraints_30_0= ruleMetaConst
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getMetaconstraintsMetaConstParserRuleCall_6_5_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_metaconstraints_30_0=ruleMetaConst();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"metaconstraints",
                    							lv_metaconstraints_30_0,
                    							"symboleoci.Symboleoci.MetaConst");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_31, grammarAccess.getAtomAccess().getRightParenthesisKeyword_6_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSymboleoci.g:2025:3: ( () otherlv_33= 'TRUE' )
                    {
                    // InternalSymboleoci.g:2025:3: ( () otherlv_33= 'TRUE' )
                    // InternalSymboleoci.g:2026:4: () otherlv_33= 'TRUE'
                    {
                    // InternalSymboleoci.g:2026:4: ()
                    // InternalSymboleoci.g:2027:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomAccess().getAtomAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_33=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_33, grammarAccess.getAtomAccess().getTRUEKeyword_7_1());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSymboleoci.g:2039:3: ( () otherlv_35= 'FALSE' )
                    {
                    // InternalSymboleoci.g:2039:3: ( () otherlv_35= 'FALSE' )
                    // InternalSymboleoci.g:2040:4: () otherlv_35= 'FALSE'
                    {
                    // InternalSymboleoci.g:2040:4: ()
                    // InternalSymboleoci.g:2041:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomAccess().getAtomAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_35=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_35, grammarAccess.getAtomAccess().getFALSEKeyword_8_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleSitProp"
    // InternalSymboleoci.g:2056:1: entryRuleSitProp returns [EObject current=null] : iv_ruleSitProp= ruleSitProp EOF ;
    public final EObject entryRuleSitProp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitProp = null;


        try {
            // InternalSymboleoci.g:2056:48: (iv_ruleSitProp= ruleSitProp EOF )
            // InternalSymboleoci.g:2057:2: iv_ruleSitProp= ruleSitProp EOF
            {
             newCompositeNode(grammarAccess.getSitPropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSitProp=ruleSitProp();

            state._fsp--;

             current =iv_ruleSitProp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSitProp"


    // $ANTLR start "ruleSitProp"
    // InternalSymboleoci.g:2063:1: ruleSitProp returns [EObject current=null] : ( (otherlv_0= 'occurs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_intervals_4_0= ruleInterval ) ) otherlv_5= ')' ) | (otherlv_6= 'occurs' otherlv_7= '(' ( (lv_oSituationName_8_0= ruleoState ) ) otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) otherlv_11= ')' ) | (otherlv_12= 'occurs' otherlv_13= '(' ( (lv_cSituationName_14_0= rulecState ) ) otherlv_15= ',' ( (lv_intervals_16_0= ruleInterval ) ) otherlv_17= ')' ) | (otherlv_18= 'occurs' otherlv_19= '(' ( (lv_pSituationName_20_0= rulepState ) ) otherlv_21= ',' ( (lv_intervals_22_0= ruleInterval ) ) otherlv_23= ')' ) ) ;
    public final EObject ruleSitProp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_intervals_4_0 = null;

        EObject lv_oSituationName_8_0 = null;

        EObject lv_intervals_10_0 = null;

        EObject lv_cSituationName_14_0 = null;

        EObject lv_intervals_16_0 = null;

        EObject lv_pSituationName_20_0 = null;

        EObject lv_intervals_22_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:2069:2: ( ( (otherlv_0= 'occurs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_intervals_4_0= ruleInterval ) ) otherlv_5= ')' ) | (otherlv_6= 'occurs' otherlv_7= '(' ( (lv_oSituationName_8_0= ruleoState ) ) otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) otherlv_11= ')' ) | (otherlv_12= 'occurs' otherlv_13= '(' ( (lv_cSituationName_14_0= rulecState ) ) otherlv_15= ',' ( (lv_intervals_16_0= ruleInterval ) ) otherlv_17= ')' ) | (otherlv_18= 'occurs' otherlv_19= '(' ( (lv_pSituationName_20_0= rulepState ) ) otherlv_21= ',' ( (lv_intervals_22_0= ruleInterval ) ) otherlv_23= ')' ) ) )
            // InternalSymboleoci.g:2070:2: ( (otherlv_0= 'occurs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_intervals_4_0= ruleInterval ) ) otherlv_5= ')' ) | (otherlv_6= 'occurs' otherlv_7= '(' ( (lv_oSituationName_8_0= ruleoState ) ) otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) otherlv_11= ')' ) | (otherlv_12= 'occurs' otherlv_13= '(' ( (lv_cSituationName_14_0= rulecState ) ) otherlv_15= ',' ( (lv_intervals_16_0= ruleInterval ) ) otherlv_17= ')' ) | (otherlv_18= 'occurs' otherlv_19= '(' ( (lv_pSituationName_20_0= rulepState ) ) otherlv_21= ',' ( (lv_intervals_22_0= ruleInterval ) ) otherlv_23= ')' ) )
            {
            // InternalSymboleoci.g:2070:2: ( (otherlv_0= 'occurs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_intervals_4_0= ruleInterval ) ) otherlv_5= ')' ) | (otherlv_6= 'occurs' otherlv_7= '(' ( (lv_oSituationName_8_0= ruleoState ) ) otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) otherlv_11= ')' ) | (otherlv_12= 'occurs' otherlv_13= '(' ( (lv_cSituationName_14_0= rulecState ) ) otherlv_15= ',' ( (lv_intervals_16_0= ruleInterval ) ) otherlv_17= ')' ) | (otherlv_18= 'occurs' otherlv_19= '(' ( (lv_pSituationName_20_0= rulepState ) ) otherlv_21= ',' ( (lv_intervals_22_0= ruleInterval ) ) otherlv_23= ')' ) )
            int alt35=4;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==18) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        alt35=1;
                        }
                        break;
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                        {
                        alt35=2;
                        }
                        break;
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                        {
                        alt35=3;
                        }
                        break;
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                        {
                        alt35=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalSymboleoci.g:2071:3: (otherlv_0= 'occurs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_intervals_4_0= ruleInterval ) ) otherlv_5= ')' )
                    {
                    // InternalSymboleoci.g:2071:3: (otherlv_0= 'occurs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_intervals_4_0= ruleInterval ) ) otherlv_5= ')' )
                    // InternalSymboleoci.g:2072:4: otherlv_0= 'occurs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_intervals_4_0= ruleInterval ) ) otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,50,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getSitPropAccess().getOccursKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSitPropAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSymboleoci.g:2080:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSymboleoci.g:2081:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSymboleoci.g:2081:5: (otherlv_2= RULE_ID )
                    // InternalSymboleoci.g:2082:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSitPropRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_2, grammarAccess.getSitPropAccess().getSituationNameNameCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getSitPropAccess().getCommaKeyword_0_3());
                    			
                    // InternalSymboleoci.g:2097:4: ( (lv_intervals_4_0= ruleInterval ) )
                    // InternalSymboleoci.g:2098:5: (lv_intervals_4_0= ruleInterval )
                    {
                    // InternalSymboleoci.g:2098:5: (lv_intervals_4_0= ruleInterval )
                    // InternalSymboleoci.g:2099:6: lv_intervals_4_0= ruleInterval
                    {

                    						newCompositeNode(grammarAccess.getSitPropAccess().getIntervalsIntervalParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_intervals_4_0=ruleInterval();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitPropRule());
                    						}
                    						add(
                    							current,
                    							"intervals",
                    							lv_intervals_4_0,
                    							"symboleoci.Symboleoci.Interval");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSitPropAccess().getRightParenthesisKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:2122:3: (otherlv_6= 'occurs' otherlv_7= '(' ( (lv_oSituationName_8_0= ruleoState ) ) otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) otherlv_11= ')' )
                    {
                    // InternalSymboleoci.g:2122:3: (otherlv_6= 'occurs' otherlv_7= '(' ( (lv_oSituationName_8_0= ruleoState ) ) otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) otherlv_11= ')' )
                    // InternalSymboleoci.g:2123:4: otherlv_6= 'occurs' otherlv_7= '(' ( (lv_oSituationName_8_0= ruleoState ) ) otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getSitPropAccess().getOccursKeyword_1_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_40); 

                    				newLeafNode(otherlv_7, grammarAccess.getSitPropAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSymboleoci.g:2131:4: ( (lv_oSituationName_8_0= ruleoState ) )
                    // InternalSymboleoci.g:2132:5: (lv_oSituationName_8_0= ruleoState )
                    {
                    // InternalSymboleoci.g:2132:5: (lv_oSituationName_8_0= ruleoState )
                    // InternalSymboleoci.g:2133:6: lv_oSituationName_8_0= ruleoState
                    {

                    						newCompositeNode(grammarAccess.getSitPropAccess().getOSituationNameOStateParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_oSituationName_8_0=ruleoState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitPropRule());
                    						}
                    						set(
                    							current,
                    							"oSituationName",
                    							lv_oSituationName_8_0,
                    							"symboleoci.Symboleoci.oState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getSitPropAccess().getCommaKeyword_1_3());
                    			
                    // InternalSymboleoci.g:2154:4: ( (lv_intervals_10_0= ruleInterval ) )
                    // InternalSymboleoci.g:2155:5: (lv_intervals_10_0= ruleInterval )
                    {
                    // InternalSymboleoci.g:2155:5: (lv_intervals_10_0= ruleInterval )
                    // InternalSymboleoci.g:2156:6: lv_intervals_10_0= ruleInterval
                    {

                    						newCompositeNode(grammarAccess.getSitPropAccess().getIntervalsIntervalParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_intervals_10_0=ruleInterval();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitPropRule());
                    						}
                    						add(
                    							current,
                    							"intervals",
                    							lv_intervals_10_0,
                    							"symboleoci.Symboleoci.Interval");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getSitPropAccess().getRightParenthesisKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:2179:3: (otherlv_12= 'occurs' otherlv_13= '(' ( (lv_cSituationName_14_0= rulecState ) ) otherlv_15= ',' ( (lv_intervals_16_0= ruleInterval ) ) otherlv_17= ')' )
                    {
                    // InternalSymboleoci.g:2179:3: (otherlv_12= 'occurs' otherlv_13= '(' ( (lv_cSituationName_14_0= rulecState ) ) otherlv_15= ',' ( (lv_intervals_16_0= ruleInterval ) ) otherlv_17= ')' )
                    // InternalSymboleoci.g:2180:4: otherlv_12= 'occurs' otherlv_13= '(' ( (lv_cSituationName_14_0= rulecState ) ) otherlv_15= ',' ( (lv_intervals_16_0= ruleInterval ) ) otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,50,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getSitPropAccess().getOccursKeyword_2_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_41); 

                    				newLeafNode(otherlv_13, grammarAccess.getSitPropAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSymboleoci.g:2188:4: ( (lv_cSituationName_14_0= rulecState ) )
                    // InternalSymboleoci.g:2189:5: (lv_cSituationName_14_0= rulecState )
                    {
                    // InternalSymboleoci.g:2189:5: (lv_cSituationName_14_0= rulecState )
                    // InternalSymboleoci.g:2190:6: lv_cSituationName_14_0= rulecState
                    {

                    						newCompositeNode(grammarAccess.getSitPropAccess().getCSituationNameCStateParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_cSituationName_14_0=rulecState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitPropRule());
                    						}
                    						set(
                    							current,
                    							"cSituationName",
                    							lv_cSituationName_14_0,
                    							"symboleoci.Symboleoci.cState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,16,FOLLOW_35); 

                    				newLeafNode(otherlv_15, grammarAccess.getSitPropAccess().getCommaKeyword_2_3());
                    			
                    // InternalSymboleoci.g:2211:4: ( (lv_intervals_16_0= ruleInterval ) )
                    // InternalSymboleoci.g:2212:5: (lv_intervals_16_0= ruleInterval )
                    {
                    // InternalSymboleoci.g:2212:5: (lv_intervals_16_0= ruleInterval )
                    // InternalSymboleoci.g:2213:6: lv_intervals_16_0= ruleInterval
                    {

                    						newCompositeNode(grammarAccess.getSitPropAccess().getIntervalsIntervalParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_intervals_16_0=ruleInterval();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitPropRule());
                    						}
                    						add(
                    							current,
                    							"intervals",
                    							lv_intervals_16_0,
                    							"symboleoci.Symboleoci.Interval");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getSitPropAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:2236:3: (otherlv_18= 'occurs' otherlv_19= '(' ( (lv_pSituationName_20_0= rulepState ) ) otherlv_21= ',' ( (lv_intervals_22_0= ruleInterval ) ) otherlv_23= ')' )
                    {
                    // InternalSymboleoci.g:2236:3: (otherlv_18= 'occurs' otherlv_19= '(' ( (lv_pSituationName_20_0= rulepState ) ) otherlv_21= ',' ( (lv_intervals_22_0= ruleInterval ) ) otherlv_23= ')' )
                    // InternalSymboleoci.g:2237:4: otherlv_18= 'occurs' otherlv_19= '(' ( (lv_pSituationName_20_0= rulepState ) ) otherlv_21= ',' ( (lv_intervals_22_0= ruleInterval ) ) otherlv_23= ')'
                    {
                    otherlv_18=(Token)match(input,50,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getSitPropAccess().getOccursKeyword_3_0());
                    			
                    otherlv_19=(Token)match(input,18,FOLLOW_42); 

                    				newLeafNode(otherlv_19, grammarAccess.getSitPropAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSymboleoci.g:2245:4: ( (lv_pSituationName_20_0= rulepState ) )
                    // InternalSymboleoci.g:2246:5: (lv_pSituationName_20_0= rulepState )
                    {
                    // InternalSymboleoci.g:2246:5: (lv_pSituationName_20_0= rulepState )
                    // InternalSymboleoci.g:2247:6: lv_pSituationName_20_0= rulepState
                    {

                    						newCompositeNode(grammarAccess.getSitPropAccess().getPSituationNamePStateParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_pSituationName_20_0=rulepState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitPropRule());
                    						}
                    						set(
                    							current,
                    							"pSituationName",
                    							lv_pSituationName_20_0,
                    							"symboleoci.Symboleoci.pState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,16,FOLLOW_35); 

                    				newLeafNode(otherlv_21, grammarAccess.getSitPropAccess().getCommaKeyword_3_3());
                    			
                    // InternalSymboleoci.g:2268:4: ( (lv_intervals_22_0= ruleInterval ) )
                    // InternalSymboleoci.g:2269:5: (lv_intervals_22_0= ruleInterval )
                    {
                    // InternalSymboleoci.g:2269:5: (lv_intervals_22_0= ruleInterval )
                    // InternalSymboleoci.g:2270:6: lv_intervals_22_0= ruleInterval
                    {

                    						newCompositeNode(grammarAccess.getSitPropAccess().getIntervalsIntervalParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_intervals_22_0=ruleInterval();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSitPropRule());
                    						}
                    						add(
                    							current,
                    							"intervals",
                    							lv_intervals_22_0,
                    							"symboleoci.Symboleoci.Interval");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getSitPropAccess().getRightParenthesisKeyword_3_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSitProp"


    // $ANTLR start "entryRuleEventProp"
    // InternalSymboleoci.g:2296:1: entryRuleEventProp returns [EObject current=null] : iv_ruleEventProp= ruleEventProp EOF ;
    public final EObject entryRuleEventProp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventProp = null;


        try {
            // InternalSymboleoci.g:2296:50: (iv_ruleEventProp= ruleEventProp EOF )
            // InternalSymboleoci.g:2297:2: iv_ruleEventProp= ruleEventProp EOF
            {
             newCompositeNode(grammarAccess.getEventPropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventProp=ruleEventProp();

            state._fsp--;

             current =iv_ruleEventProp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventProp"


    // $ANTLR start "ruleEventProp"
    // InternalSymboleoci.g:2303:1: ruleEventProp returns [EObject current=null] : ( (otherlv_0= 'happens' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ')' ) | (otherlv_6= 'happens' otherlv_7= '(' ( (lv_oEventName_8_0= ruleoEvent ) ) otherlv_9= ',' ( (lv_points_10_0= rulePoint ) ) otherlv_11= ')' ) | (otherlv_12= 'happens' otherlv_13= '(' ( (lv_cEventName_14_0= rulecEvent ) ) otherlv_15= ',' ( (lv_points_16_0= rulePoint ) ) otherlv_17= ')' ) | (otherlv_18= 'happens' otherlv_19= '(' ( (lv_pEventName_20_0= rulepEvent ) ) otherlv_21= ',' ( (lv_points_22_0= rulePoint ) ) otherlv_23= ')' ) ) ;
    public final EObject ruleEventProp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_points_4_0 = null;

        EObject lv_oEventName_8_0 = null;

        EObject lv_points_10_0 = null;

        EObject lv_cEventName_14_0 = null;

        EObject lv_points_16_0 = null;

        EObject lv_pEventName_20_0 = null;

        EObject lv_points_22_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:2309:2: ( ( (otherlv_0= 'happens' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ')' ) | (otherlv_6= 'happens' otherlv_7= '(' ( (lv_oEventName_8_0= ruleoEvent ) ) otherlv_9= ',' ( (lv_points_10_0= rulePoint ) ) otherlv_11= ')' ) | (otherlv_12= 'happens' otherlv_13= '(' ( (lv_cEventName_14_0= rulecEvent ) ) otherlv_15= ',' ( (lv_points_16_0= rulePoint ) ) otherlv_17= ')' ) | (otherlv_18= 'happens' otherlv_19= '(' ( (lv_pEventName_20_0= rulepEvent ) ) otherlv_21= ',' ( (lv_points_22_0= rulePoint ) ) otherlv_23= ')' ) ) )
            // InternalSymboleoci.g:2310:2: ( (otherlv_0= 'happens' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ')' ) | (otherlv_6= 'happens' otherlv_7= '(' ( (lv_oEventName_8_0= ruleoEvent ) ) otherlv_9= ',' ( (lv_points_10_0= rulePoint ) ) otherlv_11= ')' ) | (otherlv_12= 'happens' otherlv_13= '(' ( (lv_cEventName_14_0= rulecEvent ) ) otherlv_15= ',' ( (lv_points_16_0= rulePoint ) ) otherlv_17= ')' ) | (otherlv_18= 'happens' otherlv_19= '(' ( (lv_pEventName_20_0= rulepEvent ) ) otherlv_21= ',' ( (lv_points_22_0= rulePoint ) ) otherlv_23= ')' ) )
            {
            // InternalSymboleoci.g:2310:2: ( (otherlv_0= 'happens' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ')' ) | (otherlv_6= 'happens' otherlv_7= '(' ( (lv_oEventName_8_0= ruleoEvent ) ) otherlv_9= ',' ( (lv_points_10_0= rulePoint ) ) otherlv_11= ')' ) | (otherlv_12= 'happens' otherlv_13= '(' ( (lv_cEventName_14_0= rulecEvent ) ) otherlv_15= ',' ( (lv_points_16_0= rulePoint ) ) otherlv_17= ')' ) | (otherlv_18= 'happens' otherlv_19= '(' ( (lv_pEventName_20_0= rulepEvent ) ) otherlv_21= ',' ( (lv_points_22_0= rulePoint ) ) otherlv_23= ')' ) )
            int alt36=4;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==18) ) {
                    switch ( input.LA(3) ) {
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                        {
                        alt36=3;
                        }
                        break;
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                        {
                        alt36=4;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt36=1;
                        }
                        break;
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                        {
                        alt36=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalSymboleoci.g:2311:3: (otherlv_0= 'happens' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ')' )
                    {
                    // InternalSymboleoci.g:2311:3: (otherlv_0= 'happens' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ')' )
                    // InternalSymboleoci.g:2312:4: otherlv_0= 'happens' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getEventPropAccess().getHappensKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventPropAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSymboleoci.g:2320:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSymboleoci.g:2321:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSymboleoci.g:2321:5: (otherlv_2= RULE_ID )
                    // InternalSymboleoci.g:2322:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventPropRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_2, grammarAccess.getEventPropAccess().getEventNameDeclarCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getEventPropAccess().getCommaKeyword_0_3());
                    			
                    // InternalSymboleoci.g:2337:4: ( (lv_points_4_0= rulePoint ) )
                    // InternalSymboleoci.g:2338:5: (lv_points_4_0= rulePoint )
                    {
                    // InternalSymboleoci.g:2338:5: (lv_points_4_0= rulePoint )
                    // InternalSymboleoci.g:2339:6: lv_points_4_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getEventPropAccess().getPointsPointParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_points_4_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventPropRule());
                    						}
                    						add(
                    							current,
                    							"points",
                    							lv_points_4_0,
                    							"symboleoci.Symboleoci.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getEventPropAccess().getRightParenthesisKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:2362:3: (otherlv_6= 'happens' otherlv_7= '(' ( (lv_oEventName_8_0= ruleoEvent ) ) otherlv_9= ',' ( (lv_points_10_0= rulePoint ) ) otherlv_11= ')' )
                    {
                    // InternalSymboleoci.g:2362:3: (otherlv_6= 'happens' otherlv_7= '(' ( (lv_oEventName_8_0= ruleoEvent ) ) otherlv_9= ',' ( (lv_points_10_0= rulePoint ) ) otherlv_11= ')' )
                    // InternalSymboleoci.g:2363:4: otherlv_6= 'happens' otherlv_7= '(' ( (lv_oEventName_8_0= ruleoEvent ) ) otherlv_9= ',' ( (lv_points_10_0= rulePoint ) ) otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventPropAccess().getHappensKeyword_1_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_43); 

                    				newLeafNode(otherlv_7, grammarAccess.getEventPropAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSymboleoci.g:2371:4: ( (lv_oEventName_8_0= ruleoEvent ) )
                    // InternalSymboleoci.g:2372:5: (lv_oEventName_8_0= ruleoEvent )
                    {
                    // InternalSymboleoci.g:2372:5: (lv_oEventName_8_0= ruleoEvent )
                    // InternalSymboleoci.g:2373:6: lv_oEventName_8_0= ruleoEvent
                    {

                    						newCompositeNode(grammarAccess.getEventPropAccess().getOEventNameOEventParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_oEventName_8_0=ruleoEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventPropRule());
                    						}
                    						set(
                    							current,
                    							"oEventName",
                    							lv_oEventName_8_0,
                    							"symboleoci.Symboleoci.oEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_9, grammarAccess.getEventPropAccess().getCommaKeyword_1_3());
                    			
                    // InternalSymboleoci.g:2394:4: ( (lv_points_10_0= rulePoint ) )
                    // InternalSymboleoci.g:2395:5: (lv_points_10_0= rulePoint )
                    {
                    // InternalSymboleoci.g:2395:5: (lv_points_10_0= rulePoint )
                    // InternalSymboleoci.g:2396:6: lv_points_10_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getEventPropAccess().getPointsPointParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_points_10_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventPropRule());
                    						}
                    						add(
                    							current,
                    							"points",
                    							lv_points_10_0,
                    							"symboleoci.Symboleoci.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventPropAccess().getRightParenthesisKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:2419:3: (otherlv_12= 'happens' otherlv_13= '(' ( (lv_cEventName_14_0= rulecEvent ) ) otherlv_15= ',' ( (lv_points_16_0= rulePoint ) ) otherlv_17= ')' )
                    {
                    // InternalSymboleoci.g:2419:3: (otherlv_12= 'happens' otherlv_13= '(' ( (lv_cEventName_14_0= rulecEvent ) ) otherlv_15= ',' ( (lv_points_16_0= rulePoint ) ) otherlv_17= ')' )
                    // InternalSymboleoci.g:2420:4: otherlv_12= 'happens' otherlv_13= '(' ( (lv_cEventName_14_0= rulecEvent ) ) otherlv_15= ',' ( (lv_points_16_0= rulePoint ) ) otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,51,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getEventPropAccess().getHappensKeyword_2_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_44); 

                    				newLeafNode(otherlv_13, grammarAccess.getEventPropAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSymboleoci.g:2428:4: ( (lv_cEventName_14_0= rulecEvent ) )
                    // InternalSymboleoci.g:2429:5: (lv_cEventName_14_0= rulecEvent )
                    {
                    // InternalSymboleoci.g:2429:5: (lv_cEventName_14_0= rulecEvent )
                    // InternalSymboleoci.g:2430:6: lv_cEventName_14_0= rulecEvent
                    {

                    						newCompositeNode(grammarAccess.getEventPropAccess().getCEventNameCEventParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_cEventName_14_0=rulecEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventPropRule());
                    						}
                    						set(
                    							current,
                    							"cEventName",
                    							lv_cEventName_14_0,
                    							"symboleoci.Symboleoci.cEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_15, grammarAccess.getEventPropAccess().getCommaKeyword_2_3());
                    			
                    // InternalSymboleoci.g:2451:4: ( (lv_points_16_0= rulePoint ) )
                    // InternalSymboleoci.g:2452:5: (lv_points_16_0= rulePoint )
                    {
                    // InternalSymboleoci.g:2452:5: (lv_points_16_0= rulePoint )
                    // InternalSymboleoci.g:2453:6: lv_points_16_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getEventPropAccess().getPointsPointParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_points_16_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventPropRule());
                    						}
                    						add(
                    							current,
                    							"points",
                    							lv_points_16_0,
                    							"symboleoci.Symboleoci.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getEventPropAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:2476:3: (otherlv_18= 'happens' otherlv_19= '(' ( (lv_pEventName_20_0= rulepEvent ) ) otherlv_21= ',' ( (lv_points_22_0= rulePoint ) ) otherlv_23= ')' )
                    {
                    // InternalSymboleoci.g:2476:3: (otherlv_18= 'happens' otherlv_19= '(' ( (lv_pEventName_20_0= rulepEvent ) ) otherlv_21= ',' ( (lv_points_22_0= rulePoint ) ) otherlv_23= ')' )
                    // InternalSymboleoci.g:2477:4: otherlv_18= 'happens' otherlv_19= '(' ( (lv_pEventName_20_0= rulepEvent ) ) otherlv_21= ',' ( (lv_points_22_0= rulePoint ) ) otherlv_23= ')'
                    {
                    otherlv_18=(Token)match(input,51,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getEventPropAccess().getHappensKeyword_3_0());
                    			
                    otherlv_19=(Token)match(input,18,FOLLOW_45); 

                    				newLeafNode(otherlv_19, grammarAccess.getEventPropAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSymboleoci.g:2485:4: ( (lv_pEventName_20_0= rulepEvent ) )
                    // InternalSymboleoci.g:2486:5: (lv_pEventName_20_0= rulepEvent )
                    {
                    // InternalSymboleoci.g:2486:5: (lv_pEventName_20_0= rulepEvent )
                    // InternalSymboleoci.g:2487:6: lv_pEventName_20_0= rulepEvent
                    {

                    						newCompositeNode(grammarAccess.getEventPropAccess().getPEventNamePEventParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_pEventName_20_0=rulepEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventPropRule());
                    						}
                    						set(
                    							current,
                    							"pEventName",
                    							lv_pEventName_20_0,
                    							"symboleoci.Symboleoci.pEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_21, grammarAccess.getEventPropAccess().getCommaKeyword_3_3());
                    			
                    // InternalSymboleoci.g:2508:4: ( (lv_points_22_0= rulePoint ) )
                    // InternalSymboleoci.g:2509:5: (lv_points_22_0= rulePoint )
                    {
                    // InternalSymboleoci.g:2509:5: (lv_points_22_0= rulePoint )
                    // InternalSymboleoci.g:2510:6: lv_points_22_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getEventPropAccess().getPointsPointParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_points_22_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventPropRule());
                    						}
                    						add(
                    							current,
                    							"points",
                    							lv_points_22_0,
                    							"symboleoci.Symboleoci.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getEventPropAccess().getRightParenthesisKeyword_3_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventProp"


    // $ANTLR start "entryRuleMetaConst"
    // InternalSymboleoci.g:2536:1: entryRuleMetaConst returns [String current=null] : iv_ruleMetaConst= ruleMetaConst EOF ;
    public final String entryRuleMetaConst() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetaConst = null;


        try {
            // InternalSymboleoci.g:2536:49: (iv_ruleMetaConst= ruleMetaConst EOF )
            // InternalSymboleoci.g:2537:2: iv_ruleMetaConst= ruleMetaConst EOF
            {
             newCompositeNode(grammarAccess.getMetaConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaConst=ruleMetaConst();

            state._fsp--;

             current =iv_ruleMetaConst.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetaConst"


    // $ANTLR start "ruleMetaConst"
    // InternalSymboleoci.g:2543:1: ruleMetaConst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CannotBeAssigned' ;
    public final AntlrDatatypeRuleToken ruleMetaConst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:2549:2: (kw= 'CannotBeAssigned' )
            // InternalSymboleoci.g:2550:2: kw= 'CannotBeAssigned'
            {
            kw=(Token)match(input,52,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMetaConstAccess().getCannotBeAssignedKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaConst"


    // $ANTLR start "entryRuleInterval"
    // InternalSymboleoci.g:2558:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSymboleoci.g:2558:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSymboleoci.g:2559:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalSymboleoci.g:2565:1: ruleInterval returns [EObject current=null] : ( ( (lv_situationName_0_0= ruleSitName ) ) | (otherlv_1= '[' ( (lv_points_2_0= rulePoint ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ']' ) | ( () otherlv_7= 'UNNAMED_INTERVAL' ) | ( ( (lv_situationNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_intConsts_10_0= ruleIntConst ) ) ( (lv_units_11_0= ruleUnit ) ) ) | ( ( (lv_intConsts_12_0= ruleIntConst ) ) ( (lv_units_13_0= ruleUnit ) ) ( (lv_tempOps_14_0= ruleTempOp ) ) ( (lv_situationNames_15_0= ruleSitName ) ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_situationName_0_0 = null;

        EObject lv_points_2_0 = null;

        EObject lv_points_4_0 = null;

        EObject lv_situationNames_8_0 = null;

        AntlrDatatypeRuleToken lv_tempOps_9_0 = null;

        EObject lv_intConsts_10_0 = null;

        AntlrDatatypeRuleToken lv_units_11_0 = null;

        EObject lv_intConsts_12_0 = null;

        AntlrDatatypeRuleToken lv_units_13_0 = null;

        AntlrDatatypeRuleToken lv_tempOps_14_0 = null;

        EObject lv_situationNames_15_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:2571:2: ( ( ( (lv_situationName_0_0= ruleSitName ) ) | (otherlv_1= '[' ( (lv_points_2_0= rulePoint ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ']' ) | ( () otherlv_7= 'UNNAMED_INTERVAL' ) | ( ( (lv_situationNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_intConsts_10_0= ruleIntConst ) ) ( (lv_units_11_0= ruleUnit ) ) ) | ( ( (lv_intConsts_12_0= ruleIntConst ) ) ( (lv_units_13_0= ruleUnit ) ) ( (lv_tempOps_14_0= ruleTempOp ) ) ( (lv_situationNames_15_0= ruleSitName ) ) ) ) )
            // InternalSymboleoci.g:2572:2: ( ( (lv_situationName_0_0= ruleSitName ) ) | (otherlv_1= '[' ( (lv_points_2_0= rulePoint ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ']' ) | ( () otherlv_7= 'UNNAMED_INTERVAL' ) | ( ( (lv_situationNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_intConsts_10_0= ruleIntConst ) ) ( (lv_units_11_0= ruleUnit ) ) ) | ( ( (lv_intConsts_12_0= ruleIntConst ) ) ( (lv_units_13_0= ruleUnit ) ) ( (lv_tempOps_14_0= ruleTempOp ) ) ( (lv_situationNames_15_0= ruleSitName ) ) ) )
            {
            // InternalSymboleoci.g:2572:2: ( ( (lv_situationName_0_0= ruleSitName ) ) | (otherlv_1= '[' ( (lv_points_2_0= rulePoint ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ']' ) | ( () otherlv_7= 'UNNAMED_INTERVAL' ) | ( ( (lv_situationNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_intConsts_10_0= ruleIntConst ) ) ( (lv_units_11_0= ruleUnit ) ) ) | ( ( (lv_intConsts_12_0= ruleIntConst ) ) ( (lv_units_13_0= ruleUnit ) ) ( (lv_tempOps_14_0= ruleTempOp ) ) ( (lv_situationNames_15_0= ruleSitName ) ) ) )
            int alt37=5;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalSymboleoci.g:2573:3: ( (lv_situationName_0_0= ruleSitName ) )
                    {
                    // InternalSymboleoci.g:2573:3: ( (lv_situationName_0_0= ruleSitName ) )
                    // InternalSymboleoci.g:2574:4: (lv_situationName_0_0= ruleSitName )
                    {
                    // InternalSymboleoci.g:2574:4: (lv_situationName_0_0= ruleSitName )
                    // InternalSymboleoci.g:2575:5: lv_situationName_0_0= ruleSitName
                    {

                    					newCompositeNode(grammarAccess.getIntervalAccess().getSituationNameSitNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_situationName_0_0=ruleSitName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIntervalRule());
                    					}
                    					set(
                    						current,
                    						"situationName",
                    						lv_situationName_0_0,
                    						"symboleoci.Symboleoci.SitName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:2593:3: (otherlv_1= '[' ( (lv_points_2_0= rulePoint ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ']' )
                    {
                    // InternalSymboleoci.g:2593:3: (otherlv_1= '[' ( (lv_points_2_0= rulePoint ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ']' )
                    // InternalSymboleoci.g:2594:4: otherlv_1= '[' ( (lv_points_2_0= rulePoint ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalSymboleoci.g:2598:4: ( (lv_points_2_0= rulePoint ) )
                    // InternalSymboleoci.g:2599:5: (lv_points_2_0= rulePoint )
                    {
                    // InternalSymboleoci.g:2599:5: (lv_points_2_0= rulePoint )
                    // InternalSymboleoci.g:2600:6: lv_points_2_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getPointsPointParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_points_2_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						add(
                    							current,
                    							"points",
                    							lv_points_2_0,
                    							"symboleoci.Symboleoci.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntervalAccess().getCommaKeyword_1_2());
                    			
                    // InternalSymboleoci.g:2621:4: ( (lv_points_4_0= rulePoint ) )
                    // InternalSymboleoci.g:2622:5: (lv_points_4_0= rulePoint )
                    {
                    // InternalSymboleoci.g:2622:5: (lv_points_4_0= rulePoint )
                    // InternalSymboleoci.g:2623:6: lv_points_4_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getPointsPointParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_points_4_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						add(
                    							current,
                    							"points",
                    							lv_points_4_0,
                    							"symboleoci.Symboleoci.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,54,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:2646:3: ( () otherlv_7= 'UNNAMED_INTERVAL' )
                    {
                    // InternalSymboleoci.g:2646:3: ( () otherlv_7= 'UNNAMED_INTERVAL' )
                    // InternalSymboleoci.g:2647:4: () otherlv_7= 'UNNAMED_INTERVAL'
                    {
                    // InternalSymboleoci.g:2647:4: ()
                    // InternalSymboleoci.g:2648:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getIntervalAccess().getIntervalAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,55,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getIntervalAccess().getUNNAMED_INTERVALKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:2660:3: ( ( (lv_situationNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_intConsts_10_0= ruleIntConst ) ) ( (lv_units_11_0= ruleUnit ) ) )
                    {
                    // InternalSymboleoci.g:2660:3: ( ( (lv_situationNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_intConsts_10_0= ruleIntConst ) ) ( (lv_units_11_0= ruleUnit ) ) )
                    // InternalSymboleoci.g:2661:4: ( (lv_situationNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_intConsts_10_0= ruleIntConst ) ) ( (lv_units_11_0= ruleUnit ) )
                    {
                    // InternalSymboleoci.g:2661:4: ( (lv_situationNames_8_0= ruleSitName ) )
                    // InternalSymboleoci.g:2662:5: (lv_situationNames_8_0= ruleSitName )
                    {
                    // InternalSymboleoci.g:2662:5: (lv_situationNames_8_0= ruleSitName )
                    // InternalSymboleoci.g:2663:6: lv_situationNames_8_0= ruleSitName
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getSituationNamesSitNameParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_situationNames_8_0=ruleSitName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						add(
                    							current,
                    							"situationNames",
                    							lv_situationNames_8_0,
                    							"symboleoci.Symboleoci.SitName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:2680:4: ( (lv_tempOps_9_0= ruleTempOp ) )
                    // InternalSymboleoci.g:2681:5: (lv_tempOps_9_0= ruleTempOp )
                    {
                    // InternalSymboleoci.g:2681:5: (lv_tempOps_9_0= ruleTempOp )
                    // InternalSymboleoci.g:2682:6: lv_tempOps_9_0= ruleTempOp
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getTempOpsTempOpParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_tempOps_9_0=ruleTempOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						add(
                    							current,
                    							"tempOps",
                    							lv_tempOps_9_0,
                    							"symboleoci.Symboleoci.TempOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:2699:4: ( (lv_intConsts_10_0= ruleIntConst ) )
                    // InternalSymboleoci.g:2700:5: (lv_intConsts_10_0= ruleIntConst )
                    {
                    // InternalSymboleoci.g:2700:5: (lv_intConsts_10_0= ruleIntConst )
                    // InternalSymboleoci.g:2701:6: lv_intConsts_10_0= ruleIntConst
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getIntConstsIntConstParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_intConsts_10_0=ruleIntConst();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						add(
                    							current,
                    							"intConsts",
                    							lv_intConsts_10_0,
                    							"symboleoci.Symboleoci.IntConst");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:2718:4: ( (lv_units_11_0= ruleUnit ) )
                    // InternalSymboleoci.g:2719:5: (lv_units_11_0= ruleUnit )
                    {
                    // InternalSymboleoci.g:2719:5: (lv_units_11_0= ruleUnit )
                    // InternalSymboleoci.g:2720:6: lv_units_11_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getUnitsUnitParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_units_11_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						add(
                    							current,
                    							"units",
                    							lv_units_11_0,
                    							"symboleoci.Symboleoci.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:2739:3: ( ( (lv_intConsts_12_0= ruleIntConst ) ) ( (lv_units_13_0= ruleUnit ) ) ( (lv_tempOps_14_0= ruleTempOp ) ) ( (lv_situationNames_15_0= ruleSitName ) ) )
                    {
                    // InternalSymboleoci.g:2739:3: ( ( (lv_intConsts_12_0= ruleIntConst ) ) ( (lv_units_13_0= ruleUnit ) ) ( (lv_tempOps_14_0= ruleTempOp ) ) ( (lv_situationNames_15_0= ruleSitName ) ) )
                    // InternalSymboleoci.g:2740:4: ( (lv_intConsts_12_0= ruleIntConst ) ) ( (lv_units_13_0= ruleUnit ) ) ( (lv_tempOps_14_0= ruleTempOp ) ) ( (lv_situationNames_15_0= ruleSitName ) )
                    {
                    // InternalSymboleoci.g:2740:4: ( (lv_intConsts_12_0= ruleIntConst ) )
                    // InternalSymboleoci.g:2741:5: (lv_intConsts_12_0= ruleIntConst )
                    {
                    // InternalSymboleoci.g:2741:5: (lv_intConsts_12_0= ruleIntConst )
                    // InternalSymboleoci.g:2742:6: lv_intConsts_12_0= ruleIntConst
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getIntConstsIntConstParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_intConsts_12_0=ruleIntConst();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						add(
                    							current,
                    							"intConsts",
                    							lv_intConsts_12_0,
                    							"symboleoci.Symboleoci.IntConst");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:2759:4: ( (lv_units_13_0= ruleUnit ) )
                    // InternalSymboleoci.g:2760:5: (lv_units_13_0= ruleUnit )
                    {
                    // InternalSymboleoci.g:2760:5: (lv_units_13_0= ruleUnit )
                    // InternalSymboleoci.g:2761:6: lv_units_13_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getUnitsUnitParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_units_13_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						add(
                    							current,
                    							"units",
                    							lv_units_13_0,
                    							"symboleoci.Symboleoci.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:2778:4: ( (lv_tempOps_14_0= ruleTempOp ) )
                    // InternalSymboleoci.g:2779:5: (lv_tempOps_14_0= ruleTempOp )
                    {
                    // InternalSymboleoci.g:2779:5: (lv_tempOps_14_0= ruleTempOp )
                    // InternalSymboleoci.g:2780:6: lv_tempOps_14_0= ruleTempOp
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getTempOpsTempOpParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_tempOps_14_0=ruleTempOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						add(
                    							current,
                    							"tempOps",
                    							lv_tempOps_14_0,
                    							"symboleoci.Symboleoci.TempOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:2797:4: ( (lv_situationNames_15_0= ruleSitName ) )
                    // InternalSymboleoci.g:2798:5: (lv_situationNames_15_0= ruleSitName )
                    {
                    // InternalSymboleoci.g:2798:5: (lv_situationNames_15_0= ruleSitName )
                    // InternalSymboleoci.g:2799:6: lv_situationNames_15_0= ruleSitName
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getSituationNamesSitNameParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_situationNames_15_0=ruleSitName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						add(
                    							current,
                    							"situationNames",
                    							lv_situationNames_15_0,
                    							"symboleoci.Symboleoci.SitName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleSitName"
    // InternalSymboleoci.g:2821:1: entryRuleSitName returns [EObject current=null] : iv_ruleSitName= ruleSitName EOF ;
    public final EObject entryRuleSitName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitName = null;


        try {
            // InternalSymboleoci.g:2821:48: (iv_ruleSitName= ruleSitName EOF )
            // InternalSymboleoci.g:2822:2: iv_ruleSitName= ruleSitName EOF
            {
             newCompositeNode(grammarAccess.getSitNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSitName=ruleSitName();

            state._fsp--;

             current =iv_ruleSitName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSitName"


    // $ANTLR start "ruleSitName"
    // InternalSymboleoci.g:2828:1: ruleSitName returns [EObject current=null] : ( ( (lv_SitName_0_0= ruleName ) ) | ( (lv_oStates_1_0= ruleoState ) ) | ( (lv_pStates_2_0= rulepState ) ) | ( (lv_cStates_3_0= rulecState ) ) | ( (lv_oEvents_4_0= ruleoEvent ) ) | ( (lv_cEvents_5_0= rulecEvent ) ) | ( (lv_pEvents_6_0= rulepEvent ) ) ) ;
    public final EObject ruleSitName() throws RecognitionException {
        EObject current = null;

        EObject lv_SitName_0_0 = null;

        EObject lv_oStates_1_0 = null;

        EObject lv_pStates_2_0 = null;

        EObject lv_cStates_3_0 = null;

        EObject lv_oEvents_4_0 = null;

        EObject lv_cEvents_5_0 = null;

        EObject lv_pEvents_6_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:2834:2: ( ( ( (lv_SitName_0_0= ruleName ) ) | ( (lv_oStates_1_0= ruleoState ) ) | ( (lv_pStates_2_0= rulepState ) ) | ( (lv_cStates_3_0= rulecState ) ) | ( (lv_oEvents_4_0= ruleoEvent ) ) | ( (lv_cEvents_5_0= rulecEvent ) ) | ( (lv_pEvents_6_0= rulepEvent ) ) ) )
            // InternalSymboleoci.g:2835:2: ( ( (lv_SitName_0_0= ruleName ) ) | ( (lv_oStates_1_0= ruleoState ) ) | ( (lv_pStates_2_0= rulepState ) ) | ( (lv_cStates_3_0= rulecState ) ) | ( (lv_oEvents_4_0= ruleoEvent ) ) | ( (lv_cEvents_5_0= rulecEvent ) ) | ( (lv_pEvents_6_0= rulepEvent ) ) )
            {
            // InternalSymboleoci.g:2835:2: ( ( (lv_SitName_0_0= ruleName ) ) | ( (lv_oStates_1_0= ruleoState ) ) | ( (lv_pStates_2_0= rulepState ) ) | ( (lv_cStates_3_0= rulecState ) ) | ( (lv_oEvents_4_0= ruleoEvent ) ) | ( (lv_cEvents_5_0= rulecEvent ) ) | ( (lv_pEvents_6_0= rulepEvent ) ) )
            int alt38=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt38=1;
                }
                break;
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                {
                alt38=2;
                }
                break;
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
                {
                alt38=3;
                }
                break;
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
                {
                alt38=4;
                }
                break;
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
                {
                alt38=5;
                }
                break;
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
                {
                alt38=6;
                }
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt38=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalSymboleoci.g:2836:3: ( (lv_SitName_0_0= ruleName ) )
                    {
                    // InternalSymboleoci.g:2836:3: ( (lv_SitName_0_0= ruleName ) )
                    // InternalSymboleoci.g:2837:4: (lv_SitName_0_0= ruleName )
                    {
                    // InternalSymboleoci.g:2837:4: (lv_SitName_0_0= ruleName )
                    // InternalSymboleoci.g:2838:5: lv_SitName_0_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getSitNameAccess().getSitNameNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_SitName_0_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSitNameRule());
                    					}
                    					add(
                    						current,
                    						"SitName",
                    						lv_SitName_0_0,
                    						"symboleoci.Symboleoci.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:2856:3: ( (lv_oStates_1_0= ruleoState ) )
                    {
                    // InternalSymboleoci.g:2856:3: ( (lv_oStates_1_0= ruleoState ) )
                    // InternalSymboleoci.g:2857:4: (lv_oStates_1_0= ruleoState )
                    {
                    // InternalSymboleoci.g:2857:4: (lv_oStates_1_0= ruleoState )
                    // InternalSymboleoci.g:2858:5: lv_oStates_1_0= ruleoState
                    {

                    					newCompositeNode(grammarAccess.getSitNameAccess().getOStatesOStateParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_oStates_1_0=ruleoState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSitNameRule());
                    					}
                    					add(
                    						current,
                    						"oStates",
                    						lv_oStates_1_0,
                    						"symboleoci.Symboleoci.oState");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:2876:3: ( (lv_pStates_2_0= rulepState ) )
                    {
                    // InternalSymboleoci.g:2876:3: ( (lv_pStates_2_0= rulepState ) )
                    // InternalSymboleoci.g:2877:4: (lv_pStates_2_0= rulepState )
                    {
                    // InternalSymboleoci.g:2877:4: (lv_pStates_2_0= rulepState )
                    // InternalSymboleoci.g:2878:5: lv_pStates_2_0= rulepState
                    {

                    					newCompositeNode(grammarAccess.getSitNameAccess().getPStatesPStateParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pStates_2_0=rulepState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSitNameRule());
                    					}
                    					add(
                    						current,
                    						"pStates",
                    						lv_pStates_2_0,
                    						"symboleoci.Symboleoci.pState");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:2896:3: ( (lv_cStates_3_0= rulecState ) )
                    {
                    // InternalSymboleoci.g:2896:3: ( (lv_cStates_3_0= rulecState ) )
                    // InternalSymboleoci.g:2897:4: (lv_cStates_3_0= rulecState )
                    {
                    // InternalSymboleoci.g:2897:4: (lv_cStates_3_0= rulecState )
                    // InternalSymboleoci.g:2898:5: lv_cStates_3_0= rulecState
                    {

                    					newCompositeNode(grammarAccess.getSitNameAccess().getCStatesCStateParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cStates_3_0=rulecState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSitNameRule());
                    					}
                    					add(
                    						current,
                    						"cStates",
                    						lv_cStates_3_0,
                    						"symboleoci.Symboleoci.cState");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:2916:3: ( (lv_oEvents_4_0= ruleoEvent ) )
                    {
                    // InternalSymboleoci.g:2916:3: ( (lv_oEvents_4_0= ruleoEvent ) )
                    // InternalSymboleoci.g:2917:4: (lv_oEvents_4_0= ruleoEvent )
                    {
                    // InternalSymboleoci.g:2917:4: (lv_oEvents_4_0= ruleoEvent )
                    // InternalSymboleoci.g:2918:5: lv_oEvents_4_0= ruleoEvent
                    {

                    					newCompositeNode(grammarAccess.getSitNameAccess().getOEventsOEventParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_oEvents_4_0=ruleoEvent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSitNameRule());
                    					}
                    					add(
                    						current,
                    						"oEvents",
                    						lv_oEvents_4_0,
                    						"symboleoci.Symboleoci.oEvent");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSymboleoci.g:2936:3: ( (lv_cEvents_5_0= rulecEvent ) )
                    {
                    // InternalSymboleoci.g:2936:3: ( (lv_cEvents_5_0= rulecEvent ) )
                    // InternalSymboleoci.g:2937:4: (lv_cEvents_5_0= rulecEvent )
                    {
                    // InternalSymboleoci.g:2937:4: (lv_cEvents_5_0= rulecEvent )
                    // InternalSymboleoci.g:2938:5: lv_cEvents_5_0= rulecEvent
                    {

                    					newCompositeNode(grammarAccess.getSitNameAccess().getCEventsCEventParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cEvents_5_0=rulecEvent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSitNameRule());
                    					}
                    					add(
                    						current,
                    						"cEvents",
                    						lv_cEvents_5_0,
                    						"symboleoci.Symboleoci.cEvent");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalSymboleoci.g:2956:3: ( (lv_pEvents_6_0= rulepEvent ) )
                    {
                    // InternalSymboleoci.g:2956:3: ( (lv_pEvents_6_0= rulepEvent ) )
                    // InternalSymboleoci.g:2957:4: (lv_pEvents_6_0= rulepEvent )
                    {
                    // InternalSymboleoci.g:2957:4: (lv_pEvents_6_0= rulepEvent )
                    // InternalSymboleoci.g:2958:5: lv_pEvents_6_0= rulepEvent
                    {

                    					newCompositeNode(grammarAccess.getSitNameAccess().getPEventsPEventParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pEvents_6_0=rulepEvent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSitNameRule());
                    					}
                    					add(
                    						current,
                    						"pEvents",
                    						lv_pEvents_6_0,
                    						"symboleoci.Symboleoci.pEvent");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSitName"


    // $ANTLR start "entryRuleUnit"
    // InternalSymboleoci.g:2979:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // InternalSymboleoci.g:2979:44: (iv_ruleUnit= ruleUnit EOF )
            // InternalSymboleoci.g:2980:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalSymboleoci.g:2986:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'SECONDS' | kw= 'MINUTES' | kw= 'HOURS' | kw= 'DAYS' | kw= 'WEEKS' | kw= 'MONTHS' | kw= 'QUARTERS' | kw= 'YEARS' ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:2992:2: ( (kw= 'SECONDS' | kw= 'MINUTES' | kw= 'HOURS' | kw= 'DAYS' | kw= 'WEEKS' | kw= 'MONTHS' | kw= 'QUARTERS' | kw= 'YEARS' ) )
            // InternalSymboleoci.g:2993:2: (kw= 'SECONDS' | kw= 'MINUTES' | kw= 'HOURS' | kw= 'DAYS' | kw= 'WEEKS' | kw= 'MONTHS' | kw= 'QUARTERS' | kw= 'YEARS' )
            {
            // InternalSymboleoci.g:2993:2: (kw= 'SECONDS' | kw= 'MINUTES' | kw= 'HOURS' | kw= 'DAYS' | kw= 'WEEKS' | kw= 'MONTHS' | kw= 'QUARTERS' | kw= 'YEARS' )
            int alt39=8;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt39=1;
                }
                break;
            case 57:
                {
                alt39=2;
                }
                break;
            case 58:
                {
                alt39=3;
                }
                break;
            case 59:
                {
                alt39=4;
                }
                break;
            case 60:
                {
                alt39=5;
                }
                break;
            case 61:
                {
                alt39=6;
                }
                break;
            case 62:
                {
                alt39=7;
                }
                break;
            case 63:
                {
                alt39=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalSymboleoci.g:2994:3: kw= 'SECONDS'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getSECONDSKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:3000:3: kw= 'MINUTES'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMINUTESKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:3006:3: kw= 'HOURS'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getHOURSKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:3012:3: kw= 'DAYS'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getDAYSKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:3018:3: kw= 'WEEKS'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getWEEKSKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSymboleoci.g:3024:3: kw= 'MONTHS'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMONTHSKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSymboleoci.g:3030:3: kw= 'QUARTERS'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getQUARTERSKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSymboleoci.g:3036:3: kw= 'YEARS'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getYEARSKeyword_7());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleIntConst"
    // InternalSymboleoci.g:3045:1: entryRuleIntConst returns [EObject current=null] : iv_ruleIntConst= ruleIntConst EOF ;
    public final EObject entryRuleIntConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConst = null;


        try {
            // InternalSymboleoci.g:3045:49: (iv_ruleIntConst= ruleIntConst EOF )
            // InternalSymboleoci.g:3046:2: iv_ruleIntConst= ruleIntConst EOF
            {
             newCompositeNode(grammarAccess.getIntConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntConst=ruleIntConst();

            state._fsp--;

             current =iv_ruleIntConst; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntConst"


    // $ANTLR start "ruleIntConst"
    // InternalSymboleoci.g:3052:1: ruleIntConst returns [EObject current=null] : ( () ( (lv_Type_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntConst() throws RecognitionException {
        EObject current = null;

        Token lv_Type_1_0=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:3058:2: ( ( () ( (lv_Type_1_0= RULE_INT ) ) ) )
            // InternalSymboleoci.g:3059:2: ( () ( (lv_Type_1_0= RULE_INT ) ) )
            {
            // InternalSymboleoci.g:3059:2: ( () ( (lv_Type_1_0= RULE_INT ) ) )
            // InternalSymboleoci.g:3060:3: () ( (lv_Type_1_0= RULE_INT ) )
            {
            // InternalSymboleoci.g:3060:3: ()
            // InternalSymboleoci.g:3061:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntConstAccess().getIntConstAction_0(),
            					current);
            			

            }

            // InternalSymboleoci.g:3067:3: ( (lv_Type_1_0= RULE_INT ) )
            // InternalSymboleoci.g:3068:4: (lv_Type_1_0= RULE_INT )
            {
            // InternalSymboleoci.g:3068:4: (lv_Type_1_0= RULE_INT )
            // InternalSymboleoci.g:3069:5: lv_Type_1_0= RULE_INT
            {
            lv_Type_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_Type_1_0, grammarAccess.getIntConstAccess().getTypeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntConstRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Type",
            						lv_Type_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntConst"


    // $ANTLR start "entryRuleTempOp"
    // InternalSymboleoci.g:3089:1: entryRuleTempOp returns [String current=null] : iv_ruleTempOp= ruleTempOp EOF ;
    public final String entryRuleTempOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTempOp = null;


        try {
            // InternalSymboleoci.g:3089:46: (iv_ruleTempOp= ruleTempOp EOF )
            // InternalSymboleoci.g:3090:2: iv_ruleTempOp= ruleTempOp EOF
            {
             newCompositeNode(grammarAccess.getTempOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTempOp=ruleTempOp();

            state._fsp--;

             current =iv_ruleTempOp.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTempOp"


    // $ANTLR start "ruleTempOp"
    // InternalSymboleoci.g:3096:1: ruleTempOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BEFORE' | kw= 'AFTER' | kw= 'AT' | kw= 'WITHIN' | kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleTempOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:3102:2: ( (kw= 'BEFORE' | kw= 'AFTER' | kw= 'AT' | kw= 'WITHIN' | kw= '+' | kw= '-' ) )
            // InternalSymboleoci.g:3103:2: (kw= 'BEFORE' | kw= 'AFTER' | kw= 'AT' | kw= 'WITHIN' | kw= '+' | kw= '-' )
            {
            // InternalSymboleoci.g:3103:2: (kw= 'BEFORE' | kw= 'AFTER' | kw= 'AT' | kw= 'WITHIN' | kw= '+' | kw= '-' )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt40=1;
                }
                break;
            case 65:
                {
                alt40=2;
                }
                break;
            case 66:
                {
                alt40=3;
                }
                break;
            case 67:
                {
                alt40=4;
                }
                break;
            case 68:
                {
                alt40=5;
                }
                break;
            case 69:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSymboleoci.g:3104:3: kw= 'BEFORE'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTempOpAccess().getBEFOREKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:3110:3: kw= 'AFTER'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTempOpAccess().getAFTERKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:3116:3: kw= 'AT'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTempOpAccess().getATKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:3122:3: kw= 'WITHIN'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTempOpAccess().getWITHINKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:3128:3: kw= '+'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTempOpAccess().getPlusSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSymboleoci.g:3134:3: kw= '-'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTempOpAccess().getHyphenMinusKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTempOp"


    // $ANTLR start "entryRulePoint"
    // InternalSymboleoci.g:3143:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalSymboleoci.g:3143:46: (iv_rulePoint= rulePoint EOF )
            // InternalSymboleoci.g:3144:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalSymboleoci.g:3150:1: rulePoint returns [EObject current=null] : ( ( (lv_eventNames_0_0= ruleSitName ) ) | ( () otherlv_2= 'UNNAMED_POINT' ) | ( (lv_pointConsts_3_0= rulePointConst ) ) | ( ( (lv_pointConsts_4_0= rulePointConst ) ) ( (lv_units_5_0= ruleUnit ) ) ( (lv_tempOps_6_0= ruleTempOp ) ) ( (lv_eventNames_7_0= ruleSitName ) ) ) | ( ( (lv_eventNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_pointConsts_10_0= rulePointConst ) ) ( (lv_units_11_0= ruleUnit ) ) ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_eventNames_0_0 = null;

        EObject lv_pointConsts_3_0 = null;

        EObject lv_pointConsts_4_0 = null;

        AntlrDatatypeRuleToken lv_units_5_0 = null;

        AntlrDatatypeRuleToken lv_tempOps_6_0 = null;

        EObject lv_eventNames_7_0 = null;

        EObject lv_eventNames_8_0 = null;

        AntlrDatatypeRuleToken lv_tempOps_9_0 = null;

        EObject lv_pointConsts_10_0 = null;

        AntlrDatatypeRuleToken lv_units_11_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:3156:2: ( ( ( (lv_eventNames_0_0= ruleSitName ) ) | ( () otherlv_2= 'UNNAMED_POINT' ) | ( (lv_pointConsts_3_0= rulePointConst ) ) | ( ( (lv_pointConsts_4_0= rulePointConst ) ) ( (lv_units_5_0= ruleUnit ) ) ( (lv_tempOps_6_0= ruleTempOp ) ) ( (lv_eventNames_7_0= ruleSitName ) ) ) | ( ( (lv_eventNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_pointConsts_10_0= rulePointConst ) ) ( (lv_units_11_0= ruleUnit ) ) ) ) )
            // InternalSymboleoci.g:3157:2: ( ( (lv_eventNames_0_0= ruleSitName ) ) | ( () otherlv_2= 'UNNAMED_POINT' ) | ( (lv_pointConsts_3_0= rulePointConst ) ) | ( ( (lv_pointConsts_4_0= rulePointConst ) ) ( (lv_units_5_0= ruleUnit ) ) ( (lv_tempOps_6_0= ruleTempOp ) ) ( (lv_eventNames_7_0= ruleSitName ) ) ) | ( ( (lv_eventNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_pointConsts_10_0= rulePointConst ) ) ( (lv_units_11_0= ruleUnit ) ) ) )
            {
            // InternalSymboleoci.g:3157:2: ( ( (lv_eventNames_0_0= ruleSitName ) ) | ( () otherlv_2= 'UNNAMED_POINT' ) | ( (lv_pointConsts_3_0= rulePointConst ) ) | ( ( (lv_pointConsts_4_0= rulePointConst ) ) ( (lv_units_5_0= ruleUnit ) ) ( (lv_tempOps_6_0= ruleTempOp ) ) ( (lv_eventNames_7_0= ruleSitName ) ) ) | ( ( (lv_eventNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_pointConsts_10_0= rulePointConst ) ) ( (lv_units_11_0= ruleUnit ) ) ) )
            int alt41=5;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalSymboleoci.g:3158:3: ( (lv_eventNames_0_0= ruleSitName ) )
                    {
                    // InternalSymboleoci.g:3158:3: ( (lv_eventNames_0_0= ruleSitName ) )
                    // InternalSymboleoci.g:3159:4: (lv_eventNames_0_0= ruleSitName )
                    {
                    // InternalSymboleoci.g:3159:4: (lv_eventNames_0_0= ruleSitName )
                    // InternalSymboleoci.g:3160:5: lv_eventNames_0_0= ruleSitName
                    {

                    					newCompositeNode(grammarAccess.getPointAccess().getEventNamesSitNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_eventNames_0_0=ruleSitName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPointRule());
                    					}
                    					add(
                    						current,
                    						"eventNames",
                    						lv_eventNames_0_0,
                    						"symboleoci.Symboleoci.SitName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:3178:3: ( () otherlv_2= 'UNNAMED_POINT' )
                    {
                    // InternalSymboleoci.g:3178:3: ( () otherlv_2= 'UNNAMED_POINT' )
                    // InternalSymboleoci.g:3179:4: () otherlv_2= 'UNNAMED_POINT'
                    {
                    // InternalSymboleoci.g:3179:4: ()
                    // InternalSymboleoci.g:3180:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPointAccess().getPointAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,70,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPointAccess().getUNNAMED_POINTKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:3192:3: ( (lv_pointConsts_3_0= rulePointConst ) )
                    {
                    // InternalSymboleoci.g:3192:3: ( (lv_pointConsts_3_0= rulePointConst ) )
                    // InternalSymboleoci.g:3193:4: (lv_pointConsts_3_0= rulePointConst )
                    {
                    // InternalSymboleoci.g:3193:4: (lv_pointConsts_3_0= rulePointConst )
                    // InternalSymboleoci.g:3194:5: lv_pointConsts_3_0= rulePointConst
                    {

                    					newCompositeNode(grammarAccess.getPointAccess().getPointConstsPointConstParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pointConsts_3_0=rulePointConst();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPointRule());
                    					}
                    					add(
                    						current,
                    						"pointConsts",
                    						lv_pointConsts_3_0,
                    						"symboleoci.Symboleoci.PointConst");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:3212:3: ( ( (lv_pointConsts_4_0= rulePointConst ) ) ( (lv_units_5_0= ruleUnit ) ) ( (lv_tempOps_6_0= ruleTempOp ) ) ( (lv_eventNames_7_0= ruleSitName ) ) )
                    {
                    // InternalSymboleoci.g:3212:3: ( ( (lv_pointConsts_4_0= rulePointConst ) ) ( (lv_units_5_0= ruleUnit ) ) ( (lv_tempOps_6_0= ruleTempOp ) ) ( (lv_eventNames_7_0= ruleSitName ) ) )
                    // InternalSymboleoci.g:3213:4: ( (lv_pointConsts_4_0= rulePointConst ) ) ( (lv_units_5_0= ruleUnit ) ) ( (lv_tempOps_6_0= ruleTempOp ) ) ( (lv_eventNames_7_0= ruleSitName ) )
                    {
                    // InternalSymboleoci.g:3213:4: ( (lv_pointConsts_4_0= rulePointConst ) )
                    // InternalSymboleoci.g:3214:5: (lv_pointConsts_4_0= rulePointConst )
                    {
                    // InternalSymboleoci.g:3214:5: (lv_pointConsts_4_0= rulePointConst )
                    // InternalSymboleoci.g:3215:6: lv_pointConsts_4_0= rulePointConst
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getPointConstsPointConstParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_pointConsts_4_0=rulePointConst();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						add(
                    							current,
                    							"pointConsts",
                    							lv_pointConsts_4_0,
                    							"symboleoci.Symboleoci.PointConst");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:3232:4: ( (lv_units_5_0= ruleUnit ) )
                    // InternalSymboleoci.g:3233:5: (lv_units_5_0= ruleUnit )
                    {
                    // InternalSymboleoci.g:3233:5: (lv_units_5_0= ruleUnit )
                    // InternalSymboleoci.g:3234:6: lv_units_5_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getUnitsUnitParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_units_5_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						add(
                    							current,
                    							"units",
                    							lv_units_5_0,
                    							"symboleoci.Symboleoci.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:3251:4: ( (lv_tempOps_6_0= ruleTempOp ) )
                    // InternalSymboleoci.g:3252:5: (lv_tempOps_6_0= ruleTempOp )
                    {
                    // InternalSymboleoci.g:3252:5: (lv_tempOps_6_0= ruleTempOp )
                    // InternalSymboleoci.g:3253:6: lv_tempOps_6_0= ruleTempOp
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getTempOpsTempOpParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_tempOps_6_0=ruleTempOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						add(
                    							current,
                    							"tempOps",
                    							lv_tempOps_6_0,
                    							"symboleoci.Symboleoci.TempOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:3270:4: ( (lv_eventNames_7_0= ruleSitName ) )
                    // InternalSymboleoci.g:3271:5: (lv_eventNames_7_0= ruleSitName )
                    {
                    // InternalSymboleoci.g:3271:5: (lv_eventNames_7_0= ruleSitName )
                    // InternalSymboleoci.g:3272:6: lv_eventNames_7_0= ruleSitName
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getEventNamesSitNameParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_eventNames_7_0=ruleSitName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						add(
                    							current,
                    							"eventNames",
                    							lv_eventNames_7_0,
                    							"symboleoci.Symboleoci.SitName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:3291:3: ( ( (lv_eventNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_pointConsts_10_0= rulePointConst ) ) ( (lv_units_11_0= ruleUnit ) ) )
                    {
                    // InternalSymboleoci.g:3291:3: ( ( (lv_eventNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_pointConsts_10_0= rulePointConst ) ) ( (lv_units_11_0= ruleUnit ) ) )
                    // InternalSymboleoci.g:3292:4: ( (lv_eventNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_pointConsts_10_0= rulePointConst ) ) ( (lv_units_11_0= ruleUnit ) )
                    {
                    // InternalSymboleoci.g:3292:4: ( (lv_eventNames_8_0= ruleSitName ) )
                    // InternalSymboleoci.g:3293:5: (lv_eventNames_8_0= ruleSitName )
                    {
                    // InternalSymboleoci.g:3293:5: (lv_eventNames_8_0= ruleSitName )
                    // InternalSymboleoci.g:3294:6: lv_eventNames_8_0= ruleSitName
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getEventNamesSitNameParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_eventNames_8_0=ruleSitName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						add(
                    							current,
                    							"eventNames",
                    							lv_eventNames_8_0,
                    							"symboleoci.Symboleoci.SitName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:3311:4: ( (lv_tempOps_9_0= ruleTempOp ) )
                    // InternalSymboleoci.g:3312:5: (lv_tempOps_9_0= ruleTempOp )
                    {
                    // InternalSymboleoci.g:3312:5: (lv_tempOps_9_0= ruleTempOp )
                    // InternalSymboleoci.g:3313:6: lv_tempOps_9_0= ruleTempOp
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getTempOpsTempOpParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_tempOps_9_0=ruleTempOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						add(
                    							current,
                    							"tempOps",
                    							lv_tempOps_9_0,
                    							"symboleoci.Symboleoci.TempOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:3330:4: ( (lv_pointConsts_10_0= rulePointConst ) )
                    // InternalSymboleoci.g:3331:5: (lv_pointConsts_10_0= rulePointConst )
                    {
                    // InternalSymboleoci.g:3331:5: (lv_pointConsts_10_0= rulePointConst )
                    // InternalSymboleoci.g:3332:6: lv_pointConsts_10_0= rulePointConst
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getPointConstsPointConstParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_pointConsts_10_0=rulePointConst();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						add(
                    							current,
                    							"pointConsts",
                    							lv_pointConsts_10_0,
                    							"symboleoci.Symboleoci.PointConst");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSymboleoci.g:3349:4: ( (lv_units_11_0= ruleUnit ) )
                    // InternalSymboleoci.g:3350:5: (lv_units_11_0= ruleUnit )
                    {
                    // InternalSymboleoci.g:3350:5: (lv_units_11_0= ruleUnit )
                    // InternalSymboleoci.g:3351:6: lv_units_11_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getUnitsUnitParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_units_11_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						add(
                    							current,
                    							"units",
                    							lv_units_11_0,
                    							"symboleoci.Symboleoci.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleName"
    // InternalSymboleoci.g:3373:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalSymboleoci.g:3373:45: (iv_ruleName= ruleName EOF )
            // InternalSymboleoci.g:3374:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalSymboleoci.g:3380:1: ruleName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:3386:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSymboleoci.g:3387:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSymboleoci.g:3387:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSymboleoci.g:3388:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSymboleoci.g:3388:3: (lv_name_0_0= RULE_ID )
            // InternalSymboleoci.g:3389:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRulepEvent"
    // InternalSymboleoci.g:3408:1: entryRulepEvent returns [EObject current=null] : iv_rulepEvent= rulepEvent EOF ;
    public final EObject entryRulepEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepEvent = null;


        try {
            // InternalSymboleoci.g:3408:47: (iv_rulepEvent= rulepEvent EOF )
            // InternalSymboleoci.g:3409:2: iv_rulepEvent= rulepEvent EOF
            {
             newCompositeNode(grammarAccess.getPEventRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepEvent=rulepEvent();

            state._fsp--;

             current =iv_rulepEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulepEvent"


    // $ANTLR start "rulepEvent"
    // InternalSymboleoci.g:3415:1: rulepEvent returns [EObject current=null] : ( ( (lv_powEvent_0_0= rulePowEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject rulepEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_powEvent_0_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:3421:2: ( ( ( (lv_powEvent_0_0= rulePowEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSymboleoci.g:3422:2: ( ( (lv_powEvent_0_0= rulePowEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSymboleoci.g:3422:2: ( ( (lv_powEvent_0_0= rulePowEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalSymboleoci.g:3423:3: ( (lv_powEvent_0_0= rulePowEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalSymboleoci.g:3423:3: ( (lv_powEvent_0_0= rulePowEvent ) )
            // InternalSymboleoci.g:3424:4: (lv_powEvent_0_0= rulePowEvent )
            {
            // InternalSymboleoci.g:3424:4: (lv_powEvent_0_0= rulePowEvent )
            // InternalSymboleoci.g:3425:5: lv_powEvent_0_0= rulePowEvent
            {

            					newCompositeNode(grammarAccess.getPEventAccess().getPowEventPowEventParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_powEvent_0_0=rulePowEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPEventRule());
            					}
            					set(
            						current,
            						"powEvent",
            						lv_powEvent_0_0,
            						"symboleoci.Symboleoci.PowEvent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPEventAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSymboleoci.g:3446:3: ( (otherlv_2= RULE_ID ) )
            // InternalSymboleoci.g:3447:4: (otherlv_2= RULE_ID )
            {
            // InternalSymboleoci.g:3447:4: (otherlv_2= RULE_ID )
            // InternalSymboleoci.g:3448:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPEventRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getPEventAccess().getPowNamePowCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPEventAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepEvent"


    // $ANTLR start "entryRulePowEvent"
    // InternalSymboleoci.g:3467:1: entryRulePowEvent returns [String current=null] : iv_rulePowEvent= rulePowEvent EOF ;
    public final String entryRulePowEvent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePowEvent = null;


        try {
            // InternalSymboleoci.g:3467:48: (iv_rulePowEvent= rulePowEvent EOF )
            // InternalSymboleoci.g:3468:2: iv_rulePowEvent= rulePowEvent EOF
            {
             newCompositeNode(grammarAccess.getPowEventRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePowEvent=rulePowEvent();

            state._fsp--;

             current =iv_rulePowEvent.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePowEvent"


    // $ANTLR start "rulePowEvent"
    // InternalSymboleoci.g:3474:1: rulePowEvent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pTRIGGERED' | kw= 'pACTIVATED' | kw= 'pSUSPENDED' | kw= 'pRESUMED' | kw= 'pEXERTED' | kw= 'pEXPIRED' | kw= 'pTERMINATED' ) ;
    public final AntlrDatatypeRuleToken rulePowEvent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:3480:2: ( (kw= 'pTRIGGERED' | kw= 'pACTIVATED' | kw= 'pSUSPENDED' | kw= 'pRESUMED' | kw= 'pEXERTED' | kw= 'pEXPIRED' | kw= 'pTERMINATED' ) )
            // InternalSymboleoci.g:3481:2: (kw= 'pTRIGGERED' | kw= 'pACTIVATED' | kw= 'pSUSPENDED' | kw= 'pRESUMED' | kw= 'pEXERTED' | kw= 'pEXPIRED' | kw= 'pTERMINATED' )
            {
            // InternalSymboleoci.g:3481:2: (kw= 'pTRIGGERED' | kw= 'pACTIVATED' | kw= 'pSUSPENDED' | kw= 'pRESUMED' | kw= 'pEXERTED' | kw= 'pEXPIRED' | kw= 'pTERMINATED' )
            int alt42=7;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt42=1;
                }
                break;
            case 72:
                {
                alt42=2;
                }
                break;
            case 73:
                {
                alt42=3;
                }
                break;
            case 74:
                {
                alt42=4;
                }
                break;
            case 75:
                {
                alt42=5;
                }
                break;
            case 76:
                {
                alt42=6;
                }
                break;
            case 77:
                {
                alt42=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalSymboleoci.g:3482:3: kw= 'pTRIGGERED'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowEventAccess().getPTRIGGEREDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:3488:3: kw= 'pACTIVATED'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowEventAccess().getPACTIVATEDKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:3494:3: kw= 'pSUSPENDED'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowEventAccess().getPSUSPENDEDKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:3500:3: kw= 'pRESUMED'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowEventAccess().getPRESUMEDKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:3506:3: kw= 'pEXERTED'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowEventAccess().getPEXERTEDKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSymboleoci.g:3512:3: kw= 'pEXPIRED'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowEventAccess().getPEXPIREDKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSymboleoci.g:3518:3: kw= 'pTERMINATED'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowEventAccess().getPTERMINATEDKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePowEvent"


    // $ANTLR start "entryRulecEvent"
    // InternalSymboleoci.g:3527:1: entryRulecEvent returns [EObject current=null] : iv_rulecEvent= rulecEvent EOF ;
    public final EObject entryRulecEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecEvent = null;


        try {
            // InternalSymboleoci.g:3527:47: (iv_rulecEvent= rulecEvent EOF )
            // InternalSymboleoci.g:3528:2: iv_rulecEvent= rulecEvent EOF
            {
             newCompositeNode(grammarAccess.getCEventRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecEvent=rulecEvent();

            state._fsp--;

             current =iv_rulecEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecEvent"


    // $ANTLR start "rulecEvent"
    // InternalSymboleoci.g:3534:1: rulecEvent returns [EObject current=null] : ( ( (lv_contrEvent_0_0= ruleContrEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject rulecEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_contrEvent_0_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:3540:2: ( ( ( (lv_contrEvent_0_0= ruleContrEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSymboleoci.g:3541:2: ( ( (lv_contrEvent_0_0= ruleContrEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSymboleoci.g:3541:2: ( ( (lv_contrEvent_0_0= ruleContrEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalSymboleoci.g:3542:3: ( (lv_contrEvent_0_0= ruleContrEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalSymboleoci.g:3542:3: ( (lv_contrEvent_0_0= ruleContrEvent ) )
            // InternalSymboleoci.g:3543:4: (lv_contrEvent_0_0= ruleContrEvent )
            {
            // InternalSymboleoci.g:3543:4: (lv_contrEvent_0_0= ruleContrEvent )
            // InternalSymboleoci.g:3544:5: lv_contrEvent_0_0= ruleContrEvent
            {

            					newCompositeNode(grammarAccess.getCEventAccess().getContrEventContrEventParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_contrEvent_0_0=ruleContrEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCEventRule());
            					}
            					set(
            						current,
            						"contrEvent",
            						lv_contrEvent_0_0,
            						"symboleoci.Symboleoci.ContrEvent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCEventAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSymboleoci.g:3565:3: ( (otherlv_2= RULE_ID ) )
            // InternalSymboleoci.g:3566:4: (otherlv_2= RULE_ID )
            {
            // InternalSymboleoci.g:3566:4: (otherlv_2= RULE_ID )
            // InternalSymboleoci.g:3567:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCEventRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getCEventAccess().getContrNameContractCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCEventAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecEvent"


    // $ANTLR start "entryRuleContrEvent"
    // InternalSymboleoci.g:3586:1: entryRuleContrEvent returns [String current=null] : iv_ruleContrEvent= ruleContrEvent EOF ;
    public final String entryRuleContrEvent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContrEvent = null;


        try {
            // InternalSymboleoci.g:3586:50: (iv_ruleContrEvent= ruleContrEvent EOF )
            // InternalSymboleoci.g:3587:2: iv_ruleContrEvent= ruleContrEvent EOF
            {
             newCompositeNode(grammarAccess.getContrEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContrEvent=ruleContrEvent();

            state._fsp--;

             current =iv_ruleContrEvent.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContrEvent"


    // $ANTLR start "ruleContrEvent"
    // InternalSymboleoci.g:3593:1: ruleContrEvent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cACTIVATED' | kw= 'cSUSPENDED' | kw= 'cRESUMED' | kw= 'cFULFILLED_ACTIVE_OBLS' | kw= 'cREVOKED_PARTY' | kw= 'cASSIGNED_PARTY' | kw= 'cTERMINATED' ) ;
    public final AntlrDatatypeRuleToken ruleContrEvent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:3599:2: ( (kw= 'cACTIVATED' | kw= 'cSUSPENDED' | kw= 'cRESUMED' | kw= 'cFULFILLED_ACTIVE_OBLS' | kw= 'cREVOKED_PARTY' | kw= 'cASSIGNED_PARTY' | kw= 'cTERMINATED' ) )
            // InternalSymboleoci.g:3600:2: (kw= 'cACTIVATED' | kw= 'cSUSPENDED' | kw= 'cRESUMED' | kw= 'cFULFILLED_ACTIVE_OBLS' | kw= 'cREVOKED_PARTY' | kw= 'cASSIGNED_PARTY' | kw= 'cTERMINATED' )
            {
            // InternalSymboleoci.g:3600:2: (kw= 'cACTIVATED' | kw= 'cSUSPENDED' | kw= 'cRESUMED' | kw= 'cFULFILLED_ACTIVE_OBLS' | kw= 'cREVOKED_PARTY' | kw= 'cASSIGNED_PARTY' | kw= 'cTERMINATED' )
            int alt43=7;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt43=1;
                }
                break;
            case 79:
                {
                alt43=2;
                }
                break;
            case 80:
                {
                alt43=3;
                }
                break;
            case 81:
                {
                alt43=4;
                }
                break;
            case 82:
                {
                alt43=5;
                }
                break;
            case 83:
                {
                alt43=6;
                }
                break;
            case 84:
                {
                alt43=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalSymboleoci.g:3601:3: kw= 'cACTIVATED'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrEventAccess().getCACTIVATEDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:3607:3: kw= 'cSUSPENDED'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrEventAccess().getCSUSPENDEDKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:3613:3: kw= 'cRESUMED'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrEventAccess().getCRESUMEDKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:3619:3: kw= 'cFULFILLED_ACTIVE_OBLS'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrEventAccess().getCFULFILLED_ACTIVE_OBLSKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:3625:3: kw= 'cREVOKED_PARTY'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrEventAccess().getCREVOKED_PARTYKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSymboleoci.g:3631:3: kw= 'cASSIGNED_PARTY'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrEventAccess().getCASSIGNED_PARTYKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSymboleoci.g:3637:3: kw= 'cTERMINATED'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrEventAccess().getCTERMINATEDKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContrEvent"


    // $ANTLR start "entryRuleoEvent"
    // InternalSymboleoci.g:3646:1: entryRuleoEvent returns [EObject current=null] : iv_ruleoEvent= ruleoEvent EOF ;
    public final EObject entryRuleoEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoEvent = null;


        try {
            // InternalSymboleoci.g:3646:47: (iv_ruleoEvent= ruleoEvent EOF )
            // InternalSymboleoci.g:3647:2: iv_ruleoEvent= ruleoEvent EOF
            {
             newCompositeNode(grammarAccess.getOEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoEvent=ruleoEvent();

            state._fsp--;

             current =iv_ruleoEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleoEvent"


    // $ANTLR start "ruleoEvent"
    // InternalSymboleoci.g:3653:1: ruleoEvent returns [EObject current=null] : ( ( (lv_oblEvent_0_0= ruleOblEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleoEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_oblEvent_0_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:3659:2: ( ( ( (lv_oblEvent_0_0= ruleOblEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSymboleoci.g:3660:2: ( ( (lv_oblEvent_0_0= ruleOblEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSymboleoci.g:3660:2: ( ( (lv_oblEvent_0_0= ruleOblEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalSymboleoci.g:3661:3: ( (lv_oblEvent_0_0= ruleOblEvent ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalSymboleoci.g:3661:3: ( (lv_oblEvent_0_0= ruleOblEvent ) )
            // InternalSymboleoci.g:3662:4: (lv_oblEvent_0_0= ruleOblEvent )
            {
            // InternalSymboleoci.g:3662:4: (lv_oblEvent_0_0= ruleOblEvent )
            // InternalSymboleoci.g:3663:5: lv_oblEvent_0_0= ruleOblEvent
            {

            					newCompositeNode(grammarAccess.getOEventAccess().getOblEventOblEventParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_oblEvent_0_0=ruleOblEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOEventRule());
            					}
            					set(
            						current,
            						"oblEvent",
            						lv_oblEvent_0_0,
            						"symboleoci.Symboleoci.OblEvent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOEventAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSymboleoci.g:3684:3: ( (otherlv_2= RULE_ID ) )
            // InternalSymboleoci.g:3685:4: (otherlv_2= RULE_ID )
            {
            // InternalSymboleoci.g:3685:4: (otherlv_2= RULE_ID )
            // InternalSymboleoci.g:3686:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOEventRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getOEventAccess().getOblNameOblCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOEventAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoEvent"


    // $ANTLR start "entryRuleOblEvent"
    // InternalSymboleoci.g:3705:1: entryRuleOblEvent returns [String current=null] : iv_ruleOblEvent= ruleOblEvent EOF ;
    public final String entryRuleOblEvent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOblEvent = null;


        try {
            // InternalSymboleoci.g:3705:48: (iv_ruleOblEvent= ruleOblEvent EOF )
            // InternalSymboleoci.g:3706:2: iv_ruleOblEvent= ruleOblEvent EOF
            {
             newCompositeNode(grammarAccess.getOblEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOblEvent=ruleOblEvent();

            state._fsp--;

             current =iv_ruleOblEvent.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOblEvent"


    // $ANTLR start "ruleOblEvent"
    // InternalSymboleoci.g:3712:1: ruleOblEvent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'oTRIGGERED' | kw= 'oACTIVATED' | kw= 'oSUSPENDED' | kw= 'oRESUMED' | kw= 'oDISCHARGED' | kw= 'oEXPIRED' | kw= 'oFULFILLED' | kw= 'oVIOLATED' | kw= 'oTERMINATED' ) ;
    public final AntlrDatatypeRuleToken ruleOblEvent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:3718:2: ( (kw= 'oTRIGGERED' | kw= 'oACTIVATED' | kw= 'oSUSPENDED' | kw= 'oRESUMED' | kw= 'oDISCHARGED' | kw= 'oEXPIRED' | kw= 'oFULFILLED' | kw= 'oVIOLATED' | kw= 'oTERMINATED' ) )
            // InternalSymboleoci.g:3719:2: (kw= 'oTRIGGERED' | kw= 'oACTIVATED' | kw= 'oSUSPENDED' | kw= 'oRESUMED' | kw= 'oDISCHARGED' | kw= 'oEXPIRED' | kw= 'oFULFILLED' | kw= 'oVIOLATED' | kw= 'oTERMINATED' )
            {
            // InternalSymboleoci.g:3719:2: (kw= 'oTRIGGERED' | kw= 'oACTIVATED' | kw= 'oSUSPENDED' | kw= 'oRESUMED' | kw= 'oDISCHARGED' | kw= 'oEXPIRED' | kw= 'oFULFILLED' | kw= 'oVIOLATED' | kw= 'oTERMINATED' )
            int alt44=9;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt44=1;
                }
                break;
            case 86:
                {
                alt44=2;
                }
                break;
            case 87:
                {
                alt44=3;
                }
                break;
            case 88:
                {
                alt44=4;
                }
                break;
            case 89:
                {
                alt44=5;
                }
                break;
            case 90:
                {
                alt44=6;
                }
                break;
            case 91:
                {
                alt44=7;
                }
                break;
            case 92:
                {
                alt44=8;
                }
                break;
            case 93:
                {
                alt44=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalSymboleoci.g:3720:3: kw= 'oTRIGGERED'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblEventAccess().getOTRIGGEREDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:3726:3: kw= 'oACTIVATED'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblEventAccess().getOACTIVATEDKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:3732:3: kw= 'oSUSPENDED'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblEventAccess().getOSUSPENDEDKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:3738:3: kw= 'oRESUMED'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblEventAccess().getORESUMEDKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:3744:3: kw= 'oDISCHARGED'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblEventAccess().getODISCHARGEDKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSymboleoci.g:3750:3: kw= 'oEXPIRED'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblEventAccess().getOEXPIREDKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSymboleoci.g:3756:3: kw= 'oFULFILLED'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblEventAccess().getOFULFILLEDKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSymboleoci.g:3762:3: kw= 'oVIOLATED'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblEventAccess().getOVIOLATEDKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSymboleoci.g:3768:3: kw= 'oTERMINATED'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblEventAccess().getOTERMINATEDKeyword_8());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOblEvent"


    // $ANTLR start "entryRulePointConst"
    // InternalSymboleoci.g:3777:1: entryRulePointConst returns [EObject current=null] : iv_rulePointConst= rulePointConst EOF ;
    public final EObject entryRulePointConst() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointConst = null;


        try {
            // InternalSymboleoci.g:3777:51: (iv_rulePointConst= rulePointConst EOF )
            // InternalSymboleoci.g:3778:2: iv_rulePointConst= rulePointConst EOF
            {
             newCompositeNode(grammarAccess.getPointConstRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointConst=rulePointConst();

            state._fsp--;

             current =iv_rulePointConst; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePointConst"


    // $ANTLR start "rulePointConst"
    // InternalSymboleoci.g:3784:1: rulePointConst returns [EObject current=null] : ( () ( (lv_Type_1_0= RULE_INT ) ) ) ;
    public final EObject rulePointConst() throws RecognitionException {
        EObject current = null;

        Token lv_Type_1_0=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:3790:2: ( ( () ( (lv_Type_1_0= RULE_INT ) ) ) )
            // InternalSymboleoci.g:3791:2: ( () ( (lv_Type_1_0= RULE_INT ) ) )
            {
            // InternalSymboleoci.g:3791:2: ( () ( (lv_Type_1_0= RULE_INT ) ) )
            // InternalSymboleoci.g:3792:3: () ( (lv_Type_1_0= RULE_INT ) )
            {
            // InternalSymboleoci.g:3792:3: ()
            // InternalSymboleoci.g:3793:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointConstAccess().getPointConstAction_0(),
            					current);
            			

            }

            // InternalSymboleoci.g:3799:3: ( (lv_Type_1_0= RULE_INT ) )
            // InternalSymboleoci.g:3800:4: (lv_Type_1_0= RULE_INT )
            {
            // InternalSymboleoci.g:3800:4: (lv_Type_1_0= RULE_INT )
            // InternalSymboleoci.g:3801:5: lv_Type_1_0= RULE_INT
            {
            lv_Type_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_Type_1_0, grammarAccess.getPointConstAccess().getTypeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointConstRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Type",
            						lv_Type_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePointConst"


    // $ANTLR start "entryRuleoState"
    // InternalSymboleoci.g:3821:1: entryRuleoState returns [EObject current=null] : iv_ruleoState= ruleoState EOF ;
    public final EObject entryRuleoState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoState = null;


        try {
            // InternalSymboleoci.g:3821:47: (iv_ruleoState= ruleoState EOF )
            // InternalSymboleoci.g:3822:2: iv_ruleoState= ruleoState EOF
            {
             newCompositeNode(grammarAccess.getOStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoState=ruleoState();

            state._fsp--;

             current =iv_ruleoState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleoState"


    // $ANTLR start "ruleoState"
    // InternalSymboleoci.g:3828:1: ruleoState returns [EObject current=null] : ( ( (lv_oblState_0_0= ruleOblState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleoState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_oblState_0_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:3834:2: ( ( ( (lv_oblState_0_0= ruleOblState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSymboleoci.g:3835:2: ( ( (lv_oblState_0_0= ruleOblState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSymboleoci.g:3835:2: ( ( (lv_oblState_0_0= ruleOblState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalSymboleoci.g:3836:3: ( (lv_oblState_0_0= ruleOblState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalSymboleoci.g:3836:3: ( (lv_oblState_0_0= ruleOblState ) )
            // InternalSymboleoci.g:3837:4: (lv_oblState_0_0= ruleOblState )
            {
            // InternalSymboleoci.g:3837:4: (lv_oblState_0_0= ruleOblState )
            // InternalSymboleoci.g:3838:5: lv_oblState_0_0= ruleOblState
            {

            					newCompositeNode(grammarAccess.getOStateAccess().getOblStateOblStateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_oblState_0_0=ruleOblState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOStateRule());
            					}
            					set(
            						current,
            						"oblState",
            						lv_oblState_0_0,
            						"symboleoci.Symboleoci.OblState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOStateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSymboleoci.g:3859:3: ( (otherlv_2= RULE_ID ) )
            // InternalSymboleoci.g:3860:4: (otherlv_2= RULE_ID )
            {
            // InternalSymboleoci.g:3860:4: (otherlv_2= RULE_ID )
            // InternalSymboleoci.g:3861:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getOStateAccess().getOblNameOblCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOStateAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoState"


    // $ANTLR start "entryRuleOblState"
    // InternalSymboleoci.g:3880:1: entryRuleOblState returns [String current=null] : iv_ruleOblState= ruleOblState EOF ;
    public final String entryRuleOblState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOblState = null;


        try {
            // InternalSymboleoci.g:3880:48: (iv_ruleOblState= ruleOblState EOF )
            // InternalSymboleoci.g:3881:2: iv_ruleOblState= ruleOblState EOF
            {
             newCompositeNode(grammarAccess.getOblStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOblState=ruleOblState();

            state._fsp--;

             current =iv_ruleOblState.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOblState"


    // $ANTLR start "ruleOblState"
    // InternalSymboleoci.g:3887:1: ruleOblState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'oCREATE' | kw= 'oINEFFECT' | kw= 'oSUSPENSION' | kw= 'oSUCCESSFUL_TERMINATION' | kw= 'oUNSUCCESSFUL_TERMINATION' | kw= 'oVIOLATION' | kw= 'oFULFILLMENT' | kw= 'oDISCHARGE' ) ;
    public final AntlrDatatypeRuleToken ruleOblState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:3893:2: ( (kw= 'oCREATE' | kw= 'oINEFFECT' | kw= 'oSUSPENSION' | kw= 'oSUCCESSFUL_TERMINATION' | kw= 'oUNSUCCESSFUL_TERMINATION' | kw= 'oVIOLATION' | kw= 'oFULFILLMENT' | kw= 'oDISCHARGE' ) )
            // InternalSymboleoci.g:3894:2: (kw= 'oCREATE' | kw= 'oINEFFECT' | kw= 'oSUSPENSION' | kw= 'oSUCCESSFUL_TERMINATION' | kw= 'oUNSUCCESSFUL_TERMINATION' | kw= 'oVIOLATION' | kw= 'oFULFILLMENT' | kw= 'oDISCHARGE' )
            {
            // InternalSymboleoci.g:3894:2: (kw= 'oCREATE' | kw= 'oINEFFECT' | kw= 'oSUSPENSION' | kw= 'oSUCCESSFUL_TERMINATION' | kw= 'oUNSUCCESSFUL_TERMINATION' | kw= 'oVIOLATION' | kw= 'oFULFILLMENT' | kw= 'oDISCHARGE' )
            int alt45=8;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt45=1;
                }
                break;
            case 95:
                {
                alt45=2;
                }
                break;
            case 96:
                {
                alt45=3;
                }
                break;
            case 97:
                {
                alt45=4;
                }
                break;
            case 98:
                {
                alt45=5;
                }
                break;
            case 99:
                {
                alt45=6;
                }
                break;
            case 100:
                {
                alt45=7;
                }
                break;
            case 101:
                {
                alt45=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalSymboleoci.g:3895:3: kw= 'oCREATE'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblStateAccess().getOCREATEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:3901:3: kw= 'oINEFFECT'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblStateAccess().getOINEFFECTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:3907:3: kw= 'oSUSPENSION'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblStateAccess().getOSUSPENSIONKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:3913:3: kw= 'oSUCCESSFUL_TERMINATION'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblStateAccess().getOSUCCESSFUL_TERMINATIONKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:3919:3: kw= 'oUNSUCCESSFUL_TERMINATION'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblStateAccess().getOUNSUCCESSFUL_TERMINATIONKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSymboleoci.g:3925:3: kw= 'oVIOLATION'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblStateAccess().getOVIOLATIONKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSymboleoci.g:3931:3: kw= 'oFULFILLMENT'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblStateAccess().getOFULFILLMENTKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSymboleoci.g:3937:3: kw= 'oDISCHARGE'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOblStateAccess().getODISCHARGEKeyword_7());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOblState"


    // $ANTLR start "entryRulecState"
    // InternalSymboleoci.g:3946:1: entryRulecState returns [EObject current=null] : iv_rulecState= rulecState EOF ;
    public final EObject entryRulecState() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecState = null;


        try {
            // InternalSymboleoci.g:3946:47: (iv_rulecState= rulecState EOF )
            // InternalSymboleoci.g:3947:2: iv_rulecState= rulecState EOF
            {
             newCompositeNode(grammarAccess.getCStateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecState=rulecState();

            state._fsp--;

             current =iv_rulecState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecState"


    // $ANTLR start "rulecState"
    // InternalSymboleoci.g:3953:1: rulecState returns [EObject current=null] : ( ( (lv_contrState_0_0= ruleContrState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject rulecState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_contrState_0_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:3959:2: ( ( ( (lv_contrState_0_0= ruleContrState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSymboleoci.g:3960:2: ( ( (lv_contrState_0_0= ruleContrState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSymboleoci.g:3960:2: ( ( (lv_contrState_0_0= ruleContrState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalSymboleoci.g:3961:3: ( (lv_contrState_0_0= ruleContrState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalSymboleoci.g:3961:3: ( (lv_contrState_0_0= ruleContrState ) )
            // InternalSymboleoci.g:3962:4: (lv_contrState_0_0= ruleContrState )
            {
            // InternalSymboleoci.g:3962:4: (lv_contrState_0_0= ruleContrState )
            // InternalSymboleoci.g:3963:5: lv_contrState_0_0= ruleContrState
            {

            					newCompositeNode(grammarAccess.getCStateAccess().getContrStateContrStateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_contrState_0_0=ruleContrState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCStateRule());
            					}
            					set(
            						current,
            						"contrState",
            						lv_contrState_0_0,
            						"symboleoci.Symboleoci.ContrState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCStateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSymboleoci.g:3984:3: ( (otherlv_2= RULE_ID ) )
            // InternalSymboleoci.g:3985:4: (otherlv_2= RULE_ID )
            {
            // InternalSymboleoci.g:3985:4: (otherlv_2= RULE_ID )
            // InternalSymboleoci.g:3986:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getCStateAccess().getContractNameContractCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCStateAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecState"


    // $ANTLR start "entryRuleContrState"
    // InternalSymboleoci.g:4005:1: entryRuleContrState returns [String current=null] : iv_ruleContrState= ruleContrState EOF ;
    public final String entryRuleContrState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContrState = null;


        try {
            // InternalSymboleoci.g:4005:50: (iv_ruleContrState= ruleContrState EOF )
            // InternalSymboleoci.g:4006:2: iv_ruleContrState= ruleContrState EOF
            {
             newCompositeNode(grammarAccess.getContrStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContrState=ruleContrState();

            state._fsp--;

             current =iv_ruleContrState.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContrState"


    // $ANTLR start "ruleContrState"
    // InternalSymboleoci.g:4012:1: ruleContrState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cFORM' | kw= 'cINEFFECT' | kw= 'cSUSPENSION' | kw= 'cSUCCESSFUL_TERMINATION' | kw= 'cUNSECCESSFUL_TERMINATION' | kw= 'cUNASSIGN' ) ;
    public final AntlrDatatypeRuleToken ruleContrState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:4018:2: ( (kw= 'cFORM' | kw= 'cINEFFECT' | kw= 'cSUSPENSION' | kw= 'cSUCCESSFUL_TERMINATION' | kw= 'cUNSECCESSFUL_TERMINATION' | kw= 'cUNASSIGN' ) )
            // InternalSymboleoci.g:4019:2: (kw= 'cFORM' | kw= 'cINEFFECT' | kw= 'cSUSPENSION' | kw= 'cSUCCESSFUL_TERMINATION' | kw= 'cUNSECCESSFUL_TERMINATION' | kw= 'cUNASSIGN' )
            {
            // InternalSymboleoci.g:4019:2: (kw= 'cFORM' | kw= 'cINEFFECT' | kw= 'cSUSPENSION' | kw= 'cSUCCESSFUL_TERMINATION' | kw= 'cUNSECCESSFUL_TERMINATION' | kw= 'cUNASSIGN' )
            int alt46=6;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt46=1;
                }
                break;
            case 103:
                {
                alt46=2;
                }
                break;
            case 104:
                {
                alt46=3;
                }
                break;
            case 105:
                {
                alt46=4;
                }
                break;
            case 106:
                {
                alt46=5;
                }
                break;
            case 107:
                {
                alt46=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalSymboleoci.g:4020:3: kw= 'cFORM'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrStateAccess().getCFORMKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:4026:3: kw= 'cINEFFECT'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrStateAccess().getCINEFFECTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:4032:3: kw= 'cSUSPENSION'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrStateAccess().getCSUSPENSIONKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:4038:3: kw= 'cSUCCESSFUL_TERMINATION'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrStateAccess().getCSUCCESSFUL_TERMINATIONKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:4044:3: kw= 'cUNSECCESSFUL_TERMINATION'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrStateAccess().getCUNSECCESSFUL_TERMINATIONKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSymboleoci.g:4050:3: kw= 'cUNASSIGN'
                    {
                    kw=(Token)match(input,107,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContrStateAccess().getCUNASSIGNKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContrState"


    // $ANTLR start "entryRulePow"
    // InternalSymboleoci.g:4059:1: entryRulePow returns [EObject current=null] : iv_rulePow= rulePow EOF ;
    public final EObject entryRulePow() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePow = null;


        try {
            // InternalSymboleoci.g:4059:44: (iv_rulePow= rulePow EOF )
            // InternalSymboleoci.g:4060:2: iv_rulePow= rulePow EOF
            {
             newCompositeNode(grammarAccess.getPowRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePow=rulePow();

            state._fsp--;

             current =iv_rulePow; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePow"


    // $ANTLR start "rulePow"
    // InternalSymboleoci.g:4066:1: rulePow returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )? otherlv_4= 'P' otherlv_5= '(' ( (lv_roles_6_0= ruleName ) ) otherlv_7= ',' ( (lv_roles_8_0= ruleName ) ) otherlv_9= ',' ( (lv_antecedents_10_0= ruleProp ) ) otherlv_11= ',' ( (lv_consequents_12_0= ruleProp ) ) otherlv_13= ')' ) ;
    public final EObject rulePow() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_trigger_2_0 = null;

        EObject lv_roles_6_0 = null;

        EObject lv_roles_8_0 = null;

        EObject lv_antecedents_10_0 = null;

        EObject lv_consequents_12_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:4072:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )? otherlv_4= 'P' otherlv_5= '(' ( (lv_roles_6_0= ruleName ) ) otherlv_7= ',' ( (lv_roles_8_0= ruleName ) ) otherlv_9= ',' ( (lv_antecedents_10_0= ruleProp ) ) otherlv_11= ',' ( (lv_consequents_12_0= ruleProp ) ) otherlv_13= ')' ) )
            // InternalSymboleoci.g:4073:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )? otherlv_4= 'P' otherlv_5= '(' ( (lv_roles_6_0= ruleName ) ) otherlv_7= ',' ( (lv_roles_8_0= ruleName ) ) otherlv_9= ',' ( (lv_antecedents_10_0= ruleProp ) ) otherlv_11= ',' ( (lv_consequents_12_0= ruleProp ) ) otherlv_13= ')' )
            {
            // InternalSymboleoci.g:4073:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )? otherlv_4= 'P' otherlv_5= '(' ( (lv_roles_6_0= ruleName ) ) otherlv_7= ',' ( (lv_roles_8_0= ruleName ) ) otherlv_9= ',' ( (lv_antecedents_10_0= ruleProp ) ) otherlv_11= ',' ( (lv_consequents_12_0= ruleProp ) ) otherlv_13= ')' )
            // InternalSymboleoci.g:4074:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )? otherlv_4= 'P' otherlv_5= '(' ( (lv_roles_6_0= ruleName ) ) otherlv_7= ',' ( (lv_roles_8_0= ruleName ) ) otherlv_9= ',' ( (lv_antecedents_10_0= ruleProp ) ) otherlv_11= ',' ( (lv_consequents_12_0= ruleProp ) ) otherlv_13= ')'
            {
            // InternalSymboleoci.g:4074:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSymboleoci.g:4075:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSymboleoci.g:4075:4: (lv_name_0_0= RULE_ID )
            // InternalSymboleoci.g:4076:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPowAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getPowAccess().getColonKeyword_1());
            		
            // InternalSymboleoci.g:4096:3: ( ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_INT)||LA47_0==18||LA47_0==43||LA47_0==45||(LA47_0>=47 && LA47_0<=51)||(LA47_0>=70 && LA47_0<=107)||(LA47_0>=109 && LA47_0<=113)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSymboleoci.g:4097:4: ( (lv_trigger_2_0= ruleProp ) ) otherlv_3= '->'
                    {
                    // InternalSymboleoci.g:4097:4: ( (lv_trigger_2_0= ruleProp ) )
                    // InternalSymboleoci.g:4098:5: (lv_trigger_2_0= ruleProp )
                    {
                    // InternalSymboleoci.g:4098:5: (lv_trigger_2_0= ruleProp )
                    // InternalSymboleoci.g:4099:6: lv_trigger_2_0= ruleProp
                    {

                    						newCompositeNode(grammarAccess.getPowAccess().getTriggerPropParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_trigger_2_0=ruleProp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPowRule());
                    						}
                    						set(
                    							current,
                    							"trigger",
                    							lv_trigger_2_0,
                    							"symboleoci.Symboleoci.Prop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_51); 

                    				newLeafNode(otherlv_3, grammarAccess.getPowAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,108,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getPowAccess().getPKeyword_3());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPowAccess().getLeftParenthesisKeyword_4());
            		
            // InternalSymboleoci.g:4129:3: ( (lv_roles_6_0= ruleName ) )
            // InternalSymboleoci.g:4130:4: (lv_roles_6_0= ruleName )
            {
            // InternalSymboleoci.g:4130:4: (lv_roles_6_0= ruleName )
            // InternalSymboleoci.g:4131:5: lv_roles_6_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPowAccess().getRolesNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_roles_6_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_6_0,
            						"symboleoci.Symboleoci.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getPowAccess().getCommaKeyword_6());
            		
            // InternalSymboleoci.g:4152:3: ( (lv_roles_8_0= ruleName ) )
            // InternalSymboleoci.g:4153:4: (lv_roles_8_0= ruleName )
            {
            // InternalSymboleoci.g:4153:4: (lv_roles_8_0= ruleName )
            // InternalSymboleoci.g:4154:5: lv_roles_8_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPowAccess().getRolesNameParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_roles_8_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_8_0,
            						"symboleoci.Symboleoci.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_9, grammarAccess.getPowAccess().getCommaKeyword_8());
            		
            // InternalSymboleoci.g:4175:3: ( (lv_antecedents_10_0= ruleProp ) )
            // InternalSymboleoci.g:4176:4: (lv_antecedents_10_0= ruleProp )
            {
            // InternalSymboleoci.g:4176:4: (lv_antecedents_10_0= ruleProp )
            // InternalSymboleoci.g:4177:5: lv_antecedents_10_0= ruleProp
            {

            					newCompositeNode(grammarAccess.getPowAccess().getAntecedentsPropParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_antecedents_10_0=ruleProp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowRule());
            					}
            					add(
            						current,
            						"antecedents",
            						lv_antecedents_10_0,
            						"symboleoci.Symboleoci.Prop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_11, grammarAccess.getPowAccess().getCommaKeyword_10());
            		
            // InternalSymboleoci.g:4198:3: ( (lv_consequents_12_0= ruleProp ) )
            // InternalSymboleoci.g:4199:4: (lv_consequents_12_0= ruleProp )
            {
            // InternalSymboleoci.g:4199:4: (lv_consequents_12_0= ruleProp )
            // InternalSymboleoci.g:4200:5: lv_consequents_12_0= ruleProp
            {

            					newCompositeNode(grammarAccess.getPowAccess().getConsequentsPropParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_15);
            lv_consequents_12_0=ruleProp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowRule());
            					}
            					add(
            						current,
            						"consequents",
            						lv_consequents_12_0,
            						"symboleoci.Symboleoci.Prop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPowAccess().getRightParenthesisKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePow"


    // $ANTLR start "entryRulepState"
    // InternalSymboleoci.g:4225:1: entryRulepState returns [EObject current=null] : iv_rulepState= rulepState EOF ;
    public final EObject entryRulepState() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepState = null;


        try {
            // InternalSymboleoci.g:4225:47: (iv_rulepState= rulepState EOF )
            // InternalSymboleoci.g:4226:2: iv_rulepState= rulepState EOF
            {
             newCompositeNode(grammarAccess.getPStateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepState=rulepState();

            state._fsp--;

             current =iv_rulepState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulepState"


    // $ANTLR start "rulepState"
    // InternalSymboleoci.g:4232:1: rulepState returns [EObject current=null] : ( ( (lv_powState_0_0= rulePowState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject rulepState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_powState_0_0 = null;



        	enterRule();

        try {
            // InternalSymboleoci.g:4238:2: ( ( ( (lv_powState_0_0= rulePowState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSymboleoci.g:4239:2: ( ( (lv_powState_0_0= rulePowState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSymboleoci.g:4239:2: ( ( (lv_powState_0_0= rulePowState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalSymboleoci.g:4240:3: ( (lv_powState_0_0= rulePowState ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalSymboleoci.g:4240:3: ( (lv_powState_0_0= rulePowState ) )
            // InternalSymboleoci.g:4241:4: (lv_powState_0_0= rulePowState )
            {
            // InternalSymboleoci.g:4241:4: (lv_powState_0_0= rulePowState )
            // InternalSymboleoci.g:4242:5: lv_powState_0_0= rulePowState
            {

            					newCompositeNode(grammarAccess.getPStateAccess().getPowStatePowStateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_powState_0_0=rulePowState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPStateRule());
            					}
            					set(
            						current,
            						"powState",
            						lv_powState_0_0,
            						"symboleoci.Symboleoci.PowState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPStateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSymboleoci.g:4263:3: ( (otherlv_2= RULE_ID ) )
            // InternalSymboleoci.g:4264:4: (otherlv_2= RULE_ID )
            {
            // InternalSymboleoci.g:4264:4: (otherlv_2= RULE_ID )
            // InternalSymboleoci.g:4265:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getPStateAccess().getPowNamePowCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPStateAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepState"


    // $ANTLR start "entryRulePowState"
    // InternalSymboleoci.g:4284:1: entryRulePowState returns [String current=null] : iv_rulePowState= rulePowState EOF ;
    public final String entryRulePowState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePowState = null;


        try {
            // InternalSymboleoci.g:4284:48: (iv_rulePowState= rulePowState EOF )
            // InternalSymboleoci.g:4285:2: iv_rulePowState= rulePowState EOF
            {
             newCompositeNode(grammarAccess.getPowStateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePowState=rulePowState();

            state._fsp--;

             current =iv_rulePowState.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePowState"


    // $ANTLR start "rulePowState"
    // InternalSymboleoci.g:4291:1: rulePowState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pCREATE' | kw= 'pINEFFECT' | kw= 'pSUSPENSION' | kw= 'pSUCCESSFUL_TERMINATION' | kw= 'pUNSUCCESSFUL_TERMINATION' ) ;
    public final AntlrDatatypeRuleToken rulePowState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:4297:2: ( (kw= 'pCREATE' | kw= 'pINEFFECT' | kw= 'pSUSPENSION' | kw= 'pSUCCESSFUL_TERMINATION' | kw= 'pUNSUCCESSFUL_TERMINATION' ) )
            // InternalSymboleoci.g:4298:2: (kw= 'pCREATE' | kw= 'pINEFFECT' | kw= 'pSUSPENSION' | kw= 'pSUCCESSFUL_TERMINATION' | kw= 'pUNSUCCESSFUL_TERMINATION' )
            {
            // InternalSymboleoci.g:4298:2: (kw= 'pCREATE' | kw= 'pINEFFECT' | kw= 'pSUSPENSION' | kw= 'pSUCCESSFUL_TERMINATION' | kw= 'pUNSUCCESSFUL_TERMINATION' )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt48=1;
                }
                break;
            case 110:
                {
                alt48=2;
                }
                break;
            case 111:
                {
                alt48=3;
                }
                break;
            case 112:
                {
                alt48=4;
                }
                break;
            case 113:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalSymboleoci.g:4299:3: kw= 'pCREATE'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowStateAccess().getPCREATEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:4305:3: kw= 'pINEFFECT'
                    {
                    kw=(Token)match(input,110,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowStateAccess().getPINEFFECTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSymboleoci.g:4311:3: kw= 'pSUSPENSION'
                    {
                    kw=(Token)match(input,111,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowStateAccess().getPSUSPENSIONKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSymboleoci.g:4317:3: kw= 'pSUCCESSFUL_TERMINATION'
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowStateAccess().getPSUCCESSFUL_TERMINATIONKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSymboleoci.g:4323:3: kw= 'pUNSUCCESSFUL_TERMINATION'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPowStateAccess().getPUNSUCCESSFUL_TERMINATIONKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePowState"


    // $ANTLR start "entryRuleSetExp"
    // InternalSymboleoci.g:4332:1: entryRuleSetExp returns [String current=null] : iv_ruleSetExp= ruleSetExp EOF ;
    public final String entryRuleSetExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSetExp = null;


        try {
            // InternalSymboleoci.g:4332:46: (iv_ruleSetExp= ruleSetExp EOF )
            // InternalSymboleoci.g:4333:2: iv_ruleSetExp= ruleSetExp EOF
            {
             newCompositeNode(grammarAccess.getSetExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetExp=ruleSetExp();

            state._fsp--;

             current =iv_ruleSetExp.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetExp"


    // $ANTLR start "ruleSetExp"
    // InternalSymboleoci.g:4339:1: ruleSetExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'self.' kw= 'obligation.instance' ) | (kw= 'self.' kw= 'power.instance' ) ) ;
    public final AntlrDatatypeRuleToken ruleSetExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSymboleoci.g:4345:2: ( ( (kw= 'self.' kw= 'obligation.instance' ) | (kw= 'self.' kw= 'power.instance' ) ) )
            // InternalSymboleoci.g:4346:2: ( (kw= 'self.' kw= 'obligation.instance' ) | (kw= 'self.' kw= 'power.instance' ) )
            {
            // InternalSymboleoci.g:4346:2: ( (kw= 'self.' kw= 'obligation.instance' ) | (kw= 'self.' kw= 'power.instance' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==114) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==115) ) {
                    alt49=1;
                }
                else if ( (LA49_1==116) ) {
                    alt49=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalSymboleoci.g:4347:3: (kw= 'self.' kw= 'obligation.instance' )
                    {
                    // InternalSymboleoci.g:4347:3: (kw= 'self.' kw= 'obligation.instance' )
                    // InternalSymboleoci.g:4348:4: kw= 'self.' kw= 'obligation.instance'
                    {
                    kw=(Token)match(input,114,FOLLOW_52); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSetExpAccess().getSelfKeyword_0_0());
                    			
                    kw=(Token)match(input,115,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSetExpAccess().getObligationInstanceKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSymboleoci.g:4360:3: (kw= 'self.' kw= 'power.instance' )
                    {
                    // InternalSymboleoci.g:4360:3: (kw= 'self.' kw= 'power.instance' )
                    // InternalSymboleoci.g:4361:4: kw= 'self.' kw= 'power.instance'
                    {
                    kw=(Token)match(input,114,FOLLOW_53); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSetExpAccess().getSelfKeyword_1_0());
                    			
                    kw=(Token)match(input,116,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSetExpAccess().getPowerInstanceKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetExp"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\2\3\uffff\11\2\1\uffff";
    static final String dfa_3s = "\1\4\1\46\1\uffff\1\4\11\14\1\uffff";
    static final String dfa_4s = "\1\14\1\46\1\uffff\1\33\11\20\1\uffff";
    static final String dfa_5s = "\2\uffff\1\2\12\uffff\1\1";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\7\uffff\1\2",
            "\1\3",
            "",
            "\1\4\17\uffff\1\12\1\13\1\14\1\5\1\6\1\7\1\10\1\11",
            "\1\2\3\uffff\1\15",
            "\1\2\3\uffff\1\15",
            "\1\2\3\uffff\1\15",
            "\1\2\3\uffff\1\15",
            "\1\2\3\uffff\1\15",
            "\1\2\3\uffff\1\15",
            "\1\2\3\uffff\1\15",
            "\1\2\3\uffff\1\15",
            "\1\2\3\uffff\1\15",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 275:4: ( ( (lv_attributes_4_0= ruleAtt ) ) otherlv_5= ',' )*";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\4\2\uffff\1\22\7\uffff";
    static final String dfa_10s = "\1\161\2\uffff\1\105\7\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\3";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\4\14\uffff\1\5\32\uffff\1\6\1\uffff\1\7\1\10\1\11\1\2\1\1\22\uffff\46\4\1\uffff\5\4",
            "",
            "",
            "\1\12\31\uffff\1\4\23\uffff\6\4",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1633:2: ( ( (lv_eventPropositions_0_0= ruleEventProp ) ) | ( (lv_situationPropositions_1_0= ruleSitProp ) ) | ( ( (lv_shortHandNames_2_0= ruleName ) ) otherlv_3= '(' ( ( (lv_names_4_0= ruleName ) ) otherlv_5= ',' )* ( (lv_names_6_0= ruleName ) ) (otherlv_7= ',' ( (lv_points_8_0= rulePoint ) ) )* (otherlv_9= ',' ( (lv_intervals_10_0= ruleInterval ) ) )* otherlv_11= ')' ) | ( ( (lv_points_12_0= rulePoint ) ) otherlv_13= 'within' ( (lv_intervals_14_0= ruleInterval ) ) ) | (otherlv_15= '(' ( (lv_propositions_16_0= ruleProp ) ) otherlv_17= ')' ) | (otherlv_18= 'exists' ( (lv_varName_19_0= ruleName ) ) otherlv_20= '|' ( (lv_setExps_21_0= ruleSetExp ) ) otherlv_22= '(' ( (lv_metaconstraints_23_0= ruleMetaConst ) ) otherlv_24= ')' ) | (otherlv_25= 'forAll' ( (lv_varName_26_0= ruleName ) ) otherlv_27= '|' ( (lv_setExps_28_0= ruleSetExp ) ) otherlv_29= '(' ( (lv_metaconstraints_30_0= ruleMetaConst ) ) otherlv_31= ')' ) | ( () otherlv_33= 'TRUE' ) | ( () otherlv_35= 'FALSE' ) )";
        }
    }
    static final String dfa_14s = "\u008c\uffff";
    static final String dfa_15s = "\1\20\1\4\2\uffff\52\22\1\20\6\4\10\100\6\23\6\4\7\uffff\52\22\6\4\6\23\6\uffff";
    static final String dfa_16s = "\1\23\1\161\2\uffff\52\22\1\77\6\4\10\105\6\23\6\161\7\uffff\52\22\6\4\6\23\6\uffff";
    static final String dfa_17s = "\2\uffff\1\2\1\1\105\uffff\7\1\66\uffff\6\1";
    static final String dfa_18s = "\u008c\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\2\uffff\1\2",
            "\1\3\1\56\57\uffff\1\2\1\uffff\1\2\16\uffff\1\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\21\1\22\1\23\1\24\1\25\1\26\1\uffff\1\14\1\15\1\16\1\17\1\20",
            "",
            "",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\3\2\uffff\1\3\44\uffff\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117\102\uffff\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\135\1\136\1\137\1\140\1\141\1\142\1\uffff\1\130\1\131\1\132\1\133\1\134",
            "\1\117\102\uffff\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\135\1\136\1\137\1\140\1\141\1\142\1\uffff\1\130\1\131\1\132\1\133\1\134",
            "\1\117\102\uffff\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\135\1\136\1\137\1\140\1\141\1\142\1\uffff\1\130\1\131\1\132\1\133\1\134",
            "\1\117\102\uffff\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\135\1\136\1\137\1\140\1\141\1\142\1\uffff\1\130\1\131\1\132\1\133\1\134",
            "\1\117\102\uffff\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\135\1\136\1\137\1\140\1\141\1\142\1\uffff\1\130\1\131\1\132\1\133\1\134",
            "\1\117\102\uffff\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\135\1\136\1\137\1\140\1\141\1\142\1\uffff\1\130\1\131\1\132\1\133\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\172",
            "\1\173",
            "\1\173",
            "\1\173",
            "\1\173",
            "\1\173",
            "\1\174",
            "\1\174",
            "\1\174",
            "\1\174",
            "\1\174",
            "\1\174",
            "\1\175",
            "\1\175",
            "\1\175",
            "\1\175",
            "\1\175",
            "\1\175",
            "\1\175",
            "\1\175",
            "\1\175",
            "\1\176",
            "\1\176",
            "\1\176",
            "\1\176",
            "\1\176",
            "\1\176",
            "\1\176",
            "\1\177",
            "\1\177",
            "\1\177",
            "\1\177",
            "\1\177",
            "\1\177",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 1742:4: (otherlv_7= ',' ( (lv_points_8_0= rulePoint ) ) )*";
        }
    }
    static final String dfa_20s = "\103\uffff";
    static final String dfa_21s = "\1\uffff\1\57\73\uffff\6\57";
    static final String dfa_22s = "\1\4\1\14\52\22\5\uffff\6\4\6\23\6\14";
    static final String dfa_23s = "\1\161\1\105\52\22\5\uffff\6\4\6\23\6\105";
    static final String dfa_24s = "\54\uffff\1\2\1\3\1\5\1\1\1\4\22\uffff";
    static final String dfa_25s = "\103\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\1\56\57\uffff\1\54\1\uffff\1\55\17\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\17\1\20\1\21\1\22\1\23\1\24\1\uffff\1\12\1\13\1\14\1\15\1\16",
            "\1\57\3\uffff\1\57\2\uffff\1\57\23\uffff\1\57\1\uffff\2\57\25\uffff\6\60",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\57\3\uffff\1\57\2\uffff\1\57\23\uffff\1\57\1\uffff\2\57\25\uffff\6\60",
            "\1\57\3\uffff\1\57\2\uffff\1\57\23\uffff\1\57\1\uffff\2\57\25\uffff\6\60",
            "\1\57\3\uffff\1\57\2\uffff\1\57\23\uffff\1\57\1\uffff\2\57\25\uffff\6\60",
            "\1\57\3\uffff\1\57\2\uffff\1\57\23\uffff\1\57\1\uffff\2\57\25\uffff\6\60",
            "\1\57\3\uffff\1\57\2\uffff\1\57\23\uffff\1\57\1\uffff\2\57\25\uffff\6\60",
            "\1\57\3\uffff\1\57\2\uffff\1\57\23\uffff\1\57\1\uffff\2\57\25\uffff\6\60"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2572:2: ( ( (lv_situationName_0_0= ruleSitName ) ) | (otherlv_1= '[' ( (lv_points_2_0= rulePoint ) ) otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) otherlv_5= ']' ) | ( () otherlv_7= 'UNNAMED_INTERVAL' ) | ( ( (lv_situationNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_intConsts_10_0= ruleIntConst ) ) ( (lv_units_11_0= ruleUnit ) ) ) | ( ( (lv_intConsts_12_0= ruleIntConst ) ) ( (lv_units_13_0= ruleUnit ) ) ( (lv_tempOps_14_0= ruleTempOp ) ) ( (lv_situationNames_15_0= ruleSitName ) ) ) )";
        }
    }
    static final String dfa_27s = "\104\uffff";
    static final String dfa_28s = "\1\uffff\1\56\53\uffff\1\67\20\uffff\6\56";
    static final String dfa_29s = "\1\4\1\20\52\22\1\uffff\1\20\2\uffff\6\4\2\uffff\6\23\6\20";
    static final String dfa_30s = "\1\161\1\105\52\22\1\uffff\1\77\2\uffff\6\4\2\uffff\6\23\6\105";
    static final String dfa_31s = "\54\uffff\1\2\1\uffff\1\1\1\5\6\uffff\1\4\1\3\14\uffff";
    static final String dfa_32s = "\104\uffff}>";
    static final String[] dfa_33s = {
            "\1\1\1\55\100\uffff\1\54\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\17\1\20\1\21\1\22\1\23\1\24\1\uffff\1\12\1\13\1\14\1\15\1\16",
            "\1\56\2\uffff\1\56\30\uffff\1\56\11\uffff\1\56\11\uffff\6\57",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\65",
            "\1\65",
            "",
            "\1\67\2\uffff\1\67\30\uffff\1\67\11\uffff\1\67\1\uffff\10\66",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\56\2\uffff\1\56\30\uffff\1\56\11\uffff\1\56\11\uffff\6\57",
            "\1\56\2\uffff\1\56\30\uffff\1\56\11\uffff\1\56\11\uffff\6\57",
            "\1\56\2\uffff\1\56\30\uffff\1\56\11\uffff\1\56\11\uffff\6\57",
            "\1\56\2\uffff\1\56\30\uffff\1\56\11\uffff\1\56\11\uffff\6\57",
            "\1\56\2\uffff\1\56\30\uffff\1\56\11\uffff\1\56\11\uffff\6\57",
            "\1\56\2\uffff\1\56\30\uffff\1\56\11\uffff\1\56\11\uffff\6\57"
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "3157:2: ( ( (lv_eventNames_0_0= ruleSitName ) ) | ( () otherlv_2= 'UNNAMED_POINT' ) | ( (lv_pointConsts_3_0= rulePointConst ) ) | ( ( (lv_pointConsts_4_0= rulePointConst ) ) ( (lv_units_5_0= ruleUnit ) ) ( (lv_tempOps_6_0= ruleTempOp ) ) ( (lv_eventNames_7_0= ruleSitName ) ) ) | ( ( (lv_eventNames_8_0= ruleSitName ) ) ( (lv_tempOps_9_0= ruleTempOp ) ) ( (lv_pointConsts_10_0= rulePointConst ) ) ( (lv_units_11_0= ruleUnit ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000FF02010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000FF00010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001C0000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000FA80180040030L,0x0003EFFFFFFFFFC0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000FA80100040030L,0x0003EFFFFFFFFFC0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001E00000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001C00000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000FA81000040030L,0x0003EFFFFFFFFFC0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000FA90000040030L,0x0003EFFFFFFFFFC0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000FA80000040030L,0x0003EFFFFFFFFFC0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000030L,0x0003EFFFFFFFFFC0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00A0000000000030L,0x0003EFFFFFFFFF80L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000003FC0000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x00000FC000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0003E00000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x000000003FE00000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x00000000001FC000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000010L,0x0003EFFFFFFFFF80L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xFF00000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000FA80000040030L,0x0003FFFFFFFFFFC0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});

}