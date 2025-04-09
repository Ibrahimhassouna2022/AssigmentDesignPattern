/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bractes;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ABu_Alkhel
 */
public class MyFrame2 extends JFrame{
    String name;
    int age;
    @Override
    public String toString() {
        return  "name=" + name + ", Age=" + age + '}';
    }

    
   // Object Gender[];

    public MyFrame2(String name,int age) {
        this.name = name;
        this. age =  age;
    }
 public  MyFrame2(String title){
        super(title);
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(MyFrame2.EXIT_ON_CLOSE);
        Container c=getContentPane();
        setLayout(new FlowLayout());
//        JLabel lb1=new JLabel("User Name::");
//        Font f=new Font("Arial",Font.BOLD,25);
//        lb1.setFont(f); 
//        JTextField tf=new JTextField(15);
//        tf.setFont(f);
//        tf.setForeground(Color.DARK_GRAY);
//        JLabel lb2=new JLabel("Age");
//        JTextField tf2=new JTextField(10);
//         tf2.setFont(f);
//        tf2.setForeground(Color.DARK_GRAY);
             MyFrame2 m1,m2,m3;
                 m1=new MyFrame2("Ali", 15);
                 m2=new MyFrame2("Noor", 19);
                 m3=new MyFrame2("Gsasa", 55);
                 MyFrame2 arr[]={m1,m2,m3}; 
//String arr[]={"j","p","c++","c#"};
//        JRadioButton r1=new JRadioButton("M");
//        JRadioButton r2=new JRadioButton("F");
//        ButtonGroup bg=new ButtonGroup();
//        bg.add(r1);
//        bg.add(r2);

       JButton bt=new JButton("move>>");
        JList ls;
        ls=new JList(arr);
             JTextArea ta=new JTextArea(5, 6);
            
             c.add(ta);

           
       bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//               MyFrame2 s=(MyFrame2)ls.getSelectedValue();
//            JList  ls2=new JList();
//            c.add(ls2);
          
//           ta.setText(arr[0].name+" "+arr[0].age);
           ta.setText(arr[1].name+" "+arr[1].age);
//            ta.setText(arr.toString());
//            ls2.setListData(ls.getSelectedValues());
            
            } });
              c.add(ls); 
       c.add(bt);
//        c.add(lb1);
//        c.add(tf);
//        c.add(lb2);
//        c.add(tf2);
//        c.add(r1);
//        c.add(r2);
       this. setVisible(true);
    
    }
    
    
}
