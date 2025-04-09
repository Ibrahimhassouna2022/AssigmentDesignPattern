/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bractes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ABu_Alkhel
 */
public class NewClass {
    static  Scanner s=new Scanner(System.in);

    ArrayList <Integer>list  =new ArrayList();
    void myAdd(){
        System.out.println("Enter Elem::");
        int t=s.nextByte();
            list.add(t);
    }
    void myRemove(){
        System.out.println("Enter NUM::");
        byte t=s.nextByte();
            for (int i = 0; i < list.size(); i++) {
            if (list.contains(t))
                     list.remove(t);
            
        }
            
    }
    void p(){System.out.println(list);}
    void displayedview(){
        System.out.println("1.Add E\n2.Remove E\n3.Print E\n4-Exit");
    }
    
   void cc(){
    int chooice=s.nextInt();
    while(chooice!=4){
          switch(chooice){  
                case 1:
                    myAdd();
                    displayedview();
                    
                    break;
                case 2:
                    myRemove();
                    displayedview();
                    break;
                case 3:
                    p();
                    displayedview();
                    break;
                case 4:
                    System.exit(0);
                    break;
                            
          
          }
          chooice=s.nextInt();


}}
     public static void main(String[] args){
     
     NewClass m=new NewClass();
     m.cc();
     
     }
}
