

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class DatabaseConnectionClass {
    Connection con = null;
    public static Connection connectDB(){
        try {           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/hurryup","root","");
            JOptionPane.showMessageDialog(null,"connected");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database connection failed " );
            return null;
    }  
  }
}
