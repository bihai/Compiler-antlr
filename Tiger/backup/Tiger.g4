/**
   May,28 2014 
   author: whimsycwd
   compiler project
*/

grammar Tiger;

program :  exp 
        | decs
        ;

exp : 'nil'
     | INTEGER
     | STRING
     | type_id '[' exp ']' 'of' exp
     | type_id '{' ( ID '=' exp (',' ID '=' exp )* )? '}'
     | 'new' type_id
     | lvalue
     | ID '(' ( exp (',' exp)*)? ')'
     | '-' exp
     | exp ('*' | '/') exp
     | exp ('+' | '-') exp
     | exp ('<>' | '=' | '>=' | '<=' | '>' | '<') exp
     | exp ('&' | '|') exp
     | '(' exps ')'
     | lvalue ':=' exp
     | 'if ' exp 'then' exp ('else' exp)?
     | 'while' exp 'do' exp
     | 'for' ID ':=' exp 'to' exp 'do' exp
     | 'break'
     | 'let' decs 'in' exps 'end' 
     ;

exps : ( exp (';' exp)* )?;

decs : dec*;

dec : 'type' ID '=' ty
    | vardec
    | 'function' ID '(' tyfields? ')' (':' type_id)? '=' exp
    | 'primitive' ID '(' tyfields? ')' (':' type_id)? 
    | 'import' STRING
    | 'class' ID ('extends' type_id)? '{' classfields '}'
    ;

vardec : 'var' ID (':' type_id)? ':=' exp
        ;
classfields : classfield*
        ;


classfield : vardec
           | 'method' ID '(' tyfields ')' (':' type_id) '=' exp
           ;

ty : type_id
   | '{' tyfields? '}'
   | 'array' 'of' type_id
   | 'class' ('extends' type_id)? '{' classfields '}'
   ;
tyfields : ( ID ':' type_id (',' ID ':' type_id)*)
    ;


type_id : ID
    ;
lvalue  : ID
        | lvalue '.' ID
        | lvalue '[' exp ']'
        ;



INTEGER : ('0' | [1-9] DIGIT*);

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



