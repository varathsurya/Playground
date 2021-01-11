def get_Prime(l):
  if l<=1:
    return 0
  elif l==2:
    return 1
  for i in range(2,l//2):
    if l%i == 0:
      return 0
  return 1 

t = int(input())
while t:
  n = int(input())
  i,j = n,n
  while True:
    if i>=0 and get_Prime(i) == 1:
      print(i)
      break
    elif get_Prime(j) == 1:
      print(j)
      break
    i-=1
    j+=1
  t-=1
  