/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author ABu_Alkhel
 */
public class CheckingAccount extends Bank {
    private double balance;
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String bankName, String location, double balance, double overdraftLimit) {
        super(bankName, location);
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    // Getter and Setter methods
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Method to withdraw from account
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
