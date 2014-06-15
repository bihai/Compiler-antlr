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

public class TypePhase extends TigerBaseListener {
/*    
    ParseTreeProperty<Type> typeSys = new ParseTreeProperty<Type>(); //  type checking
    
    boolean debug = true;
    


    public void exitNil(TigerParser.NilContext ctx){
        typeSys.put(ctx,Type.tVoid);
        if (debug)    
        System.out.println(typeSys.get(ctx));
    }

    public void exitInteger(TigerPaser.IntegerContext ctx){
        typeSys.put(ctx,Type.tInt);
    }
    public void exitString(TigerParser.StringContext ctx){
        typeSys.put(ctx,Type.tString);
    }
    public void exitLeftValue(TigerParser.LeftValueContext ctx){
        typeSys.put(ctx, typeSys.get( ctx.lvalue() );
    }
    public void exitLET(TigerParser.LETContext ctx){
        typeSys.put(ctx, typeSys.get( ctx.exps() ) );
        if (debug)
            System.out.println(typeSys.get(ctx));
    }
    public void exitExps(TigerParser.ExpsContext ctx){
        List<TigerParser.ExpContext> list = ctx.exp();
        typeSys.put(ctx, typeSys.get( list.get(list.getSize()-1) ) ;
    }
    public void exitSimpleVar(TigerParser.Lvalue ctx){
        
    }
*/
}
