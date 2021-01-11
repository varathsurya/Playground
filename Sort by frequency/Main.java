from operator import itemgetter  
length = int(input())
values = list(map(int,input().split()))
unique_val = set(values)
res = {}
for i in unique_val:
  res[i] = values.count(i)

  
#y = sorted(res.values(),reverse=True)
#x = sorted(res.values(),reverse=True)
#for k in sorted(res.values(),reverse=True):
#  print(k,end=' ')

for key, value in sorted(res.items(), key = itemgetter(1), reverse = True):
    while value:
      print(key,end=' ')
      value-=1