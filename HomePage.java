package CabBooking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.sql.*;
//import java.util.*;
public class HomePage extends JFrame implements ActionListener {
    JLabel l1;
    Font f,f1,f2;
    JPanel p1,p2;
    HomePage(){
        super("CAB BOOKING Home Page");
        setLocation(0,0);
        setSize(1550,800);
        
ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("CabBooking/Images/hom.png")); 
Image i2=i1.getImage().getScaledInstance(1550,800,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2); 
l1=new JLabel(i3);

 f=new Font("Lucida Fax",Font.BOLD,20);
 f1=new Font("Gadugi",Font.BOLD,35);
 f2=new Font("MS UI Gothic",Font.BOLD,10);
 
 JMenuBar m1 =new JMenuBar();
 
 JMenu men1 =new JMenu("Profile-Customer");
 JMenuItem menI1=new JMenuItem("Add Customer");
 JMenuItem menI2=new JMenuItem("View Customer");
 men1.add(menI1);
 men1.add(menI2);
 
 JMenu men2 =new JMenu("Manage-Customer");
 JMenuItem menI3=new JMenuItem("Update Details");
  men2.add(menI3);
  
 JMenu men3 =new JMenu("Intracity-Cabs");
 JMenuItem menI4=new JMenuItem("Book Cab Intracity");
 JMenuItem menI5=new JMenuItem("View Booked Cab Intracity");
 men3.add(menI4);
 men3.add(menI5);
 
 JMenu men4 =new JMenu("Intercity-Cabs");
 JMenuItem menI6=new JMenuItem("Book Cab Intercity");
 JMenuItem menI7=new JMenuItem("View Booked Cab Intercity");
 men4.add(menI6);
 men4.add(menI7);
 
 JMenu men5 =new JMenu("Transport");
 JMenuItem menI8=new JMenuItem("Book Package");
 JMenuItem menI9=new JMenuItem("View Booked Package");
 men5.add(menI8);
 men5.add(menI9);
 
 JMenu men6 =new JMenu("Bill");
 JMenuItem menI10=new JMenuItem("Check BILL");
 men6.add(menI10);
 
 JMenu men7 =new JMenu("Delete");
 JMenuItem menI11=new JMenuItem("Delete Customer");
 men7.add(menI11);
 
 JMenu men8 =new JMenu("About-Us");
 JMenuItem menI12=new JMenuItem("About");
 JMenuItem menI13=new JMenuItem("Exit");
 men8.add(menI12);
 men8.add(menI13);
 
 m1.add(men1);m1.add(men2);
 m1.add(men3);m1.add(men4);
 m1.add(men5);m1.add(men6);
 m1.add(men7);m1.add(men8);
 
 m1.setBackground(Color.MAGENTA);
 men7.setForeground(Color.RED);
 men8.setForeground(Color.yellow);
 menI1.setBackground(Color.ORANGE);
 menI2.setBackground(Color.ORANGE);
 menI3.setBackground(Color.ORANGE);
 menI4.setBackground(Color.ORANGE);
 menI5.setBackground(Color.ORANGE);
 menI6.setBackground(Color.ORANGE);
 menI7.setBackground(Color.ORANGE);
 menI8.setBackground(Color.ORANGE);
 menI9.setBackground(Color.ORANGE);
 menI10.setBackground(Color.ORANGE);
 menI11.setBackground(Color.RED);
 menI12.setBackground(Color.ORANGE);
 menI13.setBackground(Color.yellow);
 
 menI1.setForeground(Color.WHITE);
 menI2.setForeground(Color.WHITE);
 menI3.setForeground(Color.WHITE);
 menI4.setForeground(Color.WHITE);
 menI5.setForeground(Color.WHITE);
 menI6.setForeground(Color.WHITE);
 menI7.setForeground(Color.WHITE);
 menI8.setForeground(Color.WHITE);
 menI9.setForeground(Color.WHITE);
 menI10.setForeground(Color.WHITE);
 menI11.setForeground(Color.WHITE);
 menI12.setForeground(Color.WHITE);
 menI13.setForeground(Color.WHITE);
 
 menI1.addActionListener(this);
 menI2.addActionListener(this);
 menI3.addActionListener(this);
 menI4.addActionListener(this);
 menI5.addActionListener(this);
 menI6.addActionListener(this);
 menI7.addActionListener(this);
 menI8.addActionListener(this);
 menI9.addActionListener(this);
 menI10.addActionListener(this);
 menI11.addActionListener(this);
 menI12.addActionListener(this);
 menI13.addActionListener(this);
 
 
 setJMenuBar(m1);
 add(l1);
    }
    
public void actionPerformed(ActionEvent ae)
{ 
String comnd=ae.getActionCommand();
System.out.println("Command executed: " + comnd);
if(comnd.equals("Add Customer"))
{
    this.setVisible(false);
new Add_Customer().setVisible(true);
}
else if(comnd.equals("View Customer"))
{
new View_Customer().setVisible(true);
}
else if(comnd.equals("Update Details")){
    this.setVisible(false);
new Update_Customer().setVisible(true);
}
else if(comnd.equals("Book Cab Intracity")){this.setVisible(false);
new Book_Cab().setVisible(true);
}
else if(comnd.equals("View Booked Cab Intracity")){
new View_BookedCab().setVisible(true);
}
else if(comnd.equals("Book Cab Intercity")){this.setVisible(false);
new Book_Intercity_Cab().setVisible(true);
}
else if(comnd.equals("View Booked Cab Intercity")){
new View_Intercity_BookedCab().setVisible(true);
}
else if(comnd.equals("Book Package")){this.setVisible(false);
new Book_Package().setVisible(true);
}
else if(comnd.equals("View Booked Package")){
new View_Booked_Pacakage().setVisible(true);
}
else if(comnd.equals("Check BILL")){
    this.setVisible(false);
new CheckBill().setVisible(true);
}
else if(comnd.equals("Delete Customer")){
    this.setVisible(false);
new Delete_Customer().setVisible(true);
}
else if (comnd.equals("About")){
new About();
}
else if(comnd.equals("Exit"))
{
    System.exit(0);
}
    }
    public static void main(String[] args){
        new HomePage().setVisible(true);
        
    }
    
}
