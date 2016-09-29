import math
a=int(input("Please give the a side: "))
b=int (input("Please give the b side: "))
c=int(input("Please give the c side: "))
d=b**2-(4*a*c)
if d<0 :
    print("No real value solution exists!")
else:
    x1=((-b)+math.sqrt((b**2)-(4*a*c)))/(2*a)
    x2=((-b)-math.sqrt((b**2)-(4*a*c)))/(2*a)
    print("The solutions are:", x1,"and", x2)
