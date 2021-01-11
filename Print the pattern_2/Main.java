n = int(input())
p = n 
i = 1
while(i <= n):
    k = (i-1) * n + 1 
    for j in range (0,n-1):
        print(k,"*", end = ' ');
        k = k + 1 
        
    print(k)
    i = i + 2


if(n % 2 != 0):
    p = n - 1 

i = p 
while(i > 0):
    k = (i-1)*n+1 
    for j in range(0, n-1):
        print(k,"*", end = ' ');
        k = k + 1 
    print(k)
    i = i - 2
