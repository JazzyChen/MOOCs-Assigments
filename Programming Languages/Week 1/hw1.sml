
fun is_older(d1:int*int*int,d2:int*int*int) = 
    let
	fun checkYear() = 
	    if (#1 d1) < (#1 d2)
	    then true
	    else ((#1 d1) > (#1 d2))
	fun checkMonth() = 
	    if (#2 d1) < (#2 d2)
	    then true
            else ((#2 d1) > (#2 d2))
	fun checkDay() =
	    if (#3 d1) < (#3 d2)
	    then true
            else ((#3 d1) > (#3 d2))
    in
	checkYear() andalso (checkMonth() andalso checkDay())
	 
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

fun get_nth(xs:string list,n:int)=
    if n = 1
    then hd xs
    else get_nth(tl xs,n-1)

fun date_to_string(date:(int*int*int)) =
    let
	val months = ["January","February","March", "April","May", "June","July","August","September", "October", "November","December"]
	fun get_month(date:(int*int*int)) = get_nth(months,(#2 date))
	fun get_date(date:(int*int*int)) = Int.toString(#3 date)
	fun get_year(date:(int*int*int)) = Int.toString(#1 date)
	in
	    get_month(date) ^ " " ^ get_date(date) ^ ", " ^ get_year(date)
    end

fun number_before_reaching_sum(sum:int,xs:int list) = 
    let
	
	fun sum_list_til_n(head:int,value:int,max:int,xs: int list) = 
	if (value+(hd xs)) >= max
	then head
	else sum_list_til_n((head+1),(value+(hd xs)),max,(tl xs))

    in
	sum_list_til_n(0,0,sum,xs)
    end

fun what_month(day:int) = 
     	(1 + number_before_reaching_sum(day,[31,28,31,30,31,30,31,31,30,31,30,31]))

fun month_range(day1:int,day2:int) = 
    let
	fun listConstructor(m1:int,m2:int) = 
	    if m1>=m2
	    then m2::[]
	    else m1::listConstructor((m1+1),m2)
    in
	if(day1>day2)
	then []
        else
	    listConstructor(what_month(day1),what_month(day2))
    end

fun oldest(dates:(int*int*int) list) = 
    let
	fun get_oldest(dates:(int*int*int) list,date: (int*int*int)) =
	    if null dates
	    then SOME date
	    else 
		if(is_older((hd dates),date))
		then get_oldest((tl dates),(hd dates))
	        else get_oldest(tl dates,date)
    in
	if null dates
        then NONE
        else
	    get_oldest(tl dates,hd dates)
    end

fun reasonable_date(date:int*int*int) = 
    let
	val days = [31,28,31,30,31,30,31,31,30,31,30,31]
	fun get_days(xs:int list,n:int)=
	    if n = 1
	    then hd xs
	    else get_days(tl xs,n-1)
	fun checkYear(y:int) = y>0
	fun checkMonth(m:int) = (m>=1) andalso (m<=12)
        fun divisible(x:int,y:int) = (x mod y) = 0
        fun checkDay(d:int,m:int) = 
	    if (m = 2 andalso (divisible(m,400) orelse divisible(m,4)) andalso (divisible(m,100) = false))
	    then (d>=1) andalso (d<=29)
	    else
		(d>=1) andalso (d<=get_days(days,m))
    in
	checkYear((#1 date)) andalso checkMonth((#2 date)) andalso checkDay((#3 date,(#2 date)))

    end
