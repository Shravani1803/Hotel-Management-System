/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package Project;

/**
 *
 * @author Shravani S. Gulhane
 */
import java.sql.Connection;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotelmanagement","root","shravani1234");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
