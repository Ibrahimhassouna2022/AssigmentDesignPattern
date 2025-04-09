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
public class B implements DataBus.Subscribter{
    
     void sendToAll(String text) {
        DataBus.BusMessage<String> b = new DataBus.BusMessage<>();
        b.setData(text);
        b.setSender(this);
        DataBus.getInstance().publisher(b);

    }
    @Override
    public void messageRecived(DataBus.BusMessage b) {
        System.out.println("B recived " + b.getData() + " from" + b.getSender().getClass().getName());
    }
}
