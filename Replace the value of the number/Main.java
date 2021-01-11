
n=int(input())
arr=[]

arr = list(map(int, input().split()))
temp=[]
for i in range(0,n):
    ele=0;
    temp.append(ele)
for i in range(0,n):
    m=arr[i]
    temp[m]=i;
for i in range(0,n):
    arr[i]=temp[i];

for i in range(0,n):
    print(arr[i],end=' ')
print()

   