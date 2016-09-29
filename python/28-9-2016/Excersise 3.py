x=input("Enter an 10 digit number: ")
for i in range (0,len(x)):
    if int(x[i])%2==1:
        print (x[i], end=" ")
print()
print(end=" ")
for i in range (0,len(x)):
    if int(x[i])%2==0:
        print (x[i], end=" ")

