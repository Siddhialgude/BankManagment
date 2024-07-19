/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankmanagment.src;

import java.awt.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Date;
import java.sql.*;


/**
 *
 * @author algud
 */
public class FastCash extends JFrame implements ActionListener
{

    /**
     * @param args the command line arguments
     */
    String pin;
    JLabel lbl2;
    JButton btnexit,b1,b2,b3,b4,b5,b6;
    public FastCash(String pin){
        this.pin=pin;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel lbl3=new JLabel(i3);
        
        lbl3.setBounds(0,0,1550,830);
        add(lbl3);
        
        JLabel lbl1=new JLabel("SELECT WITHDRAWL AMOUNT ");
        lbl1.setBounds(430,180,700,35);
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("System",Font.BOLD,26));
        
        lbl3.add(lbl1);
        
        
        b1=new JButton("Rs. 100");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        lbl3.add(b1);
        
        b2=new JButton("Rs. 500");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,274,150,35);
        b2.addActionListener(this);
        lbl3.add(b2);
        
        
        b3=new JButton("Rs. 1000");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(410,318,150,35);
        b3.addActionListener(this);
        lbl3.add(b3);
        
        
        b4=new JButton("Rs. 2000");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,318,150,35);
        b4.addActionListener(this);
        lbl3.add(b4);
        
        b5=new JButton("Rs. 5000");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(410,362,150,35);
        b5.addActionListener(this);
        lbl3.add(b5);
        
        b6=new JButton("Rs. 10000");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,362,150,35);
        b6.addActionListener(this);
        lbl3.add(b6);
        
        btnexit=new JButton("BACK");
        btnexit.setForeground(Color.WHITE);
        btnexit.setBackground(new Color(65,125,128));
        btnexit.setBounds(700,406,150,35);
        btnexit.addActionListener(this);
        lbl3.add(btnexit);
        
        
        
        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==btnexit){
            setVisible(false);
            new main_class(pin);
        }else {
            String amount=((JButton)ae.getSource()).getText().substring(4);
            
            Connectionn c1=new Connectionn();
            Date date=new Date();
            try{
                
                    ResultSet rs=c1.st.executeQuery("select * from bank where pin_no = '"+pin+"'");
                    int bal=0;
                    while(rs.next()){
                       if(rs.getString("type").equals("Deposit")){
                           bal+=Integer.parseInt(rs.getString("amount"));
                       } else{
                           bal-=Integer.parseInt(rs.getString("amount"));
                       }
                    }
                     
                    if(ae.getSource()!=btnexit &&bal<Integer.parseInt(amount)){
                        JOptionPane.showMessageDialog(null,"Insufficient Account Balance");
                        return;
                    }

                   c1.st.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                   JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfully");

                   
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            setVisible(false);
            new main_class(pin);
            
        }
    }
    public static void main(String[] args)
    {
        new FastCash("");
        // TODO code application logic here
    }
    
}
