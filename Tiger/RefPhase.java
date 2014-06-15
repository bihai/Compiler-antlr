import org.antlr.v4.runtime.tree.ParseTreeProperty;
import java.util.*;


public class RefPhase extends TigerBaseListener {
    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope; // resolve symbols starting in this scope
    
    boolean debug = false;

    ParseTreeProperty<Type> typeSys = new ParseTreeProperty<Type>();

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }
    
    // first enter program set globals

    public void enterProgram(TigerParser.ProgramContext ctx){
        currentScope = globals;
    }

    // let, function, for stmt create new scope 
    

    public void enterLET(TigerParser.LETContext ctx){
        currentScope = scopes.get(ctx); // enter a new scope
    }
    /*
    public void exitLET(TigerParser.LETContext ctx){
    
        currentScope = currentScope.getEnclosingScope(); // exit a scope
    }
    */
    public void enterFuncDec(TigerParser.FuncDecContext ctx){
        currentScope = scopes.get(ctx);
    }
    public void exitFuncDec(TigerParser.FuncDecContext ctx){
        currentScope = currentScope.getEnclosingScope();
    }
    public void enterForStmt(TigerParser.ForStmtContext ctx){
        currentScope = scopes.get(ctx);
    }
    /*
    public void exitForStmt(TigerParser.ForStmtContext ctx){
        currentScope = currentScope.getEnclosingScope();
    }
    */
    /*
    public void exitSimpleVar(TigerParser.SimpleVarContext ctx){
        
        String name = ctx.ID().getSymbol().getText();

        Symbol var = currentScope.resolve(name);
        if (var == null){
            CheckSymbols.error(ctx.ID().getSymbol(),"no such variable: " + name);
        }
    }
    */
    
    // type checking
    // @since  June 14, 2014 


    public void exitNil(TigerParser.NilContext ctx){
        typeSys.put(ctx,Type.tVoid);
        print( typeSys.get(ctx) );
    }
    public void exitInteger(TigerParser.IntegerContext ctx){
        typeSys.put(ctx, Type.tInt);
        print( typeSys.get(ctx) );
    }
    public void exitString(TigerParser.StringContext ctx){
        typeSys.put(ctx, Type.tString);
        print( typeSys.get(ctx) );
    }
    public void exitLeftValue(TigerParser.LeftValueContext ctx){
        typeSys.put(ctx, typeSys.get( ctx.lvalue() ) );
        print("In LeftValue: " +  typeSys.get(ctx) );
    }

    public void exitUnaryMinus(TigerParser.UnaryMinusContext ctx){
        Type t = typeSys.get(ctx.exp());

        if (t != Type.tInt){
             CheckSymbols.error( ctx.getStart(), "Expected - Int, got - "+ t);  
            typeSys.put(ctx, Type.tVoid);
       } else {
            typeSys.put(ctx, Type.tInt);
        }
        print( "In UnaryMinus " + typeSys.get(ctx));
    }
    public void exitAdd(TigerParser.AddContext ctx){
        Type t1 = typeSys.get(ctx.exp(0));
        Type t2 = typeSys.get(ctx.exp(1));
        if (t1 != Type.tInt || t2 != Type.tInt){
            CheckSymbols.error( ctx.getStart(), "Expected Int +/- Int got " + t1 + " +/- " + t2 );
            typeSys.put(ctx, Type.tVoid);
        } else {
            typeSys.put(ctx, Type.tInt);
        }
        print( "In Add " + typeSys.get(ctx) );
    }
    public void exitCmp(TigerParser.CmpContext ctx){
        Type t1 = typeSys.get(ctx.exp(0));
        Type t2 = typeSys.get(ctx.exp(1));
        if (t1 != Type.tInt || t2 != Type.tInt){
            CheckSymbols.error( ctx.getStart(), "Expected Int cmpOp Int got " + t1 + " cmpOp " + t2 );
            typeSys.put(ctx, Type.tVoid);
        } else {
            typeSys.put(ctx, Type.tInt);
        }
        print( "In Cmp : " + typeSys.get(ctx));
    }
    public void exitLogical(TigerParser.LogicalContext ctx){
        Type t1 = typeSys.get(ctx.exp(0));
        Type t2 = typeSys.get(ctx.exp(1));

        if (t1 != Type.tInt || t2 != Type.tInt){
            CheckSymbols.error( ctx.getStart(), "Expected Int logicalCmp Int got " + t1 + " logicalCmp " + t2); 
            typeSys.put(ctx, Type.tVoid);
        } else {
            typeSys.put(ctx, Type.tInt);
        }
        
        print("In Logical "+ typeSys);

    }
    public void exitParenExprs(TigerParser.ParenExprsContext ctx){
        typeSys.put(ctx, typeSys.get( ctx.exps() ) );
        print("In ParenExpers: " + typeSys.get(ctx) );
    }

    public void exitAssign(TigerParser.AssignContext ctx){
        
        Type t1 = typeSys.get(ctx.lvalue());
        Type t2 = typeSys.get(ctx.exp());
        if (t1 != t2){
            CheckSymbols.error( ctx.getStart(), "Assign " + t2 + " to " + t1);
            typeSys.put(ctx, Type.tVoid);
        } else {
            typeSys.put(ctx, t1);
        }

        print("In Assign : " + typeSys.get(ctx));
    }
    public void exitIfStmt(TigerParser.IfStmtContext ctx){
        Type t1 = typeSys.get(ctx.exp(0));
        Type t2 = typeSys.get(ctx.exp(1));
        Type t3 = typeSys.get(ctx.exp(2));
        if (t1 != Type.tInt){
            CheckSymbols.error( ctx.getStart(), "boolean experssion must be tInt ");
            typeSys.put(ctx, Type.tVoid);
        } else {
            if (t2 != t3){
                CheckSymbols.error( ctx.getStart(), "then statement and else statement need to same");
                typeSys.put(ctx, Type.tVoid);
            }
            else {
                typeSys.put(ctx,t2);
            }
        }
        print( "In IfStmt " + typeSys.get(ctx));

    }

    public void exitWhileStmt(TigerParser.WhileStmtContext ctx){
        Type t1 = typeSys.get(ctx.exp(0));
        Type t2 = typeSys.get(ctx.exp(1));

        if (t1 != Type.tInt){
            CheckSymbols.error( ctx.getStart(), "loop pd expression must be tInt" );
            typeSys.put(ctx, Type.tVoid);
        } else {
            typeSys.put(ctx, t2);
        }
        print("In WhileStmt : " + typeSys.get(ctx) );
    }
    
    public void exitForStmt(TigerParser.ForStmtContext ctx){
        Type t1 = typeSys.get(ctx.exp(0));
        Type t2 = typeSys.get(ctx.exp(1));
        Type t3 = typeSys.get(ctx.exp(2));

        if (t1 != Type.tInt || t2 != Type.tInt){
            CheckSymbols.error( ctx.getStart(), "loop start and end must both be tInt" );
            typeSys.put(ctx, Type.tVoid);
        } else {
            typeSys.put(ctx, t3);
        }
        print("In ForStmt " + typeSys.get(ctx));
        currentScope = currentScope.getEnclosingScope();
    }

    public void exitLET(TigerParser.LETContext ctx){
        typeSys.put(ctx, typeSys.get( ctx.exps() ) );
        currentScope = currentScope.getEnclosingScope(); // exit a scope
        print("In LET: "+typeSys.get(ctx) );
    }
    public void exitExps(TigerParser.ExpsContext ctx){
        List<TigerParser.ExpContext> list = ctx.exp();
        typeSys.put(ctx, typeSys.get( list.get(list.size() -1 ) ) );
        print("In exps: "+  typeSys.get(ctx) );
    
    }
    public void exitVarDecInner(TigerParser.VarDecInnerContext ctx){
        Symbol var = currentScope.resolve(ctx.ID().getSymbol().getText());
        var.setType(  typeSys.get( ctx.exp() ) );
    }
    public void exitSimpleVar(TigerParser.SimpleVarContext ctx){
        
        String name = ctx.ID().getSymbol().getText();

        Symbol var = currentScope.resolve(name);
       // print(currentScope);
        if (var == null){
            CheckSymbols.error(ctx.ID().getSymbol(),"no such variable: " + name);
        }
        if (var != null){
            typeSys.put(ctx, var.getType() );
        } else {
            typeSys.put(ctx, Type.tVoid);
        }
        print("In Simple Var : "+ typeSys.get(ctx) );
    }
    public void print(Object o){
        if (debug)
            System.out.println(o);
    }

}
