keys = ['break', 'case', 'continue', 'default', 'defer', 'else', 'for', 'func', 'goto', 'if', 'map', 'range', 'return', 'struct', 'type', 'var']
x = input()
if x in keys:
  print('{} is a keyword'.format(x))
else:
  print('{} is not a keyword'.format(x))