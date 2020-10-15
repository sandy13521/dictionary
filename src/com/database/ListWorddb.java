package com.database;

import com.ui.Front;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListWorddb {
    public static void main() {
        JFrame dicFrame = new JFrame("List Of Word");
        dicFrame.setBounds(100, 100, 500, 600);
        dicFrame.setVisible(true);
        dicFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        dicFrame.setTitle("List Of Word In Dictionary");

        JTable list = new JTable();

        String columnNames[] = {"Sno.","Word","Meaning"};
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        try {
            Statement st = Front.conn.createStatement();
            String sql = "select * from collection";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int sno= rs.getInt(1);
                String w =rs.getString(2);
                String m = rs.getString(3);
                model.addRow(new Object[]{sno,w,m});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        list.setModel(model);
        dicFrame.add(list);
    }
}
