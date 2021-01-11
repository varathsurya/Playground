def Largest_Power(n,p):
  x = 0
  while(n):
    n = n//p
    x = x+n
  return x


test_case = int(input())
while(test_case):
  n,p = input().split(' ')
  print(Largest_Power(int(n),int(p)))
  test_case -=1
#n,p = input().split(' ')