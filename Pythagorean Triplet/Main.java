n = int(input())
for i in range(1, n+1):
    for j in range(i+1, n+1):
        for k in range(j+1, n+1):
            if((i*i+j*j) == (k*k)):
                print(i,end="\t")
                print(j,end="\t")
                print(k)