/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment1;

import java.util.Scanner;

/**
 *
 * @author ABu_Alkhel
 */
public class Euclidean {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Num1::");
        int n1 = s.nextInt();

        System.out.print("Enter First Num2::");
        int n2 = s.nextInt();
        int reminder = 1;
        System.out.println("GCD(" + n1 + "," + n2 + ")");

        while (reminder != 0) {
            if (n1 > n2) {
                reminder = n1 % n2;
                n1 = n2;
                n2 = reminder;
                System.out.print("GCD(" + n1 + "," + n2 + ")=");
            } else if (n2 > n1) {
                reminder = n2 % n1;
                n2 = reminder;
                System.out.print("GCD(" + n2 + "," + n1 + ")=");

            }

        }
        System.out.println("" + n1);
    }

}
