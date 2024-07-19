/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankmanagment.src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author algud
 */
public class PinChange extends JFrame implements ActionListener
{

    /**
     * @param args the command line arguments
     */
    String pin,pin1;
    JButton b1,b2;
    JPasswordField p1,p2;
    PinChange(String pin){
        
        this.pin=pin;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel lbl3=new JLabel(i3);
        
        lbl3.setBounds(0,0,1550,830);
        add(lbl3);
        
        JLabel lbl1=new JLabel("CHANGE YOUR PIN ");
        lbl1.setFont(new Font("System",Font.BOLD,16));
        lbl1.setBounds(430,180,400,35);
        lbl1.setForeground(Color.WHITE);
        lbl3.add(lbl1);
        
        JLabel lbl2=new JLabel("NEW PIN : ");
        lbl2.setFont(new Font("System",Font.BOLD,16));
        lbl2.setBounds(430,220,150,35);
        lbl2.setForeground(Color.WHITE);
        lbl3.add(lbl2);
        
        p1=new JPasswordField(); 
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(600,220,180,25);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        lbl3.add(p1);
        
        
        JLabel lbl4=new JLabel("Re-Enter NEW PIN : ");
        lbl4.setFont(new Font("System",Font.BOLD,16));
        lbl4.setBounds(430,255,400,35);
        lbl4.setForeground(Color.WHITE);
        lbl3.add(lbl4);
        
        p2=new JPasswordField(); 
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(600,255,180,25);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        lbl3.add(p2);
        
        
        b1=new JButton("CHANGE");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(700,362,150,35);
        b1.addActionListener(this);
        lbl3.add(b1);
        
        b2=new JButton("BACK");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,406,150,35);
        b2.addActionListener(this);
        lbl3.add(b2);
         
        
        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        
        try{
            String pin1=p1.getText();
            String pin2=p2.getText();
            
            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match ");
                return;
            }  
            if(ae.getSource()==b1){
                    
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN ");
                    return;
                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN ");
                    return; 
                }
                Connectionn c1=new Connectionn();
                String q1="update bank set pin_no = '"+pin1+"' where pin_no = '"+pin+"'";
                String q2="update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3="update signup3 set pin = '"+pin1+"' where pin = '"+pin+"'";
                
                c1.st.executeUpdate(q1);
                c1.st.executeUpdate(q2);
                c1.st.executeUpdate(q3);
                
                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                setVisible(false);
                new  main_class(pin);
                        
            }else if(ae.getSource()==b2){
                new main_class(pin);
                setVisible(false);
            }
            
             
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args)
    {
        new PinChange("");
        // TODO code application logic here
    }
    
}
