/**
   May,28 2014 
   author: whimsycwd
   compiler project
*/

grammar Tiger;

program :   
         array
        ;


array : '[' INTEGER (',' INTEGER)* ']'
    | '[' ']'
    ;



INTEGER : ('0' | [1-9] DIGIT*);

fragment
DIGIT : [0-9];

WS : [ \t\n\r]+ ->skip;



