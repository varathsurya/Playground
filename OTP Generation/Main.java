x = int(input())
res=1
while x>0:
  temp = x%10
  res*=temp
  x=x//10
  
print(res)