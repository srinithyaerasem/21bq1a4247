import java.util.*;
class Invoice
{
    private String number;
    private String description;
    private int quantity;
    private double price;
    void assignNum(String number)
    {
        this.number=number;
    }
    void assigndes(String description)
    {
        this.description=description;
    }
    void assignqua(int quantity)
    {
        if(quantity>=0)
        this.quantity=quantity;
        else
        this.quantity=0;
    }
    void assignprice(double price)
    {
        if (price>=0){
          this.price=price;  
        }
        
        else
        {
          this.price=0.0;  
        }
        
    }
    String getnumber()
    {
        return number;
    }
    String getdescription()
    {
        return description;
    }
    int getquantity()
    {
        return quantity;
        
    }
    double getprice()
    {
        return price;
    }
    double getInvoiceAmount()
    {
        return (getprice()*getquantity());
    }
}