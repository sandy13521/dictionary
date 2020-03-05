package com.ui;

import com.database.ConnectToDB;
import com.database.ListWorddb;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import javax.swing.*;


public class Front {
	public static Connection conn = null;
	public static void main(String args[]) {
		JFrame front = new JFrame("Dictionary");
		front.setVisible(true);
		front.setBounds(100, 100, 500, 430);
//		front.setLayout(null);

		front.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		conn = ConnectToDB.main();

		JButton b1 =new JButton("Edit Dictionary");
		b1.setBounds(0, 0, front.getWidth(), 100);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
			}
		});
		
		JButton b2 =new JButton("Add Word");
		b2.setBounds(0, 100, front.getWidth(), 100);
		b2.setBackground(Color.CYAN);
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddWord.main(front);
			}
		});

		JButton b3 =new JButton("Test Yourself");
		b3.setBounds(0, 200, front.getWidth(), 100);
		b3.setBackground(Color.GREEN);
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
			}
		});

		JButton b4 = new JButton("List All Words");
		b4.setBounds(0, 300, front.getWidth(), 100);
		b4.setForeground(Color.black);
		b4.setBackground(Color.yellow);
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ListWorddb.main();
			}
		});

        front.add(b1);
        front.add(b2);
        front.add(b3);
        front.add(b4);


	}
}
