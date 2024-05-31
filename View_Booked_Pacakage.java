package CabBooking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class View_Booked_Pacakage extends JFrame {
    Font f;
    JTable t1;
    String x[]={"Booked ID","Username","Name","Drivername","Source","Destination","Truck-Type","Distance","Price"};
    String y[][]=new String[40][10];
    int i=0;
    int j=0;
    
   View_Booked_Pacakage(){
    super("All Package booked Cab details");
    setSize(1300,400);
    setLocation(0,10);
    f=new Font("MS UI Gothic",Font.BOLD,18);
    
    try
    {
ConnectionClass obj=new ConnectionClass();
String q="select * from intransport ";
ResultSet rest= obj.stm.executeQuery(q);
while(rest.next()){
y[i][j++]=rest.getString("BookId"); 
y[i][j++]=rest.getString("username"); 
y[i][j++]=rest.getString("name"); 
y[i][j++]=rest.getString("drivername");
y[i][j++]=rest.getString("source");
y[i][j++]=rest.getString("destination");
y[i][j++]=rest.getString("truck");
y[i][j++]=rest.getString("distance");
y[i][j++]=rest.getString("price");

i++;j=0;
    }
    t1=new JTable(y,x);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    t1.setFont(f);
    t1.setBackground (Color.red);
    t1.setForeground (Color.pink);
    
    JScrollPane js=new JScrollPane(t1);
    add(js);
    }    
    //void actionPerformed(ActionEvent e){
    
    public static void main(String[] ae){
        new View_Booked_Pacakage().setVisible(true);
    }
    
}