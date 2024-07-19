/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankmanagment.src;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JLabel;
import java.util.*;
import java.sql.*;
 

/**
 *
 * @author algud
 */
public class BalanceEnquiry extends JFrame implements ActionListener
{

    /**
     * @param args the command line arguments
     */
    String pin;
    JLabel lbl2;
    JButton btnback;
    BalanceEnquiry(String pin){
        this.pin=pin;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel lbl3=new JLabel(i3);
        
        lbl3.setBounds(0,0,1550,830);
        add(lbl3);
        
        JLabel lbl1=new JLabel("Your Current Balance is Rs.");
        lbl1.setFont(new Font("System",Font.BOLD,16));
        lbl1.setBounds(430,180,700,35);
        lbl1.setForeground(Color.WHITE);
        lbl3.add(lbl1);
        
        lbl2=new JLabel();
        lbl2.setFont(new Font("System",Font.BOLD,16));
        lbl2.setBounds(430,220,400,35);
        lbl2.setForeground(Color.WHITE);
        lbl3.add(lbl2);
        
        btnback=new JButton("Back");
        btnback.setBounds(700,406,150,35);
        btnback.setBackground(new Color(65,125,128));
        btnback.setForeground(Color.WHITE);
        btnback.addActionListener(this);
        lbl3.add(btnback);  
        
        
        int bal=0;
        try{
            
            Connectionn c1=new Connectionn();
            ResultSet rs=c1.st.executeQuery("select * from bank where pin_no = '"+pin+"'");
            while(rs.next()){
                
                if(rs.getString("type").equals("Deposit")){
                        bal+=Integer.parseInt(rs.getString("amount"));
                    }else{
                        bal-=Integer.parseInt(rs.getString("amount"));
                    }
            } 
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        lbl2.setText(""+bal);
        
        
        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btnback){
            new main_class(pin);
            setVisible(false);
        }
        
    }
    public static void main(String[] args)
    {
        new BalanceEnquiry("");
        // TODO code application logic here
    }
    
}
