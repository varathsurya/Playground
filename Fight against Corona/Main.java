str=input()
h=int(str[0:2])
m=int(str[3:5])
time=int(0)
while (h % 10 != m // 10 or h // 10 != m % 10):
    m=m+1
    if(m==60):
        m=0
        h=h+1
    if(h==24):
        h=0
    time=time+1
print(time)