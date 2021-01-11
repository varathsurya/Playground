n = int(input())
s = input()
arr = [True for i in range(n)]
z = n
l = len(s)
i = 0
j = 0
while n!=1:
  if arr[i] == True:
    if s[j] == 'y':
      arr[i] = False
      n -=1
      j +=1
    else: j+=1
    
  i +=1
  if i>=z:
    i = 0
  if j>=l:
    j=0
  
x = [y+1 for y in range(len(arr)) if arr[y] == True]
print(x[0])