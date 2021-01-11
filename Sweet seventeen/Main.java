x = list(input())[::-1]
power = 0
res = 0
order = 0
for i in x:
  if i.isdigit():
    res += int(i)*(17**power)
    power +=1
  else:
    order = ord(i) - ord('A') + 10
    res += order*(17**power)
    power+=1
print(res)
