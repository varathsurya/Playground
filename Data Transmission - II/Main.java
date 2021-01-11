x = input()
y = x[::-1]
length = len(x)
count=0
for i in range(length):
  if y[i]==x[i]:
    count+=1
print(count)