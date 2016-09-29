x=input("Enter an 8-bit binary number: ")
count=0
for i in range (0,len(x)-1):
    if int(x[i])==1:
        count+=1
if (int(x[-1])==1 and count%2==1) or int(x[-1])==0 and count%2==0:
    print("Parity check OK")
else: print ("Parity check not OK")
