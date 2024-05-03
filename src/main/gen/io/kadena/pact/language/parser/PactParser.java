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
  // (Expression | BindingForm)*
  public static boolean AppBindList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppBindList")) return false;
    Marker m = enter_section_(b, l, _NONE_, APP_BIND_LIST, "<app bind list>");
    while (true) {
      int c = current_position_(b);
      if (!AppBindList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AppBindList", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // Expression | BindingForm
  private static boolean AppBindList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppBindList_0")) return false;
    boolean r;
    r = Expression(b, l + 1);
    if (!r) r = BindingForm(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Expression*
  public static boolean AppList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppList")) return false;
    Marker m = enter_section_(b, l, _NONE_, APP_LIST, "<app list>");
    while (true) {
      int c = current_position_(b);
      if (!Expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AppList", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // PLUS
  //                      | MINUS
  //                      | MULTIPLY
  //                      | DIVIDE
  //                      | POW
  //                      | ABS
  //                      | CEILING
  //                      | FLOOR
  //                      | LOG
  //                      | LN
  //                      | DECIMAL
  //                      | EXP
  //                      | MOD
  //                      | ROUND
  //                      | SQRT
  public static boolean ArithmeticOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArithmeticOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARITHMETIC_OPERATOR, "<arithmetic operator>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, MULTIPLY);
    if (!r) r = consumeToken(b, DIVIDE);
    if (!r) r = consumeToken(b, POW);
    if (!r) r = consumeToken(b, ABS);
    if (!r) r = consumeToken(b, CEILING);
    if (!r) r = consumeToken(b, FLOOR);
    if (!r) r = consumeToken(b, LOG);
    if (!r) r = consumeToken(b, LN);
    if (!r) r = consumeToken(b, DECIMAL);
    if (!r) r = consumeToken(b, EXP);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, ROUND);
    if (!r) r = consumeToken(b, SQRT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BIND_ASSIGN
  public static boolean AssignmentOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentOperator")) return false;
    if (!nextTokenIs(b, BIND_ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIND_ASSIGN);
    exit_section_(b, m, ASSIGNMENT_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // Number
  //                  | String
  //                  | Boolean
  public static boolean AtomicDataType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AtomicDataType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOMIC_DATA_TYPE, "<atomic data type>");
    r = Number(b, l + 1);
    if (!r) r = String(b, l + 1);
    if (!r) r = Boolean(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STR ":=" MArg
  //            | TICK ":=" MArg
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
  // ("(" IDENTIFIER [MTypeAnn] Expression ")")+
  public static boolean Binders(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Binders")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Binders_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Binders_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Binders", c)) break;
    }
    exit_section_(b, m, BINDERS, r);
    return r;
  }

  // "(" IDENTIFIER [MTypeAnn] Expression ")"
  private static boolean Binders_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Binders_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, IDENTIFIER);
    r = r && Binders_0_2(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean Binders_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Binders_0_2")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "{" BindPairs "}"
  public static boolean BindingForm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindingForm")) return false;
    if (!nextTokenIs(b, BRACE_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_OPEN);
    r = r && BindPairs(b, l + 1);
    r = r && consumeToken(b, BRACE_CLOSE);
    exit_section_(b, m, BINDING_FORM, r);
    return r;
  }

  /* ********************************************************** */
  // BITWISE_AND
  //                   | BITWISE_OR
  //                   | BITWISE_REVERSE
  //                   | BITWISE_SHIFT
  //                   | BITWISE_XOR
  public static boolean BitwiseOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitwiseOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITWISE_OPERATOR, "<bitwise operator>");
    r = consumeToken(b, BITWISE_AND);
    if (!r) r = consumeToken(b, BITWISE_OR);
    if (!r) r = consumeToken(b, BITWISE_REVERSE);
    if (!r) r = consumeToken(b, BITWISE_SHIFT);
    if (!r) r = consumeToken(b, BITWISE_XOR);
    exit_section_(b, l, m, r, false, null);
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
  // Expression+
  public static boolean BlockBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_BODY, "<block body>");
    r = Expression(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockBody", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRUE
  //           | FALSE
  public static boolean Boolean(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Boolean")) return false;
    if (!nextTokenIs(b, "<boolean>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN, "<boolean>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CapabilityForm
  public static boolean CapabilityExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapabilityExpression")) return false;
    if (!nextTokenIs(b, "<capability expression>", KEYWORD_CREATE_USER_GUARD, KEYWORD_WITH_CAPABILITY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, CAPABILITY_EXPRESSION, "<capability expression>");
    r = CapabilityForm(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_WITH_CAPABILITY Expression Block
  //                  | KEYWORD_CREATE_USER_GUARD "(" ParsedName AppList ")"
  public static boolean CapabilityForm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapabilityForm")) return false;
    if (!nextTokenIs(b, "<capability form>", KEYWORD_CREATE_USER_GUARD, KEYWORD_WITH_CAPABILITY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAPABILITY_FORM, "<capability form>");
    r = CapabilityForm_0(b, l + 1);
    if (!r) r = CapabilityForm_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_WITH_CAPABILITY Expression Block
  private static boolean CapabilityForm_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapabilityForm_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_WITH_CAPABILITY);
    r = r && Expression(b, l + 1);
    r = r && Block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEYWORD_CREATE_USER_GUARD "(" ParsedName AppList ")"
  private static boolean CapabilityForm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CapabilityForm_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_CREATE_USER_GUARD, PAREN_OPEN);
    r = r && ParsedName(b, l + 1);
    r = r && AppList(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // List
  //                     | Object
  public static boolean CompositeDataType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompositeDataType")) return false;
    if (!nextTokenIs(b, "<composite data type>", BRACE_OPEN, BRACKET_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOSITE_DATA_TYPE, "<composite data type>");
    r = List(b, l + 1);
    if (!r) r = Object(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CompositeDataType
  //            | AtomicDataType
  //            | "(" ")"
  public static boolean DataType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_TYPE, "<data type>");
    r = CompositeDataType(b, l + 1);
    if (!r) r = AtomicDataType(b, l + 1);
    if (!r) r = parseTokens(b, 0, PAREN_OPEN, PAREN_CLOSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" KEYWORD_DEF_CAP IDENTIFIER [MTypeAnn] "(" [MArgs] ")" [MDocOrModel] [MDCapMeta] Block ")"
  public static boolean DefCap(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefCap")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEF_CAP, null);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_DEF_CAP, IDENTIFIER);
    r = r && DefCap_3(b, l + 1);
    r = r && consumeToken(b, PAREN_OPEN);
    r = r && DefCap_5(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    r = r && DefCap_7(b, l + 1);
    r = r && DefCap_8(b, l + 1);
    r = r && Block(b, l + 1);
    p = r; // pin = 10
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [MTypeAnn]
  private static boolean DefCap_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefCap_3")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MArgs]
  private static boolean DefCap_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefCap_5")) return false;
    MArgs(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean DefCap_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefCap_7")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  // [MDCapMeta]
  private static boolean DefCap_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefCap_8")) return false;
    MDCapMeta(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "(" KEYWORD_DEF_CONST IDENTIFIER [MTypeAnn] Expression [MDoc] ")"
  public static boolean DefConst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefConst")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEF_CONST, null);
    r = consumeTokens(b, 2, PAREN_OPEN, KEYWORD_DEF_CONST, IDENTIFIER);
    p = r; // pin = 2
    r = r && report_error_(b, DefConst_3(b, l + 1));
    r = p && report_error_(b, Expression(b, l + 1)) && r;
    r = p && report_error_(b, DefConst_5(b, l + 1)) && r;
    r = p && consumeToken(b, PAREN_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [MTypeAnn]
  private static boolean DefConst_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefConst_3")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MDoc]
  private static boolean DefConst_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefConst_5")) return false;
    MDoc(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "(" KEYWORD_DEF_PACT IDENTIFIER [MTypeAnn] "(" MArgs ")" [MDocOrModel] Steps ")"
  public static boolean DefPact(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefPact")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEF_PACT, null);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_DEF_PACT, IDENTIFIER);
    r = r && DefPact_3(b, l + 1);
    r = r && consumeToken(b, PAREN_OPEN);
    r = r && MArgs(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    r = r && DefPact_7(b, l + 1);
    r = r && Steps(b, l + 1);
    p = r; // pin = 9
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [MTypeAnn]
  private static boolean DefPact_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefPact_3")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean DefPact_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefPact_7")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "(" KEYWORD_DEF_SCHEMA IDENTIFIER [MDocOrModel] SchemaArgumentList ")"
  public static boolean DefSchema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefSchema")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEF_SCHEMA, null);
    r = consumeTokens(b, 2, PAREN_OPEN, KEYWORD_DEF_SCHEMA, IDENTIFIER);
    p = r; // pin = 2
    r = r && report_error_(b, DefSchema_3(b, l + 1));
    r = p && report_error_(b, SchemaArgumentList(b, l + 1)) && r;
    r = p && consumeToken(b, PAREN_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [MDocOrModel]
  private static boolean DefSchema_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefSchema_3")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "(" KEYWORD_DEF_TABLE IDENTIFIER ":" "{" ParsedName "}" [MDoc] ")"
  public static boolean DefTable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefTable")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEF_TABLE, null);
    r = consumeTokens(b, 2, PAREN_OPEN, KEYWORD_DEF_TABLE, IDENTIFIER, COLON, BRACE_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, ParsedName(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_CLOSE)) && r;
    r = p && report_error_(b, DefTable_7(b, l + 1)) && r;
    r = p && consumeToken(b, PAREN_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [MDoc]
  private static boolean DefTable_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefTable_7")) return false;
    MDoc(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DefCap
  //                      | DefConst
  //                      | DefPact
  //                      | DefSchema
  //                      | DefTable
  //                      | Defun
  static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    r = DefCap(b, l + 1);
    if (!r) r = DefConst(b, l + 1);
    if (!r) r = DefPact(b, l + 1);
    if (!r) r = DefSchema(b, l + 1);
    if (!r) r = DefTable(b, l + 1);
    if (!r) r = Defun(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "(" KEYWORD_DEFUN IDENTIFIER [MTypeAnn] "(" [MArgs] ")" [MDocOrModel] Block ")"
  public static boolean Defun(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defun")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEFUN, null);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_DEFUN, IDENTIFIER);
    r = r && Defun_3(b, l + 1);
    r = r && consumeToken(b, PAREN_OPEN);
    r = r && Defun_5(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    r = r && Defun_7(b, l + 1);
    r = r && Block(b, l + 1);
    p = r; // pin = 9
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [MTypeAnn]
  private static boolean Defun_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defun_3")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MArgs]
  private static boolean Defun_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defun_5")) return false;
    MArgs(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean Defun_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Defun_7")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_DOC_ANNOTATION STR
  public static boolean DocumentationAnnotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DocumentationAnnotation")) return false;
    if (!nextTokenIs(b, KEYWORD_DOC_ANNOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_DOC_ANNOTATION, STR);
    exit_section_(b, m, DOCUMENTATION_ANNOTATION, r);
    return r;
  }

  /* ********************************************************** */
  // STR
  public static boolean DocumentationString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DocumentationString")) return false;
    if (!nextTokenIs(b, STR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STR);
    exit_section_(b, m, DOCUMENTATION_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_EVENT_ANNOTATION
  public static boolean EventAnnotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EventAnnotation")) return false;
    if (!nextTokenIs(b, KEYWORD_EVENT_ANNOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_EVENT_ANNOTATION);
    exit_section_(b, m, EVENT_ANNOTATION, r);
    return r;
  }

  /* ********************************************************** */
  // "(" SymbolicExpression ")"
  //              | Variable
  //              | DataType
  //              | Operator
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = Expression_0(b, l + 1);
    if (!r) r = Variable(b, l + 1);
    if (!r) r = DataType(b, l + 1);
    if (!r) r = Operator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" SymbolicExpression ")"
  private static boolean Expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAREN_OPEN);
    r = r && SymbolicExpression(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression ("," Expression) *
  public static boolean ExpressionCommaSep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionCommaSep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_COMMA_SEP, "<expression comma sep>");
    r = Expression(b, l + 1);
    r = r && ExpressionCommaSep_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," Expression) *
  private static boolean ExpressionCommaSep_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionCommaSep_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExpressionCommaSep_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExpressionCommaSep_1", c)) break;
    }
    return true;
  }

  // "," Expression
  private static boolean ExpressionCommaSep_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionCommaSep_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Use
  //             | "(" KEYWORD_IMPLEMENTS ModuleQualifier ")"
  //             | "(" KEYWORD_BLESS String ")"
  public static boolean Extension(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Extension")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Use(b, l + 1);
    if (!r) r = Extension_1(b, l + 1);
    if (!r) r = Extension_2(b, l + 1);
    exit_section_(b, m, EXTENSION, r);
    return r;
  }

  // "(" KEYWORD_IMPLEMENTS ModuleQualifier ")"
  private static boolean Extension_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Extension_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_IMPLEMENTS);
    r = r && ModuleQualifier(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" KEYWORD_BLESS String ")"
  private static boolean Extension_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Extension_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_BLESS);
    r = r && String(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{"
  //           | "}"
  //           | ":"
  //           | ","
  public static boolean FVDelim(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVDelim")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FV_DELIM, "<fv delim>");
    r = consumeToken(b, BRACE_OPEN);
    if (!r) r = consumeToken(b, BRACE_CLOSE);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, COMMA);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_LET
  //             | KEYWORD_LAMBDA
  //             | KEYWORD_IF
  //             | KEYWORD_BLOCK_INTRO
  //             | KEYWORD_SUSPEND
  //             | KEYWORD_TRY
  //             | KEYWORD_ENFORCE
  //             | KEYWORD_ENFORCE_ONE
  //             | AND
  //             | OR
  //             | KEYWORD_CREATE_USER_GUARD
  //             | KEYWORD_WITH_CAPABILITY
  //             | KEYWORD_DEF_PROPERTY
  //             | KEYWORD_INVARIANT
  //             | KEYWORD_PROPERTY
  public static boolean FVKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FVKeyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FV_KEYWORD, "<fv keyword>");
    r = consumeToken(b, KEYWORD_LET);
    if (!r) r = consumeToken(b, KEYWORD_LAMBDA);
    if (!r) r = consumeToken(b, KEYWORD_IF);
    if (!r) r = consumeToken(b, KEYWORD_BLOCK_INTRO);
    if (!r) r = consumeToken(b, KEYWORD_SUSPEND);
    if (!r) r = consumeToken(b, KEYWORD_TRY);
    if (!r) r = consumeToken(b, KEYWORD_ENFORCE);
    if (!r) r = consumeToken(b, KEYWORD_ENFORCE_ONE);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, KEYWORD_CREATE_USER_GUARD);
    if (!r) r = consumeToken(b, KEYWORD_WITH_CAPABILITY);
    if (!r) r = consumeToken(b, KEYWORD_DEF_PROPERTY);
    if (!r) r = consumeToken(b, KEYWORD_INVARIANT);
    if (!r) r = consumeToken(b, KEYWORD_PROPERTY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STR ":" Expression
  //             | TICK ":" Expression
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

  // STR ":" Expression
  private static boolean FieldPair_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldPair_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STR, COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TICK ":" Expression
  private static boolean FieldPair_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldPair_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TICK, COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression AppBindList
  public static boolean GenericExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, GENERIC_EXPRESSION, "<generic expression>");
    r = Expression(b, l + 1);
    r = r && AppBindList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // String
  //                      | IDENTIFIER
  static boolean Governance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Governance")) return false;
    boolean r;
    r = String(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // "(" KEYWORD_DEF_CAP IDENTIFIER [MTypeAnn] "(" MArgs ")" [MDocOrModel] [MDCapMeta] ")"
  public static boolean IfDefCap(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefCap")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_DEF_CAP, IDENTIFIER);
    r = r && IfDefCap_3(b, l + 1);
    r = r && consumeToken(b, PAREN_OPEN);
    r = r && MArgs(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    r = r && IfDefCap_7(b, l + 1);
    r = r && IfDefCap_8(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, IF_DEF_CAP, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean IfDefCap_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefCap_3")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean IfDefCap_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefCap_7")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  // [MDCapMeta]
  private static boolean IfDefCap_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefCap_8")) return false;
    MDCapMeta(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "(" KEYWORD_DEF_PACT IDENTIFIER [MTypeAnn] "(" MArgs ")" [MDocOrModel] ")"
  public static boolean IfDefPact(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefPact")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_DEF_PACT, IDENTIFIER);
    r = r && IfDefPact_3(b, l + 1);
    r = r && consumeToken(b, PAREN_OPEN);
    r = r && MArgs(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    r = r && IfDefPact_7(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, IF_DEF_PACT, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean IfDefPact_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefPact_3")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean IfDefPact_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefPact_7")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "(" KEYWORD_DEFUN IDENTIFIER [MTypeAnn] "(" MArgs ")" [MDocOrModel] ")"
  public static boolean IfDefun(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefun")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_DEFUN, IDENTIFIER);
    r = r && IfDefun_3(b, l + 1);
    r = r && consumeToken(b, PAREN_OPEN);
    r = r && MArgs(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    r = r && IfDefun_7(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, IF_DEFUN, r);
    return r;
  }

  // [MTypeAnn]
  private static boolean IfDefun_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefun_3")) return false;
    MTypeAnn(b, l + 1);
    return true;
  }

  // [MDocOrModel]
  private static boolean IfDefun_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfDefun_7")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_IF Expression Expression Expression
  public static boolean IfExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfExpression")) return false;
    if (!nextTokenIs(b, KEYWORD_IF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, IF_EXPRESSION, null);
    r = consumeToken(b, KEYWORD_IF);
    r = r && Expression(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "[" [IDENTIFIER+] "]"
  public static boolean ImportList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList")) return false;
    if (!nextTokenIs(b, BRACKET_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_OPEN);
    r = r && ImportList_1(b, l + 1);
    r = r && consumeToken(b, BRACKET_CLOSE);
    exit_section_(b, m, IMPORT_LIST, r);
    return r;
  }

  // [IDENTIFIER+]
  private static boolean ImportList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList_1")) return false;
    ImportList_1_0(b, l + 1);
    return true;
  }

  // IDENTIFIER+
  private static boolean ImportList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "ImportList_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" KEYWORD_INTERFACE IDENTIFIER [MDocOrModel] (InterfaceDefinition | Use)+ ")"
  public static boolean Interface(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interface")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_INTERFACE, IDENTIFIER);
    r = r && Interface_3(b, l + 1);
    r = r && Interface_4(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, INTERFACE, r);
    return r;
  }

  // [MDocOrModel]
  private static boolean Interface_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interface_3")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  // (InterfaceDefinition | Use)+
  private static boolean Interface_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interface_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Interface_4_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Interface_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Interface_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // InterfaceDefinition | Use
  private static boolean Interface_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interface_4_0")) return false;
    boolean r;
    r = InterfaceDefinition(b, l + 1);
    if (!r) r = Use(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IfDefCap
  //                               | DefConst
  //                               | IfDefPact
  //                               | DefSchema
  //                               | IfDefun
  static boolean InterfaceDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDefinition")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    r = IfDefCap(b, l + 1);
    if (!r) r = DefConst(b, l + 1);
    if (!r) r = IfDefPact(b, l + 1);
    if (!r) r = DefSchema(b, l + 1);
    if (!r) r = IfDefun(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (":" TypeDeclaration)?
  public static boolean LambdaArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaArgument")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && LambdaArgument_1(b, l + 1);
    exit_section_(b, m, LAMBDA_ARGUMENT, r);
    return r;
  }

  // (":" TypeDeclaration)?
  private static boolean LambdaArgument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaArgument_1")) return false;
    LambdaArgument_1_0(b, l + 1);
    return true;
  }

  // ":" TypeDeclaration
  private static boolean LambdaArgument_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaArgument_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LambdaArgument (LambdaArgument)*
  public static boolean LambdaArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaArguments")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LambdaArgument(b, l + 1);
    r = r && LambdaArguments_1(b, l + 1);
    exit_section_(b, m, LAMBDA_ARGUMENTS, r);
    return r;
  }

  // (LambdaArgument)*
  private static boolean LambdaArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaArguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LambdaArguments_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LambdaArguments_1", c)) break;
    }
    return true;
  }

  // (LambdaArgument)
  private static boolean LambdaArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LambdaArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_LAMBDA "(" LambdaArguments ")" Block
  public static boolean LambdaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression")) return false;
    if (!nextTokenIs(b, KEYWORD_LAMBDA)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, LAMBDA_EXPRESSION, null);
    r = consumeTokens(b, 0, KEYWORD_LAMBDA, PAREN_OPEN);
    r = r && LambdaArguments(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    r = r && Block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_LET "(" Binders ")" Block
  public static boolean LetExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpression")) return false;
    if (!nextTokenIs(b, KEYWORD_LET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, LET_EXPRESSION, null);
    r = consumeTokens(b, 0, KEYWORD_LET, PAREN_OPEN);
    r = r && Binders(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    r = r && Block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "[" [ListExpression] "]"
  public static boolean List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "List")) return false;
    if (!nextTokenIs(b, BRACKET_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_OPEN);
    r = r && List_1(b, l + 1);
    r = r && consumeToken(b, BRACKET_CLOSE);
    exit_section_(b, m, LIST, r);
    return r;
  }

  // [ListExpression]
  private static boolean List_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "List_1")) return false;
    ListExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Expression MCommaExpression?
  public static boolean ListExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_EXPRESSION, "<list expression>");
    r = Expression(b, l + 1);
    r = r && ListExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MCommaExpression?
  private static boolean ListExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListExpression_1")) return false;
    MCommaExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AND
  //                   | AND_SHORT_CIRCUIT
  //                   | NOT
  //                   | NOT_SHORT_CIRCUIT
  //                   | OR
  //                   | OR_SHORT_CIRCUIT
  public static boolean LogicalOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_OPERATOR, "<logical operator>");
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, AND_SHORT_CIRCUIT);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, NOT_SHORT_CIRCUIT);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, OR_SHORT_CIRCUIT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ":" TypeDeclaration
  //        | IDENTIFIER
  public static boolean MArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MArg")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MArg_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, M_ARG, r);
    return r;
  }

  // IDENTIFIER ":" TypeDeclaration
  private static boolean MArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MArg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && TypeDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MArg*
  public static boolean MArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MArgs")) return false;
    Marker m = enter_section_(b, l, _NONE_, M_ARGS, "<m args>");
    while (true) {
      int c = current_position_(b);
      if (!MArg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MArgs", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // "," ExpressionCommaSep
  //                    | AppList
  public static boolean MCommaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MCommaExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_COMMA_EXPRESSION, "<m comma expression>");
    r = MCommaExpression_0(b, l + 1);
    if (!r) r = AppList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "," ExpressionCommaSep
  private static boolean MCommaExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MCommaExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ExpressionCommaSep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ManagedAnnotation
  //             | EventAnnotation
  public static boolean MDCapMeta(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDCapMeta")) return false;
    if (!nextTokenIs(b, "<md cap meta>", KEYWORD_EVENT_ANNOTATION, KEYWORD_MANAGED_ANNOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MD_CAP_META, "<md cap meta>");
    r = ManagedAnnotation(b, l + 1);
    if (!r) r = EventAnnotation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DocumentationAnnotation
  //        | DocumentationString
  public static boolean MDoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDoc")) return false;
    if (!nextTokenIs(b, "<m doc>", KEYWORD_DOC_ANNOTATION, STR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, M_DOC, "<m doc>");
    r = DocumentationAnnotation(b, l + 1);
    if (!r) r = DocumentationString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DocumentationAnnotation ModelAnnotation
  //                       | ModelAnnotation DocumentationAnnotation
  //                       | DocumentationAnnotation
  //                       | ModelAnnotation
  //                       | DocumentationString
  static boolean MDocOrModel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDocOrModel")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MDocOrModel_0(b, l + 1);
    if (!r) r = MDocOrModel_1(b, l + 1);
    if (!r) r = DocumentationAnnotation(b, l + 1);
    if (!r) r = ModelAnnotation(b, l + 1);
    if (!r) r = DocumentationString(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DocumentationAnnotation ModelAnnotation
  private static boolean MDocOrModel_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDocOrModel_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DocumentationAnnotation(b, l + 1);
    r = r && ModelAnnotation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ModelAnnotation DocumentationAnnotation
  private static boolean MDocOrModel_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MDocOrModel_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModelAnnotation(b, l + 1);
    r = r && DocumentationAnnotation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ModelAnnotation
  public static boolean MModel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MModel")) return false;
    if (!nextTokenIs(b, KEYWORD_MODEL_ANNOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModelAnnotation(b, l + 1);
    exit_section_(b, m, M_MODEL, r);
    return r;
  }

  /* ********************************************************** */
  // ":" TypeDeclaration
  public static boolean MTypeAnn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MTypeAnn")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeDeclaration(b, l + 1);
    exit_section_(b, m, M_TYPE_ANN, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_MANAGED_ANNOTATION (IDENTIFIER ParsedName)*
  public static boolean ManagedAnnotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ManagedAnnotation")) return false;
    if (!nextTokenIs(b, KEYWORD_MANAGED_ANNOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_MANAGED_ANNOTATION);
    r = r && ManagedAnnotation_1(b, l + 1);
    exit_section_(b, m, MANAGED_ANNOTATION, r);
    return r;
  }

  // (IDENTIFIER ParsedName)*
  private static boolean ManagedAnnotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ManagedAnnotation_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ManagedAnnotation_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ManagedAnnotation_1", c)) break;
    }
    return true;
  }

  // IDENTIFIER ParsedName
  private static boolean ManagedAnnotation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ManagedAnnotation_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && ParsedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_MODEL_ANNOTATION "[" PactFVModels "]"
  public static boolean ModelAnnotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelAnnotation")) return false;
    if (!nextTokenIs(b, KEYWORD_MODEL_ANNOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_MODEL_ANNOTATION, BRACKET_OPEN);
    r = r && PactFVModels(b, l + 1);
    r = r && consumeToken(b, BRACKET_CLOSE);
    exit_section_(b, m, MODEL_ANNOTATION, r);
    return r;
  }

  /* ********************************************************** */
  // "(" KEYWORD_MODULE IDENTIFIER Governance [MDocOrModel] (Definition | Extension)+ ")"
  public static boolean Module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_MODULE, IDENTIFIER);
    r = r && Governance(b, l + 1);
    r = r && Module_4(b, l + 1);
    r = r && Module_5(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, MODULE, r);
    return r;
  }

  // [MDocOrModel]
  private static boolean Module_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module_4")) return false;
    MDocOrModel(b, l + 1);
    return true;
  }

  // (Definition | Extension)+
  private static boolean Module_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Module_5_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Module_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Module_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Definition | Extension
  private static boolean Module_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module_5_0")) return false;
    boolean r;
    r = Definition(b, l + 1);
    if (!r) r = Extension(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ModuleQualifier ("," ModuleQualifier)*
  public static boolean ModuleNames(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleNames")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleQualifier(b, l + 1);
    r = r && ModuleNames_1(b, l + 1);
    exit_section_(b, m, MODULE_NAMES, r);
    return r;
  }

  // ("," ModuleQualifier)*
  private static boolean ModuleNames_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleNames_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ModuleNames_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModuleNames_1", c)) break;
    }
    return true;
  }

  // "," ModuleQualifier
  private static boolean ModuleNames_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleNames_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ModuleQualifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER "." IDENTIFIER
  //                   | IDENTIFIER
  public static boolean ModuleQualifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleQualifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, IDENTIFIER, DOT, IDENTIFIER);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, MODULE_QUALIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // FLOATING_POINT
  //          | INTEGER
  public static boolean Number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Number")) return false;
    if (!nextTokenIs(b, "<number>", FLOATING_POINT, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER, "<number>");
    r = consumeToken(b, FLOATING_POINT);
    if (!r) r = consumeToken(b, INTEGER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "{" ObjectBody? "}"
  public static boolean Object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Object")) return false;
    if (!nextTokenIs(b, BRACE_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_OPEN);
    r = r && Object_1(b, l + 1);
    r = r && consumeToken(b, BRACE_CLOSE);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  // ObjectBody?
  private static boolean Object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Object_1")) return false;
    ObjectBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FieldPair ("," FieldPair)*
  public static boolean ObjectBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectBody")) return false;
    if (!nextTokenIs(b, "<object body>", STR, TICK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_BODY, "<object body>");
    r = FieldPair(b, l + 1);
    r = r && ObjectBody_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," FieldPair)*
  private static boolean ObjectBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectBody_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectBody_1", c)) break;
    }
    return true;
  }

  // "," FieldPair
  private static boolean ObjectBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectBody_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FieldPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ArithmeticOperator
  //            | AssignmentOperator
  //            | LogicalOperator
  //            | RelationalOperator
  //            | BitwiseOperator
  //            | KEYWORD_ENFORCE
  //            | KEYWORD_ENFORCE_ONE
  public static boolean Operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = ArithmeticOperator(b, l + 1);
    if (!r) r = AssignmentOperator(b, l + 1);
    if (!r) r = LogicalOperator(b, l + 1);
    if (!r) r = RelationalOperator(b, l + 1);
    if (!r) r = BitwiseOperator(b, l + 1);
    if (!r) r = consumeToken(b, KEYWORD_ENFORCE);
    if (!r) r = consumeToken(b, KEYWORD_ENFORCE_ONE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PropExpressionList
  public static boolean PactFVModels(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PactFVModels")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACT_FV_MODELS, "<pact fv models>");
    r = PropExpressionList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER "." ModuleQualifier
  //              | IDENTIFIER "::" IDENTIFIER
  //              | IDENTIFIER
  public static boolean ParsedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParsedName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParsedName_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, IDENTIFIER, DYN_ACC, IDENTIFIER);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARSED_NAME, r);
    return r;
  }

  // IDENTIFIER "." ModuleQualifier
  private static boolean ParsedName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParsedName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, DOT);
    r = r && ModuleQualifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER "." ModuleQualifier
  //                  | IDENTIFIER
  public static boolean ParsedTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParsedTypeName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParsedTypeName_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARSED_TYPE_NAME, r);
    return r;
  }

  // IDENTIFIER "." ModuleQualifier
  private static boolean ParsedTypeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParsedTypeName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, DOT);
    r = r && ModuleQualifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_BLOCK_INTRO BlockBody
  public static boolean ProgNExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgNExpression")) return false;
    if (!nextTokenIs(b, KEYWORD_BLOCK_INTRO)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, PROG_N_EXPRESSION, null);
    r = consumeToken(b, KEYWORD_BLOCK_INTRO);
    r = r && BlockBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> ReplProgramList
  //           | !<<eof>> ProgramList
  static boolean Program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Program_0(b, l + 1);
    if (!r) r = Program_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>> ReplProgramList
  private static boolean Program_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Program_0_0(b, l + 1);
    r = r && ReplProgramList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean Program_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !<<eof>> ProgramList
  private static boolean Program_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Program_1_0(b, l + 1);
    r = r && ProgramList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean Program_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // Variable
  //            | Number
  //            | String
  //            | FVKeyword
  //            | FVDelim
  //            | Boolean
  //            | Operator
  public static boolean PropAtom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropAtom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROP_ATOM, "<prop atom>");
    r = Variable(b, l + 1);
    if (!r) r = Number(b, l + 1);
    if (!r) r = String(b, l + 1);
    if (!r) r = FVKeyword(b, l + 1);
    if (!r) r = FVDelim(b, l + 1);
    if (!r) r = Boolean(b, l + 1);
    if (!r) r = Operator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PropAtom
  //                  | "(" PropExpressionList ")"
  //                  | "[" PropExpressionList "]"
  public static boolean PropExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROP_EXPRESSION, "<prop expression>");
    r = PropAtom(b, l + 1);
    if (!r) r = PropExpression_1(b, l + 1);
    if (!r) r = PropExpression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" PropExpressionList ")"
  private static boolean PropExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAREN_OPEN);
    r = r && PropExpressionList(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // "[" PropExpressionList "]"
  private static boolean PropExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_OPEN);
    r = r && PropExpressionList(b, l + 1);
    r = r && consumeToken(b, BRACKET_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PropExpression*
  public static boolean PropExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropExpressionList")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROP_EXPRESSION_LIST, "<prop expression list>");
    while (true) {
      int c = current_position_(b);
      if (!PropExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PropExpressionList", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // EQUAL
  //                      | NOT_EQUAL
  //                      | LESS_THAN
  //                      | LESS_THAN_OR_EQUAL
  //                      | GREATER_THAN
  //                      | GREATER_THAN_OR_EQUAL
  public static boolean RelationalOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_OPERATOR, "<relational operator>");
    r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, NOT_EQUAL);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, LESS_THAN_OR_EQUAL);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, GREATER_THAN_OR_EQUAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ReplTopLevel+
  public static boolean ReplProgramList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplProgramList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REPL_PROGRAM_LIST, "<repl program list>");
    r = ReplTopLevel(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ReplTopLevel(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReplProgramList", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" KEYWORD_LOAD STR Boolean? ")"
  public static boolean ReplSpecial(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplSpecial")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_LOAD, STR);
    r = r && ReplSpecial_3(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, REPL_SPECIAL, r);
    return r;
  }

  // Boolean?
  private static boolean ReplSpecial_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplSpecial_3")) return false;
    Boolean(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ReplSpecial
  //                        | Defun
  //                        | DefConst
  //                        | TopLevel
  static boolean ReplTopLevel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplTopLevel")) return false;
    boolean r;
    r = ReplSpecial(b, l + 1);
    if (!r) r = Defun(b, l + 1);
    if (!r) r = DefConst(b, l + 1);
    if (!r) r = TopLevel(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (":" TypeDeclaration)?
  public static boolean SchemaArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArgument")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && SchemaArgument_1(b, l + 1);
    exit_section_(b, m, SCHEMA_ARGUMENT, r);
    return r;
  }

  // (":" TypeDeclaration)?
  private static boolean SchemaArgument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArgument_1")) return false;
    SchemaArgument_1_0(b, l + 1);
    return true;
  }

  // ":" TypeDeclaration
  private static boolean SchemaArgument_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArgument_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SchemaArgument (SchemaArgument) *
  public static boolean SchemaArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArgumentList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SchemaArgument(b, l + 1);
    r = r && SchemaArgumentList_1(b, l + 1);
    exit_section_(b, m, SCHEMA_ARGUMENT_LIST, r);
    return r;
  }

  // (SchemaArgument) *
  private static boolean SchemaArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArgumentList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SchemaArgumentList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SchemaArgumentList_1", c)) break;
    }
    return true;
  }

  // (SchemaArgument)
  private static boolean SchemaArgumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SchemaArgumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SchemaArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" KEYWORD_STEP Expression [MModel] ")"
  //        | "(" KEYWORD_STEP Expression Expression [MModel] ")"
  //        | "(" KEYWORD_STEP_WITH_ROLLBACK Expression Expression [MModel] ")"
  //        | "(" KEYWORD_STEP_WITH_ROLLBACK Expression Expression Expression [MModel] ")"
  public static boolean Step(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Step_0(b, l + 1);
    if (!r) r = Step_1(b, l + 1);
    if (!r) r = Step_2(b, l + 1);
    if (!r) r = Step_3(b, l + 1);
    exit_section_(b, m, STEP, r);
    return r;
  }

  // "(" KEYWORD_STEP Expression [MModel] ")"
  private static boolean Step_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_STEP);
    r = r && Expression(b, l + 1);
    r = r && Step_0_3(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MModel]
  private static boolean Step_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_0_3")) return false;
    MModel(b, l + 1);
    return true;
  }

  // "(" KEYWORD_STEP Expression Expression [MModel] ")"
  private static boolean Step_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_STEP);
    r = r && Expression(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && Step_1_4(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MModel]
  private static boolean Step_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_1_4")) return false;
    MModel(b, l + 1);
    return true;
  }

  // "(" KEYWORD_STEP_WITH_ROLLBACK Expression Expression [MModel] ")"
  private static boolean Step_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_STEP_WITH_ROLLBACK);
    r = r && Expression(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && Step_2_4(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MModel]
  private static boolean Step_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_2_4")) return false;
    MModel(b, l + 1);
    return true;
  }

  // "(" KEYWORD_STEP_WITH_ROLLBACK Expression Expression Expression [MModel] ")"
  private static boolean Step_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Step_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_STEP_WITH_ROLLBACK);
    r = r && Expression(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && Step_3_5(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
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
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
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
  //          | TICK
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
  // KEYWORD_SUSPEND Expression
  public static boolean SuspendExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuspendExpression")) return false;
    if (!nextTokenIs(b, KEYWORD_SUSPEND)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, SUSPEND_EXPRESSION, null);
    r = consumeToken(b, KEYWORD_SUSPEND);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LambdaExpression
  //                                    | LetExpression
  //                                    | IfExpression
  //                                    | TryExpression
  //                                    | SuspendExpression
  //                                    | ProgNExpression
  //                                    | CapabilityExpression
  //                                    | GenericExpression
  static boolean SymbolicExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicExpression")) return false;
    boolean r;
    r = LambdaExpression(b, l + 1);
    if (!r) r = LetExpression(b, l + 1);
    if (!r) r = IfExpression(b, l + 1);
    if (!r) r = TryExpression(b, l + 1);
    if (!r) r = SuspendExpression(b, l + 1);
    if (!r) r = ProgNExpression(b, l + 1);
    if (!r) r = CapabilityExpression(b, l + 1);
    if (!r) r = GenericExpression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Module
  //                    | Interface
  //                    | Use
  //                    | Expression
  static boolean TopLevel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevel")) return false;
    boolean r;
    r = Module(b, l + 1);
    if (!r) r = Interface(b, l + 1);
    if (!r) r = Use(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_TRY Expression Expression
  public static boolean TryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryExpression")) return false;
    if (!nextTokenIs(b, KEYWORD_TRY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, TRY_EXPRESSION, null);
    r = consumeToken(b, KEYWORD_TRY);
    r = r && Expression(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "[" TypeDeclaration "]"
  //                   | "module" "{" ModuleNames "}"
  //                   | IDENTIFIER "{" ParsedTypeName "}"
  //                   | IDENTIFIER
  public static boolean TypeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION, "<type declaration>");
    r = TypeDeclaration_0(b, l + 1);
    if (!r) r = TypeDeclaration_1(b, l + 1);
    if (!r) r = TypeDeclaration_2(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "[" TypeDeclaration "]"
  private static boolean TypeDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_OPEN);
    r = r && TypeDeclaration(b, l + 1);
    r = r && consumeToken(b, BRACKET_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // "module" "{" ModuleNames "}"
  private static boolean TypeDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_MODULE, BRACE_OPEN);
    r = r && ModuleNames(b, l + 1);
    r = r && consumeToken(b, BRACE_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER "{" ParsedTypeName "}"
  private static boolean TypeDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, BRACE_OPEN);
    r = r && ParsedTypeName(b, l + 1);
    r = r && consumeToken(b, BRACE_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" KEYWORD_IMPORT ModuleQualifier STR? ImportList? ")"
  public static boolean Use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Use")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PAREN_OPEN, KEYWORD_IMPORT);
    r = r && ModuleQualifier(b, l + 1);
    r = r && Use_3(b, l + 1);
    r = r && Use_4(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, USE, r);
    return r;
  }

  // STR?
  private static boolean Use_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Use_3")) return false;
    consumeToken(b, STR);
    return true;
  }

  // ImportList?
  private static boolean Use_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Use_4")) return false;
    ImportList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER "." ModuleQualifier
  //            | IDENTIFIER "::" IDENTIFIER
  //            | IDENTIFIER
  public static boolean Variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Variable")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Variable_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, IDENTIFIER, DYN_ACC, IDENTIFIER);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, VARIABLE, r);
    return r;
  }

  // IDENTIFIER "." ModuleQualifier
  private static boolean Variable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Variable_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, DOT);
    r = r && ModuleQualifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
