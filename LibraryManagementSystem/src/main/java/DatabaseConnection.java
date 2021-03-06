
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinat
 */
public class DatabaseConnection {
    Connection conn;
public static Connection connectDB(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/jinat/NetBeansProjects/LibraryManagementSystem/DatabaseLMS.db");
        return conn;
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        return null;
    }
}
}
