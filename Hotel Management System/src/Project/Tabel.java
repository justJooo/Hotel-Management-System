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
            /*Note
            If you wanna create a new table, just deactivate the st.executeUpdate and put your
            new SQL syntax to make the new tables
            */

            st.executeUpdate("create table admin(name varchar(50) not null, username varchar(50) not null, email varchar(50) not null, password varchar(50) not null, securityQuestion varchar(100) not null, answer varchar(100) not null, address varchar(100) not null, status varchar(20) not null)");
            st.executeUpdate("create table room(roomNumber INT(11), roomType varchar(100), bed varchar(100), price varchar(20), feature varchar (200), status varchar(20), maintenance_start date, maintenance_end date)");
            st.executeUpdate("create table customer(id int(11) primary key not null, fullName varchar(100) not null, phoneNumber varchar(13) not null, nationality varchar(50) not null, gender varchar(20) not null, idProof int (11) not null, address varchar(100) not null, checkInDate date, roomNo varchar(10) not null, bedType varchar(100) not null, roomType varchar(100) not null, pricePerDay varchar(20) not null, numberOfDays int (10), totalAmount varchar(200), checkOut date)"); 
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
