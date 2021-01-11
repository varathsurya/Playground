m = int(input())
n = int(input())
s = int(input())
#val =[[0]*m]*n
#print(val)
for i in range(0,m):
  for j in range(0,n):
    print(s,end=' ')
    #val[i][j] = s
    s=s+1
  print()
#print(val)