n=int(input());
r=n
while r>=2:
    for sp in range(1,(n-r)+1):
        print(end=' ')
    for star in range(1,(2*r-1)+1):
        print("*",end='')
    print()
    r=r-1

for r in range(1,n+1):
    for sp in range(1,(n-r)+1):
        print(end=' ')
    for star in range(1,(2*r-1)+1):
        print("*",end='')
    print()