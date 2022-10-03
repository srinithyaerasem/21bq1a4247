public class SavingsAccountTest
{
    public static void main(String args[])
    {
        SavingsAccount saver1=new SavingsAccount();
        SavingsAccount saver2=new SavingsAccount();
        saver1.Account(2000);
        saver2.Account(3000);
        SavingsAccount.ModifyIntrestRate(0.04);
        saver1.CalculateMonthlyIntrest();
        saver2.CalculateMonthlyIntrest();
        System.out.println("Balance of saver 1 is"+saver1.getbalance());
        System.out.println("Balance of saver 2 is"+saver2.getbalance());
        SavingsAccount.ModifyIntrestRate(0.05);
        saver1.CalculateMonthlyIntrest();
        saver2.CalculateMonthlyIntrest();
        System.out.println("Balance of saver 1 is"+saver1.getbalance());
        System.out.println("Balance of saver 2 is"+saver2.getbalance());
    }
}