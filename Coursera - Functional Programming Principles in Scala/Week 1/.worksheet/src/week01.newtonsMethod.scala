package week01

import scala.math;

object newtonsMethod {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); 
  def worksheetInfo() =
  print ("This worksheet implements the Newton's Method.");System.out.println("""worksheetInfo: ()Unit""");$skip(56); 
  
  def abs(x:Double):Double =
  if(x<0) x * -1 else x;System.out.println("""abs: (x: Double)Double""");$skip(403); 
	
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
		  
  };System.out.println("""sqrt: (x: Double)Double""");$skip(15); val res$0 = 
		
	sqrt(1e-8);System.out.println("""res0: Double = """ + $show(res$0));$skip(9); val res$1 = 
	sqrt(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(22); val res$2 = 
	sqrt(math.pow(10,6));System.out.println("""res2: Double = """ + $show(res$2))}
}
