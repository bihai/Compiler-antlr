(program (exp let (decs (dec (vardec var a := (exp 0)))) in (exps (exp for i := (exp 0) to (exp 100) do (exp ( (exps (exp (lvalue a) := (exp (exp (lvalue a)) + (exp 1))) ; (exp ( exps ))) )))) end))
