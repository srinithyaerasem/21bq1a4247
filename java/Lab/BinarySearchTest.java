import java.util.*;
public class BinarySearchTest
{
public static void main(String args[])
{
BinarySearch obj=new BinarySearch();
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter "+n+" elements:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter key:");
int key=sc.nextInt();
int result=obj.search(a,0,n-1,key);
if(result==-1)
System.out.println("Key not found");
else
System.out.println("Key found at "+result);
}
}