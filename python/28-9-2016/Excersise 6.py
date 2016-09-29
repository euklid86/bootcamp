ans=[]
for i in range (0,3):
    for j in range (0,3):
        print("Give a number with", j+1," digits: ", end=" ")
        x=input()
        ans.append(x)
print(ans)
for i in range (0,9):
        if len(ans[i])==1:
            print("  ",ans[i],"+",end="")
print()
for i in range (0,9):
        if len(ans[i])==2:
            print(" ",ans[i],"+",end="")
print()
for i in range (0,9):
        if len(ans[i])==3:
            print("",ans[i],"+",end="")
print()
