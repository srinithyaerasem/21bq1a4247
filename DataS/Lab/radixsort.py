def countingsort(array,place):
    size=len(array)
    output=[0]*size
    count=[0]*10
    for i in range(0,size):
        index=array[i]//place
        count[index%10]+=1
    for i in range(1,10):
        count[i]+=count[i-1]
    i=size-1
    while i>=0:
        index=array[i]//place
        output[count[index%10]-1]=array[i]
        count[index%10]-=1
        i-=1
    for i in range(0,size):
        array[i]=output[i]
def radixsort(array):
    max_element=max(array)
    place=1
    while max_element//place>0:
        countingsort(array,place)
        place*=10
a=[]

n=int(input("Enter the size of list:"))
for i in range(n):
    x=int(input("Enter element:"))
    a.append(x)
print("Before sorting",a)
radixsort(a)
print("After sorting",a)