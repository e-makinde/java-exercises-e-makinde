package main.java.com.cbfacademy.accounts;

public class Account {
    protected double balance;
    private int accountNumber;

    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }


    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

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