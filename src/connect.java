/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author USER
 */
public class connect {
    private static java.sql.Connection connect;
    
    public static java.sql.Connection getConnect(){
        if (connect == null){
            try{
                String url = "jdbc:mysql://localhost:3306/login";
                String user = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                connect = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            }catch(SQLException e){
            System.out.println("Error");
        }
    }
    return connect;
}
    public static void main(String args[]){
        getConnect();
    }
}
