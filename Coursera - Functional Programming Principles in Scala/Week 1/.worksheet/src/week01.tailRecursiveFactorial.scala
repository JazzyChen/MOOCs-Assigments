package week01

object tailRecursiveFactorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(147); 
	
	def worksheetInfo() =
  print ("This worksheet implements a tail recursive factorial function.");System.out.println("""worksheetInfo: ()Unit""");$skip(163); 
  
  def factorial(x:Long) = {
  	
  	def factorialIter(n:Long,acc:Long):Long =
  	if(n==0)1*acc
  	else factorialIter(n-1,n*acc)
  	
  	factorialIter(x,1)
  
  };System.out.println("""factorial: (x: Long)Long""");$skip(18); val res$0 = 
  
  factorial(4);System.out.println("""res0: Long = """ + $show(res$0));$skip(16); val res$1 = 
  factorial(20);System.out.println("""res1: Long = """ + $show(res$1))}
  
}
