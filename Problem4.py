"""
A palindromic number reads the same both ways (ex: 91 x 99 = 9009) 
find the largest palindrome made from the product of two 3 digit numbers. 
"""
largest = 0 #initially

for i in range(999, 100, -1): #product of 3 digit numbers
	for j in range(i,100, -1):
		mynum = i*j
		if mynum > largest:
			s = str(mynum) #convert number to string
			if s == s[::-1]: #this prints s backwards...
				largest = mynum 

print (largest)
