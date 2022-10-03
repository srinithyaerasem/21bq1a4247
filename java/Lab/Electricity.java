import java.util.Scanner;
class Electricity
{
    long Consumer_number;
    String Consumer_name;
    long Previous_reading;
    long Current_reading;
    String eb_connection;
    Electricity(long no, String name,long pr,long cr,String eb)
    {
        Consumer_number=no;
        Consumer_name=name;
        Previous_reading=pr;
        Current_reading=cr;
        eb_connection=eb;
    }
    double rate()
    {
        double p=0.0;
        double c=Current_reading-Previous_reading;
        if(eb_connection.equals("domestic"))
        {
            if((c)<=100)
            p=c*1;
            else if((c)<=200)
            p=1*(100)+(c-100)*2.50;
            else if((c)<=500)
            p=1*(100)+(200*2.50)+(c-500)*4;
            else
            p=1*(100)+(200*2.50)+(500*4)+((c-800)*6);
        }
        else
        {
            if((c)<=100)
            p=c*2;
            else if((c)<=200)
            p=(100*2)+((c-100)*4.50);
            else if((c)<=500)
            p=(100*2)+(200*4.50)+((c-500)*6);
            else if((c)>501)
            p=(100*2)+(200*4.50)+(500*6)+((c-800)*7);
        }
        return p;
    }
}