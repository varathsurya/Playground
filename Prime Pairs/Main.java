def Prime(x,y):
  primes = []
  for i in range(x,y+1):
    count = 0
    for j in range(2,i//2 +1):
      if i%j == 0:
        count+=1
    if count == 0:
      primes.append(i)
  return primes

def Prime_pairs(x):
  res = 0
  for i in range(0,len(x)):
    for j in range(i,len(x)):
      if x[j]-x[i] == 6:
        res +=1
  return res
low = int(input())
up  = int(input())

n= Prime(low,up)

x = Prime_pairs(n)
if x >0:
  print(x)
else:
  print('No Prime Pairs')