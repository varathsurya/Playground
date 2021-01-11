def solve():
  mod = 1e9 + 7
  n = int(input())
  ans = n*(2*n-1)
  ans = ans%mod
  print(int(ans))

cases = int(input())
while(cases):
  solve()
  cases-=1
