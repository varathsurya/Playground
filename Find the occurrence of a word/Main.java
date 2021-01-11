sentence = list(input().split())
word = input()
#print(sentence)
val = 0
for i in sentence:
  if word in i:
    val+=1
print('Occurrences = ',end='')
print(val)