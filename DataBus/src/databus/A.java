/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databus;

import databus.DataBus.BusMessage;
import databus.DataBus.Subscribter;

/**
 *
 * @author ABu_Alkhel
 */
public class A implements Subscribter {
//

    void sendToAll(String text) {
        FinanceMessage<String> b = new FinanceMessage<>();
        b.setData(text);
        b.setSender(this);
        DataBus.getInstance().publisher(b);

    }

    @Override
    public void messageRecived(DataBus.BusMessage m) {
               System.out.println("A recived " + m.getData() + " from" + m.getSender().getClass().getName());

    }

}
