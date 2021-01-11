n = int(input())
a = input().split(' ')
a = [int(i) for i in a]
avg = sum(a)//n
b = list()
b.append(0)
for i in range(0,n-1):
  b.append(b[i]+a[i] - avg)
  
b.sort()
m = -b[n//2]
val = 0
for i in range(0,n):
  val = val + abs(b[i] + m)

print(val)