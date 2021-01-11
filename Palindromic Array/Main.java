
t = int(input())
while t:
  n = int(input())
  a = [int(x) for x in input().split()]
  start,end,count = 0,n-1,0
  while start<end:
    if a[start] == a[end]:
      start+=1
      end-=1
    elif a[start] > a[end]:
      a[end-1] = a[end]+a[end-1]
      count+=1
      end-=1
    else:
      a[start+1] = a[start+1]+a[start]
      start+=1
      count+=1
  print(count)
  t-=1