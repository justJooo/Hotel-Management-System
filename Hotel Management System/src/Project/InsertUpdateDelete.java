/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ABEL
 */
public class InsertUpdateDelete{
    public static void setData (String Query, String msg)
    {
        Connection Conn = null;
        Statement st = null;
        try
        {
            Conn = ConnectionProvider.getConn();
            st = Conn.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))  
                JOptionPane.showMessageDialog(null, msg);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
        {}
        catch(Exception e)
        {}
        }
    } 
}