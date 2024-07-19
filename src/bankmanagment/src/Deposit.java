/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagment.src;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

 /*
 *
 * @author algud
 *
 */

public class Deposit extends JFrame implements ActionListener
{
    String pin;
    TextField txtf;
    JButton deposit,back;
            
    public Deposit(String pin){
        
        this.pin=pin;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel lbl3=new JLabel(i3);
        
        lbl3.setBounds(0,0,1550,830);
        add(lbl3);
        
        JLabel lbl1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT ");
        lbl1.setFont(new Font("System",Font.BOLD,16));
        lbl1.setBounds(460,180,400,35);
        lbl1.setForeground(Color.WHITE);
        lbl3.add(lbl1);
        
        txtf=new TextField();
        txtf.setBackground(new Color(65,125,128));
        txtf.setForeground(Color.WHITE);
        txtf.setBounds(460,230,320,25);
        txtf.setFont(new Font("Raleway",Font.BOLD,22));
        lbl3.add(txtf);
        
        
        deposit=new JButton("DEPOSIT");
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
        
        try{
            String amount=(String)txtf.getText();
            Date date=new Date();
            
            if(ae.getSource()==deposit){
                if(amount.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter the Amount You want to Deposit");
                }else{
                    Connectionn c1=new Connectionn();
                    c1.st.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully. ");
                    setVisible(false);
                    new main_class(pin);
                }
            }else if(ae.getSource()==back){
                 new main_class(pin);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    public static void main(String args[]){
        new Deposit("");
    }
    
}
