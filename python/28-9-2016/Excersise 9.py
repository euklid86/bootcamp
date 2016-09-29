x=input("Enter the shift: ")
x=int(x)
phrase=input("Enter the phrase: ")
phrase2=[]
for i in range(0,(len(phrase))):
    phrase2.append(ord(phrase[i]))
    a=int(phrase2[i])+x
    if a>90:
        a=a-26
    #print(a, end=" ")
    print(chr(a), end="")
    
print(phrase2)
