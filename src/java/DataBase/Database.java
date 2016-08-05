/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import javax.naming.InitialContext;
import javax.sql.DataSource;



/**
 *
 * @author Руслан
 */
public class Database {
    final private String JDBC = "jdbc/library";
    private InitialContext ic = null;
    private Connection connect = null;
    private DataSource ds = null;
    
    public Connection getConnection(){
        try{
            ic = new InitialContext();
            ds = (DataSource) ic.lookup(JDBC);
            if(connect == null)
                connect = ds.getConnection();
        }catch(Exception e){
            System.out.println("ErDatabse");
        }
        return connect;
    }
    
    

    


}
