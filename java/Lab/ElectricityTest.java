import java.util.Scanner;
public class ElectricityTest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter consumer number");
        long number=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter consumer name");
        String name=sc.nextLine();
        System.out.println("Enter previous month reading");
        long pr=sc.nextLong();
        System.out.println("Enter current month reading");
        long cr=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter connection type");
        String eb=sc.nextLine();
        Electricity e=new Electricity(number,name,pr,cr,eb);
        System.out.println("The bill amount to be paid:"+e.rate());
    }
}