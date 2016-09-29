x=input("Enter an 9 digit number: ")
space=" "
for i in range (0,3):
    print(space*i, end="")
    for j in range (i,len(x),3):
        print(x[j], end="  ")
    print()
    
