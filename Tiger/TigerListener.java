// Generated from Tiger.g4 by ANTLR 4.2.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TigerParser}.
 */
public interface TigerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TigerParser#decs}.
	 * @param ctx the parse tree
	 */
	void enterDecs(@NotNull TigerParser.DecsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#decs}.
	 * @param ctx the parse tree
	 */
	void exitDecs(@NotNull TigerParser.DecsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#tyfields}.
	 * @param ctx the parse tree
	 */
	void enterTyfields(@NotNull TigerParser.TyfieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#tyfields}.
	 * @param ctx the parse tree
	 */
	void exitTyfields(@NotNull TigerParser.TyfieldsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull TigerParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull TigerParser.ArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExps(@NotNull TigerParser.ExpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExps(@NotNull TigerParser.ExpsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#UnaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(@NotNull TigerParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#UnaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(@NotNull TigerParser.UnaryMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#SimpleVar}.
	 * @param ctx the parse tree
	 */
	void enterSimpleVar(@NotNull TigerParser.SimpleVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#SimpleVar}.
	 * @param ctx the parse tree
	 */
	void exitSimpleVar(@NotNull TigerParser.SimpleVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull TigerParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull TigerParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#FuncDec}.
	 * @param ctx the parse tree
	 */
	void enterFuncDec(@NotNull TigerParser.FuncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#FuncDec}.
	 * @param ctx the parse tree
	 */
	void exitFuncDec(@NotNull TigerParser.FuncDecContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull TigerParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull TigerParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#DotVar}.
	 * @param ctx the parse tree
	 */
	void enterDotVar(@NotNull TigerParser.DotVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#DotVar}.
	 * @param ctx the parse tree
	 */
	void exitDotVar(@NotNull TigerParser.DotVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#VarDecNothing}.
	 * @param ctx the parse tree
	 */
	void enterVarDecNothing(@NotNull TigerParser.VarDecNothingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#VarDecNothing}.
	 * @param ctx the parse tree
	 */
	void exitVarDecNothing(@NotNull TigerParser.VarDecNothingContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#TypeDec}.
	 * @param ctx the parse tree
	 */
	void enterTypeDec(@NotNull TigerParser.TypeDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#TypeDec}.
	 * @param ctx the parse tree
	 */
	void exitTypeDec(@NotNull TigerParser.TypeDecContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(@NotNull TigerParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(@NotNull TigerParser.NilContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull TigerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull TigerParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(@NotNull TigerParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(@NotNull TigerParser.LogicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull TigerParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull TigerParser.CallContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(@NotNull TigerParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(@NotNull TigerParser.BreakContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#WhileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(@NotNull TigerParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#WhileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(@NotNull TigerParser.WhileStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(@NotNull TigerParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(@NotNull TigerParser.Type_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#ty}.
	 * @param ctx the parse tree
	 */
	void enterTy(@NotNull TigerParser.TyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#ty}.
	 * @param ctx the parse tree
	 */
	void exitTy(@NotNull TigerParser.TyContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#IfStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(@NotNull TigerParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#IfStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(@NotNull TigerParser.IfStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#BracketVar}.
	 * @param ctx the parse tree
	 */
	void enterBracketVar(@NotNull TigerParser.BracketVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#BracketVar}.
	 * @param ctx the parse tree
	 */
	void exitBracketVar(@NotNull TigerParser.BracketVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(@NotNull TigerParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(@NotNull TigerParser.RecordContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#VarDecInner}.
	 * @param ctx the parse tree
	 */
	void enterVarDecInner(@NotNull TigerParser.VarDecInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#VarDecInner}.
	 * @param ctx the parse tree
	 */
	void exitVarDecInner(@NotNull TigerParser.VarDecInnerContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#String}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull TigerParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#String}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull TigerParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull TigerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull TigerParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(@NotNull TigerParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(@NotNull TigerParser.CmpContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#ParenExprs}.
	 * @param ctx the parse tree
	 */
	void enterParenExprs(@NotNull TigerParser.ParenExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#ParenExprs}.
	 * @param ctx the parse tree
	 */
	void exitParenExprs(@NotNull TigerParser.ParenExprsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#LET}.
	 * @param ctx the parse tree
	 */
	void enterLET(@NotNull TigerParser.LETContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#LET}.
	 * @param ctx the parse tree
	 */
	void exitLET(@NotNull TigerParser.LETContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#Integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull TigerParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#Integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull TigerParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#ForStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(@NotNull TigerParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#ForStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(@NotNull TigerParser.ForStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TigerParser#LeftValue}.
	 * @param ctx the parse tree
	 */
	void enterLeftValue(@NotNull TigerParser.LeftValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#LeftValue}.
	 * @param ctx the parse tree
	 */
	void exitLeftValue(@NotNull TigerParser.LeftValueContext ctx);
}