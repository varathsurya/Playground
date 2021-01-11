x = input()
z=[]
for i in x:
  if i not in z:
    z.append(i)
ans = ''.join(z[i] for i in range(len(z)-1,-1,-1))
print(ans)