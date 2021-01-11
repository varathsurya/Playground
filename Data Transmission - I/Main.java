x = input()
length = len(x)
res=0
for i in range(length):
  if x[i]=='1':
    res+=2**(length-1-i)
    
print(res)
  