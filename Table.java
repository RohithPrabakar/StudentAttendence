package com.Rohith;

import javax.swing.*;

public class Table{
    JFrame f;
    Table(String[][] data, String[] column) {
        f = new JFrame();
        final JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    Table(String[][] data, String[] column,String name){
        f = new JFrame();
        JTable jt = new JTable(data, column);
        JLabel l1 = new JLabel(name);
        JScrollPane sp = new JScrollPane(jt);
        f.add(l1);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
