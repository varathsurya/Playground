str = input()
count = [0] * 256  
max = -1
c = '' 
for i in str: 
	count[ord(i)]+=1; 
for i in str: 
	if max < count[ord(i)]: 
		max = count[ord(i)] 
		c = i 
print(c)