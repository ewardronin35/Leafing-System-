/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author eduar
 */
public class DBConnection {
   
   private static final String servername = "localhost";
   private static final  String username = "root";
   private static final  String dbname = "userreg";
   private static final  Integer portnumber = 3308;
   private static final  String password = "null";
   
   
   public static Connection getConnection() 
   {
   Connection cnx = null;
   MysqlDataSource datasource = new MysqlDataSource();
   
   datasource.setServerName(servername);
   datasource.setUser(username);
   datasource.setPassword(password);
   datasource.setDatabaseName(dbname);
   datasource.setPortNumber(portnumber);
   
       try {
           cnx = datasource.getConnection();
       } catch (SQLException ex) {
           Logger.getLogger("Get Connection -> " + DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   return cnx;        
   }
}