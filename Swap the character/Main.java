vowels = ['a','e','i','o','u']
first = input().strip()
x = ''.join('$' if i.lower() in vowels else i for i in first)
second = input().strip()
y = ''.join('#' if i.lower() not in vowels else i for i in second)
third = input()
z = third.upper()
print(x+y+z)