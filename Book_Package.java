
package CabBooking;
import CabBooking.HomePage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Book_Package extends JFrame implements ActionListener{
JLabel id, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id13;
JFrame f;
JTextField t1, t2, t3, t4, t5, t6, t7, t8,t9,t10,t11,t12,t13;
JButton b,b1;
Choice ch1,ch2,ch3,ch4;

public Book_Package(){
    ch1=new Choice();
    ch2=new Choice();
    ch3=new Choice();
    ch4=new Choice();
    try{
    ConnectionClass obj =new ConnectionClass();
    String q= "select source from transport_driver";
          ResultSet rest =obj.stm.executeQuery(q);
         while(rest.next())
         {
          ch1.add(rest.getString("source"));
         }
         rest.close();
         }
catch (Exception ee)
        {
     ee.printStackTrace();}

try{
    ConnectionClass obj =new ConnectionClass();
    String q= "select username from customer";
          ResultSet rest =obj.stm.executeQuery(q);
         while(rest.next())
         {
          ch3.add(rest.getString("username"));
         }
         rest.close();
         }
 catch (Exception eee)
        {
     eee.printStackTrace();}
/*try{
    ConnectionClass obj =new ConnectionClass();
    String q= "select * from customer";
          ResultSet rest =obj.stm.executeQuery(q);
         while(rest.next())
         {
          ch1.add(rest.getString("source"));
         }
         rest.close();
         }
catch (Exception eeee)
        {
     eeee.printStackTrace();}*/
    
    
f=new JFrame ("Book Package Transportation"); 
f.setBackground (Color.yellow);
f.setLayout(null);

id=new JLabel();
id.setBounds (0,0,900,600);
id.setLayout(null);

ImageIcon ic= new ImageIcon (ClassLoader.getSystemResource("CabBooking/Images/pp.png")); 
Image img=ic.getImage().getScaledInstance (1550, 800, Image.SCALE_DEFAULT);
ImageIcon ic1=new ImageIcon(img);
id.setIcon(ic1);

id1 =new JLabel("Book Package Transportation");
id1.setBounds (230,30,500,50);
id1.setFont(new Font("Arial",Font.BOLD,30));
id1.setForeground (Color.black);
id.add(id1);
f.add(id);

id2=new JLabel("Book ID");
id2.setBounds (50,150,150,30);
id2.setFont(new Font("Arial", Font. BOLD, 20));
id2.setForeground (Color.black);
id.add(id2);

t1=new JTextField();
t1.setBounds (200, 150, 150,30); 
id.add(t1);

id3= new JLabel("Source"); 
id3.setBounds (450,150,150,30); 
id3.setFont (new Font("Airal", Font.BOLD, 20)); 
id3.setForeground (Color.black);
id.add(id3);

//t2=new JTextField();
ch1.setBounds (600, 150, 150,30); 
id.add(ch1);

id4 =new JLabel("Destination");
id4.setBounds (50,200,150,30);
id4.setFont(new Font("Airal", Font.BOLD, 20));
id4.setForeground (Color.black);
id.add(id4);

//t3=new JTextField();
ch2.setBounds (200,200,150,30); 
id.add(ch2);

id5= new JLabel("Username");
id5.setBounds (450,200,100,30); 
id5.setFont(new Font("Airal", Font.BOLD, 20));
id5.setForeground (Color.black);
id.add(id5);

//t4=new JTextField(); 
ch3.setBounds (600,200,150,30); 
id.add(ch3);

id6= new JLabel("Name"); 
id6.setBounds (50,250,100,30);
id6.setFont(new Font("Airal", Font.BOLD, 20));
id6.setForeground (Color.black);
id.add(id6);

t5= new JTextField(); 
t5.setBounds (200,250,150,30);
id.add(t5);


id7= new JLabel("Driver Name");
id7.setBounds (450,250,100,30); 
id7.setFont(new Font("Airal", Font.BOLD, 20));
id7.setForeground (Color.black);
id.add(id7);

t6=new JTextField(); 
t6.setBounds (600, 250, 150, 30);
id.add(t6);

id8=new JLabel("Truck"); 
id8.setBounds (50,300,100,30);
id8.setFont(new Font("Airal", Font.BOLD, 20));
id8.setForeground (Color.black);
id.add(id8);

t7=new JTextField();
t7.setBounds (200,300,150,30);
id.add(t7);

id9= new JLabel("Destination from"); 
id9.setBounds (450,300,100,30); 
id9.setFont (new Font("Arial", Font.BOLD,20));
id9.setForeground (Color.black);
id.add(id9);

t8=new JTextField();
t8.setBounds (600,300,150,30);
id.add(t8);

id10=new JLabel("Destination to");
id10.setBounds(50,350,100,30);
id10.setFont (new Font("Arial", Font.BOLD,20));
id10.setForeground (Color.black);
id.add(id10);

t9=new JTextField();
t9.setBounds (200, 350, 150,30);
id.add(t9);

id11= new JLabel("Price");
id11.setBounds (450,350,150,30);
id11.setFont(new Font("Arial", Font.BOLD,20));
id11.setForeground (Color.black);
id.add(id11);

t10= new JTextField(); 
t10.setBounds (600,350,150,30);
id.add(t10);

id12= new JLabel("Distance");
id12.setBounds (250,400,150,30);
id12.setFont(new Font("Arial", Font.BOLD,20));
id12.setForeground (Color.black);
id.add(id12);

ch4.setBounds (450,400,150,45); 
id.add(ch4);

t1.setEditable(false);
//t2.setEditable(false);
//t3.setEditable(false);
//t4.setEditable(false);
t5.setEditable(false);
t6.setEditable(false);
t7.setEditable(false);
t8.setEditable(false);
t9.setEditable(false);
t10.setEditable(false);

b=new JButton("Book Package"); 
b.setBackground (Color.orange);
b.setForeground (Color.black);
b.setBounds (250,470,150,45);
id.add(b);

b1=new JButton("Back");
b1.setBackground (Color.red); 
b1.setForeground (Color.white);
b1.setBounds (450,470,150,45);
id.add(b1);

b1.addActionListener(this);
b.addActionListener(this);

Random rm =new Random();
t1.setText(""+Math.abs(rm.nextInt())%1000);
t1.setForeground(Color.red);

f.setVisible(true);
f.setSize(900,600);
f.setLocation(250,100);



ch3.addMouseListener(new MouseAdapter()
        { @Override 
        public void mouseClicked(MouseEvent arg0)
        {
        try
        {
        ConnectionClass obj=new ConnectionClass();
        String username=ch3.getSelectedItem();
        String q1="select name from customer where username='"+username+"'";
        ResultSet rest1=obj.stm.executeQuery(q1);
        while (rest1.next()){
        t5.setText(rest1.getString("name"));
        }
        rest1.close();
        }
        catch(Exception bb)
        {
        bb.printStackTrace();
        }      }      });


ch1.addMouseListener(new MouseAdapter()
        { @Override 
        public void mouseClicked(MouseEvent arg0)
        {ch2.removeAll();
        
        try
        {
        ConnectionClass obj=new ConnectionClass();
        String source=ch1.getSelectedItem();
        String q2="select destination from transport_driver where source='"+source+"'";
        ResultSet rest2=obj.stm.executeQuery(q2);
        while (rest2.next()){
            
            ch2.add(rest2.getString("destination"));
        
        }
        }
        catch(Exception er)
        {
        er.printStackTrace();
        }      }      });
ch2.addMouseListener(new MouseAdapter()
        { @Override 
        public void mouseClicked(MouseEvent arg0)
        {
        try
        {
        ConnectionClass obj=new ConnectionClass();
        String source=ch1.getSelectedItem();
        String destination=ch2.getSelectedItem();
        String q3="select * from transport_driver where source='"+source+"'and destination='"+destination+"' ";
        ResultSet rest3=obj.stm.executeQuery(q3);
        while (rest3.next()){
        t6.setText(rest3.getString("drivername"));
        t7.setText(rest3.getString("truck"));
        t8.setText(rest3.getString("source"));
        t9.setText(rest3.getString("destination"));
        t10.setText(rest3.getString("price"));
        ch4.add(rest3.getString("distance"));
        }
        rest3.close();
        }
        catch(Exception bb)
        {
        bb.printStackTrace();
        }      }      });
     
    
} public void actionPerformed(ActionEvent e){
       if(e.getSource()==b){
       String bid=t1.getText();
       String username=ch3.getSelectedItem();
       String name=t5.getText();
       String dname =t6.getText();
       String truck= t7.getText();
       String source = t8.getText();
       String destination=t9.getText();
       String price= t10.getText();
       String distance=ch4.getSelectedItem();
        try
      {
          ConnectionClass obj1 =new ConnectionClass();
          String q4= "insert into intransport values('"+bid+"', '"+username+"', '"+name+"', '"+dname+"', '"+source+"', '"+destination+"','"+truck+"' ,'"+distance+ "', '"+price+"')";
          int aa =obj1.stm.executeUpdate(q4);
          if (aa==1){
          JOptionPane.showMessageDialog(null, " Package Booked Successfully");
          f.setVisible(false);
          new HomePage().setVisible(true);
          }
          else{
        JOptionPane.showMessageDialog(null, "Please! fill the details carefully");

          }
      }
     catch (Exception ee)
        {
     ee.printStackTrace();}
       }
       if(e.getSource()==b1){
       f.setVisible(false);
       new HomePage().setVisible(true);}
   }
    public static void main(String[] args){
     new Book_Package();
    }
}
