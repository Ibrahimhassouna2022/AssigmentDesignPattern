/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Scanner;

 
public class BranchBankGaza {
    public static void main(String args[]){
    
  Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Global Bank!");
        System.out.println("Please choose an account type to create:");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");
        
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        System.out.print("Enter the bank name: ");
        String bankName = scanner.nextLine();

        System.out.print("Enter the bank location: ");
        String location = scanner.nextLine();

        if (choice == 1) {
            // Create a Checking Account
            System.out.print("Enter the initial balance for Checking Account: ");
            double balance = scanner.nextDouble();

            System.out.print("Enter the overdraft limit: ");
            double overdraftLimit = scanner.nextDouble();

            CheckingAccount checkingAccount = new CheckingAccount(bankName, location, balance, overdraftLimit);
            checkingAccount.displayBankInfo();
            System.out.println("Checking Account created successfully!");
            
            // Example operation
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            checkingAccount.withdraw(withdrawAmount);

        } else if (choice == 2) {
            // Create a Savings Account
            System.out.print("Enter the initial balance for Savings Account: ");
            double balance = scanner.nextDouble();

            System.out.print("Enter the interest rate: ");
            double interestRate = scanner.nextDouble();

            SavingsAccount savingsAccount = new SavingsAccount(bankName, location, balance, interestRate);
            savingsAccount.displayBankInfo();
            System.out.println("Savings Account created successfully!");
            
            // Example operation
            savingsAccount.addInterest();

        } else {
            System.out.println("Invalid choice. Please restart the application.");
        }

        scanner.close();
    }
    
    
    
}
