/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Scanner;

/**
 *
 * @author ABu_Alkhel
 */
public class BankFactory {
    
  public static Bank createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose an account type to create:");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter the bank name: ");
        String bankName = scanner.nextLine();

        System.out.print("Enter the bank location: ");
        String location = scanner.nextLine();

        switch (choice) {
            case 1:
                // Create a Checking Account
                System.out.print("Enter the initial balance for Checking Account: ");
                double checkingBalance = scanner.nextDouble();

                System.out.print("Enter the overdraft limit: ");
                double overdraftLimit = scanner.nextDouble();

                return new CheckingAccount(bankName, location, checkingBalance, overdraftLimit);

            case 2:
                // Create a Savings Account
                System.out.print("Enter the initial balance for Savings Account: ");
                double savingsBalance = scanner.nextDouble();

                System.out.print("Enter the interest rate: ");
                double interestRate = scanner.nextDouble();

                return new SavingsAccount(bankName, location, savingsBalance, interestRate);

            default:
                System.out.println("Invalid choice. Account creation aborted.");
                return null;
           }
    }
    
    
}
