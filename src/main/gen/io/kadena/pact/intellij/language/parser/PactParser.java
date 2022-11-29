// This is a generated file. Not intended for manual editing.
package io.kadena.pact.intellij.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.kadena.pact.intellij.language.psi.PactTypes.*;
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
    return program(b, l + 1);
  }

  /* ********************************************************** */
  // uc_letter | lc_letter | number
  public static boolean alphanumeric(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alphanumeric")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALPHANUMERIC, "<alphanumeric>");
    r = uc_letter(b, l + 1);
    if (!r) r = lc_letter(b, l + 1);
    if (!r) r = number(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ident [colon ident]
  public static boolean arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = ident(b, l + 1);
    r = r && arg_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [colon ident]
  private static boolean arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_1")) return false;
    arg_1_0(b, l + 1);
    return true;
  }

  // colon ident
  private static boolean arg_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = colon(b, l + 1);
    r = r && ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // { arg }
  public static boolean arg_rest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_rest")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG_REST, "<arg rest>");
    r = arg(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_ann | let_bind | let_star_bind | atom2
  public static boolean atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM, "<atom>");
    r = type_ann(b, l + 1);
    if (!r) r = let_bind(b, l + 1);
    if (!r) r = let_star_bind(b, l + 1);
    if (!r) r = atom2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ident | lit | op
  public static boolean atom2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM_2, "<atom 2>");
    r = ident(b, l + 1);
    if (!r) r = lit(b, l + 1);
    if (!r) r = op(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'bless'
  public static boolean bless(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bless")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLESS, "<bless>");
    r = consumeToken(b, "bless");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // bless hash
  public static boolean bless_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bless_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLESS_DECL, "<bless decl>");
    r = bless(b, l + 1);
    r = r && hash(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'true' | 'false'
  public static boolean bool(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL, "<bool>");
    r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ':'
  public static boolean colon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLON, "<colon>");
    r = consumeToken(b, ":");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ','
  public static boolean comma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMA, "<comma>");
    r = consumeToken(b, ",");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr comma_delimited_rest | ε
  public static boolean comma_delimited_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_delimited_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMA_DELIMITED_LIST, "<comma delimited list>");
    r = comma_delimited_list_0(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr comma_delimited_rest
  private static boolean comma_delimited_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_delimited_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && comma_delimited_rest(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // comma expr | ε
  public static boolean comma_delimited_rest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_delimited_rest")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMA_DELIMITED_REST, "<comma delimited rest>");
    r = comma_delimited_rest_0(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // comma expr
  private static boolean comma_delimited_rest_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_delimited_rest_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ sub ] numbers dot numbers
  public static boolean decimal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECIMAL, "<decimal>");
    r = decimal_0(b, l + 1);
    r = r && numbers(b, l + 1);
    r = r && dot(b, l + 1);
    r = r && numbers(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ sub ]
  private static boolean decimal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_0")) return false;
    sub(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // defun_decl | defconst_decl | defcap_decl | defpact_decl | defschema_decl |
  //            deftable_decl | bless_decl
  public static boolean decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL, "<decl>");
    r = defun_decl(b, l + 1);
    if (!r) r = defconst_decl(b, l + 1);
    if (!r) r = defcap_decl(b, l + 1);
    if (!r) r = defpact_decl(b, l + 1);
    if (!r) r = defschema_decl(b, l + 1);
    if (!r) r = deftable_decl(b, l + 1);
    if (!r) r = bless_decl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // imports decls
  public static boolean decl_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_LIST, "<decl list>");
    r = imports(b, l + 1);
    r = r && decls(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lparen decl rparen { lparen decl rparen }
  public static boolean decls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decls")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLS, "<decls>");
    r = lparen(b, l + 1);
    r = r && decl(b, l + 1);
    r = r && rparen(b, l + 1);
    r = r && decls_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lparen decl rparen
  private static boolean decls_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decls_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lparen(b, l + 1);
    r = r && decl(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'defcap'
  public static boolean defcap(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defcap")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFCAP, "<defcap>");
    r = consumeToken(b, "defcap");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // defcap ident lparen fun_args rparen doc_or_meta expr
  public static boolean defcap_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defcap_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFCAP_DECL, "<defcap decl>");
    r = defcap(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && lparen(b, l + 1);
    r = r && fun_args(b, l + 1);
    r = r && rparen(b, l + 1);
    r = r && doc_or_meta(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'defconst'
  public static boolean defconst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defconst")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFCONST, "<defconst>");
    r = consumeToken(b, "defconst");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // defconst ident expr
  public static boolean defconst_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defconst_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFCONST_DECL, "<defconst decl>");
    r = defconst(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'defpact'
  public static boolean defpact(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defpact")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFPACT, "<defpact>");
    r = consumeToken(b, "defpact");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // defpact ident lparen fun_args rparen doc_or_meta { step_decl }
  public static boolean defpact_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defpact_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFPACT_DECL, "<defpact decl>");
    r = defpact(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && lparen(b, l + 1);
    r = r && fun_args(b, l + 1);
    r = r && rparen(b, l + 1);
    r = r && doc_or_meta(b, l + 1);
    r = r && defpact_decl_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { step_decl }
  private static boolean defpact_decl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defpact_decl_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = step_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'defschema'
  public static boolean defschema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defschema")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFSCHEMA, "<defschema>");
    r = consumeToken(b, "defschema");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // defschema ident doc_or_meta fields
  public static boolean defschema_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defschema_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFSCHEMA_DECL, "<defschema decl>");
    r = defschema(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && doc_or_meta(b, l + 1);
    r = r && fields(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'deftable'
  public static boolean deftable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deftable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFTABLE, "<deftable>");
    r = consumeToken(b, "deftable");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // deftable ident [colon ident] doc_or_meta
  public static boolean deftable_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deftable_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFTABLE_DECL, "<deftable decl>");
    r = deftable(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && deftable_decl_2(b, l + 1);
    r = r && doc_or_meta(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [colon ident]
  private static boolean deftable_decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deftable_decl_2")) return false;
    deftable_decl_2_0(b, l + 1);
    return true;
  }

  // colon ident
  private static boolean deftable_decl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deftable_decl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = colon(b, l + 1);
    r = r && ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'defun'
  public static boolean defun(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFUN, "<defun>");
    r = consumeToken(b, "defun");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // defun lparen fun_args rparen doc_or_meta expr
  public static boolean defun_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFUN_DECL, "<defun decl>");
    r = defun(b, l + 1);
    r = r && lparen(b, l + 1);
    r = r && fun_args(b, l + 1);
    r = r && rparen(b, l + 1);
    r = r && doc_or_meta(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // defun lparen fun_args rparen doc_or_meta
  public static boolean defun_sig(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_sig")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFUN_SIG, "<defun sig>");
    r = defun(b, l + 1);
    r = r && lparen(b, l + 1);
    r = r && fun_args(b, l + 1);
    r = r && rparen(b, l + 1);
    r = r && doc_or_meta(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@doc' string
  public static boolean doc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doc")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOC, "<doc>");
    r = consumeToken(b, "@doc");
    r = r && string(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // doc mta | mta | ε
  public static boolean doc_or_meta(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doc_or_meta")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOC_OR_META, "<doc or meta>");
    r = doc_or_meta_0(b, l + 1);
    if (!r) r = mta(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // doc mta
  private static boolean doc_or_meta_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doc_or_meta_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = doc(b, l + 1);
    r = r && mta(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '.'
  public static boolean dot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOT, "<dot>");
    r = consumeToken(b, ".");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ';;'
  public static boolean double_semicolon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "double_semicolon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOUBLE_SEMICOLON, "<double semicolon>");
    r = consumeToken(b, ";;");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lparen ne_expr_list rparen | atom
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = expr_0(b, l + 1);
    if (!r) r = atom(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lparen ne_expr_list rparen
  private static boolean expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lparen(b, l + 1);
    r = r && ne_expr_list(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident colon ident
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD, "<field>");
    r = ident(b, l + 1);
    r = r && colon(b, l + 1);
    r = r && ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { field }
  public static boolean fields(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fields")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELDS, "<fields>");
    r = field(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // arg arg_rest
  public static boolean fun_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_args")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_ARGS, "<fun args>");
    r = arg(b, l + 1);
    r = r && arg_rest(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { alphanumeric }
  public static boolean hash(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hash")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HASH, "<hash>");
    r = alphanumeric(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lsquare { hash } rsquare
  public static boolean hashes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hashes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HASHES, "<hashes>");
    r = lsquare(b, l + 1);
    r = r && hashes_1(b, l + 1);
    r = r && rsquare(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { hash }
  private static boolean hashes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hashes_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hash(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // letter { (sub | letter | number) }
  public static boolean ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT, "<ident>");
    r = letter(b, l + 1);
    r = r && ident_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // sub | letter | number
  private static boolean ident_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_1")) return false;
    boolean r;
    r = sub(b, l + 1);
    if (!r) r = letter(b, l + 1);
    if (!r) r = number(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'implements'
  public static boolean implements_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPLEMENTS, "<implements $>");
    r = consumeToken(b, "implements");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // implements ident
  public static boolean implements_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPLEMENTS_DECL, "<implements decl>");
    r = implements_$(b, l + 1);
    r = r && ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lparen use_decl rparen { lparen use_decl rparen }
  public static boolean imports(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORTS, "<imports>");
    r = lparen(b, l + 1);
    r = r && use_decl(b, l + 1);
    r = r && rparen(b, l + 1);
    r = r && imports_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lparen use_decl rparen
  private static boolean imports_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lparen(b, l + 1);
    r = r && use_decl(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ sub ] numbers
  public static boolean integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER, "<integer>");
    r = integer_0(b, l + 1);
    r = r && numbers(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ sub ]
  private static boolean integer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_0")) return false;
    sub(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'interface'
  public static boolean interface_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE, "<interface $>");
    r = consumeToken(b, "interface");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lparen interface ident doc_or_meta sig_list rparen
  public static boolean interface_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_DECL, "<interface decl>");
    r = lparen(b, l + 1);
    r = r && interface_$(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && doc_or_meta(b, l + 1);
    r = r && sig_list(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lparen 'invariant' expr rparen
  public static boolean invariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invariant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INVARIANT, "<invariant>");
    r = lparen(b, l + 1);
    r = r && consumeToken(b, "invariant");
    r = r && expr(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // hashes | lcurl 'keys' colon hashes rcurl | lcurl 'keys' colon hashes comma 'pred' colon pred rcurl
  public static boolean kset(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kset")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KSET, "<kset>");
    r = hashes(b, l + 1);
    if (!r) r = kset_1(b, l + 1);
    if (!r) r = kset_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lcurl 'keys' colon hashes rcurl
  private static boolean kset_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kset_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lcurl(b, l + 1);
    r = r && consumeToken(b, "keys");
    r = r && colon(b, l + 1);
    r = r && hashes(b, l + 1);
    r = r && rcurl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // lcurl 'keys' colon hashes comma 'pred' colon pred rcurl
  private static boolean kset_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kset_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lcurl(b, l + 1);
    r = r && consumeToken(b, "keys");
    r = r && colon(b, l + 1);
    r = r && hashes(b, l + 1);
    r = r && comma(b, l + 1);
    r = r && consumeToken(b, "pred");
    r = r && colon(b, l + 1);
    r = r && pred(b, l + 1);
    r = r && rcurl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '\"' ident '\"' colon expr
  public static boolean kv(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kv")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KV, "<kv>");
    r = consumeToken(b, "\\\"");
    r = r && ident(b, l + 1);
    r = r && consumeToken(b, "\\\"");
    r = r && colon(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'a' | ' ...' | 'z'
  public static boolean lc_letter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lc_letter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LC_LETTER, "<lc letter>");
    r = consumeToken(b, "a");
    if (!r) r = consumeToken(b, " ...");
    if (!r) r = consumeToken(b, "z");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{'
  public static boolean lcurl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lcurl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LCURL, "<lcurl>");
    r = consumeToken(b, "{");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lparen 'let' (single_bind | multi_bind) expr rparen
  public static boolean let_bind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_bind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_BIND, "<let bind>");
    r = lparen(b, l + 1);
    r = r && consumeToken(b, "let");
    r = r && let_bind_2(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // single_bind | multi_bind
  private static boolean let_bind_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_bind_2")) return false;
    boolean r;
    r = single_bind(b, l + 1);
    if (!r) r = multi_bind(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // lparen 'let*' (single_bind | multi_bind) expr rparen
  public static boolean let_star_bind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_star_bind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_STAR_BIND, "<let star bind>");
    r = lparen(b, l + 1);
    r = r && consumeToken(b, "let*");
    r = r && let_star_bind_2(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // single_bind | multi_bind
  private static boolean let_star_bind_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_star_bind_2")) return false;
    boolean r;
    r = single_bind(b, l + 1);
    if (!r) r = multi_bind(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // uc_letter | lc_letter | underscore
  public static boolean letter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LETTER, "<letter>");
    r = uc_letter(b, l + 1);
    if (!r) r = lc_letter(b, l + 1);
    if (!r) r = underscore(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lsquare { expr } rsquare | lsquare expr { comma expr } rsquare
  public static boolean list_lit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_lit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_LIT, "<list lit>");
    r = list_lit_0(b, l + 1);
    if (!r) r = list_lit_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lsquare { expr } rsquare
  private static boolean list_lit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_lit_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lsquare(b, l + 1);
    r = r && list_lit_0_1(b, l + 1);
    r = r && rsquare(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { expr }
  private static boolean list_lit_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_lit_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // lsquare expr { comma expr } rsquare
  private static boolean list_lit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_lit_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lsquare(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && list_lit_1_2(b, l + 1);
    r = r && rsquare(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma expr
  private static boolean list_lit_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_lit_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string_lit | symbol | integer | decimal | bool
  //      bool | list_lit | object_lit | table | kset
  public static boolean lit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIT, "<lit>");
    r = string_lit(b, l + 1);
    if (!r) r = symbol(b, l + 1);
    if (!r) r = integer(b, l + 1);
    if (!r) r = decimal(b, l + 1);
    if (!r) r = lit_4(b, l + 1);
    if (!r) r = list_lit(b, l + 1);
    if (!r) r = object_lit(b, l + 1);
    if (!r) r = consumeToken(b, TABLE);
    if (!r) r = kset(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // bool
  //      bool
  private static boolean lit_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lit_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bool(b, l + 1);
    r = r && bool(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '('
  public static boolean lparen(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lparen")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LPAREN, "<lparen>");
    r = consumeToken(b, "(");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '['
  public static boolean lsquare(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lsquare")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LSQUARE, "<lsquare>");
    r = consumeToken(b, "[");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // property models | invariant models | models | ε
  public static boolean models(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "models")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, MODELS, "<models>");
    r = models_0(b, l + 1);
    if (!r) r = models_1(b, l + 1);
    if (!r) r = models(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // property models
  private static boolean models_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "models_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    r = r && models(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // invariant models
  private static boolean models_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "models_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = invariant(b, l + 1);
    r = r && models(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'module'
  public static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE, "<module>");
    r = consumeToken(b, "module");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lparen module ident module_guard doc_or_meta decl_list rparen
  public static boolean module_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_DECL, "<module decl>");
    r = lparen(b, l + 1);
    r = r && module(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && module_guard(b, l + 1);
    r = r && doc_or_meta(b, l + 1);
    r = r && decl_list(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ident | kset
  public static boolean module_guard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_guard")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_GUARD, "<module guard>");
    r = ident(b, l + 1);
    if (!r) r = kset(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@model' lsquare models rsquare
  public static boolean mta(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mta")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MTA, "<mta>");
    r = consumeToken(b, "@model");
    r = r && lsquare(b, l + 1);
    r = r && models(b, l + 1);
    r = r && rsquare(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lparen single_bind { single_bind } rparen
  public static boolean multi_bind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_bind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_BIND, "<multi bind>");
    r = lparen(b, l + 1);
    r = r && single_bind(b, l + 1);
    r = r && multi_bind_2(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { single_bind }
  private static boolean multi_bind_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_bind_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_bind(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr { expr }
  public static boolean ne_expr_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ne_expr_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NE_EXPR_LIST, "<ne expr list>");
    r = expr(b, l + 1);
    r = r && ne_expr_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { expr }
  private static boolean ne_expr_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ne_expr_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '0' | ' ...' | '9'
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER, "<number>");
    r = consumeToken(b, "0");
    if (!r) r = consumeToken(b, " ...");
    if (!r) r = consumeToken(b, "9");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // number { number }
  public static boolean numbers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numbers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBERS, "<numbers>");
    r = number(b, l + 1);
    r = r && numbers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { number }
  private static boolean numbers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numbers_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lcurl kv { comma kv } rcurl
  public static boolean object_lit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_lit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_LIT, "<object lit>");
    r = lcurl(b, l + 1);
    r = r && kv(b, l + 1);
    r = r && object_lit_2(b, l + 1);
    r = r && rcurl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // comma kv
  private static boolean object_lit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_lit_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && kv(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  public static boolean op(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, OP, true);
    return true;
  }

  /* ********************************************************** */
  // 'keys-all' | 'keys-1' | 'keys-2'
  public static boolean pred(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pred")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRED, "<pred>");
    r = consumeToken(b, "keys-all");
    if (!r) r = consumeToken(b, "keys-1");
    if (!r) r = consumeToken(b, "keys-2");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // top_level_list
  static boolean program(PsiBuilder b, int l) {
    return top_level_list(b, l + 1);
  }

  /* ********************************************************** */
  // lparen 'property' expr rparen
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = lparen(b, l + 1);
    r = r && consumeToken(b, "property");
    r = r && expr(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '}'
  public static boolean rcurl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rcurl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RCURL, "<rcurl>");
    r = consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ')'
  public static boolean rparen(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rparen")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RPAREN, "<rparen>");
    r = consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ']'
  public static boolean rsquare(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rsquare")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RSQUARE, "<rsquare>");
    r = consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ';'
  public static boolean semicolon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semicolon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMICOLON, "<semicolon>");
    r = consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // defconst | defun_sig
  public static boolean sig_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sig_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIG_LIST, "<sig list>");
    r = defconst(b, l + 1);
    if (!r) r = defun_sig(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lparen ident expr rparen
  public static boolean single_bind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_bind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_BIND, "<single bind>");
    r = lparen(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'step'
  public static boolean step(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "step")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STEP, "<step>");
    r = consumeToken(b, "step");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lparen step [ string_lit ] expr rparen
  //  | lparen step_with_rollback [ string_lit ] expr expr rparen
  public static boolean step_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "step_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STEP_DECL, "<step decl>");
    r = step_decl_0(b, l + 1);
    if (!r) r = step_decl_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lparen step [ string_lit ] expr rparen
  private static boolean step_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "step_decl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lparen(b, l + 1);
    r = r && step(b, l + 1);
    r = r && step_decl_0_2(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ string_lit ]
  private static boolean step_decl_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "step_decl_0_2")) return false;
    string_lit(b, l + 1);
    return true;
  }

  // lparen step_with_rollback [ string_lit ] expr expr rparen
  private static boolean step_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "step_decl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lparen(b, l + 1);
    r = r && step_with_rollback(b, l + 1);
    r = r && step_decl_1_2(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ string_lit ]
  private static boolean step_decl_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "step_decl_1_2")) return false;
    string_lit(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'step-with-rollback'
  public static boolean step_with_rollback(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "step_with_rollback")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STEP_WITH_ROLLBACK, "<step with rollback>");
    r = consumeToken(b, "step-with-rollback");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  public static boolean string(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, STRING, true);
    return true;
  }

  /* ********************************************************** */
  // '\"' string '\"'
  public static boolean string_lit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_lit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LIT, "<string lit>");
    r = consumeToken(b, "\\\"");
    r = r && string(b, l + 1);
    r = r && consumeToken(b, "\\\"");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '-'
  public static boolean sub(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUB, "<sub>");
    r = consumeToken(b, "-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "\'" ident
  public static boolean symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL, "<symbol>");
    r = consumeToken(b, "\'");
    r = r && ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // module_decl top_level_list |
  //                           expr top_level_list |
  //                 interface_decl top_level_list | ε
  public static boolean top_level_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP_LEVEL_LIST, "<top level list>");
    r = top_level_list_0(b, l + 1);
    if (!r) r = top_level_list_1(b, l + 1);
    if (!r) r = top_level_list_2(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // module_decl top_level_list
  private static boolean top_level_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_decl(b, l + 1);
    r = r && top_level_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr top_level_list
  private static boolean top_level_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && top_level_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // interface_decl top_level_list
  private static boolean top_level_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_list_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_decl(b, l + 1);
    r = r && top_level_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lparen expr colon ident rparen
  public static boolean type_ann(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_ann")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ANN, "<type ann>");
    r = lparen(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && colon(b, l + 1);
    r = r && ident(b, l + 1);
    r = r && rparen(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'A' | ' ...' | 'Z'
  public static boolean uc_letter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uc_letter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UC_LETTER, "<uc letter>");
    r = consumeToken(b, "A");
    if (!r) r = consumeToken(b, " ...");
    if (!r) r = consumeToken(b, "Z");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '_'
  public static boolean underscore(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "underscore")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNDERSCORE, "<underscore>");
    r = consumeToken(b, "_");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'use'
  public static boolean use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USE, "<use>");
    r = consumeToken(b, "use");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // use ident
  public static boolean use_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USE_DECL, "<use decl>");
    r = use(b, l + 1);
    r = r && ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
