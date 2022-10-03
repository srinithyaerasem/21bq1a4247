class SavingsAccount
{
    static double annualIntrestRate;
    private double SavingsBalance;
    void Account(double bal)
    {
        SavingsBalance=bal;
    }
    double CalculateMonthlyIntrest()
    {
        double intrest;
        intrest=SavingsBalance*(annualIntrestRate/12);
        SavingsBalance=SavingsBalance+intrest;
        return intrest;
    }
    static void ModifyIntrestRate(double newintrate)
    {
        annualIntrestRate=newintrate;
    }
    double getbalance()
    {
        return SavingsBalance;
    }
}