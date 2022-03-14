package amio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterForm  extends JFrame {


    JLabel l1,l2;
    JTextField t1,t2;
    JButton C,F,K;
    RegisterForm(){
        setSize(470,380);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Currency Converter");



        Font f = new Font("Arial",1,20);




        l1 = new JLabel("input in BDT   :           ");
        l2 = new JLabel("Output            :");

        l1.setBounds(20,70,210,30);
        l1.setFont(f);
        l2.setBounds(20,130,200,30);
        l2.setFont(f);


        add(l1);
        add(l2);


        t1 = new JTextField();
        t2 = new JTextField();

        t1.setBounds(200,70,200,30);
        t1.setFont(f);
        t2.setBounds(200,130,240,30);
        t2.setFont(f);
        t2.setEditable(false);


        add(t1);
        add(t2);


        K = new JButton("AUS");
        K.setFont(f);
        K.setBounds(290,280,100,30);
        K.setBackground(Color.BLUE);
        K.setForeground(Color.WHITE);
        add(K);

        F = new JButton("USA");
        F.setFont(f);
        F.setBounds(170,280,100,30);
        F.setBackground(Color.yellow);
        add(F);

        C = new JButton("IND");
        C.setFont(f);
        C.setBounds(50,280,100,30);
        C.setBackground(Color.RED);
        C.setForeground(Color.WHITE);
        add(C);

        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double d = Double.parseDouble(t1.getText());
                double d1 = (d / 1.16);
                String str1 = String.valueOf(d1);
                t2.setText(str1);
            }
        });
        F.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(t1.getText());
                double d2 = (d/85.89);
                String str2 = String.valueOf(d2);
                t2.setText(str2);

            }
        });
        K.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(t1.getText());
                double d3 = (d/61.77);
                String str3 = String.valueOf(d3);
                t2.setText(str3);
            }
        });






        setVisible(true);
    }



}
