spotlist=[]
table=[]
line=[]
spacespot=[]
spaces=[]
ans="y"
s='s'
g='g'
counts=0
countg=0
sspot=""
gspot=""
line=input("Enter the line: ")
anslen=len(line);
table.append(line)
if (line.count(s, 0, len(line))>0) :
    counts=counts+line.count(s, 0, len(line))
if (line.count(g, 0, len(line))>0) :
    countg=countg+line.count(g, 0, len(line))
ans=input("Do you want another line? (Y/N): ")
while ans=="y" or ans=="Y":
    line=input("Enter the line: ")
    while anslen!=len(line):
        line=input("Please enter the line again: ")
    if (line.count(s, 0, len(line))>0) :
        counts=counts+line.count(s, 0, len(line))
    if (line.count(g, 0, len(line))>0) :
        countg=countg+line.count(g, 0, len(line))
    table.append(line)
    ans=input("Do you want another line? (Y/N): ")
if counts==1 and countg==1 :
    print("Input OK!")
    for i in range (0, len(table)):
        for j in range (0, len(line)):
            if table[i][j]=="s":
                sspot=i+1,j+1;
                si=i+1
                sj=j+1
            if table[i][j]=="g":
                gspot=i+1,j+1;
                gi=i+1
                gj=j+1
            if table[i][j]==" ":
                spacespot.append(i+1)
                spacespot.append(j+1)
                spaces.append(spacespot)
                spacespot=[]
    spotlist.append(sspot)
    for i in range (0, len(spaces)):
        if (spaces[i][0]== spotlist[-1][0]) and (spaces[i][1]==spotlist[-1][1]+1):
            spotlist.append(spaces[i])
        elif (spaces[i][0]==spotlist[-1][0]+1) and (spaces[i][1]==spotlist[-1][1]):
            spotlist.append(spaces[i])
        '''else:
            spotlist=[]
            spotlist.append(sspot)'''
elif counts>1 :
    print("Multiple S!")
elif countg>1 :
    print("Multiple G!")
elif countg==0 :
    print("No G!")
elif counts==0 :
    print("No S!")
