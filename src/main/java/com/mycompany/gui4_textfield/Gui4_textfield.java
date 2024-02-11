/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui4_textfield;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class Gui4_textfield {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField t1, t2, t3;
        JButton btn;
        JLabel l1, l2, l3;

        l1 = new JLabel("ilk sayı");
        l1.setBounds(50, 10, 100, 30);

        t1 = new JTextField();
        t1.setBounds(50, 40, 200, 30);

        l2 = new JLabel("ikinci sayı");
        l2.setBounds(50, 70, 100, 30);

        t2 = new JTextField();
        t2.setBounds(50, 100, 200, 30);

        l3 = new JLabel("Toplam");
        l3.setBounds(50, 130, 100, 30);

        t3 = new JTextField();
        t3.setBounds(50, 160, 200, 30);
        t3.setEditable(false);

        btn = new JButton("Topla");
        btn.setBounds(50, 220, 200, 30);

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            int a, b, c;

            @Override
            public void actionPerformed(ActionEvent e) {
                a = Integer.parseInt(t1.getText());
                b = Integer.parseInt(t2.getText());
                c = a + b;
                String toplam = String.valueOf(c);
                t3.setText(toplam);
            }

        });

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
