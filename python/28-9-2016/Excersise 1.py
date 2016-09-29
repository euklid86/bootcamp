x=input("Enter Tax Identification Number: ")
sum=0
for i in range (2,len(x)+1):
    sum=sum+(int(x[-1*i])*(2**(i-1)))
sum=sum%11
sum=sum%10
if sum==int(x[-1]):
    print("Tax Identification Number valid.")
else: print("Tax Identification Number NOT valid.")
