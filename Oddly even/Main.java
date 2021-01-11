#x = list(map(int, input().split()))
x = input()
y = [int(x[i]) for i in range(0,len(x))]
even = 0
odd = 0
for i in range(len(y)):
  if i%2 == 0:
    odd+=y[i]
  else:
    even+=y[i]
sums = even-odd
print(abs(sums))