package week02

object Rational {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	val x = new Rational(75,50)               //> x  : week02.Rational = 3/2
	val y = new Rational(5,7)                 //> y  : week02.Rational = 5/7
	val z = new Rational(3,2)                 //> z  : week02.Rational = 3/2
	val t = new Rational(5)                   //> t  : week02.Rational = 5/1
	-x                                        //> res0: week02.Rational = 3/-2
	x.sub(y + z)                              //> res1: week02.Rational = 5/-7
	
}

class Rational(x:Int,y:Int){
	
	require(y!=0, "denom must be differ than zero")
	
	private def gcd(a:Int,b:Int):Int =  if(b==0)a else gcd(b,a%b)
	private val g = gcd(x,y)

	val numer = x/g
	val denom = y/g
	
	def this(x:Int) = this(x,1)
	
	def < (z:Rational): Boolean = numer*z.denom < z.numer * denom
	
	def max(z:Rational) = if(this < z)z else this
	
	def + (z: Rational): Rational =
		new Rational(numer*z.denom+z.numer*denom,denom*z.denom)
		
	def unary_- 	: Rational =
		new Rational(-1 * numer,denom)
		
	def sub(z:Rational) = this + (-z)
		
	override def toString = numer + "/" + denom
}