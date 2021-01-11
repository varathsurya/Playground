x = int(input())
vals = list(map(int,input().split()))
pillar = list(map(int,input().split()))
count=0
for i in vals:
  if pillar[0]%i==0:
    if pillar[-1]%i==0:
      count+=1
  
print(count)