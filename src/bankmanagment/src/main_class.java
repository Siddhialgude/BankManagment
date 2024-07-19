/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagment.src;

/**
 *
 * @author algud
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class main_class extends JFrame implements ActionListener
{
    String pin;
    JButton btnexit,btnbalenq,btnpinchange,btnministatement,btndeposit,btnwithdraw,btnfastcash;
    public main_class(String pin){
        
        this.pin=pin;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel lbl3=new JLabel(i3);
        
        lbl3.setBounds(0,0,1550,830);
        add(lbl3);
        
        JLabel lbl1=new JLabel("Please Select Your Transaction ");
        lbl1.setBounds(430,180,700,35);
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("System",Font.BOLD,28));
        
        lbl3.add(lbl1);
        
        
        btndeposit=new JButton("DEPOSIT");
        btndeposit.setForeground(Color.WHITE);
        btndeposit.setBackground(new Color(65,125,128));
        btndeposit.setBounds(410,274,150,35);
        btndeposit.addActionListener(this);
        lbl3.add(btndeposit);
        
        btnwithdraw=new JButton("CASH WITHDRAWL");
        btnwithdraw.setForeground(Color.WHITE);
        btnwithdraw.setBackground(new Color(65,125,128));
        btnwithdraw.setBounds(700,274,150,35);
        btnwithdraw.addActionListener(this);
        lbl3.add(btnwithdraw);
        
        
        btnfastcash=new JButton("FAST CASH");
        btnfastcash.setForeground(Color.WHITE);
        btnfastcash.setBackground(new Color(65,125,128));
        btnfastcash.setBounds(410,318,150,35);
        btnfastcash.addActionListener(this);
        lbl3.add(btnfastcash);
        
        
        btnministatement=new JButton("MINI STATEMENT");
        btnministatement.setForeground(Color.WHITE);
        btnministatement.setBackground(new Color(65,125,128));
        btnministatement.setBounds(700,318,150,35);
        btnministatement.addActionListener(this);
        lbl3.add(btnministatement);
        
        btnpinchange=new JButton("PIN CHANGE");
        btnpinchange.setForeground(Color.WHITE);
        btnpinchange.setBackground(new Color(65,125,128));
        btnpinchange.setBounds(410,362,150,35);
        btnpinchange.addActionListener(this);
        lbl3.add(btnpinchange);
        
        btnbalenq=new JButton("BALANCE ENQUIRY");
        btnbalenq.setForeground(Color.WHITE);
        btnbalenq.setBackground(new Color(65,125,128));
        btnbalenq.setBounds(700,362,150,35);
        btnbalenq.addActionListener(this);
        lbl3.add(btnbalenq);
        
        btnexit=new JButton("EXIT");
        btnexit.setForeground(Color.WHITE);
        btnexit.setBackground(new Color(65,125,128));
        btnexit.setBounds(700,406,150,35);
        btnexit.addActionListener(this);
        lbl3.add(btnexit);
        
        
        
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==btndeposit){
            new Deposit(pin);
            setVisible(false);
        }
        else if(ae.getSource()==btnexit){
            System.exit(0);
        }
        else if(ae.getSource()==btnwithdraw){
            
            
            new Withdrawl(pin);
            setVisible(false);
        }else if(ae.getSource()==btnbalenq){
            
            new BalanceEnquiry(pin);
            setVisible(false);
            
        }else if(ae.getSource()==btnfastcash){
            
            new FastCash(pin);
            setVisible(false);
        }else if(ae.getSource()==btnpinchange){
            
            new PinChange(pin);
            setVisible(false);
                    
        }else if(ae.getSource()==btnministatement){
            new mini(pin);
        }
    }
    public static void main(String args[]){
        new main_class("");
    }
}
