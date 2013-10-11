
fun is_older(d1:int*int*int,d2:int*int*int) = 
    let
	fun checkYear() = (#1 d1) < (#1 d2)
	fun checkMonth() = (#2 d1) < (#2 d2)
	fun checkDay() = (#3 d1) < (#3 d2)
    in
	checkYear() orelse (checkMonth() orelse checkDay())
	 
    end

fun number_in_month(xs:(int*int*int) list, month:int) =
 
       if null xs
       then 0
       else if (#2 (hd xs))= month
	    then 1 + number_in_month(tl xs, month)
            else number_in_month(tl xs, month)

fun  number_in_months(xs:(int*int*int) list, months:int list) =
     if null months
     then 0
     else number_in_month(xs,(hd months)) + number_in_months(xs,(tl months))

fun dates_in_month(xs:(int*int*int) list, month:int) =
    if null xs
    then []
    else if (#2 (hd xs)) = month
         then hd xs :: dates_in_month((tl xs),month)
         else dates_in_month((tl xs),month)

fun dates_in_months(xs:(int*int*int) list, months:int list) =
    if null months
    then []
    else dates_in_month(xs,(hd months)) @ dates_in_months(xs,(tl months))
