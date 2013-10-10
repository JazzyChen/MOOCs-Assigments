package week01

import scala.math;

object newtonsMethod {
  def worksheetInfo() =
  print ("This worksheet implements the Newton's Method.")
                                                  //> worksheetInfo: ()Unit
  
  def abs(x:Double):Double =
  if(x<0) x * -1 else x                           //> abs: (x: Double)Double
	
	def sqrt(x:Double) = {
	
	
			def sqrtIter(guess:Double,x:Double):Double =
			if (isGoodEnough(guess,x)) guess
			else sqrtIter(improve(guess,x),x)
			
			def isGoodEnough(guess:Double,x:Double): Boolean =
		     abs((guess*guess) - x) < 0.001*x
			
			//Newton's Method guess improviment
			def improve(guess:Double,x:Double):Double =
		      ((x/guess)+(guess))/2
		  
		  sqrtIter(1.0,x)
		  
  }                                               //> sqrt: (x: Double)Double
		
	sqrt(1e-8)                                //> res0: Double = 1.0000040611237676E-4
	sqrt(2)                                   //> res1: Double = 1.4142156862745097
	sqrt(math.pow(10,6))                      //> res2: Double = 1000.0001533016629
}