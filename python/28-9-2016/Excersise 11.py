import math
x=input("Enter limit: ")
ans=int(x)
y=[]
count=0
for i in range(ans+1):
    y.append(2**i)
for i in range(ans+1):
   if y.count(i)==0:
        if count<=9:
            count+=1
            print(i, end=" ")
        else:
            print (i)
            count=0
