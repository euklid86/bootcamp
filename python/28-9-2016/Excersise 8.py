print("Enter the number sequence:")
x=input()
sum=0
for i in range (0,(len(x)-1),2):
        sum=sum+(int(x[i])*int(x[i+1]))
if len(x)%2==1:
    sum=sum+int(x[-1])
print(sum)
