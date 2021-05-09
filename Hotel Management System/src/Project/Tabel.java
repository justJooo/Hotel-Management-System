package Project;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABEL
 */

public class Tabel{
    public static void main (String[] args)
    {
        Connection conn=null;
        Statement st=null;
        try
        {
            conn = ConnectionProvider.getConn();
            st = conn.createStatement();
            st.executeUpdate("create table admin(id_admin int(11) primary key auto_increment, name varchar(50) not null, username varchar(50) not null, email varchar(50) not null, password varchar(50) not null, securityQuestion varchar(100) not null, answer varchar(100) not null, address varchar(100) not null, status varchar(20) not null)");
            JOptionPane.showMessageDialog(null, "Table Succesfully Created");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Creating Table Failed");
        }
        finally
        {
          try   
        {
          conn.close();
          st.close();
        }
        catch(Exception e)
        {}
        }
    }
}
