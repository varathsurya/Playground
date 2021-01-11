n = int(input())
m = int(input())
vals = list(map(int,input().split()))
vals.sort(reverse=True)
sum = 0
for i in range(0,m):
  sum+=vals[i]
print(sum)