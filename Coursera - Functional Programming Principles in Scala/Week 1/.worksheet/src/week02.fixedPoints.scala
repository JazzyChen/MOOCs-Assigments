package week02

object fixedPoints {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(57); 
  
    def abs(x:Double):Double =  if(x<0) x * -1 else x;System.out.println("""abs: (x: Double)Double""");$skip(365); 
  
  def fixedPoints(f: Double => Double)(firstGuess:Double) = {
			
			val tolerance = 0.000001
			
			
			def isCloseEnough(x:Double,y:Double): Boolean =
		     abs((x-y) / x)  < tolerance*x
			
			def iterate(guess:Double):Double = {
				val next = f(guess)
				if(isCloseEnough(guess,next))next
				else iterate(next)
			}
		  
		  iterate(firstGuess)
		  
  };System.out.println("""fixedPoints: (f: Double => Double)(firstGuess: Double)Double""");$skip(35); val res$0 = 
  
  fixedPoints(x => 1 + x/2) (1);System.out.println("""res0: Double = """ + $show(res$0));$skip(118); 
  //def sqrt(x:Double) = fixedPoints(y=>(y + x/y)/2) (1)
  def avaregeDamp	(f:Double=>Double) (x:Double) = (x+f(x))/2;System.out.println("""avaregeDamp: (f: Double => Double)(x: Double)Double""");$skip(62); 
  def sqrt(x:Double) = fixedPoints(avaregeDamp( y=> x/y)) (1);System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$1 = 
   sqrt(4);System.out.println("""res1: Double = """ + $show(res$1))}
  
}
