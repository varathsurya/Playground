def Rightrotate(a,b,rr):
  length = len(a)
  for i in range(length):
    b[(i+rr)%length] = a[i]

def Leftrotate(a,b,lr):
  length = len(a)
  for i in range(length):
    b[(i-lr+length)%length] = a[i]
    

a = input()
b = [None]*(len(a))
n = int(input())
d = input()
if d == 'R':
  Rightrotate(a,b,n)
else:
  Leftrotate(a,b,n)
print (''.join(x for x in b))
