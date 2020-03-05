package com.ui;

import com.database.AddWorddb;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddWord {
    public static void main(JFrame front){
        JFrame addf = new JFrame("Add Word To Dictionary");
        addf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addf.setLayout(null);
        addf.setBounds(200,200,500,600);
        addf.setVisible(true);

        JLabel wordDisplay = new JLabel("Enter the Word Here : ");
        wordDisplay.setBounds(50,60,200,25);

        JTextField wordHolder= new JTextField();
        wordHolder.setBounds(50,100,200,40);


        JLabel meaning = new JLabel("Enter the Meaning Here : ");
        meaning.setBounds(50,150,200,30);

        JTextField emeaning = new JTextField();
        emeaning.setBounds(50,190,200,100);

        JButton add = new JButton("Add Word");
        add.setBounds(100,300,100,50);
        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AddWorddb.main(wordHolder.getText(),emeaning.getText());
            }
        });

        addf.add(wordDisplay);
        addf.add(wordHolder);
        addf.add(meaning);
        addf.add(emeaning);
        addf.add(add);
    }

}
