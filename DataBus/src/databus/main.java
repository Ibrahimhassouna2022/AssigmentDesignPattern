/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databus;

public class main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        DataBus.getInstance().subscriper(a);
        DataBus.getInstance().subscriper(b);
        DataBus.getInstance().subscriper(c);
        a.sendToAll("Financeing");
        System.out.println("----------------------------");
        b.sendToAll("Helloworkd");
    }
}
