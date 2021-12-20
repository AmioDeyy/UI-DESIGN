package amio;

import javax.swing.*;
import java.awt.*;

public class RegisterForm  extends JFrame {

    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton SubMitButton;
    RegisterForm(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        Font f = new Font("Arial",1,20);

        l1 = new JLabel("User name:");
        l2 = new JLabel("Phone no:");
        l3 = new JLabel("Gender:");
        l4 = new JLabel("Email:");


        l1.setBounds(20,20,120,30);
        l1.setFont(f);
        l2.setBounds(20,80,100,30);
        l2.setFont(f);
        l3.setBounds(20,140,100,30);
        l3.setFont(f);
        l4.setBounds(20,200,100,30);
        l4.setFont(f);

        add(l1);
        add(l2);
        add(l3);
        add(l4);


        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();

        t1.setBounds(150,20,140,30);
        t1.setFont(f);
        t2.setBounds(150,80,140,30);
        t2.setFont(f);
        t3.setBounds(150,140,140,30);
        t3.setFont(f);
        t4.setBounds(150,200,140,30);
        t4.setFont(f);

        add(t1);
        add(t2);
        add(t3);
        add(t4);

        SubMitButton = new JButton("SUBMIT");
        SubMitButton.setFont(f);
        SubMitButton.setBounds(250,270,120,30);
        SubMitButton.setBackground(Color.CYAN);
        add(SubMitButton);







        setVisible(true);
    }
}
