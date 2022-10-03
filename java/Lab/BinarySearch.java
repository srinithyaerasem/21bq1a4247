import java.lang.*;
import java.util.*;
class BinarySearch{
int search(int a[],int low,int high,int key)
{
int mid;
while (low<=high)
{
mid=(low+high)/2;
if(a[mid]==key)
{
return mid;
}
else if(a[mid]>key)
{
high=mid-1;
}
else
{
low=mid+1;
}

}
return -1;
}
}