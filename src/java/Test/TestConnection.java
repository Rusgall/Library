package Test;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.naming.InitialContext;
import javax.sql.DataSource;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Руслан
 */
public class TestConnection {
    public String check(){
        String s = "null";
        try{
            s="In";
            InitialContext ic = new InitialContext();
            s="1";
            DataSource ds = (DataSource) ic.lookup("jdbc/library");
            s="2";
            Connection connection = ds.getConnection();
            s="3";
            Statement stmt = connection.createStatement();
            s="4";
            ResultSet rs = stmt.executeQuery("Select * from book");
            s="5";
            while(rs.next()){
                s = rs.getString("name");
            }
        }catch(Exception e){
            System.out.print("Er");
        }
        return s;
                    
            
    }
}
