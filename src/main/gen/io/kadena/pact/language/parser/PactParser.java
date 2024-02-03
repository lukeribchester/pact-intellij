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
  // (Expr | BindingForm)+
  public static boolean AppBindList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppBindList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, APP_BIND_LIST, "<app bind list>");
    r = AppBindList_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AppBindList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AppBindList", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Expr | BindingForm
  private static boolean AppBindList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppBindList_0")) return false;
    boolean r;
    r = Expr(b, l + 1);
    if (!r) r = BindingForm(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Expr+
  public static boolean AppList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, APP_LIST, "<app list>");
    r = Expr(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AppList", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Var
  //          | Number
  //          | String
  //          | List
  //          | Bool
  //          | Operator
  //          | Object
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
  // STR ":=" MArg
  //              | TICK ":=" MArg
  public static boolean BindPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindPair")) return false;
    if (!nextTokenIs(b, "<bind pair>", STR, TICK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIND_PAIR, "<bind pair>");
    r = BindPair_0(b, l + 1);
    if (!r) r = BindPair_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STR ":=" MArg
  private static boolean BindPair_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindPair_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STR, BIND_ASSIGN);
    r = r && MArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TICK ":=" MArg
  private static boolean BindPair_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindPair_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TICK, BIND_ASSIGN);
    r = r && MArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BindPair ("," BindPair)*
  public static boolean BindPairs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindPairs")) return false;
    if (!nextTokenIs(b, "<bind pairs>", STR, TICK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIND_PAIRS, "<bind pairs>");
    r = BindPair(b, l + 1);
    r = r && BindPairs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," BindPair)*
  private static boolean BindPairs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindPairs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BindPairs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BindPairs_1", c)) break;
    }
    return true;
  }

  // "," BindPair
  private static boolean BindPairs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindPairs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && BindPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" IDENT [MTypeAnn] Expr ")"
  public static boolean Binder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Binder")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, IDENT);
    r = r && Binder_2(b, l + 1);
    r = r && Expr(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, BINDER, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean Binder_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Binder_2")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Binder (Binder)*
  public static boolean Binders(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Binders")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Binder(b, l + 1);
    r = r && Binders_1(b, l + 1);
    exit_section_(b, m, BINDERS, r);
    return r;
  }

  // (Binder)*
  private static boolean Binders_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Binders_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Binders_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Binders_1", c)) break;
    }
    return true;
  }

  // (Binder)
  private static boolean Binders_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Binders_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Binder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{" BindPairs "}"
  public static boolean BindingForm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindingForm")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && BindPairs(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, BINDING_FORM, r);
    return r;
  }

  /* ********************************************************** */
  // BlockBody
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    r = BlockBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expr+
  public static boolean BlockBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_BODY, "<block body>");
    r = Expr(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockBody", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "true"
  //          | "false"
  public static boolean Bool(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Bool")) return false;
    if (!nextTokenIs(b, "<bool>", FALSE_KEYWORD, TRUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL, "<bool>");
    r = consumeToken(b, TRUE_KEYWORD);
    if (!r) r = consumeToken(b, FALSE_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CapForm
  public static boolean CapExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapExpr")) return false;
    if (!nextTokenIs(b, "<cap expr>", CREATE_USER_GUARD_KEYWORD, WITH_CAPABILITY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAP_EXPR, "<cap expr>");
    r = CapForm(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "with-capability" Expr Block
  //             | "create-user-guard" "(" ParsedName AppList ")"
  public static boolean CapForm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapForm")) return false;
    if (!nextTokenIs(b, "<cap form>", CREATE_USER_GUARD_KEYWORD, WITH_CAPABILITY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAP_FORM, "<cap form>");
    r = CapForm_0(b, l + 1);
    if (!r) r = CapForm_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "with-capability" Expr Block
  private static boolean CapForm_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapForm_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH_CAPABILITY_KEYWORD);
    r = r && Expr(b, l + 1);
    r = r && Block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "create-user-guard" "(" ParsedName AppList ")"
  private static boolean CapForm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapForm_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CREATE_USER_GUARD_KEYWORD, OPEN_PARENS);
    r = r && ParsedName(b, l + 1);
    r = r && AppList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" Defun ")"
  //         | "(" DefConst ")"
  //         | "(" Defcap ")"
  //         | "(" Defschema ")"
  //         | "(" Deftable ")"
  //         | "(" DefPact ")"
  public static boolean Def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Def")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Def_0(b, l + 1);
    if (!r) r = Def_1(b, l + 1);
    if (!r) r = Def_2(b, l + 1);
    if (!r) r = Def_3(b, l + 1);
    if (!r) r = Def_4(b, l + 1);
    if (!r) r = Def_5(b, l + 1);
    exit_section_(b, m, DEF, r);
    return r;
  }

  // "(" Defun ")"
  private static boolean Def_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Def_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && Defun(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" DefConst ")"
  private static boolean Def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Def_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && DefConst(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" Defcap ")"
  private static boolean Def_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Def_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && Defcap(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" Defschema ")"
  private static boolean Def_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Def_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && Defschema(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" Deftable ")"
  private static boolean Def_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Def_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && Deftable(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" DefPact ")"
  private static boolean Def_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Def_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && DefPact(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "defconst" IDENT [MTypeAnn] Expr [MDoc]
  public static boolean DefConst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefConst")) return false;
    if (!nextTokenIs(b, DEF_CONST_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_CONST_KEYWORD, IDENT);
    r = r && DefConst_2(b, l + 1);
    r = r && Expr(b, l + 1);
    r = r && DefConst_4(b, l + 1);
    exit_section_(b, m, DEF_CONST, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean DefConst_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefConst_2")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MDoc]
  private static boolean DefConst_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefConst_4")) return false;
    MDoc(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "defpact" IDENT [MTypeAnn] "(" MArgs ")" [MDocOrModel] Steps
  public static boolean DefPact(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefPact")) return false;
    if (!nextTokenIs(b, DEF_PACT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_PACT_KEYWORD, IDENT);
    r = r && DefPact_2(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENS);
    r = r && MArgs(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && DefPact_6(b, l + 1);
    r = r && Steps(b, l + 1);
    exit_section_(b, m, DEF_PACT, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean DefPact_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefPact_2")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean DefPact_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefPact_6")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "defcap" IDENT [MTypeAnn] "(" [MArgs] ")" [MDocOrModel] [MDCapMeta] Block
  public static boolean Defcap(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defcap")) return false;
    if (!nextTokenIs(b, DEF_CAP_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_CAP_KEYWORD, IDENT);
    r = r && Defcap_2(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENS);
    r = r && Defcap_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && Defcap_6(b, l + 1);
    r = r && Defcap_7(b, l + 1);
    r = r && Block(b, l + 1);
    exit_section_(b, m, DEFCAP, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean Defcap_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defcap_2")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MArgs]
  private static boolean Defcap_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defcap_4")) return false;
    MArgs(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean Defcap_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defcap_6")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  // [MDCapMeta]
  private static boolean Defcap_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defcap_7")) return false;
    MDCapMeta(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "defschema" IDENT [MDocOrModel] SchemaArgList
  public static boolean Defschema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defschema")) return false;
    if (!nextTokenIs(b, DEF_SCHEMA_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_SCHEMA_KEYWORD, IDENT);
    r = r && Defschema_2(b, l + 1);
    r = r && SchemaArgList(b, l + 1);
    exit_section_(b, m, DEFSCHEMA, r);
    return r;
  }

  // [MDocOrModel]
  private static boolean Defschema_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defschema_2")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "deftable" IDENT ":" "{" ParsedName "}" [MDoc]
  public static boolean Deftable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Deftable")) return false;
    if (!nextTokenIs(b, DEF_TABLE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_TABLE_KEYWORD, IDENT, COLON, OPEN_BRACE);
    r = r && ParsedName(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    r = r && Deftable_6(b, l + 1);
    exit_section_(b, m, DEFTABLE, r);
    return r;
  }

  // [MDoc]
  private static boolean Deftable_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Deftable_6")) return false;
    MDoc(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "defun" IDENT [MTypeAnn] "(" [MArgs] ")" [MDocOrModel] Block
  public static boolean Defun(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defun")) return false;
    if (!nextTokenIs(b, DEFUN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFUN_KEYWORD, IDENT);
    r = r && Defun_2(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENS);
    r = r && Defun_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && Defun_6(b, l + 1);
    r = r && Block(b, l + 1);
    exit_section_(b, m, DEFUN, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean Defun_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defun_2")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MArgs]
  private static boolean Defun_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defun_4")) return false;
    MArgs(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean Defun_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defun_6")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "@doc" STR
  public static boolean DocAnn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DocAnn")) return false;
    if (!nextTokenIs(b, DOC_ANN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOC_ANN_KEYWORD, STR);
    exit_section_(b, m, DOC_ANN, r);
    return r;
  }

  /* ********************************************************** */
  // STR
  public static boolean DocStr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DocStr")) return false;
    if (!nextTokenIs(b, STR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STR);
    exit_section_(b, m, DOC_STR, r);
    return r;
  }

  /* ********************************************************** */
  // "@event"
  public static boolean Event(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Event")) return false;
    if (!nextTokenIs(b, EVENT_ANN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EVENT_ANN_KEYWORD);
    exit_section_(b, m, EVENT, r);
    return r;
  }

  /* ********************************************************** */
  // "(" SExpr ")"
  //          | Atom
  public static boolean Expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = Expr_0(b, l + 1);
    if (!r) r = Atom(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" SExpr ")"
  private static boolean Expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && SExpr(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expr ("," Expr)*
  public static boolean ExprCommaSep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprCommaSep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_COMMA_SEP, "<expr comma sep>");
    r = Expr(b, l + 1);
    r = r && ExprCommaSep_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," Expr)*
  private static boolean ExprCommaSep_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprCommaSep_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExprCommaSep_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExprCommaSep_1", c)) break;
    }
    return true;
  }

  // "," Expr
  private static boolean ExprCommaSep_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprCommaSep_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Use
  //         | "(" "implements" ModQual ")"
  //         | "(" "bless" StringRaw ")"
  public static boolean Ext(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ext")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Use(b, l + 1);
    if (!r) r = Ext_1(b, l + 1);
    if (!r) r = Ext_2(b, l + 1);
    exit_section_(b, m, EXT, r);
    return r;
  }

  // "(" "implements" ModQual ")"
  private static boolean Ext_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ext_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, IMPLEMENTS_KEYWORD);
    r = r && ModQual(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" "bless" StringRaw ")"
  private static boolean Ext_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ext_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, BLESS_KEYWORD);
    r = r && StringRaw(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Def | Ext)+
  public static boolean ExtOrDefs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtOrDefs")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExtOrDefs_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ExtOrDefs_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExtOrDefs", c)) break;
    }
    exit_section_(b, m, EXT_OR_DEFS, r);
    return r;
  }

  // Def | Ext
  private static boolean ExtOrDefs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtOrDefs_0")) return false;
    boolean r;
    r = Def(b, l + 1);
    if (!r) r = Ext(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "true"
  //            | "false"
  public static boolean FVBool(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVBool")) return false;
    if (!nextTokenIs(b, "<fv bool>", FALSE_KEYWORD, TRUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FV_BOOL, "<fv bool>");
    r = consumeToken(b, TRUE_KEYWORD);
    if (!r) r = consumeToken(b, FALSE_KEYWORD);
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
  //               | "lambda"
  //               | "if"
  //               | "progn"
  //               | "suspend"
  //               | "try"
  //               | "enforce"
  //               | "enforce-one"
  //               | "and"
  //               | "or"
  //               | "create-user-guard"
  //               | "with-capability"
  public static boolean FVKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVKeyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FV_KEYWORD, "<fv keyword>");
    r = consumeToken(b, "let");
    if (!r) r = consumeToken(b, LAMBDA_KEYWORD);
    if (!r) r = consumeToken(b, IF_KEYWORD);
    if (!r) r = consumeToken(b, BLOCK_INTRO_KEYWORD);
    if (!r) r = consumeToken(b, SUSPEND_KEYWORD);
    if (!r) r = consumeToken(b, TRY_KEYWORD);
    if (!r) r = consumeToken(b, ENFORCE_KEYWORD);
    if (!r) r = consumeToken(b, ENFORCE_ONE_KEYWORD);
    if (!r) r = consumeToken(b, AND_KEYWORD);
    if (!r) r = consumeToken(b, OR_KEYWORD);
    if (!r) r = consumeToken(b, CREATE_USER_GUARD_KEYWORD);
    if (!r) r = consumeToken(b, WITH_CAPABILITY_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NUM "." NUM
  //              | NUM
  public static boolean FVNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVNumber")) return false;
    if (!nextTokenIs(b, NUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, NUM, DOT, NUM);
    if (!r) r = consumeToken(b, NUM);
    exit_section_(b, m, FV_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // STR
  //              | TICK
  public static boolean FVString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVString")) return false;
    if (!nextTokenIs(b, "<fv string>", STR, TICK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FV_STRING, "<fv string>");
    r = consumeToken(b, STR);
    if (!r) r = consumeToken(b, TICK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENT "." ModQual
  //           | IDENT
  //           | IDENT "::" IDENT
  public static boolean FVVar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVVar")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FVVar_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = parseTokens(b, 0, IDENT, DYN_ACC, IDENT);
    exit_section_(b, m, FV_VAR, r);
    return r;
  }

  // IDENT "." ModQual
  private static boolean FVVar_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVVar_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, DOT);
    r = r && ModQual(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STR ":" Expr
  //               | TICK ":" Expr
  public static boolean FieldPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldPair")) return false;
    if (!nextTokenIs(b, "<field pair>", STR, TICK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_PAIR, "<field pair>");
    r = FieldPair_0(b, l + 1);
    if (!r) r = FieldPair_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STR ":" Expr
  private static boolean FieldPair_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldPair_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STR, COLON);
    r = r && Expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TICK ":" Expr
  private static boolean FieldPair_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldPair_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TICK, COLON);
    r = r && Expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FieldPair ("," FieldPair)*
  public static boolean FieldPairs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldPairs")) return false;
    if (!nextTokenIs(b, "<field pairs>", STR, TICK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_PAIRS, "<field pairs>");
    r = FieldPair(b, l + 1);
    r = r && FieldPairs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," FieldPair)*
  private static boolean FieldPairs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldPairs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FieldPairs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FieldPairs_1", c)) break;
    }
    return true;
  }

  // "," FieldPair
  private static boolean FieldPairs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldPairs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FieldPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expr AppBindList
  public static boolean GenAppExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenAppExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GEN_APP_EXPR, "<gen app expr>");
    r = Expr(b, l + 1);
    r = r && AppBindList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StringRaw
  //                | IDENT
  public static boolean Governance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Governance")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GOVERNANCE, "<governance>");
    r = StringRaw(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" IfDefun ")"
  //           | "(" DefConst ")"
  //           | "(" IfDefCap ")"
  //           | "(" Defschema ")"
  //           | "(" IfDefPact ")"
  public static boolean IfDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDef")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfDef_0(b, l + 1);
    if (!r) r = IfDef_1(b, l + 1);
    if (!r) r = IfDef_2(b, l + 1);
    if (!r) r = IfDef_3(b, l + 1);
    if (!r) r = IfDef_4(b, l + 1);
    exit_section_(b, m, IF_DEF, r);
    return r;
  }

  // "(" IfDefun ")"
  private static boolean IfDef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDef_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && IfDefun(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" DefConst ")"
  private static boolean IfDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDef_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && DefConst(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" IfDefCap ")"
  private static boolean IfDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDef_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && IfDefCap(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" Defschema ")"
  private static boolean IfDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDef_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && Defschema(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" IfDefPact ")"
  private static boolean IfDef_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDef_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && IfDefPact(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "defcap" IDENT [MTypeAnn] "(" MArgs ")" [MDocOrModel] MDCapMeta
  public static boolean IfDefCap(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefCap")) return false;
    if (!nextTokenIs(b, DEF_CAP_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_CAP_KEYWORD, IDENT);
    r = r && IfDefCap_2(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENS);
    r = r && MArgs(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && IfDefCap_6(b, l + 1);
    r = r && MDCapMeta(b, l + 1);
    exit_section_(b, m, IF_DEF_CAP, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean IfDefCap_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefCap_2")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean IfDefCap_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefCap_6")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "defpact" IDENT [MTypeAnn] "(" MArgs ")" [MDocOrModel]
  public static boolean IfDefPact(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefPact")) return false;
    if (!nextTokenIs(b, DEF_PACT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_PACT_KEYWORD, IDENT);
    r = r && IfDefPact_2(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENS);
    r = r && MArgs(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && IfDefPact_6(b, l + 1);
    exit_section_(b, m, IF_DEF_PACT, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean IfDefPact_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefPact_2")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean IfDefPact_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefPact_6")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "defun" IDENT [MTypeAnn] "(" MArgs ")" [MDocOrModel]
  public static boolean IfDefun(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefun")) return false;
    if (!nextTokenIs(b, DEFUN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFUN_KEYWORD, IDENT);
    r = r && IfDefun_2(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENS);
    r = r && MArgs(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && IfDefun_6(b, l + 1);
    exit_section_(b, m, IF_DEFUN, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean IfDefun_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefun_2")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean IfDefun_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefun_6")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "if" Expr Expr Expr
  public static boolean IfExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfExpr")) return false;
    if (!nextTokenIs(b, IF_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF_KEYWORD);
    r = r && Expr(b, l + 1);
    r = r && Expr(b, l + 1);
    r = r && Expr(b, l + 1);
    exit_section_(b, m, IF_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // "[" ImportNames "]"
  public static boolean ImportList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && ImportNames(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, IMPORT_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT+
  public static boolean ImportNames(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportNames")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENT)) break;
      if (!empty_element_parsed_guard_(b, "ImportNames", c)) break;
    }
    exit_section_(b, m, IMPORT_NAMES, r);
    return r;
  }

  /* ********************************************************** */
  // (IfDef | Use)+
  public static boolean ImportOrIfDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportOrIfDef")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportOrIfDef_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ImportOrIfDef_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ImportOrIfDef", c)) break;
    }
    exit_section_(b, m, IMPORT_OR_IF_DEF, r);
    return r;
  }

  // IfDef | Use
  private static boolean ImportOrIfDef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportOrIfDef_0")) return false;
    boolean r;
    r = IfDef(b, l + 1);
    if (!r) r = Use(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "(" "interface" IDENT [MDocOrModel] ImportOrIfDef ")"
  public static boolean Interface(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interface")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, INTERFACE_KEYWORD, IDENT);
    r = r && Interface_3(b, l + 1);
    r = r && ImportOrIfDef(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, INTERFACE, r);
    return r;
  }

  // [MDocOrModel]
  private static boolean Interface_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interface_3")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENT (":" Type)?
  public static boolean LamArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LamArg")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && LamArg_1(b, l + 1);
    exit_section_(b, m, LAM_ARG, r);
    return r;
  }

  // (":" Type)?
  private static boolean LamArg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LamArg_1")) return false;
    LamArg_1_0(b, l + 1);
    return true;
  }

  // ":" Type
  private static boolean LamArg_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LamArg_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LamArg ("," LamArg)*
  public static boolean LamArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LamArgs")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LamArg(b, l + 1);
    r = r && LamArgs_1(b, l + 1);
    exit_section_(b, m, LAM_ARGS, r);
    return r;
  }

  // ("," LamArg)*
  private static boolean LamArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LamArgs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LamArgs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LamArgs_1", c)) break;
    }
    return true;
  }

  // "," LamArg
  private static boolean LamArgs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LamArgs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && LamArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "lambda" "(" LamArgs ")" Block
  public static boolean LamExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LamExpr")) return false;
    if (!nextTokenIs(b, LAMBDA_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LAMBDA_KEYWORD, OPEN_PARENS);
    r = r && LamArgs(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && Block(b, l + 1);
    exit_section_(b, m, LAM_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // LET_KEYWORD "(" Binders ")" Block
  public static boolean LetExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr")) return false;
    if (!nextTokenIs(b, LET_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LET_KEYWORD, OPEN_PARENS);
    r = r && Binders(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && Block(b, l + 1);
    exit_section_(b, m, LET_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // "[" ListExprs "]"
  public static boolean List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "List")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && ListExprs(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, LIST, r);
    return r;
  }

  /* ********************************************************** */
  // Expr MCommaExpr*
  public static boolean ListExprs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListExprs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_EXPRS, "<list exprs>");
    r = Expr(b, l + 1);
    r = r && ListExprs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MCommaExpr*
  private static boolean ListExprs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListExprs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MCommaExpr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ListExprs_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENT ":" Type
  //          | IDENT
  public static boolean MArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MArg")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MArg_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, m, M_ARG, r);
    return r;
  }

  // IDENT ":" Type
  private static boolean MArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MArg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MArg+
  public static boolean MArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MArgs")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MArg(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MArg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MArgs", c)) break;
    }
    exit_section_(b, m, M_ARGS, r);
    return r;
  }

  /* ********************************************************** */
  // "," ExprCommaSep
  //                | AppList
  public static boolean MCommaExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MCommaExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_COMMA_EXPR, "<m comma expr>");
    r = MCommaExpr_0(b, l + 1);
    if (!r) r = AppList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "," ExprCommaSep
  private static boolean MCommaExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MCommaExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ExprCommaSep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Managed
  //               | Event
  public static boolean MDCapMeta(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDCapMeta")) return false;
    if (!nextTokenIs(b, "<md cap meta>", EVENT_ANN_KEYWORD, MANAGED_ANN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MD_CAP_META, "<md cap meta>");
    r = Managed(b, l + 1);
    if (!r) r = Event(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DocAnn
  //          | DocStr
  public static boolean MDoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDoc")) return false;
    if (!nextTokenIs(b, "<m doc>", DOC_ANN_KEYWORD, STR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_DOC, "<m doc>");
    r = DocAnn(b, l + 1);
    if (!r) r = DocStr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DocAnn ModelAnn
  //                 | ModelAnn DocAnn
  //                 | DocAnn
  //                 | ModelAnn
  //                 | DocStr
  public static boolean MDocOrModel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDocOrModel")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_DOC_OR_MODEL, "<m doc or model>");
    r = MDocOrModel_0(b, l + 1);
    if (!r) r = MDocOrModel_1(b, l + 1);
    if (!r) r = DocAnn(b, l + 1);
    if (!r) r = ModelAnn(b, l + 1);
    if (!r) r = DocStr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DocAnn ModelAnn
  private static boolean MDocOrModel_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDocOrModel_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DocAnn(b, l + 1);
    r = r && ModelAnn(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ModelAnn DocAnn
  private static boolean MDocOrModel_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDocOrModel_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModelAnn(b, l + 1);
    r = r && DocAnn(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ModelAnn
  public static boolean MModel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MModel")) return false;
    if (!nextTokenIs(b, MODEL_ANN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModelAnn(b, l + 1);
    exit_section_(b, m, M_MODEL, r);
    return r;
  }

  /* ********************************************************** */
  // ":" Type
  public static boolean MTypeAnn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MTypeAnn")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, M_TYPE_ANN, r);
    return r;
  }

  /* ********************************************************** */
  // "@managed"
  //             | "@managed" IDENT ParsedName
  public static boolean Managed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Managed")) return false;
    if (!nextTokenIs(b, MANAGED_ANN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MANAGED_ANN_KEYWORD);
    if (!r) r = Managed_1(b, l + 1);
    exit_section_(b, m, MANAGED, r);
    return r;
  }

  // "@managed" IDENT ParsedName
  private static boolean Managed_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Managed_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MANAGED_ANN_KEYWORD, IDENT);
    r = r && ParsedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT "." IDENT
  //             | IDENT
  public static boolean ModQual(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModQual")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, IDENT, DOT, IDENT);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, m, MOD_QUAL, r);
    return r;
  }

  /* ********************************************************** */
  // "@model" "[" PactFVModels "]"
  public static boolean ModelAnn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelAnn")) return false;
    if (!nextTokenIs(b, MODEL_ANN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MODEL_ANN_KEYWORD, OPEN_BRACKET);
    r = r && PactFVModels(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, MODEL_ANN, r);
    return r;
  }

  /* ********************************************************** */
  // "(" "module" IDENT Governance [MDocOrModel] ExtOrDefs ")"
  public static boolean Module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, MODULE_KEYWORD, IDENT);
    r = r && Governance(b, l + 1);
    r = r && Module_4(b, l + 1);
    r = r && ExtOrDefs(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, MODULE, r);
    return r;
  }

  // [MDocOrModel]
  private static boolean Module_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module_4")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ModQual ("," ModQual)*
  public static boolean ModuleNames(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleNames")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModQual(b, l + 1);
    r = r && ModuleNames_1(b, l + 1);
    exit_section_(b, m, MODULE_NAMES, r);
    return r;
  }

  // ("," ModQual)*
  private static boolean ModuleNames_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleNames_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ModuleNames_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModuleNames_1", c)) break;
    }
    return true;
  }

  // "," ModQual
  private static boolean ModuleNames_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleNames_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ModQual(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NUM+ "." NUM+
  //            | NUM+
  public static boolean Number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Number")) return false;
    if (!nextTokenIs(b, NUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Number_0(b, l + 1);
    if (!r) r = Number_1(b, l + 1);
    exit_section_(b, m, NUMBER, r);
    return r;
  }

  // NUM+ "." NUM+
  private static boolean Number_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Number_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Number_0_0(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && Number_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUM+
  private static boolean Number_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Number_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUM);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, NUM)) break;
      if (!empty_element_parsed_guard_(b, "Number_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // NUM+
  private static boolean Number_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Number_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUM);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, NUM)) break;
      if (!empty_element_parsed_guard_(b, "Number_0_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // NUM+
  private static boolean Number_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Number_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUM);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, NUM)) break;
      if (!empty_element_parsed_guard_(b, "Number_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{" ObjectBody "}"
  public static boolean Object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Object")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && ObjectBody(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  /* ********************************************************** */
  // FieldPairs
  public static boolean ObjectBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectBody")) return false;
    if (!nextTokenIs(b, "<object body>", STR, TICK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_BODY, "<object body>");
    r = FieldPairs(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "and"
  //              | "or"
  //              | "enforce"
  //              | "enforce-one"
  public static boolean Operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = consumeToken(b, AND_KEYWORD);
    if (!r) r = consumeToken(b, OR_KEYWORD);
    if (!r) r = consumeToken(b, ENFORCE_KEYWORD);
    if (!r) r = consumeToken(b, ENFORCE_ONE_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PropExprList
  public static boolean PactFVModels(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PactFVModels")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACT_FV_MODELS, "<pact fv models>");
    r = PropExprList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENT "." ModQual
  //                | IDENT
  //                | IDENT "::" IDENT
  public static boolean ParsedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParsedName")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParsedName_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = parseTokens(b, 0, IDENT, DYN_ACC, IDENT);
    exit_section_(b, m, PARSED_NAME, r);
    return r;
  }

  // IDENT "." ModQual
  private static boolean ParsedName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParsedName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, DOT);
    r = r && ModQual(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT "." ModQual
  //                  | IDENT
  public static boolean ParsedTyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParsedTyName")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParsedTyName_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, m, PARSED_TY_NAME, r);
    return r;
  }

  // IDENT "." ModQual
  private static boolean ParsedTyName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParsedTyName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, DOT);
    r = r && ModQual(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "progn" BlockBody
  public static boolean ProgNExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgNExpr")) return false;
    if (!nextTokenIs(b, BLOCK_INTRO_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BLOCK_INTRO_KEYWORD);
    r = r && BlockBody(b, l + 1);
    exit_section_(b, m, PROG_N_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // ProgramList | ReplProgramList
  static boolean Program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program")) return false;
    boolean r;
    r = ProgramList(b, l + 1);
    if (!r) r = ReplProgramList(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // TopLevel+
  public static boolean ProgramList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROGRAM_LIST, "<program list>");
    r = TopLevel(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!TopLevel(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ProgramList", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FVVar
  //              | FVNumber
  //              | FVString
  //              | FVKeyword
  //              | FVDelim
  //              | FVBool
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
  // PropAtom
  //              | "(" PropExprList ")"
  //              | "[" PropExprList "]"
  public static boolean PropExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROP_EXPR, "<prop expr>");
    r = PropAtom(b, l + 1);
    if (!r) r = PropExpr_1(b, l + 1);
    if (!r) r = PropExpr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" PropExprList ")"
  private static boolean PropExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && PropExprList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "[" PropExprList "]"
  private static boolean PropExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropExpr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && PropExprList(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PropExpr+
  public static boolean PropExprList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropExprList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROP_EXPR_LIST, "<prop expr list>");
    r = PropExpr(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!PropExpr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PropExprList", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ReplTopLevel
  //         | "(" ReplSpecial ")"
  public static boolean RTL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RTL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RTL, "<rtl>");
    r = ReplTopLevel(b, l + 1);
    if (!r) r = RTL_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" ReplSpecial ")"
  private static boolean RTL_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RTL_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && ReplSpecial(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RTL+
  public static boolean ReplProgramList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplProgramList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REPL_PROGRAM_LIST, "<repl program list>");
    r = RTL(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!RTL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReplProgramList", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "load" STR BOOLEAN
  //                  | "load" STR
  public static boolean ReplSpecial(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplSpecial")) return false;
    if (!nextTokenIs(b, LOAD_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, LOAD_KEYWORD, STR, BOOLEAN);
    if (!r) r = parseTokens(b, 0, LOAD_KEYWORD, STR);
    exit_section_(b, m, REPL_SPECIAL, r);
    return r;
  }

  /* ********************************************************** */
  // TopLevel
  //                  | "(" Defun ")"
  //                  | "(" DefConst ")"
  public static boolean ReplTopLevel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplTopLevel")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REPL_TOP_LEVEL, "<repl top level>");
    r = TopLevel(b, l + 1);
    if (!r) r = ReplTopLevel_1(b, l + 1);
    if (!r) r = ReplTopLevel_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" Defun ")"
  private static boolean ReplTopLevel_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplTopLevel_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && Defun(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" DefConst ")"
  private static boolean ReplTopLevel_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplTopLevel_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && DefConst(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LamExpr
  //           | LetExpr
  //           | IfExpr
  //           | TryExpr
  //           | ProgNExpr
  //           | GenAppExpr
  //           | SuspendExpr
  //           | CapExpr
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
  // IDENT (":" Type)?
  public static boolean SchemaArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArg")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && SchemaArg_1(b, l + 1);
    exit_section_(b, m, SCHEMA_ARG, r);
    return r;
  }

  // (":" Type)?
  private static boolean SchemaArg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArg_1")) return false;
    SchemaArg_1_0(b, l + 1);
    return true;
  }

  // ":" Type
  private static boolean SchemaArg_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArg_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SchemaArg (SchemaArg)*
  public static boolean SchemaArgList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArgList")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SchemaArg(b, l + 1);
    r = r && SchemaArgList_1(b, l + 1);
    exit_section_(b, m, SCHEMA_ARG_LIST, r);
    return r;
  }

  // (SchemaArg)*
  private static boolean SchemaArgList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArgList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SchemaArgList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SchemaArgList_1", c)) break;
    }
    return true;
  }

  // (SchemaArg)
  private static boolean SchemaArgList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArgList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SchemaArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" "step" Expr [MModel] ")"
  //          | "(" "step" Expr Expr [MModel] ")"
  //          | "(" "step-with-rollback" Expr Expr [MModel] ")"
  //          | "(" "step-with-rollback" Expr Expr Expr [MModel] ")"
  public static boolean Step(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Step_0(b, l + 1);
    if (!r) r = Step_1(b, l + 1);
    if (!r) r = Step_2(b, l + 1);
    if (!r) r = Step_3(b, l + 1);
    exit_section_(b, m, STEP, r);
    return r;
  }

  // "(" "step" Expr [MModel] ")"
  private static boolean Step_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, STEP_KEYWORD);
    r = r && Expr(b, l + 1);
    r = r && Step_0_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MModel]
  private static boolean Step_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_0_3")) return false;
    MModel(b, l + 1);
    return true;
  }

  // "(" "step" Expr Expr [MModel] ")"
  private static boolean Step_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, STEP_KEYWORD);
    r = r && Expr(b, l + 1);
    r = r && Expr(b, l + 1);
    r = r && Step_1_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MModel]
  private static boolean Step_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_1_4")) return false;
    MModel(b, l + 1);
    return true;
  }

  // "(" "step-with-rollback" Expr Expr [MModel] ")"
  private static boolean Step_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, STEP_WITH_ROLLBACK_KEYWORD);
    r = r && Expr(b, l + 1);
    r = r && Expr(b, l + 1);
    r = r && Step_2_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MModel]
  private static boolean Step_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_2_4")) return false;
    MModel(b, l + 1);
    return true;
  }

  // "(" "step-with-rollback" Expr Expr Expr [MModel] ")"
  private static boolean Step_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, STEP_WITH_ROLLBACK_KEYWORD);
    r = r && Expr(b, l + 1);
    r = r && Expr(b, l + 1);
    r = r && Expr(b, l + 1);
    r = r && Step_3_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MModel]
  private static boolean Step_3_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_3_5")) return false;
    MModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Step+
  public static boolean Steps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Steps")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Step(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Step(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Steps", c)) break;
    }
    exit_section_(b, m, STEPS, r);
    return r;
  }

  /* ********************************************************** */
  // STR
  //            | TICK
  public static boolean String(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "String")) return false;
    if (!nextTokenIs(b, "<string>", STR, TICK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, STR);
    if (!r) r = consumeToken(b, TICK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STR
  //               | TICK
  public static boolean StringRaw(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringRaw")) return false;
    if (!nextTokenIs(b, "<string raw>", STR, TICK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_RAW, "<string raw>");
    r = consumeToken(b, STR);
    if (!r) r = consumeToken(b, TICK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "suspend" Expr
  public static boolean SuspendExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuspendExpr")) return false;
    if (!nextTokenIs(b, SUSPEND_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUSPEND_KEYWORD);
    r = r && Expr(b, l + 1);
    exit_section_(b, m, SUSPEND_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // Module
  //              | Interface
  //              | Expr
  //              | Use
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
  // "try" Expr Expr
  public static boolean TryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryExpr")) return false;
    if (!nextTokenIs(b, TRY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRY_KEYWORD);
    r = r && Expr(b, l + 1);
    r = r && Expr(b, l + 1);
    exit_section_(b, m, TRY_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // "[" Type "]"
  //          | "module" "{" ModuleNames "}"
  //          | IDENT "{" ParsedTyName "}"
  //          | IDENT
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = Type_0(b, l + 1);
    if (!r) r = Type_1(b, l + 1);
    if (!r) r = Type_2(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "[" Type "]"
  private static boolean Type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // "module" "{" ModuleNames "}"
  private static boolean Type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MODULE_KEYWORD, OPEN_BRACE);
    r = r && ModuleNames(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENT "{" ParsedTyName "}"
  private static boolean Type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, OPEN_BRACE);
    r = r && ParsedTyName(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" "import" ModQual ImportList ")"
  //         | "(" "import" ModQual STR ImportList ")"
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

  // "(" "import" ModQual ImportList ")"
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

  // "(" "import" ModQual STR ImportList ")"
  private static boolean Use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Use_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && consumeToken(b, "import");
    r = r && ModQual(b, l + 1);
    r = r && consumeToken(b, STR);
    r = r && ImportList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT "." ModQual
  //         | IDENT
  //         | IDENT "::" IDENT
  public static boolean Var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Var")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Var_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = parseTokens(b, 0, IDENT, DYN_ACC, IDENT);
    exit_section_(b, m, VAR, r);
    return r;
  }

  // IDENT "." ModQual
  private static boolean Var_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Var_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, DOT);
    r = r && ModQual(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
