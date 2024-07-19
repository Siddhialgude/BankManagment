/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankmanagment.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author algud
 */
public class mini extends JFrame implements ActionListener
{

    /**
     * @param args the command line arguments
     */
    String pin;
    JButton btn;
    public mini(String pin){
        this.pin=pin;
        
        JLabel lbl1=new JLabel();
        lbl1.setFont(new Font("System",Font.BOLD,15));
        lbl1.setBounds(20,140,400,200);
        add(lbl1);
        
        JLabel lbl2=new JLabel("Technout S.A");
        lbl2.setFont(new Font("System",Font.BOLD,15));
        lbl2.setBounds(150,20,200,20);
        add(lbl2);
        
        JLabel lbl3=new JLabel();
        lbl3.setFont(new Font("System",Font.BOLD,12));
        lbl3.setBounds(20,80,300,20);
        add(lbl3);
        
        JLabel lbl4=new JLabel( );
        lbl4.setFont(new Font("System",Font.BOLD,15));
        lbl4.setBounds(20,400,300,20);
        add(lbl4);
        
        try{
            Connectionn c1=new Connectionn();
            ResultSet rs=c1.st.executeQuery("select * from login where pin = '"+pin+"'");
            
            while(rs.next()){
                lbl3.setText("card Number : "+rs.getString("card_no").substring(0,4)+"XXXX-XXXX-XXXX"+rs.getString("card_no").substring(12));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        try{
            Connectionn c1=new Connectionn();
            ResultSet rs=c1.st.executeQuery("select * from bank where pin_no = '"+pin+"'");
            int bal=0;
            while(rs.next()){
                
                lbl1.setText(lbl1.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
                
               if(rs.getString("type").equals("Deposit")){
                   bal+=Integer.parseInt(rs.getString("amount"));
               } else{
                   bal-=Integer.parseInt(rs.getString("amount"));
               }
            }
            lbl4.setText("Your Total Balance is Rs. "+bal);
            
            
            
        }catch(Exception e){
            
            e.printStackTrace();
            
        }
        
        btn=new JButton("EXIT");
        btn.setBounds(20,500,100,25);
        btn.addActionListener(this);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        add(btn);
        
        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args)
    {
        new mini("");
        // TODO code application logic here
    }
    
}
