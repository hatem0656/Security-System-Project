/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.concurrent.TimeUnit;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;

/**
 *
 * @author Hatem Moahmed
 */
public class Empolyee {
    private int True_ID ;
    private int ID_num ;
    public Empolyee()  {
        ID_num = 0 ;
         
    }
    public char Set_ID(int ID){
        if ( ID < 100000){ 
        ID_num = ID ; 
        return ('k'); // ID entered from 1 to 5 didgit
        }
        else {
        return('f') ; // iD entered greater than 5 digits
        }
    }
    public String Check_ID (){
        int flag =0  ;
    try{
    
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Security System", "Hatem", "133147");
    Statement stmt =  con.createStatement() ; 
    String SQL = "SELECT * FROM employees" ; 
    ResultSet rs = stmt.executeQuery(SQL);
     
    while(rs.next()){
    True_ID = rs.getInt("ID");
      if (ID_num == True_ID){
                  flag ++ ;
                  break ;
            }  
        
    }
    }
        catch (SQLException err){
            System.out.println(err.getMessage());
        }
           
        if (flag == 0) {
            return("ID not Found") ;
        }
        else {
            return("ID Found") ;
        }
    }
}


