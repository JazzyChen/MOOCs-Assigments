
class BookInStock

	def initialize(isbn,price)
		unless isbn != '' and price>0
			raise ArgumentError.new("")
		end
		
		@isbn = isbn
		@price = price
	end
	
	attr_reader :isbn
	attr_writer :isbn
	attr_reader :price
	attr_writer :price
	
	def price_as_string
		s = "$"+(price.to_s)
		if s.match /[0123456789]*$/
			return s + ".00"
		else if s.match /[0123456789]*.[0123456789]$/
			return s + "0"
			else s
			end
		end
	end
	
end


puts("(new BookInStock('123',80).isbn == '123') == true")
puts (BookInStock.new('123',80).isbn == '123')

puts("(new BookInStock('123',1.1).price_as_string == '$1.10') == true")
puts (BookInStock.new('123',1.1).price_as_string == '$1.10')
puts(BookInStock.new('123',1.1).price_as_string)
/puts("new BookInStock('',80) == ArgumentError")
puts (BookInStock.new('',80))
/




