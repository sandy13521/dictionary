package com.database;

import com.ui.Front;
import java.sql.PreparedStatement;

public class AddWorddb {
    public static boolean main(String word,String meaning){
        try {
            String sql = "INSERT INTO collection (Word,Meaning) VALUES (?,?)";
            PreparedStatement pst = Front.conn.prepareStatement(sql);
            pst.setString(1,word);
            pst.setString(2,meaning);
            int i = pst.executeUpdate();
            if(i==1) {
                System.out.println("Successfully Inserted " + word);
                return true;
            }
            else{
                System.out.println("The Word Couldn't be Inserted");
                return false;
            }
        }
        catch (Exception e) {
            return false;
        }
    }
}