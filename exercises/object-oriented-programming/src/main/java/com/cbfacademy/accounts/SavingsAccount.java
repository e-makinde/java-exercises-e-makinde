package main.java.com.cbfacademy.accounts;

public class SavingsAccount extends Account{
    // Keeping the interest rate for all saving accounts the same.
    final static private double INTEREST_PERCENTAGE = 6.7;

    //Constructor for saving account object
    public SavingsAccount(double balance, int accountNumber){
        super(balance, accountNumber); // Inheriting from super(Account) class
    }


    public void addInterest() {
        double interestAmount = balance*(INTEREST_PERCENTAGE/100); // Calculate the 
        balance = balance + interestAmount;
        
    }
    
}
