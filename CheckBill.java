package CabBooking;
import CabBooking.ConnectionClass;
import CabBooking.HomePage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class CheckBill extends JFrame implements ActionListener {
JLabel l1,l2,l3,l4,l5,l6,l7;
JButton bt1, bt2,bt3,bt4;
JPanel p1,p2,p3;
JTextField tf1, tf2,tf3, tf4;
Font f, f1;
Choice ch;
public int price =0;
    CheckBill(){
    super("Check Total Cab bill");
    setSize(1100,500);
    setLocation(50,100);
    f=new Font("MS UI Gothic",Font.BOLD,25);
    f1=new Font("MS UI Gothic",Font.BOLD,18);
    l1=new JLabel("Check Total Cab Bill");
    l2=new JLabel("Username");
    l3=new JLabel("Name");
    l4=new JLabel("Email");
    l5=new JLabel("Address");
    l6=new JLabel("Price");
    ch=new Choice();
    tf1=new JTextField();
    tf2=new JTextField();
    tf3=new JTextField();
    tf4=new JTextField();
    tf1.setEditable(false);
    tf2.setEditable(false);
    tf3.setEditable(false);
    tf4.setEditable(false);
    bt1 =new JButton("Intercity cab");
    bt2 =new JButton("Intracity cab");
    bt3 =new JButton("Transport");
    bt4 =new JButton("Back");
    l1.setHorizontalAlignment(JLabel.CENTER);
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    bt3.addActionListener(this);
    bt4.addActionListener(this);
    
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        l5.setFont(f1);
        l6.setFont(f1);
        
        bt1.setFont(f1);
        bt2.setFont(f1);
        bt3.setFont(f1);
        bt4.setFont(f1);
        
        tf1.setFont(f1);
        tf2.setFont(f1);
        tf3.setFont(f1);
        tf4.setFont(f1);
        ch.setFont(f1);
        bt1.setBackground(Color.yellow);
        bt2.setBackground(Color.yellow);
        bt3.setBackground(Color.yellow);
        bt4.setBackground(Color.black);
        bt1.setForeground(Color.BLACK);
        bt2.setForeground(Color.BLACK);
        bt3.setForeground(Color.BLACK);
        bt4.setForeground(Color.white);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        p2=new JPanel();
        p2.setLayout(new GridLayout(7,2,10,10));
        p2.add(l2);p2.add(ch);
        p2.add(l3);p2.add(tf1);
        p2.add(l4);p2.add(tf2);
        p2.add(l5);p2.add(tf3);
        p2.add(l6);p2.add(tf4);
        p2.add(bt1);p2.add(bt2);
        p2.add(bt3);p2.add(bt4);
        p3=new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("CabBooking/Images/bb.png")); 
        Image i2=i1.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2); 
        l7=new JLabel(i3);
        p3.add(l7);
        
        setLayout(new BorderLayout(0,0));
        add(p1,"North");
        add(p2,"Center");
        add(p3,"West");     
        
    try{
    ConnectionClass obj = new ConnectionClass();
    String q= "Select * from customer";
    ResultSet rest=obj.stm.executeQuery(q);
    while(rest.next()){
    ch.add(rest.getString("username"));
    
    }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    ch.addMouseListener(new MouseAdapter()
        { @Override 
        public void mouseClicked(MouseEvent arg0)
        {        
        try
        {
        ConnectionClass obj=new ConnectionClass();
        String username=ch.getSelectedItem();
        String q2="select * from customer where username='"+username+"'";
        ResultSet rest1=obj.stm.executeQuery(q2);
        while (rest1.next()){
            
            tf1.setText(rest1.getString("name"));
            tf2.setText(rest1.getString("email"));
            tf3.setText(rest1.getString("address"));
          }
        rest1.close();
        }
        catch(Exception er)
        {
        er.printStackTrace();
        }      }      });
    
    
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==bt1)
        {
         price=0;
        String username=ch.getSelectedItem();
          try{
              ConnectionClass obj2=new ConnectionClass();
              String q2="select price from intercitycab where username='"+username+"'";
              ResultSet rest1=obj2.stm.executeQuery(q2);
          while (rest1.next()){
          price=price+Integer.parseInt(rest1.getString("price"));
          }
         tf4.setText(price+"");
         rest1.close();
          }
        catch(Exception ee){
         ee.printStackTrace();}}
        
        
      if(e.getSource()==bt2)
        {
         price=0;
        String username=ch.getSelectedItem();
          try{
              ConnectionClass obj3=new ConnectionClass();
              String q3="select price from intracitycab where username='"+username+"'";
              ResultSet rest1=obj3.stm.executeQuery(q3);
          while (rest1.next()){
          price=price+Integer.parseInt(rest1.getString("price"));
          }
         tf4.setText(price+"");
         rest1.close();
          }
        catch(Exception eee){
         eee.printStackTrace();}}
      
      if(e.getSource()==bt3)
        {
         price=0;
        String username=ch.getSelectedItem();
          try{
              ConnectionClass obj3=new ConnectionClass();
              String q3="select price from intransport where username='"+username+"'";
              ResultSet rest1=obj3.stm.executeQuery(q3);
          while (rest1.next()){
          price=price+Integer.parseInt(rest1.getString("price"));
          }
         tf4.setText(price+"");
         rest1.close();
          }
        catch(Exception eee){
         eee.printStackTrace();}}
    
      if(e.getSource()==bt4)
        {try{
        this.setVisible(false);
        new HomePage().setVisible(true);
          }
        catch(Exception eee){
         eee.printStackTrace();}}  
      
        
    }
    
    
    public static void main(String[] ar){
        new CheckBill().setVisible(true);
    }
    
}
