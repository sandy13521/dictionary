package com.ui;

import com.database.AddWorddb;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class AddWord {
    private static JLabel result;
    public static void main(){
        JFrame addf = new JFrame("Add Word To Dictionary");
        addf.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        addf.setLayout(null);
        addf.setBounds(200,200,350,500);
        addf.setVisible(true);

        JLabel wordDisplay = new JLabel("Enter the Word Here : ");
        wordDisplay.setBounds(60,40,200,25);

        JTextField wordHolder= new JTextField();
        wordHolder.setBounds(60,70,200,40);

        JLabel meaning = new JLabel("Enter the Meaning Here : ");
        meaning.setBounds(60,150,200,30);

        JTextField emeaning = new JTextField();
        emeaning.setBounds(60,180,200,40);
        emeaning.setAutoscrolls(true);

        result = new JLabel();
        result.setBounds(60,330,300,100);
        result.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));

        JButton add = new JButton("Add Word");
        add.setFont(Font.getFont(Font.MONOSPACED));
        add.setBounds(90,250,100,40);
        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(wordHolder.getText()+ "\t" + emeaning.getText());
                if(AddWorddb.main(wordHolder.getText(),emeaning.getText())) {
                    result.setText("Inserted " + wordHolder.getText() + " successfully");
                    emeaning.setText("");
                    wordHolder.setText("");
                }
                else
                    result.setText("Could Not Inserted " + wordHolder.getText() + " , Try Editing ");
            }
        });

        addf.add(wordDisplay);
        addf.add(wordHolder);
        addf.add(meaning);
        addf.add(emeaning);
        addf.add(add);
        addf.add(result);
    }

}
