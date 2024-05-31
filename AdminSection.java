package CabBooking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.awt.event.ActionEvent;

public class AdminSection extends JFrame implements ActionListener{
    JLabel id,id1;
   JFrame f;
   Font f2, f1;
   JButton b,b1,b3,b2,b5;
    AdminSection(){
   
        f2=new Font("Arial", Font.BOLD, 25);
        f1=new Font("Arial", Font.BOLD, 25);
        
       
         f=new JFrame ("Admin Section"); 
         f.setBackground (Color.BLUE);
         
         f.setLayout(null);

        id=new JLabel();
        id.setBounds (0,0,900,600);
        id.setLayout(null);

        ImageIcon ic= new ImageIcon (ClassLoader.getSystemResource("CabBooking/Images/ff.png")); 
        Image img=ic.getImage().getScaledInstance (1600, 1000, Image.SCALE_DEFAULT);
        ImageIcon ic1=new ImageIcon(img);
        id.setIcon(ic1);
   
   
    id1 =new JLabel("Admin Section");
    id1.setBounds (325,30,500,50);
    id1.setFont(new Font("Arial",Font.BOLD,35));
    id1.setForeground (Color.black);
    id.add(id1);
    f.add(id);
    
     b5=new JButton("Login"); 
    b5.setFont(f1);
    b5.setBackground (Color.GREEN);
    b5.setForeground (Color.yellow);
    b5.setBounds (300,100,300,70);
    id.add(b5);
   
    b=new JButton("Sign-up"); 
    b.setFont(f1);
    b.setBackground (Color.GREEN);
    b.setForeground (Color.yellow);
    b.setBounds (300,180,300,70);
    id.add(b);
    
    b1=new JButton("Driver Intercity"); 
    b1.setBackground (Color.GREEN); b1.setFont(f1);
    b1.setForeground (Color.yellow);
    b1.setBounds (300,260,300,70);
    id.add(b1);
    
    b2=new JButton("Driver Intracity"); 
    b2.setBackground (Color.GREEN);
    b2.setForeground (Color.yellow); b2.setFont(f1);
    b2.setBounds (300,340,300,70);
    id.add(b2);
    
    b3=new JButton("Driver Package Delivery"); 
    b3.setBackground (Color.GREEN); b3.setFont(f1);
    b3.setForeground (Color.yellow);
    b3.setBounds (300,420,300,70);
    id.add(b3);
    
    
b1.addActionListener(this);
b.addActionListener(this);   
b2.addActionListener(this);
b3.addActionListener(this);
b5.addActionListener(this);

f.setVisible(true);
f.setSize(900,600);
f.setLocation(250,100);
    
    
    }
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==b){
      f.setVisible(false);
    new SignUpPage().setVisible(true);}
    
     if(e.getSource()==b1){
         f.setVisible(false);
      new Add_Intercity_Driver().setVisible(true);}
    
     if(e.getSource()==b2){
         f.setVisible(false);new Add_Intracity_Driver().setVisible(true);}
    
     if(e.getSource()==b3){f.setVisible(false);
     new Add_Transport_Driver().setVisible(true);}
     
     if(e.getSource()==b5){f.setVisible(false);
     new Login().setVisible(true);}
    }
    
    public static void main(String[] args){
    new AdminSection().setVisible(true);}
    }
