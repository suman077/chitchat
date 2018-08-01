/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chichat;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author suman
 */
public class sqlconnect {
    
 Connection cn =null;
 public static Connection connectdatabase()
 {
     try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chitchat?"+"user=root");
          Statement st = cn.createStatement();
//      check weather the database is connected or not        
//    JOptionPane.showMessageDialog(null,"connectedd");
            return cn;
    
        }
      
        catch(ClassNotFoundException | SQLException | HeadlessException e){
             JOptionPane.showMessageDialog(null," mysql not connectedd");
             return null;
        }
}}