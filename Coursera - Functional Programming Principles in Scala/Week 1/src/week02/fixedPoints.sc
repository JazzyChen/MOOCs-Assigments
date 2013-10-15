package week02

object fixedPoints {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
    def abs(x:Double):Double =  if(x<0) x * -1 else x
                                                  //> abs: (x: Double)Double
  
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
		  
  }                                               //> fixedPoints: (f: Double => Double)(firstGuess: Double)Double
  
  fixedPoints(x => 1 + x/2) (1)                   //> res0: Double = 1.9999961853027344
  //def sqrt(x:Double) = fixedPoints(y=>(y + x/y)/2) (1)
  def avaregeDamp	(f:Double=>Double) (x:Double) = (x+f(x))/2
                                                  //> avaregeDamp: (f: Double => Double)(x: Double)Double
  def sqrt(x:Double) = fixedPoints(avaregeDamp( y=> x/y)) (1)
                                                  //> sqrt: (x: Double)Double
   sqrt(4)                                        //> res1: Double = 2.000000000000002
  
}