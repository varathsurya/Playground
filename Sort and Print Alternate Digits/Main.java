x = int(input())
y = list(map(int,input().split()))
y = sorted(y)
for i in range(0,x,2):
  print(y[i],end=' ')