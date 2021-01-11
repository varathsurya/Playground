def isPrime(n):
  if n ==2:
    return 1
  for x in range(2,n//2+1):
    if n%x == 0:
      return 0
  return 1

n = int(input())
x = []
for i in range(2,n):
  if isPrime(i) == 1:
    x.append(i)
y = ' '.join(map(str, x))
print(y)
    