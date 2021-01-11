str1=input()
str2=input()
j=0;
for i in range(0,len(str1)):
  try:
    if str1[i]==str2[j]:
      j=j+1;
    else:
      print(str1[i],end='');
  except:
    print(str1[i],end='');
if j==len(str1):
  print("NA");