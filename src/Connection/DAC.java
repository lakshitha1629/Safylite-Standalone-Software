/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Subhash
 */
public class DAC {
    
    Connection con;

    public Connection getConnection() {
        //String driver = "com.mysql.jdbc.Driver";
        //String url = "jdbc:mysql://localhost:3306/login1";
        //String username = "root";
        //String password = "";
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/safylite", "root", "");
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
}
