use "hw2provided.sml";

fun isNone(x) = not(isSome(x))
(*
val t1 = isNone(all_except_option("oi",[])) 
val t2 = isNone(all_except_option("",["oi","tes"]))
val t3 = valOf(all_except_option(("oi",["sads","oi","dsadw"])))
val t4 = isNone(all_except_option("oi",["sads","sdawd"])) 
*)
(*
val t1 = get_substitutions1("oi",[])
val t2 = get_substitutions1("",[["oi","ok"],["1","","2"],[""]])
val t3 = get_substitutions1("p",[["1","p","2"],["9","10"],["p","3","4"]])

*)
(*
val t1 = get_substitutions2("oi",[])
val t2 = get_substitutions2("",[["oi","ok"],["1","","2"],[""]])
val t3 = get_substitutions2("p",[["1","p","2"],["9","10"],["p","3","4"]])

*)

(*
val t1 = similar_names([["red","Fredrick"],["Elizabeth","Betty"],["Freddie","Frd","F"]],{first="Fred", middle="W", last="Smith"})

val t2 = similar_names([["Fred","Fredrick"],["Elizabeth","Betty"],["Freddie","Fred","F"]],{first="Fred", middle="W", last="Smith"})
*)
