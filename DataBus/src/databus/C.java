/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databus;

/**
 *
 * @author ABu_Alkhel
 */
public class C implements DataBus.Subscribter{
         void sendToAll(String text) {
        DataBus.BusMessage<String> b = new DataBus.BusMessage<>();
        b.setData(text);
        b.setSender(this);
        DataBus.getInstance().publisher(b);

    }
    @Override
    public void messageRecived(DataBus.BusMessage m) {
        if (m instanceof FinanceMessage) {
            System.out.println("C recived " + m.getData() + " from" + m.getSender().getClass().getName());
        } else {
            System.out.println("Nothing");
        }
    }
}
