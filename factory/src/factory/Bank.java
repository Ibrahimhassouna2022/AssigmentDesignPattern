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
public class Bank {

    private String bankName;
    private String location;

    // Constructor
    public Bank(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
    }

    // Getter and Setter methods
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Method to display bank information
    public void displayBankInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Location: " + location);
    }
}
