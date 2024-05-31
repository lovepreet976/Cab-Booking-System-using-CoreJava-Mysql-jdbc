package CabBooking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class View_Intercity_BookedCab extends JFrame {
    Font f;
    JTable t1;
    String x[]={"Booked ID","Username","Drivername","Car","Source","Destination","Price","Type"};
    String y[][]=new String[40][10];
    int i=0;
    int j=0;
    
   View_Intercity_BookedCab(){
    super("All Intercity booked Cab details");
    setSize(1300,400);
    setLocation(0,10);
    f=new Font("MS UI Gothic",Font.BOLD,18);
    
    try
    {
ConnectionClass obj=new ConnectionClass();
String q="select * from intercitycab ";
ResultSet rest= obj.stm.executeQuery(q);
while(rest.next()){
    y[i][j++]=rest.getString("BookId"); 
y[i][j++]=rest.getString("username"); 
y[i][j++]=rest.getString("drivername");
y[i][j++]=rest.getString("car");
y[i][j++]=rest.getString("source");
y[i][j++]=rest.getString("destination");
y[i][j++]=rest.getString("price");
y[i][j++]=rest.getString("type");
i++;j=0;
    }
    t1=new JTable(y,x);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    t1.setFont(f);
    t1.setBackground (Color.orange); 
    t1.setForeground (Color.black);
    
    JScrollPane js=new JScrollPane(t1);
    add(js);
    }    
    //void actionPerformed(ActionEvent e){
    
    public static void main(String[] ae){
        new View_Intercity_BookedCab().setVisible(true);
    }
    
}