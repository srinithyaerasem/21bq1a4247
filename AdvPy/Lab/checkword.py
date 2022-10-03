words=["Arun","Varun","Kent",'Eat','Pot','Net','Peak','Peacock','Zebra','Nato','Toe','Poke','Knife','Poet','Venus','Ant']
list=['A','K','E','T','O','T','P','N',]
res=[]
for x in words:
    count=0
    for l in list:
        if l in x.upper():
            count+=1
            if count==len(x):
                res.append(x)
                

print("Words formed from given letters are:\n",res)