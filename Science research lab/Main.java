n=int(input())
arr = list(map(int, input().split()))

largest1 = 0
largest2 = 0
for i in range(0, n):
    temp = arr[i]
    if(temp >= largest1):
        largest2 = largest1
        largest1 = temp
    elif temp > largest2:
        largest2 = temp
        
print(largest1 + largest2)
    