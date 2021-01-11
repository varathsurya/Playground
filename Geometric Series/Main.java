def Geo_Series():
  x = int(input())
  odd_out = 1
  even_out = 1
  if x==1 or x==2:
    return 1
  if x%2 == 0:
    if x==4:
      return 3
    else:
      for i in range(2,x,2):
        odd_out*=3
    return odd_out
  else:
    if x==3:
      return 2
    else:
      for i in range(2,x,2):
        even_out*=2
      return even_out
    
print(Geo_Series())      
  
  
  