
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
//import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Tables {
    public static void main(String args[])
    {
        
        Connection con = null;
        Statement st = null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table room(RoomNo varchar(5) primary key,RoomType varchar(10),bedType varchar(10),price int ,status varchar(20))");
            st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(300),answer varchar(200),address varchar(200),status varchar(20))");
            st.executeUpdate("create table customer(id int,name varchar(200),mobileNo varchar(20),nationality varchar(20),gender varchar(10),email varchar(30),idProof varchar(20),address varchar(50),checkIn varchar(20),roomNo varchar(5),bed varchar(20),roomType varchar(20),PricePerDay int(5),numberOfDays int(10),totalAmount varchar(20),checkout varchar(20))");
            JOptionPane.showMessageDialog(null,"Table created successfully ");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
             try
        {
            con.close();
            st.close();
        }
        catch(Exception e)
        {
        }    
        }
    }
}
