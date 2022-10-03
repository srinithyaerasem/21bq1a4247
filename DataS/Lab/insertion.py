def insertion(a):
    for i in range(1,len(a)):
        j=i-1
        nxtele=a[i]
        while(a[j]>nxtele and j>=0):
            a[j+1]=a[j]
            j=j-1
        a[j+1]=nxtele
    print(a)
n=int(input("Enter size of array:"))
arr=[]
for i in range(n):
    ele=int(input("Enter element"))
    arr.append(ele)
insertion(arr)