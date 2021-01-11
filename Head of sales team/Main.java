x = int(input())
y = list(map(int,input().split()))
for i in y:
  res = [int(n) for n in str(i)]
  val = sum(res)
  print(val,end=' ')