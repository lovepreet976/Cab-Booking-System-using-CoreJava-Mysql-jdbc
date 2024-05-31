package CabBooking;

import java.sql.*;
public class ConnectionClass {
    public Connection con;
    public Statement stm;

    ConnectionClass(){
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:330/cab_booking","root","123456789");
           stm=con.createStatement();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
}
    public static void main(String args[]){
       new ConnectionClass();
    }
}
