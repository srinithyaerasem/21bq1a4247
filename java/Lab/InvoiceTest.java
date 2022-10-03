import java.util.*;
public class InvoiceTest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Invoice v1=new Invoice();
        System.out.println("Enter the invoice number");
        String invoi=sc.next();
        sc.nextLine();
        System.out.println("Enter the description");
        String des=sc.nextLine();
        System.out.println("Enter the quantity");
        int quan=sc.nextInt();
        System.out.println("Enter the price per item");
        double price=sc.nextDouble();
        v1.assignNum(invoi);
        v1.assigndes(des);
        v1.assignqua(quan);
        v1.assignprice(price);
        System.out.println("The invoice amoutnt:"+v1.getInvoiceAmount());
    }
}