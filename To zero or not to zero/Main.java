x, y = map(int, input().split())
for i in range(x,y+1):
  if y>=100:
    print('%03d' %i, end = ' ')
  elif y>=10:
    print('%02d' %i, end = ' ')
  else:
    print(i, end = ' ')