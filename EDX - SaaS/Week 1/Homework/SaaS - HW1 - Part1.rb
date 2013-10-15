def sum(list)

	if list == []
		0
	else list.shift + sum(list)
	
	end

end

def max_2_sum(list)

	if list == []
		return 0
	else
		m1 = 0
		m2 = 0
		
		list.each do |v|
			if v >= m1
				m2 = m1
				m1 = v
			end
		end
		return m1 + m2
	end
end

def sum_to_n?(list,n)
	
	list.each do |v|
		
		if(v>n)
			list.delete(v)
		end
		
	end
	
	if list == []
	return 0
	end
	
	for i in 1..list.length-1 do
		
		for l in i..list.length-1 do
			if(list[i] + list[l] == n)
				return true
			end
		end
	end
	
	return false
	
end


puts("sum[1,2,3] == 6")
puts (sum [1,2,3]) == 6
puts("sum[] == 0")
puts (sum []) == 0

puts("max_2_sum[1,2,3] == 5")
puts (max_2_sum [1,2,3]) == 5
puts("max_2_sum[] == 0")
puts (max_2_sum []) == 0
puts("max_2_sum[8] == 8")
puts (max_2_sum [8]) == 8

puts("sum_to_n?[1,2,3]  5 == true")
puts (sum_to_n?([1,2,3],5)) == true
puts("sum_to_n?[1,2,3]  6 == false")
puts (sum_to_n?([1,2,3],6)) == false
puts("sum_to_n?[]  80 == 0")
puts (sum_to_n?([],80)) == 0

