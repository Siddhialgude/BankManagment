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
public class Withdrawl extends JFrame implements ActionListener
{

    /**
     * @param args the command line arguments
     */
    String pin;
    TextField txtf;
    JButton deposit,back;
    Withdrawl(String pin){
         this.pin=pin;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel lbl3=new JLabel(i3);
        
        lbl3.setBounds(0,0,1550,830);
        add(lbl3);
        
        JLabel lbl1=new JLabel("MAXIMUM WITHDRAWL IS RS. 10,000 ");
        lbl1.setFont(new Font("System",Font.BOLD,16));
        lbl1.setBounds(460,180,700,35);
        lbl1.setForeground(Color.WHITE);
        lbl3.add(lbl1);
        
        JLabel lbl2=new JLabel("PLEASE ENTER YOUR AMOUNT ");
        lbl2.setFont(new Font("System",Font.BOLD,16));
        lbl2.setBounds(460,220,400,35);
        lbl2.setForeground(Color.WHITE);
        lbl3.add(lbl2);
        
        txtf=new TextField();
        txtf.setBackground(new Color(65,125,128));
        txtf.setForeground(Color.WHITE);
        txtf.setBounds(460,260,320,25);
        txtf.setFont(new Font("Raleway",Font.BOLD,22));
        lbl3.add(txtf);
        
        
        deposit=new JButton("WITHDRAW");
        deposit.setBounds(700,362,150,35);
        deposit.setBackground(new Color(65,125,128));
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        lbl3.add(deposit);  
        
        back=new JButton("BACK");
        back.setBounds(700,406,150,35);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        lbl3.add(back);
        
        
        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==back){
            setVisible(false);
            new main_class(pin);
        }
        try{
            String amount=txtf.getText();
            Date date=new Date();
            if(txtf.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please eneter the amount you want to withdraw ");
                
            }else{
                Connectionn c1=new Connectionn();
                ResultSet rs=c1.st.executeQuery("select * from bank where pin_no = '"+pin+"'");
                int bal=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        bal+=Integer.parseInt(rs.getString("amount"));
                    }else{
                        bal-=Integer.parseInt(rs.getString("amount"));
                    }
                }if(bal < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Account Balance");
                    return;
                }
                c1.st.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfully");
                setVisible(false);
                new main_class(pin);
            }
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        new Withdrawl("");
        // TODO code application logic here
    }
    
}
