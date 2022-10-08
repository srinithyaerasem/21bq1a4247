def display(name,salary,exp):
    ta=int(input("enter ta"))
    da=int(input("enter da"))
    hra=int(input("enter tra"))
    if exp>=2:
        bonus=int(input("enter the bonus:"))
    else:
        bonus=0
    print("the person name is :",name)
    print("the prson salary is :",(ta+da+bonus+salary))
d={}
for i in range(5):
    n=input("enter the name:")
    sal=float(input("enter salary:"))
    d[n]=sal
    exp=float(input("enter the experiance:"))
for name in d:
    display(name,d[name],exp)