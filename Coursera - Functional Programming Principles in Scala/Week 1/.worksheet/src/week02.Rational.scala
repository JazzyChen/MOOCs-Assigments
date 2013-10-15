package week02

object Rational {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet");$skip(29); 
	val x = new Rational(75,50);System.out.println("""x  : week02.Rational = """ + $show(x ));$skip(27); 
	val y = new Rational(5,7);System.out.println("""y  : week02.Rational = """ + $show(y ));$skip(27); 
	val z = new Rational(3,2);System.out.println("""z  : week02.Rational = """ + $show(z ));$skip(25); 
	val t = new Rational(5);System.out.println("""t  : week02.Rational = """ + $show(t ));$skip(4); val res$0 = 
	-x;System.out.println("""res0: week02.Rational = """ + $show(res$0));$skip(14); val res$1 = 
	x.sub(y + z);System.out.println("""res1: week02.Rational = """ + $show(res$1))}
	
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
