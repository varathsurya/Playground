T=int(input())
A=[]
n=int(input())         
m=int(input())
for i in range(0,n):
    row=[]                                        
    for j in range(0,m): 
        row.append(int(input()))               
    A.append(row)                              

# print(A)
B=[]
for i in range(0,n): 
   row=[]                                       
   for j in range(0,m): 
      row.append(int(input()))             
   B.append(row)                           
# print(B)

result=[]                                         
result=[[0]*m]*n 
# print(result)
for i in range(0,n):
    for j in range(0,m):
        # print(A[i][j])
        # print(B[i][j])
        result[i][j] = A[i][j] + B[i][j] 
        print(result[i][j],end=" ")

# for i in range(0,n):    
#     for j in range(0,m):
#         print(result[i][j],end=" ") 