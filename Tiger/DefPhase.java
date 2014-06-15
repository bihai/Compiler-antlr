/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class DefPhase extends TigerBaseListener {
    
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();   // variable table
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope
    
    boolean debug = true;

    // enter Program 
    public void enterProgram(TigerParser.ProgramContext ctx){
        globals = new GlobalScope(null);
        currentScope = globals;
    }
    public void exitProgram(TigerParser.ProgramContext ctx){
    //    System.out.println(globals);
    }


    // enter let, function, for statement.

    public void enterLET(TigerParser.LETContext ctx){
        // push new local scope
        // make the parameter in the decs
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }
    public void exitLET(TigerParser.LETContext ctx){
        //System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }
    public void enterFuncDec(TigerParser.FuncDecContext ctx){
        // formal parameter
        //if (debug)        
        //    System.out.println("Entering FuncDec "+ currentScope);
        currentScope = new LocalScope(currentScope);
        
        TigerParser.TyfieldsContext tyfields = ctx.tyfields();
        if (tyfields != null){
            // if there is formal parameters.
            List<TerminalNode> list = tyfields.ID();
            for (TerminalNode e : list){
                currentScope.define(new VariableSymbol( e.getSymbol().getText() ) );
            }
        }
        saveScope(ctx, currentScope);
    }
    public void exitFuncDec(TigerParser.FuncDecContext ctx){
        
        //if (debug)        
        //System.out.println("Exiting FuncDec "+ currentScope);
        //System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }
    public void enterForStmt(TigerParser.ForStmtContext ctx){
        // for statmt
        //if (debug)        
        //System.out.println("Entering ForStmt"+ currentScope);
        currentScope = new LocalScope(currentScope);

        String name = ctx.ID().getSymbol().getText();
        currentScope.define(new VariableSymbol(name));

        saveScope(ctx, currentScope);
    }
    public void exitForStmt(TigerParser.ForStmtContext ctx){
        //if (debug)        
        //System.out.println("Exiting ForStmt" +  currentScope);
        currentScope = currentScope.getEnclosingScope();
    }


    // VarDef      VarDecInner
    public void enterVarDecInner(TigerParser.VarDecInnerContext ctx){
         String name = ctx.ID().getSymbol().getText();
         currentScope.define(new VariableSymbol(name));
    }

    void saveScope(ParserRuleContext ctx, Scope s) { scopes.put(ctx, s); }
}
