(program (exp let (decs (dec type arrtype = (ty array of (type_id int))) (dec (vardec var arr1 : (type_id arrtype) := (exp (type_id arrtype) [ (exp 10) ] of (exp 0))))) in (exps (exp (lvalue arr1))) end))
