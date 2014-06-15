// Generated from Tiger.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TigerParser}.
 */
public interface TigerListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link TigerParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull TigerParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull TigerParser.ArrayContext ctx);
}