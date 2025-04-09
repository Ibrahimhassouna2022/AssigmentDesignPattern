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
public class BranchBankNablas {
    public static void main(String args[]){
    
  Scanner scanner = new Scanner(System.in); 
    
    Bank b= BankFactory.createAccount();
    
}

}
