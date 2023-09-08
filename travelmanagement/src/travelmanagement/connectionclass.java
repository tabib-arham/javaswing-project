
package travelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class connectionclass {
    Connection con= null;
    
public static Connection connectDB(){
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tttravels", "root", "");
            JOptionPane.showMessageDialog(null, "database connected");
            //System.out.println("database connected");
            return con;
        } catch (Exception e) {
            System.out.println("not connected"); 
            return null;
        }
    
}
}
