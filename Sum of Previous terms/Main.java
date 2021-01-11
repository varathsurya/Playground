def Term():
  n =  int(input())
  prev=1
  now=2
  if n==1:
    return 1
  if n==2:
    return now
  if n>30:
    return -1
  for i in range(2,n):
    temp = now
    now=now+prev
    prev = temp
  return now
val = Term()
if val<0:
  print("Invalid Input")
else:
  print(val)

    