package main.java.com.cbfacademy.accounts;


public class Main {
    public static void main(String[] args) {

    CurrentAccount sarahCurrentAccount = new CurrentAccount(100, 1, 50);
    
    System.out.println(sarahCurrentAccount.balance);
    sarahCurrentAccount.deposit(50);
    System.out.println(sarahCurrentAccount.balance);


    }
    
}
