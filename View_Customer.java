package CabBooking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class View_Customer extends JFrame {
    Font f;
    JTable t1;
    String x[]={"Username","Name","Age","DOB","Address","Phone","E-mail","Country","Gender","Aadhar-no"};
    String y[][]=new String[40][10];
    int i=0;
    int j=0;
    
    View_Customer(){
    super("All customer details");
    setSize(1600,900);
    setLocation(0,10);
    f=new Font("MS UI Gothic",Font.BOLD,18);
    
    try
    {
ConnectionClass obj=new ConnectionClass();
String q="select * from customer";
ResultSet rest= obj.stm.executeQuery(q);
while(rest.next()){
y[i][j++]=rest.getString("username"); 
y[i][j++]=rest.getString("name");
y[i][j++]=rest.getString("age");
y[i][j++]=rest.getString("dob");
y[i][j++]=rest.getString("address");
y[i][j++]=rest.getString("phone");
y[i][j++]=rest.getString("email");
y[i][j++]=rest.getString("country");
y[i][j++]=rest.getString("gender");
y[i][j++]=rest.getString("aadhar");
i++;j=0;
    }
    t1=new JTable(y,x);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    t1.setFont(f);
    t1.setBackground (Color.BLACK); 
    t1.setForeground (Color.WHITE);
    
    JScrollPane js=new JScrollPane(t1);
    add(js);
    }    
    //void actionPerformed(ActionEvent e){
    
    public static void main(String[] ae){
         new HomePage().setVisible(true);
        new View_Customer().setVisible(true);
        
    }
    
}
