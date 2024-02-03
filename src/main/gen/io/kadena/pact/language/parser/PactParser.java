// This is a generated file. Not intended for manual editing.
package io.kadena.pact.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.kadena.pact.language.psi.PactTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PactParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Program(b, l + 1);
  }

  /* ********************************************************** */
  // <AppBindList> <Expr>
  //                 | <AppBindList> <BindingForm>
  //                 | ε
  public static boolean AppBindList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppBindList")) return false;
    if (!nextTokenIs(b, "<app bind list>", _APPBINDLIST_, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, APP_BIND_LIST, "<app bind list>");
    r = AppBindList(b, l + 1);
    if (!r) r = AppBindList(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <AppList> <Expr>
  //             | ε
  public static boolean AppList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppList")) return false;
    if (!nextTokenIs(b, "<app list>", _APPLIST_, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, APP_LIST, "<app list>");
    r = AppList(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <Var>
  //          | <Number>
  //          | <String>
  //          | <List>
  //          | <Bool>
  //          | <Operator>
  //          | <Object>
  //          | "(" ")"
  public static boolean Atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM, "<atom>");
    r = Var(b, l + 1);
    if (!r) r = Number(b, l + 1);
    if (!r) r = String(b, l + 1);
    if (!r) r = List(b, l + 1);
    if (!r) r = Bool(b, l + 1);
    if (!r) r = Operator(b, l + 1);
    if (!r) r = Object(b, l + 1);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, CLOSE_PARENS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <STR> ":=" <MArg>
  //              | <TICK> ":=" <MArg>
  public static boolean BindPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindPair")) return false;
    if (!nextTokenIs(b, "<bind pair>", _STR_, _TICK_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIND_PAIR, "<bind pair>");
    r = parseTokens(b, 0, _STR_, BIND_ASSIGN, _MARG_);
    if (!r) r = parseTokens(b, 0, _TICK_, BIND_ASSIGN, _MARG_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <BindPairs> "," <BindPair>
  //               | <BindPair>
  public static boolean BindPairs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindPairs")) return false;
    if (!nextTokenIs(b, "<bind pairs>", _BINDPAIRS_, _BINDPAIR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIND_PAIRS, "<bind pairs>");
    r = BindPairs(b, l + 1);
    if (!r) r = BindPair(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <Binders> "(" <IDENT> <MTypeAnn> <Expr> ")"
  //             | "(" <IDENT> <MTypeAnn> <Expr> ")"
  public static boolean Binders(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Binders")) return false;
    if (!nextTokenIs(b, "<binders>", OPEN_PARENS, _BINDERS_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINDERS, "<binders>");
    r = Binders(b, l + 1);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _IDENT_, _MTYPEANN_, _EXPR_, CLOSE_PARENS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "{" <BindPairs> "}"
  public static boolean BindingForm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindingForm")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_BRACE, _BINDPAIRS_, CLOSE_BRACE);
    exit_section_(b, m, BINDING_FORM, r);
    return r;
  }

  /* ********************************************************** */
  // <BlockBody>
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    if (!nextTokenIs(b, _BLOCKBODY_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BlockBody(b, l + 1);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // <BlockBody> <Expr>
  //               | <Expr>
  public static boolean BlockBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockBody")) return false;
    if (!nextTokenIs(b, "<block body>", _BLOCKBODY_, _EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_BODY, "<block body>");
    r = BlockBody(b, l + 1);
    if (!r) r = Expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "true"
  //          | "false"
  public static boolean Bool(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Bool")) return false;
    if (!nextTokenIs(b, "<bool>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL, "<bool>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <CapForm>
  public static boolean CapExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapExpr")) return false;
    if (!nextTokenIs(b, _CAPFORM_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CapForm(b, l + 1);
    exit_section_(b, m, CAP_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // "withcap" <Expr> <Block>
  //             | "c_usr_grd" "(" <ParsedName> <AppList> ")"
  public static boolean CapForm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapForm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAP_FORM, "<cap form>");
    r = CapForm_0(b, l + 1);
    if (!r) r = CapForm_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "withcap" <Expr> <Block>
  private static boolean CapForm_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapForm_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "withcap");
    r = r && Expr(b, l + 1);
    r = r && Block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "c_usr_grd" "(" <ParsedName> <AppList> ")"
  private static boolean CapForm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapForm_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "c_usr_grd");
    r = r && consumeTokens(b, 0, OPEN_PARENS, _PARSEDNAME_, _APPLIST_, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" <Defun> ")"
  //         | "(" <DefConst> ")"
  //         | "(" <Defcap> ")"
  //         | "(" <Defschema> ")"
  //         | "(" <Deftable> ")"
  //         | "(" <DefPact> ")"
  public static boolean Def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Def")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, OPEN_PARENS, _DEFUN_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _DEFCONST_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _DEFCAP_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _DEFSCHEMA_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _DEFTABLE_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _DEFPACT_, CLOSE_PARENS);
    exit_section_(b, m, DEF, r);
    return r;
  }

  /* ********************************************************** */
  // "defconst" <IDENT> <MTypeAnn> <Expr> <MDoc>
  public static boolean DefConst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefConst")) return false;
    if (!nextTokenIs(b, DEF_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_CONST, _IDENT_, _MTYPEANN_, _EXPR_, _MDOC_);
    exit_section_(b, m, DEF_CONST, r);
    return r;
  }

  /* ********************************************************** */
  // "defpact" <IDENT> <MTypeAnn> "(" <MArgs> ")" <MDocOrModel> <Steps>
  public static boolean DefPact(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefPact")) return false;
    if (!nextTokenIs(b, DEF_PACT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_PACT, _IDENT_, _MTYPEANN_, OPEN_PARENS, _MARGS_, CLOSE_PARENS, _MDOCORMODEL_, _STEPS_);
    exit_section_(b, m, DEF_PACT, r);
    return r;
  }

  /* ********************************************************** */
  // "defcap" <IDENT> <MTypeAnn> "(" <MArgs> ")" <MDocOrModel> <MDCapMeta> <Block>
  public static boolean Defcap(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defcap")) return false;
    if (!nextTokenIs(b, DEF_CAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_CAP, _IDENT_, _MTYPEANN_, OPEN_PARENS, _MARGS_, CLOSE_PARENS, _MDOCORMODEL_, _MDCAPMETA_, _BLOCK_);
    exit_section_(b, m, DEFCAP, r);
    return r;
  }

  /* ********************************************************** */
  // "defschema" <IDENT> <MDocOrModel> <SchemaArgList>
  public static boolean Defschema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defschema")) return false;
    if (!nextTokenIs(b, DEF_SCHEMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_SCHEMA, _IDENT_, _MDOCORMODEL_, _SCHEMAARGLIST_);
    exit_section_(b, m, DEFSCHEMA, r);
    return r;
  }

  /* ********************************************************** */
  // "deftable" <IDENT> ":" "{" <ParsedName> "}" <MDoc>
  public static boolean Deftable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Deftable")) return false;
    if (!nextTokenIs(b, DEF_TABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_TABLE, _IDENT_, COLON, OPEN_BRACE, _PARSEDNAME_, CLOSE_BRACE, _MDOC_);
    exit_section_(b, m, DEFTABLE, r);
    return r;
  }

  /* ********************************************************** */
  // "defun" <IDENT> <MTypeAnn> "(" <MArgs> ")" <MDocOrModel> <Block>
  public static boolean Defun(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defun")) return false;
    if (!nextTokenIs(b, DEFUN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFUN, _IDENT_, _MTYPEANN_, OPEN_PARENS, _MARGS_, CLOSE_PARENS, _MDOCORMODEL_, _BLOCK_);
    exit_section_(b, m, DEFUN, r);
    return r;
  }

  /* ********************************************************** */
  // "docAnn" <STR>
  public static boolean DocAnn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DocAnn")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOC_ANN, "<doc ann>");
    r = consumeToken(b, "docAnn");
    r = r && consumeToken(b, _STR_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <STR>
  public static boolean DocStr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DocStr")) return false;
    if (!nextTokenIs(b, _STR_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _STR_);
    exit_section_(b, m, DOC_STR, r);
    return r;
  }

  /* ********************************************************** */
  // "eventAnn"
  public static boolean Event(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Event")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EVENT, "<event>");
    r = consumeToken(b, "eventAnn");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" <SExpr> ")"
  //          | <Atom>
  public static boolean Expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expr")) return false;
    if (!nextTokenIs(b, "<expr>", OPEN_PARENS, _ATOM_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = parseTokens(b, 0, OPEN_PARENS, _SEXPR_, CLOSE_PARENS);
    if (!r) r = Atom(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <ExprCommaSep> "," <Expr>
  //                  | <Expr>
  public static boolean ExprCommaSep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprCommaSep")) return false;
    if (!nextTokenIs(b, "<expr comma sep>", _EXPRCOMMASEP_, _EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_COMMA_SEP, "<expr comma sep>");
    r = ExprCommaSep(b, l + 1);
    if (!r) r = Expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <Use>
  //         | "(" "implements" <ModQual> ")"
  //         | "(" "bless" <StringRaw> ")"
  public static boolean Ext(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ext")) return false;
    if (!nextTokenIs(b, "<ext>", OPEN_PARENS, _USE_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXT, "<ext>");
    r = Use(b, l + 1);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, IMPLEMENTS, _MODQUAL_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, BLESS, _STRINGRAW_, CLOSE_PARENS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <ExtOrDefs> <Def>
  //               | <ExtOrDefs> <Ext>
  //               | <Def>
  //               | <Ext>
  public static boolean ExtOrDefs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtOrDefs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXT_OR_DEFS, "<ext or defs>");
    r = ExtOrDefs(b, l + 1);
    if (!r) r = ExtOrDefs(b, l + 1);
    if (!r) r = Def(b, l + 1);
    if (!r) r = Ext(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "true"
  //            | "false"
  public static boolean FVBool(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVBool")) return false;
    if (!nextTokenIs(b, "<fv bool>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FV_BOOL, "<fv bool>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "{"
  //             | "}"
  //             | ":"
  //             | ","
  public static boolean FVDelim(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVDelim")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FV_DELIM, "<fv delim>");
    r = consumeToken(b, OPEN_BRACE);
    if (!r) r = consumeToken(b, CLOSE_BRACE);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, COMMA);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "let"
  //               | "lam"
  //               | "if"
  //               | "progn"
  //               | "suspend"
  //               | "try"
  //               | "enforce"
  //               | "enforceOne"
  //               | "and"
  //               | "or"
  //               | "c_usr_grd"
  //               | "withcap"
  public static boolean FVKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVKeyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FV_KEYWORD, "<fv keyword>");
    r = consumeToken(b, "let");
    if (!r) r = consumeToken(b, "lam");
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, BLOCK_INTRO);
    if (!r) r = consumeToken(b, SUSPEND);
    if (!r) r = consumeToken(b, TRY);
    if (!r) r = consumeToken(b, ENFORCE);
    if (!r) r = consumeToken(b, "enforceOne");
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, "c_usr_grd");
    if (!r) r = consumeToken(b, "withcap");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <NUM> "." <NUM>
  //              | <NUM>
  public static boolean FVNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVNumber")) return false;
    if (!nextTokenIs(b, _NUM_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, _NUM_, DOT, _NUM_);
    if (!r) r = consumeToken(b, _NUM_);
    exit_section_(b, m, FV_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // <STR>
  //              | <TICK>
  public static boolean FVString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVString")) return false;
    if (!nextTokenIs(b, "<fv string>", _STR_, _TICK_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FV_STRING, "<fv string>");
    r = consumeToken(b, _STR_);
    if (!r) r = consumeToken(b, _TICK_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <IDENT> "." <ModQual>
  //           | <IDENT>
  //           | <IDENT> "::" <IDENT>
  public static boolean FVVar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVVar")) return false;
    if (!nextTokenIs(b, _IDENT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, _IDENT_, DOT, _MODQUAL_);
    if (!r) r = consumeToken(b, _IDENT_);
    if (!r) r = parseTokens(b, 0, _IDENT_, DYN_ACC, _IDENT_);
    exit_section_(b, m, FV_VAR, r);
    return r;
  }

  /* ********************************************************** */
  // <STR> ":" <Expr>
  //               | <TICK> ":" <Expr>
  public static boolean FieldPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldPair")) return false;
    if (!nextTokenIs(b, "<field pair>", _STR_, _TICK_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_PAIR, "<field pair>");
    r = parseTokens(b, 0, _STR_, COLON, _EXPR_);
    if (!r) r = parseTokens(b, 0, _TICK_, COLON, _EXPR_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <FieldPairs> "," <FieldPair>
  //                | <FieldPair>
  //                | ε
  public static boolean FieldPairs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldPairs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_PAIRS, "<field pairs>");
    r = FieldPairs(b, l + 1);
    if (!r) r = FieldPair(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <Expr> <AppBindList>
  public static boolean GenAppExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenAppExpr")) return false;
    if (!nextTokenIs(b, _EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expr(b, l + 1);
    r = r && AppBindList(b, l + 1);
    exit_section_(b, m, GEN_APP_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // <StringRaw>
  //                | <IDENT>
  public static boolean Governance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Governance")) return false;
    if (!nextTokenIs(b, "<governance>", _IDENT_, _STRINGRAW_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GOVERNANCE, "<governance>");
    r = StringRaw(b, l + 1);
    if (!r) r = consumeToken(b, _IDENT_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" <IfDefun> ")"
  //           | "(" <DefConst> ")"
  //           | "(" <IfDefCap> ")"
  //           | "(" <Defschema> ")"
  //           | "(" <IfDefPact> ")"
  public static boolean IfDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDef")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, OPEN_PARENS, _IFDEFUN_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _DEFCONST_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _IFDEFCAP_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _DEFSCHEMA_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _IFDEFPACT_, CLOSE_PARENS);
    exit_section_(b, m, IF_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // "defcap" <IDENT> <MTypeAnn> "(" <MArgs> ")" <MDocOrModel> <MDCapMeta>
  public static boolean IfDefCap(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefCap")) return false;
    if (!nextTokenIs(b, DEF_CAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_CAP, _IDENT_, _MTYPEANN_, OPEN_PARENS, _MARGS_, CLOSE_PARENS, _MDOCORMODEL_, _MDCAPMETA_);
    exit_section_(b, m, IF_DEF_CAP, r);
    return r;
  }

  /* ********************************************************** */
  // "defpact" <IDENT> <MTypeAnn> "(" <MArgs> ")" <MDocOrModel>
  public static boolean IfDefPact(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefPact")) return false;
    if (!nextTokenIs(b, DEF_PACT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_PACT, _IDENT_, _MTYPEANN_, OPEN_PARENS, _MARGS_, CLOSE_PARENS, _MDOCORMODEL_);
    exit_section_(b, m, IF_DEF_PACT, r);
    return r;
  }

  /* ********************************************************** */
  // "defun" <IDENT> <MTypeAnn> "(" <MArgs> ")" <MDocOrModel>
  public static boolean IfDefun(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefun")) return false;
    if (!nextTokenIs(b, DEFUN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFUN, _IDENT_, _MTYPEANN_, OPEN_PARENS, _MARGS_, CLOSE_PARENS, _MDOCORMODEL_);
    exit_section_(b, m, IF_DEFUN, r);
    return r;
  }

  /* ********************************************************** */
  // "if" <Expr> <Expr> <Expr>
  public static boolean IfExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfExpr")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, _EXPR_, _EXPR_, _EXPR_);
    exit_section_(b, m, IF_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // "[" <ImportNames> "]"
  //                | ε
  public static boolean ImportList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList")) return false;
    if (!nextTokenIs(b, "<import list>", OPEN_BRACKET, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_LIST, "<import list>");
    r = parseTokens(b, 0, OPEN_BRACKET, _IMPORTNAMES_, CLOSE_BRACKET);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <ImportNames> <IDENT>
  //                 | ε
  public static boolean ImportNames(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportNames")) return false;
    if (!nextTokenIs(b, "<import names>", _IMPORTNAMES_, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_NAMES, "<import names>");
    r = ImportNames(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <ImportOrIfDef> <IfDef>
  //                   | <ImportOrIfDef> <Use>
  //                   | <IfDef>
  //                   | <Use>
  public static boolean ImportOrIfDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportOrIfDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_OR_IF_DEF, "<import or if def>");
    r = ImportOrIfDef(b, l + 1);
    if (!r) r = ImportOrIfDef(b, l + 1);
    if (!r) r = IfDef(b, l + 1);
    if (!r) r = Use(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" "interface" <IDENT> <MDocOrModel> <ImportOrIfDef> ")"
  public static boolean Interface(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interface")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, INTERFACE, _IDENT_, _MDOCORMODEL_, _IMPORTORIFDEF_, CLOSE_PARENS);
    exit_section_(b, m, INTERFACE, r);
    return r;
  }

  /* ********************************************************** */
  // <LamArgs> <IDENT> ":" <Type>
  //             | <LamArgs> <IDENT>
  //             | ε
  public static boolean LamArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LamArgs")) return false;
    if (!nextTokenIs(b, "<lam args>", _LAMARGS_, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAM_ARGS, "<lam args>");
    r = LamArgs(b, l + 1);
    if (!r) r = LamArgs(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "lam" "(" <LamArgs> ")" <Block>
  public static boolean LamExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LamExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAM_EXPR, "<lam expr>");
    r = consumeToken(b, "lam");
    r = r && consumeTokens(b, 0, OPEN_PARENS, _LAMARGS_, CLOSE_PARENS, _BLOCK_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "let" "(" <Binders> ")" <Block>
  public static boolean LetExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_EXPR, "<let expr>");
    r = consumeToken(b, "let");
    r = r && consumeTokens(b, 0, OPEN_PARENS, _BINDERS_, CLOSE_PARENS, _BLOCK_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "[" <ListExprs> "]"
  public static boolean List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "List")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_BRACKET, _LISTEXPRS_, CLOSE_BRACKET);
    exit_section_(b, m, LIST, r);
    return r;
  }

  /* ********************************************************** */
  // <Expr> <MCommaExpr>
  //               | ε
  public static boolean ListExprs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListExprs")) return false;
    if (!nextTokenIs(b, "<list exprs>", _EXPR_, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_EXPRS, "<list exprs>");
    r = Expr(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <IDENT> ":" <Type>
  //          | <IDENT>
  public static boolean MArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MArg")) return false;
    if (!nextTokenIs(b, _IDENT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, _IDENT_, COLON, _TYPE_);
    if (!r) r = consumeToken(b, _IDENT_);
    exit_section_(b, m, M_ARG, r);
    return r;
  }

  /* ********************************************************** */
  // <MArgs> <MArg>
  //           | ε
  public static boolean MArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MArgs")) return false;
    if (!nextTokenIs(b, "<m args>", _MARGS_, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_ARGS, "<m args>");
    r = MArgs(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "," <ExprCommaSep>
  //                | <AppList>
  public static boolean MCommaExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MCommaExpr")) return false;
    if (!nextTokenIs(b, "<m comma expr>", COMMA, _APPLIST_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_COMMA_EXPR, "<m comma expr>");
    r = parseTokens(b, 0, COMMA, _EXPRCOMMASEP_);
    if (!r) r = AppList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <Managed>
  //               | <Event>
  //               | ε
  public static boolean MDCapMeta(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDCapMeta")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MD_CAP_META, "<md cap meta>");
    r = Managed(b, l + 1);
    if (!r) r = Event(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <DocAnn>
  //          | <DocStr>
  //          | ε
  public static boolean MDoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDoc")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_DOC, "<m doc>");
    r = DocAnn(b, l + 1);
    if (!r) r = DocStr(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <DocAnn> <ModelAnn>
  //                 | <ModelAnn> <DocAnn>
  //                 | <DocAnn>
  //                 | <ModelAnn>
  //                 | <DocStr>
  //                 | ε
  public static boolean MDocOrModel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDocOrModel")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_DOC_OR_MODEL, "<m doc or model>");
    r = DocAnn(b, l + 1);
    if (!r) r = ModelAnn(b, l + 1);
    if (!r) r = DocAnn(b, l + 1);
    if (!r) r = ModelAnn(b, l + 1);
    if (!r) r = DocStr(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <ModelAnn>
  //            | ε
  public static boolean MModel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MModel")) return false;
    if (!nextTokenIs(b, "<m model>", _MODELANN_, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_MODEL, "<m model>");
    r = ModelAnn(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ":" <Type>
  //              | ε
  public static boolean MTypeAnn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MTypeAnn")) return false;
    if (!nextTokenIs(b, "<m type ann>", COLON, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_TYPE_ANN, "<m type ann>");
    r = parseTokens(b, 0, COLON, _TYPE_);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "managedAnn"
  //             | "managedAnn" <IDENT> <ParsedName>
  public static boolean Managed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Managed")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MANAGED, "<managed>");
    r = consumeToken(b, "managedAnn");
    if (!r) r = Managed_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "managedAnn" <IDENT> <ParsedName>
  private static boolean Managed_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Managed_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "managedAnn");
    r = r && consumeTokens(b, 0, _IDENT_, _PARSEDNAME_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <IDENT> "." <IDENT>
  //             | <IDENT>
  public static boolean ModQual(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModQual")) return false;
    if (!nextTokenIs(b, _IDENT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, _IDENT_, DOT, _IDENT_);
    if (!r) r = consumeToken(b, _IDENT_);
    exit_section_(b, m, MOD_QUAL, r);
    return r;
  }

  /* ********************************************************** */
  // "modelAnn" "[" <PactFVModels> "]"
  public static boolean ModelAnn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelAnn")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODEL_ANN, "<model ann>");
    r = consumeToken(b, "modelAnn");
    r = r && consumeTokens(b, 0, OPEN_BRACKET, _PACTFVMODELS_, CLOSE_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" "module" <IDENT> <Governance> <MDocOrModel> <ExtOrDefs> ")"
  public static boolean Module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, MODULE, _IDENT_, _GOVERNANCE_, _MDOCORMODEL_, _EXTORDEFS_, CLOSE_PARENS);
    exit_section_(b, m, MODULE, r);
    return r;
  }

  /* ********************************************************** */
  // <ModuleNames> "," <ModQual>
  //                 | <ModQual>
  public static boolean ModuleNames(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleNames")) return false;
    if (!nextTokenIs(b, "<module names>", _MODQUAL_, _MODULENAMES_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_NAMES, "<module names>");
    r = ModuleNames(b, l + 1);
    if (!r) r = ModQual(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <NUM> "." <NUM>
  //            | <NUM>
  public static boolean Number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Number")) return false;
    if (!nextTokenIs(b, _NUM_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, _NUM_, DOT, _NUM_);
    if (!r) r = consumeToken(b, _NUM_);
    exit_section_(b, m, NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // "{" <ObjectBody> "}"
  public static boolean Object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Object")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_BRACE, _OBJECTBODY_, CLOSE_BRACE);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  /* ********************************************************** */
  // <FieldPairs>
  public static boolean ObjectBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectBody")) return false;
    if (!nextTokenIs(b, _FIELDPAIRS_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FieldPairs(b, l + 1);
    exit_section_(b, m, OBJECT_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // "and"
  //              | "or"
  //              | "enforce"
  //              | "enforceOne"
  public static boolean Operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, ENFORCE);
    if (!r) r = consumeToken(b, "enforceOne");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <PropExprList>
  public static boolean PactFVModels(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PactFVModels")) return false;
    if (!nextTokenIs(b, _PROPEXPRLIST_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropExprList(b, l + 1);
    exit_section_(b, m, PACT_FV_MODELS, r);
    return r;
  }

  /* ********************************************************** */
  // <IDENT> "." <ModQual>
  //                | <IDENT>
  //                | <IDENT> "::" <IDENT>
  public static boolean ParsedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParsedName")) return false;
    if (!nextTokenIs(b, _IDENT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, _IDENT_, DOT, _MODQUAL_);
    if (!r) r = consumeToken(b, _IDENT_);
    if (!r) r = parseTokens(b, 0, _IDENT_, DYN_ACC, _IDENT_);
    exit_section_(b, m, PARSED_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // <IDENT> "." <ModQual>
  //                  | <IDENT>
  public static boolean ParsedTyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParsedTyName")) return false;
    if (!nextTokenIs(b, _IDENT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, _IDENT_, DOT, _MODQUAL_);
    if (!r) r = consumeToken(b, _IDENT_);
    exit_section_(b, m, PARSED_TY_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "progn" <BlockBody>
  public static boolean ProgNExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgNExpr")) return false;
    if (!nextTokenIs(b, BLOCK_INTRO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BLOCK_INTRO, _BLOCKBODY_);
    exit_section_(b, m, PROG_N_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // <ProgramList>
  static boolean Program(PsiBuilder b, int l) {
    return ProgramList(b, l + 1);
  }

  /* ********************************************************** */
  // <ProgramList> <TopLevel>
  //                 | ε
  public static boolean ProgramList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramList")) return false;
    if (!nextTokenIs(b, "<program list>", _PROGRAMLIST_, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROGRAM_LIST, "<program list>");
    r = ProgramList(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <FVVar>
  //              | <FVNumber>
  //              | <FVString>
  //              | <FVKeyword>
  //              | <FVDelim>
  //              | <FVBool>
  public static boolean PropAtom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropAtom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROP_ATOM, "<prop atom>");
    r = FVVar(b, l + 1);
    if (!r) r = FVNumber(b, l + 1);
    if (!r) r = FVString(b, l + 1);
    if (!r) r = FVKeyword(b, l + 1);
    if (!r) r = FVDelim(b, l + 1);
    if (!r) r = FVBool(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <PropAtom>
  //              | "(" <PropExprList> ")"
  //              | "[" <PropExprList> "]"
  public static boolean PropExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROP_EXPR, "<prop expr>");
    r = PropAtom(b, l + 1);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, _PROPEXPRLIST_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_BRACKET, _PROPEXPRLIST_, CLOSE_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <PropExprList> <PropExpr>
  //                  | ε
  public static boolean PropExprList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropExprList")) return false;
    if (!nextTokenIs(b, "<prop expr list>", _PROPEXPRLIST_, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROP_EXPR_LIST, "<prop expr list>");
    r = PropExprList(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <LamExpr>
  //           | <LetExpr>
  //           | <IfExpr>
  //           | <TryExpr>
  //           | <ProgNExpr>
  //           | <GenAppExpr>
  //           | <SuspendExpr>
  //           | <CapExpr>
  public static boolean SExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, S_EXPR, "<s expr>");
    r = LamExpr(b, l + 1);
    if (!r) r = LetExpr(b, l + 1);
    if (!r) r = IfExpr(b, l + 1);
    if (!r) r = TryExpr(b, l + 1);
    if (!r) r = ProgNExpr(b, l + 1);
    if (!r) r = GenAppExpr(b, l + 1);
    if (!r) r = SuspendExpr(b, l + 1);
    if (!r) r = CapExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <SchemaArgList> <IDENT> ":" <Type>
  //                   | <SchemaArgList> <IDENT>
  //                   | ε
  public static boolean SchemaArgList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArgList")) return false;
    if (!nextTokenIs(b, "<schema arg list>", _SCHEMAARGLIST_, Ε)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCHEMA_ARG_LIST, "<schema arg list>");
    r = SchemaArgList(b, l + 1);
    if (!r) r = SchemaArgList(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" "step" <Expr> <MModel> ")"
  //          | "(" "step" <Expr> <Expr> <MModel> ")"
  //          | "(" "steprb" <Expr> <Expr> <MModel> ")"
  //          | "(" "steprb" <Expr> <Expr> <Expr> <MModel> ")"
  public static boolean Step(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, OPEN_PARENS, STEP, _EXPR_, _MMODEL_, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, STEP, _EXPR_, _EXPR_, _MMODEL_, CLOSE_PARENS);
    if (!r) r = Step_2(b, l + 1);
    if (!r) r = Step_3(b, l + 1);
    exit_section_(b, m, STEP, r);
    return r;
  }

  // "(" "steprb" <Expr> <Expr> <MModel> ")"
  private static boolean Step_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && consumeToken(b, "steprb");
    r = r && Expr(b, l + 1);
    r = r && Expr(b, l + 1);
    r = r && MModel(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" "steprb" <Expr> <Expr> <Expr> <MModel> ")"
  private static boolean Step_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && consumeToken(b, "steprb");
    r = r && Expr(b, l + 1);
    r = r && Expr(b, l + 1);
    r = r && Expr(b, l + 1);
    r = r && MModel(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <Steps> <Step>
  //           | <Step>
  public static boolean Steps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Steps")) return false;
    if (!nextTokenIs(b, "<steps>", _STEPS_, _STEP_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STEPS, "<steps>");
    r = Steps(b, l + 1);
    if (!r) r = Step(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <STR>
  //            | <TICK>
  public static boolean String(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "String")) return false;
    if (!nextTokenIs(b, "<string>", _STR_, _TICK_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, _STR_);
    if (!r) r = consumeToken(b, _TICK_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <STR>
  //               | <TICK>
  public static boolean StringRaw(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringRaw")) return false;
    if (!nextTokenIs(b, "<string raw>", _STR_, _TICK_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_RAW, "<string raw>");
    r = consumeToken(b, _STR_);
    if (!r) r = consumeToken(b, _TICK_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "suspend" <Expr>
  public static boolean SuspendExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuspendExpr")) return false;
    if (!nextTokenIs(b, SUSPEND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SUSPEND, _EXPR_);
    exit_section_(b, m, SUSPEND_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // <Module>
  //              | <Interface>
  //              | <Expr>
  //              | <Use>
  public static boolean TopLevel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevel")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP_LEVEL, "<top level>");
    r = Module(b, l + 1);
    if (!r) r = Interface(b, l + 1);
    if (!r) r = Expr(b, l + 1);
    if (!r) r = Use(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "try" <Expr> <Expr>
  public static boolean TryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryExpr")) return false;
    if (!nextTokenIs(b, TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TRY, _EXPR_, _EXPR_);
    exit_section_(b, m, TRY_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // "[" <Type> "]"
  //          | "module" "{" <ModuleNames> "}"
  //          | <IDENT> "{" <ParsedTyName> "}"
  //          | <IDENT>
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = parseTokens(b, 0, OPEN_BRACKET, _TYPE_, CLOSE_BRACKET);
    if (!r) r = parseTokens(b, 0, MODULE, OPEN_BRACE, _MODULENAMES_, CLOSE_BRACE);
    if (!r) r = parseTokens(b, 0, _IDENT_, OPEN_BRACE, _PARSEDTYNAME_, CLOSE_BRACE);
    if (!r) r = consumeToken(b, _IDENT_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" "import" <ModQual> <ImportList> ")"
  //         | "(" "import" <ModQual> <STR> <ImportList> ")"
  public static boolean Use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Use")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Use_0(b, l + 1);
    if (!r) r = Use_1(b, l + 1);
    exit_section_(b, m, USE, r);
    return r;
  }

  // "(" "import" <ModQual> <ImportList> ")"
  private static boolean Use_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Use_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && consumeToken(b, "import");
    r = r && ModQual(b, l + 1);
    r = r && ImportList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" "import" <ModQual> <STR> <ImportList> ")"
  private static boolean Use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Use_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && consumeToken(b, "import");
    r = r && ModQual(b, l + 1);
    r = r && consumeTokens(b, 0, _STR_, _IMPORTLIST_, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <IDENT> "." <ModQual>
  //         | <IDENT>
  //         | <IDENT> "::" <IDENT>
  public static boolean Var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Var")) return false;
    if (!nextTokenIs(b, _IDENT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, _IDENT_, DOT, _MODQUAL_);
    if (!r) r = consumeToken(b, _IDENT_);
    if (!r) r = parseTokens(b, 0, _IDENT_, DYN_ACC, _IDENT_);
    exit_section_(b, m, VAR, r);
    return r;
  }

}
