
def hello(name)
	"Hello, " + name
end

def starts_with_consonant?(str)
	
	
	if str.match /[^AEIOU]/i
		true
	else 
		false
	end
end

def binary_multiple_of_4?(n)
	
	if n.match /^[10]*00$/
		
		n.split("").each do |x|
			
			if(x!='1' and x!='0')
				return false
			end
			
		end
		
		return true
	end
	else return false
	
end

puts("hello(""Carl"") == ""Hello, Carl""")
puts (hello("Carl"))

puts("starts_with_consonant?(""Texto"")) == true")
puts (starts_with_consonant?("Texto"))
puts("starts_with_consonant?(""Oi"")) == false")
puts (starts_with_consonant?("Oi"))

puts("binary_multiple_of_4?(""100"") == true")
puts (binary_multiple_of_4?("100"))

puts("binary_multiple_of_4?(""101"") == false")
puts (binary_multiple_of_4?("101"))

puts("binary_multiple_of_4?(""121"") == false")
puts (binary_multiple_of_4?("121"))

