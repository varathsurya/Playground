n=int(input())
m1=int(input())
p1=int(input())
m2=int(input())
p2=int(input())
count=0
cost=0
flag = 0
	
while 1: 
    if count == n:
        print(cost)
        break
    elif count < n:
        count=count+m1;
        cost=cost+p1;
    elif count > n:
        if flag == 0:
            count=count -(2*m1);
            cost=cost - (2*p1);
            flag = 1;
        count=count+m2;
        cost=cost+p2;
