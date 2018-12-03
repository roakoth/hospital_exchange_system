package hospital_exchange;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASPIRE
 */

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection1 {
    public static Connection getConnection(){
       
                     
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/hospital_exchangeinfo","root","");
            System.out.println("Connection established successfully");
            return con;
        }
        catch(Exception ex){
            System.out.println("Error in DB connection");
        }
        return null;
    }
}
