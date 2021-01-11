x = int(input())
y=0
for  i in range(x):
  for j in range(x):
    y+=1
    if j<x-1:
      print('{}*'.format(y),end='')
    else:
      print(y)
  #print()  
    