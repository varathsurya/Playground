n = input()
length = len(n)

for i in range(0,length):
  j = length - 1 - i
  for k in range(0,length):
    if k==i or k==j:
      print(n[k],end ='')
    else:
      print(end = " ")
  print(' ')