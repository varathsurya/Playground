
n=int(input())
c=[]
for i in range(0,n):
    x=int(input())
    c.append(x)
i=1;

count=0
while True:
    if i!=n:
        if c[n-i]!=0 :
            count=count+1
            c[n-i]=c[n-i]-1;
            count=count+1;
            c[0]=c[0]-1;
        else:
            i=i+1;
    else:
        break;
print(count+1)
    