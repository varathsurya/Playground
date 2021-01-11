x = input()
y = set(x)
count=0
for i in y:
  if x.count(i)==1:
    count+=1
    
    
print(count)