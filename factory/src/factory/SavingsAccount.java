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
public class SavingsAccount extends Bank {
    private double balance;
    private double interestRate;

    // Constructor
    public SavingsAccount(String bankName, String location, double balance, double interestRate) {
        super(bankName, location);
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Getter and Setter methods
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Method to add interest
    public void addInterest() {
        balance += balance * (interestRate / 100);
        System.out.println("Interest added. New balance: " + balance);
    }
}
