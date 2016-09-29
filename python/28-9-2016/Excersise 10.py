x=input("Enter binary sequence: ")
ones=['0']
zeros=['0']
maxone=0
maxzero=0
for i in range(0,(len(x))):
    if int(x[i])==0:
        if (int(x[i])==int(x[i-1])):
            zeros.append(x[i])
            if maxzero<len(zeros):
                maxzero=len(zeros)
        else:
            zeros=[]
    if int(x[i])==1:
        if (int(x[i])==int(x[i-1])):
            ones.append(x[i])
            if maxone<len(ones):
                maxone=len(ones)
        else:
            ones=[]
if (maxzero+1==maxone+1):
    print("Equal longest run of ones and zeros with length: ", maxzero)
elif (maxzero+1>maxone+1):
    print("Longest run was zeros with length: ", maxzero+1)
else: print("Longest run was ones with length: ", maxone+1)
