x=int(input())
vals = list(map(int,input().split()))
y =[]
y.append(vals[0])
for i in range(1,x):
  if vals[i] not in y:
    y.append(vals[i])
res = ' '.join(str(i) for i in y)
print(res)