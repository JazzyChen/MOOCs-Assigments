(* Dan Grossman, Coursera PL, HW2 Provided Code *)

(* if you use this function to compare two strings (returns true if the same
   string), then you avoid several of the functions in problem 1 having
   polymorphic types that may be confusing *)
fun same_string(s1 : string, s2 : string) =
    s1 = s2

(* put your solutions for problem 1 here *)

fun all_except_option (str, []) = NONE
  | all_except_option (str, x :: xs) =
    case same_string(x, str) of
      true  => SOME xs
    | false => case all_except_option(str, xs) of
                 NONE   => NONE
               | SOME y => SOME (x::y)


fun get_substitutions1 (s, []) = []
  | get_substitutions1 (s,x::xs) =
    case all_except_option(x,s) of
      NONE   => get_substitutions1(s,xs)
    | SOME y => y @ get_substitutions1(s,xs)

fun get_substitutions2 (str,list) = 
    let
	fun aux (_, [], acc) = acc
	  | aux (str,x::xs,acc) = 
	    case all_except_option(str,x) of
		NONE => aux(str,xs,acc)
	      | SOME y  => aux(str,xs,acc@y) 
    in
	aux(str,list,[])
    end

fun similar_names([],_) = []
  | similar_names (list,{first=f,middle=m,last=l}) =
    let
	fun aux([],_,acc) = acc
	  | aux (name::xs,(m,l),acc) = 
	    aux(xs,(m,l),{first=name,middle=m,last=l}::acc)
	 fun rev xs =
	     let 
		 fun aux([],acc) = acc
		   | aux (x::xs,acc) = aux(xs,x::acc) 	
	     in
		 aux(xs,[])
	     end
     in
	 rev(aux(f::get_substitutions2(f,list),(m,l),[]))
     end

(* you may assume that Num is always used with values 2, 3, ..., 10
   though it will not really come up *)
datatype suit = Clubs | Diamonds | Hearts | Spades
datatype rank = Jack | Queen | King | Ace | Num of int 
type card = suit * rank

datatype color = Red | Black
datatype move = Discard of card | Draw 

exception IllegalMove

(* put your solutions for problem 2 here *)




