fun pow(x: real,y:int):real =
if y>0
then x*pow(x,y-1) 
else if y=0
then 1.0
else 1.0/pow(x,0-y)
