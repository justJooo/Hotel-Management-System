package Project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ABEL
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectionProvider {
    static final String DB_URL = "jdbc:mysql://localhost/hotel";
    static final String USER = "root";
    static final String PASS = "";
    public static Connection getConn()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            return null;
        }
    }
}
