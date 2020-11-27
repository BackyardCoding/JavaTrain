package de.dumbuya;

import org.w3c.dom.ls.LSOutput;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount(){
        this("34", 2.50, "Default Name","Default Address","Default Phone");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("Account constructor called with parameters.");
        this.number = number;
        this.balance= balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999",100.5,customerName,customerEmail,customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double funds) {
        this.balance += funds;
    }

    public void withdraw(double funds) {
        if (this.balance - funds < 0) {
            System.out.println("Insufficient funds. You cant withdraw the amount of " + funds + ". Your balanc is " + this.balance + ".");
        } else if (funds == 0) {
            System.out.println("The chosen amount to withdraw is 0. So your balance wil still be: " + this.balance + ".");
        } else if (funds < 0) {
            System.out.println("The input value is negative and therefore invalid.");
        } else {
            this.balance -= funds;
            System.out.println("You have withdrawn " + funds + ".");
            System.out.println("Your new balance is: " + this.balance + ".");
        }
    }


}
