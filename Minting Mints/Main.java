x = list(map(int, input().split()))
res = 0
for i in range(1,x[-1]+1):
  if i==1:
    res+=x[0]
  else:
    res+=res-1
print(res)