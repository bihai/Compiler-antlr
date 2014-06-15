/**
   May,28 2014 
   author: whimsycwd
   compiler project
*/

grammar Tiger;

program :  exp                                                      
        | decs                                                      
        ;

exp : 'nil'                                                         #Nil
     | INTEGER                                                      #Integer
     | STRING                                                       #String
     | type_id '[' exp ']' 'of' exp                                 #Array
     | type_id '{' ( ID '=' exp (',' ID '=' exp )* )? '}'           #Record
     //| 'new' type_id                                                #New                                                
     | lvalue                                                       #LeftValue
     | ID '(' ( exp (',' exp)*)? ')'                                    #Call
     | '-' exp                                                          #UnaryMinus
     | exp ('*' | '/') exp                                          #Mul
     | exp ('+' | '-') exp                                          #Add
     | exp ('<>' | '=' | '>=' | '<=' | '>' | '<') exp               #Cmp
     | exp ('&' | '|') exp                                          #Logical
     | '(' exps ')'                                                 #ParenExprs
     | lvalue ':=' exp                                              #Assign
     | 'if ' exp 'then' exp ('else' exp)?                           #IfStmt
     | 'while' exp 'do' exp                                         #WhileStmt
     | 'for' ID ':=' exp 'to' exp 'do' exp                              #ForStmt
     | 'break'                                                          #Break
     | 'let' decs 'in' exps 'end'                                       #LET
     ;

exps : ( exp (';' exp)* )?;                                        

decs : dec*;                                                       

dec : 'type' ID '=' ty                                                  #TypeDec
    | vardec                                                            #VarDecNothing
    | 'function' ID '(' tyfields? ')' (':' type_id)? '=' exp            #FuncDec
    //| 'primitive' ID '(' tyfields? ')' (':' type_id)?                   
    //| 'import' STRING
    //| 'class' ID ('extends' type_id)? '{' classfields '}'
    ;

vardec : 'var' ID (':' type_id)? ':=' exp                               #VarDecInner
        ;
//classfields : classfield*
//        ;


//classfield : vardec
//          | 'method' ID '(' tyfields ')' (':' type_id) '=' exp
//           ;

ty : type_id
   | '{' tyfields? '}'
   | 'array' 'of' type_id
//   | 'class' ('extends' type_id)? '{' classfields '}'
   ;
tyfields : ( ID ':' type_id (',' ID ':' type_id)*)
    ;


type_id : ID
    ;
lvalue  : ID                            #SimpleVar
        | lvalue '.' ID                 #DotVar
        | lvalue '[' exp ']'            #BracketVar
        ;



INTEGER :   DIGIT+;

STRING : '"' (ESC | .)*? '"';
ID : LETTER (LETTER | DIGIT) *;

fragment
ESC : '\\' [btnr"\\];

fragment
LETTER : [a-zA-Z] | '_';

fragment 
DIGIT : [0-9];

COMMENT : '/*' .*? '*/'  ->skip;
LINE_COMMENT : '//' .*? '\n' ->skip;

WS : [ \n\r\t]+ ->skip;



