s = int(input())
n = int(input())
m = int(input())

res = ((((s**n)%10)**m)%1000000007)
print(res)