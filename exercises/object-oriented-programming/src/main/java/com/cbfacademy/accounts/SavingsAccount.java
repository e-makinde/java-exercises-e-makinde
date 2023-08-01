package main.java.com.cbfacademy.accounts;

public class SavingsAccount extends Account{
    final static private double INTEREST_PERCENTAGE = 6.7;


    public SavingsAccount(double balance, int accountNumber){
        super(balance, accountNumber);
    }

    public void addInterest() {
        double interestAmount = this.balance*(INTEREST_PERCENTAGE/100);
        this.balance = this.balance + interestAmount;
        
    }
    
}
