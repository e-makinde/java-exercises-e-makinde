package main.java.com.cbfacademy.accounts;

public class Account {
    // Creating instance variables. Balance is protected (not private) so that it can be accessed in other classes within the pacakage.
    protected double balance;
    private int accountNumber;

    //Constructor. Updates the instance variables.
    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Update balance by adding deposit amount to current balance
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    // Only allow a withdrawal if the withdrawal amount is less than or equal to the current balance, or the withdrawal amount is a positive number.
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount>this.balance){
            System.out.println("not enough funds in balance.");
        } else if (withdrawalAmount<0) {
            System.out.println("Cannot withdraw a negative number. Nice try!");
        } else {
            this.balance -= withdrawalAmount;
        }
        
    }
}