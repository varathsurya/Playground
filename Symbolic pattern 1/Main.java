n = int(input())
mid = n//2 +1
for i in range(n):
  for j in range(n):
    if i == mid-1:
      print("*",end='')
    elif j == mid-1:
      print("*",end='')
    else:
      print(end=" ")
  print(end='\n')