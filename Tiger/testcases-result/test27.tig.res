(program (exp let (decs (dec (vardec var a := (exp 0))) (dec function g ( (tyfields a : (type_id int)) ) : (type_id int) = (exp (lvalue a)))) in (exps (exp g ( (exp 2) ))) end))
