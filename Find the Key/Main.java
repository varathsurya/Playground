a,b,c=map(int,input().split())
num=int(0)
for i in range(4):
    if(i%2==0):
        x=a%10
        y=b%10
        z=c%10
        largest=x if x>y and x>z else y if y>x and y>z else z
        num = largest*int(pow(10,i))+num;
        a=a//10
        b=b//10
        c=c//10
    else:
        x=a%10
        y=b%10
        z=c%10
        smallest=x if x<y and x<z else y if y<x and y<z else z
        num = smallest*int(pow(10,i))+num;
        a=a//10
        b=b//10
        c=c//10
print(num)