x = input()
vowels = ['a','e','i','o','u']
y=''
for i in x:
  if i.lower() in vowels:
    continue
  else:
    #y.append(i)
    y+=i

#res = ''.join(y)
#print(res)
print(y)