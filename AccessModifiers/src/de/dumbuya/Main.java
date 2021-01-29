package de.dumbuya;

// This program demonstrates the use of an AccessModifier

public class Main {

    public static void main(String[] args) {
        Account mosesAccount = new Account("Moses");
        mosesAccount.deposit(1000);
        mosesAccount.withdraw(500);
        mosesAccount.withdraw(-200);
        mosesAccount.deposit(-20);
        mosesAccount.calculateBalance();
        System.out.println("Balance on account is " + mosesAccount.getBalance());

        mosesAccount.calculateBalance();
    }
}
