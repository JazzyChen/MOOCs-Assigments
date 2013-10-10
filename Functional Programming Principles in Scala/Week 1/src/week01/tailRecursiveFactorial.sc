package week01

object tailRecursiveFactorial {
	
	def worksheetInfo() =
  print ("This worksheet implements a tail recursive factorial function.")
                                                  //> worksheetInfo: ()Unit
  
  def factorial(x:Long) = {
  	
  	def factorialIter(n:Long,acc:Long):Long =
  	if(n==0)1*acc
  	else factorialIter(n-1,n*acc)
  	
  	factorialIter(x,1)
  
  }                                               //> factorial: (x: Long)Long
  
  factorial(4)                                    //> res0: Long = 24
  factorial(20)                                   //> res1: Long = 2432902008176640000
  
}