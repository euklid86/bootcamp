x=input("Enter the year: ")
y=int(x)
a=y%4
b=y%7
c=y%19
d=((19*c)+15)%30
e=((2*a)+(4*b)-d+34)%7
month=(d+e+114)//31
day=((d+e+114)%31)+14
if month==3:
    if day>31:
        month=4
        day=day-31
elif month==4:
    if day>30:
        month=5
        day=day-30
else:
    if day>30:
        month=6
        day=day-31
print("Day: ", day, "Month: ",month)
