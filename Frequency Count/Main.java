x = input()
y = list(set(x))
#y.sort()
c = {}
for i in y:
  c[i] = x.count(i)
  
#print(c)  
for key, value in sorted(c.items()):
  print(key,end='')
  print(value,end='')