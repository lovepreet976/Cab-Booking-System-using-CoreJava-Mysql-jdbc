package CabBooking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
public class SignUpPage extends JFrame implements ActionListener
{
    
JFrame f;
JLabel l1,l2,l3,l4,l5;
JTextField t1, t2, t3;
JPasswordField p1;
JButton b1,b2;
SignUpPage()
{
f=new JFrame("Create New Account"); 
f.setBackground (Color.WHITE);
f.setLayout(null);

l1=new JLabel("Username");
l1.setBounds (40,20,100,30);
f.add(l1);

l2=new JLabel("Name"); 
l2.setBounds (40,70,100,30);
f.add(l2);

l3=new JLabel("Password");
l3.setBounds (40,120,100,30);
f.add(l3);

l4=new JLabel("Phone No");
l4.setBounds (40,170,100,30);
f.add(l4);

t1=new JTextField();
t1.setBounds (150,20,150,30);
f.add(t1);
t2=new JTextField();
t2.setBounds (150,70,150,30); 
f.add(t2);
t3=new JTextField();
t3.setBounds (150,170,150,30);
f.add(t3);
p1=new JPasswordField();
p1.setBounds (150,120,150,30);
f.add(p1);

ImageIcon i1= new ImageIcon (ClassLoader.getSystemResource("CabBooking/Images/user.png")); 
Image i2=i1.getImage().getScaledInstance (150, 150, Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2); 
JLabel l5=new JLabel(i3); 
l5.setBounds (350,70,150,120);
f.add(l5);

b1=new JButton("SignUp"); 
b1.setBackground (Color.BLUE);
b1.setForeground (Color.YELLOW);
b1.setBounds (40,240,120,30);

b2=new JButton("Back");
b2.setBackground (Color.BLUE); 
b2.setForeground (Color.YELLOW);
b2.setBounds (180,240,120,30);

b1.addActionListener(this);
b2.addActionListener(this);

f.add(b1);
f.add(b2);

f.getContentPane();
f.setVisible(true);
f.setSize(550,340);
f.setLocation(250, 100);
}
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==b1){
String username=t1.getText();
String name= t2.getText();
String password =p1.getText();
String phone=t3.getText();

try{
ConnectionClass obj=new ConnectionClass();
String q= "insert into signup values('"+username+"', '"+name+"', '"+password+"', '"+phone+"')";
int aa =obj.stm.executeUpdate(q);
if (aa==1){
JOptionPane.showMessageDialog(null, "Account Created Successfully");
this.f.setVisible (false);
new Login();}

else{
    JOptionPane.showMessageDialog(null,"Please,fill all the details carefully");
    this.f.setVisible(false);
    this.f.setVisible(true);
}}
catch(Exception e){
    e.printStackTrace();
}
        }
if(ae.getSource()==b2){
    this.f.setVisible(false);
    new AdminSection();
}

}

public static void main(String[] args)
{
SignUpPage aa=new SignUpPage();
    
}}
