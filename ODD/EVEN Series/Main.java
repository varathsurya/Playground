def Series():
  x = int(input())
  sums_odd = 0
  sums_even = 0
  if (x%2 == 1):
    if x==1:
      return 0
    for i in range(2,x,2):
      sums_even +=2
     # print(sums_even)
    return sums_even
  elif (x%2==0):
    if x==2:
      return 0
    for i in range(2,x,2):
      sums_odd +=1
      #print(sums_odd)
    return sums_odd
    
print(Series())    
  