names={}
n=int(input("Enter no.of items:"))
for i in range(n):
    names[i+1]=input("enter name{}:".format(i+1))
name=list(names.values())
pos=int(input("Enter a position:"))
name.sort(key=lambda x:x[pos-1])
print(name)