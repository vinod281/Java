package com.mycompany.bankobj;


public class CheckingAccount extends BankAccount
{
    private static final double interestRate=0.02;
    
    
    
    @Override
    public void calculateInterest()
    {
        double interest=getBalance()*interestRate;
        System.out.println("Interest for the checking account : "+interest);
    }
}
