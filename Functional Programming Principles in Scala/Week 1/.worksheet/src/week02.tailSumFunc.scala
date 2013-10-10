package week02

object tailSumFunc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(182); 
  
  def sum(f: Int => Int) (a: Int, b: Int): Int = {
        def loop(a: Int, acc: Int): Int =
          if (a > b) acc
          else loop(a+1, acc+(f(a)))
        loop(a, 0)
   };System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(26); val res$0 = 
  
  sum (x => x*x) (3,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(363); 
  
  /*def product(f:Int=>Int) (a:Int,b:Int): Int = {
    
    def loop(a:Int,acc:Int):Int =
    if(a>b)acc
    else loop(a+1,acc*f(a))
    
    loop(a,1)
    
  }
  
  product(x=>x*x) (3,4) */
  
  def sumAndProduct (f1:Int=>Int, f2:(Int,Int) => Int, zero:Int ) (a:Int,b:Int): Int = {
 			if(a>b)zero
  		else f2(f1(a),sumAndProduct(f1,f2,zero)(a+1,b))
  		
  };System.out.println("""sumAndProduct: (f1: Int => Int, f2: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(84); 
  
  def product(f:Int=>Int)(a:Int,b:Int): Int = sumAndProduct(f,(x,y)=>x*y,1)(a,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(53); 
  
  def factorial(a:Int): Int = product(x=>x) (1,a);System.out.println("""factorial: (a: Int)Int""");$skip(18); val res$1 = 
  
  factorial(5);System.out.println("""res1: Int = """ + $show(res$1))}
  	
  
  

}
