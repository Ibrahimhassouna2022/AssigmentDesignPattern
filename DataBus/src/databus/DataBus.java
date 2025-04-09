package databus;

import java.util.ArrayList;
import java.util.List;

public class DataBus {
//SingleTon:: resone only one object from data Bus.  

    private static DataBus instance;
    private List<Subscribter> list;//creational arrayList for benfit added classes that implement for interfac 

    private DataBus() {
        list = new ArrayList<>();
    }
    //method add object
    public void subscriper(Subscribter s) {
        if (!list.contains(s)) {
            list.add(s);
        }
    }
//remove
    public void Unsubscriper(Subscribter s) {
        if (list.contains(s)) {
            list.remove(s);
        }
    }

    public static DataBus getInstance() {
        if (instance == null) {
            instance = new DataBus();
        }
        return instance;
    }

    void publisher(BusMessage m) {
        for (Subscribter s : list) {
            if (s != m.getSender()) {
                s.messageRecived(m);
            }
        }
    }
//any class wanted in Bus only make Imlements from interface.
    public interface Subscribter {

       public void messageRecived(BusMessage b);

    }
// 1- to access to class DataBUSE and accssing for method getInstance()
   
    public static class BusMessage<T> {
//2- make inner method contain message that any class sented data and name sender
        T data;//Genric
        Subscribter sender;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Subscribter getSender() {
            return sender;
        }

        public void setSender(Subscribter sender) {
            this.sender = sender;
        }

    }

}
