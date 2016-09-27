import math
a=float(input("Please give the a side: "))
b=float(input("Please give the b side: "))
c=float(input("Please give the c side: "))
subtotal=(a+b+c)*(b+c-a)*(a-b+c)*(a+b-c)
ssubtotal=math.sqrt(subtotal)
total=1/4 * ssubtotal
print("The area of the triangle is :", total)
