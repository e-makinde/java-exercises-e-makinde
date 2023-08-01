package main.java.com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;


    public CurrentAccount(double balance, int accountNumber, double overdraftLimit) {
        super(balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount>(this.balance+this.overdraftLimit)){
            System.out.println("Not enough funds in balance and overdraft.");
        } else if (withdrawalAmount<0) {
            System.out.println("Cannot withdraw a negative number. Nice try!");
        } else {
            this.balance -= withdrawalAmount;
        }
    }
    
}
