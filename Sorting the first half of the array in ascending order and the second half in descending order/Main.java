x = int(input())
vals = list(map(int,input().split()))
for i in range(x):
  for j in range(0,x//2-1):
    if vals[j]>vals[j+1]:
      vals[j],vals[j+1] = vals[j+1],vals[j]
  for j in range(x//2,x-1):
    if vals[j]<vals[j+1]:
      vals[j],vals[j+1] = vals[j+1],vals[j]
  
res = ' '.join(str(i) for i in vals)
print(res)