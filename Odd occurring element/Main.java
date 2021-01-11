# Function to find odd occurring element in a given list
'''def findOddOccuring(A):
    xor = 0
    for i in A[0]:
        xor = xor ^ i
    return xor
'''
A=[]
n=int(input())
A=list(map(int,input().split()))
#print(findOddOccuring(A))
vals = set(A)

#print(vals)
for i in vals:
  x= A.count(i)
  if x%2!=0:
    res = i
print(res)