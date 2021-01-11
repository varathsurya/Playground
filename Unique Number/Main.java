def printUnique(l,r):
    count = 0;
    for i in range (l, r + 1):
        num = i;
        visited = [0,0,0,0,0,0,0,0,0,0];
        while (num):
            if visited[num % 10] == 1:
                break;
            visited[num % 10] = 1;
            num = (int)(num / 10);
        if num == 0:
            count+=1
    if(count>0):
        print(count)
    else:
        print("No Unique Number")
l = int(input()); 
r = int(input()); 
printUnique(l, r); 