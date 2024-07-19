/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagment.src;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author algud
 */
public class signup3 extends JFrame implements ActionListener
{
    
    JRadioButton rb1,rb2,rb3,rb4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submit,cancel;
    String formNo;
    
    signup3(String form_no){
        
        this.formNo=form_no;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);
        
        JLabel lbl1=new JLabel("Page 3 : ");
        lbl1.setFont(new Font("Raleway",Font.BOLD,22));
        lbl1.setBounds(280,40,400,40);
        add(lbl1);
        
        JLabel lbl2=new JLabel("Account Details : ");
        lbl2.setFont(new Font("Raleway",Font.BOLD,22));
        lbl2.setBounds(280,70,400,40);
        add(lbl2);
        
        JLabel lbl3=new JLabel("Account Type : ");
        lbl3.setFont(new Font("Raleway",Font.BOLD,18));
        lbl3.setBounds(100,140,200,30);
        add(lbl3);
        
        rb1=new JRadioButton("Saving Account");
        rb1.setFont(new Font("Raleway",Font.BOLD,16));
        rb1.setBackground(new Color(215,252,252));
        rb1.setBounds(100,180,150,30);
        add(rb1);
        
        rb2=new JRadioButton("Fixed-Deposit Account");
        rb2.setFont(new Font("Raleway",Font.BOLD,16));
        rb2.setBackground(new Color(215,252,252));
        rb2.setBounds(350,180,350,30);
        add(rb2);
        
        rb3=new JRadioButton("Current Account");
        rb3.setFont(new Font("Raleway",Font.BOLD,16));
        rb3.setBackground(new Color(215,252,252));
        rb3.setBounds(100,220,250,30);
        add(rb3);
        
        rb4=new JRadioButton("Recurring Deposit Account");
        rb4.setFont(new Font("Raleway",Font.BOLD,16));
        rb4.setBackground(new Color(215,252,252));
        rb4.setBounds(350,220,250,30);
        add(rb4);
        
        
        ButtonGroup btngrp=new ButtonGroup();
        btngrp.add(rb1);
        btngrp.add(rb2);
        btngrp.add(rb3);
        btngrp.add(rb4);
        
        
        JLabel lbl4=new JLabel("Card Number : ");
        lbl4.setFont(new Font("Raleway",Font.BOLD,18));
        lbl4.setBounds(100,300,200,30);
        add(lbl4);
        
        JLabel lbl5=new JLabel("(Your 16 Digit Card Number)");
        lbl5.setFont(new Font("Raleway",Font.BOLD,12));
        lbl5.setBounds(100,330,200,20);
        add(lbl5);
        
        JLabel lbl6=new JLabel("XXXX-XXXX-XXXX-4241");
        lbl6.setFont(new Font("Raleway",Font.BOLD,18));
        lbl6.setBounds(330,300,250,30);
        add(lbl6);
        
        JLabel lbl7=new JLabel("(It would appear on atm card/cheque Book and Statements)");
        lbl7.setFont(new Font("Raleway",Font.BOLD,12));
        lbl7.setBounds(330,330,500,30);
        add(lbl7);
        
        
        JLabel lbl8=new JLabel("PIN : ");
        lbl8.setFont(new Font("Raleway",Font.BOLD,18));
        lbl8.setBounds(100,370,200,30);
        add(lbl8);
        
        JLabel lbl9=new JLabel("XXXX");
        lbl9.setFont(new Font("Raleway",Font.BOLD,18));
        lbl9.setBounds(330,370,200,30);
        add(lbl9);
        
        JLabel lbl10=new JLabel("(4-digit password)");
        lbl10.setFont(new Font("Raleway",Font.BOLD,16));
        lbl10.setBounds(100,400,200,30);
        add(lbl10);
        
        
        JLabel lbl11=new JLabel("Services Required : ");
        lbl11.setFont(new Font("Raleway",Font.BOLD,18));
        lbl11.setBounds(100,450,200,30);
        add(lbl11);
        
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("Email Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        
        c6=new JCheckBox("E-statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        
        JCheckBox c7=new JCheckBox("I here by declare that above entered details correct to the best of my knowledge.",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,14));
        c7.setBounds(100,680,600,30);
        add(c7);
        
         
        JLabel lbl12=new JLabel("Form No : ");
        lbl12.setFont(new Font("Raleway",Font.BOLD,14));
        lbl12.setBounds(700,10,250,30);
        add(lbl12);
        
        
        JLabel lbl13=new JLabel();
        lbl13.setFont(new Font("Raleway",Font.BOLD,14));
        lbl13.setBounds(760,10,250,30);
        add(lbl13);
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,18));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel=new JButton("cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,18));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLocation(400,20);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        String aType="";
        if(rb1.isSelected()){
            
            aType="Saving Account";
        }else if(rb2.isSelected()){
            
            aType="Fixed-Deposit Account";
            
        }else if(rb3.isSelected()){
            
            aType="Current Account";
            
        }else if(rb4.isSelected()){
            
            aType="Recurring Deposit Account";
            
        } 
        
        Random ran=new Random();
        
        long first7=(ran.nextLong()%10000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);
        
        long first3=(ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);
        
        String fac="";
       
        if(c1.isSelected()){
            fac+="ATM CARD";
            
        }else if(c2.isSelected()){
            fac+="Internet Banking";
            
        }else if(c3.isSelected()){
            fac+="Mobile Banking";
            
        }else if(c4.isSelected()){
            fac+="Email Alerts";
            
        }else if(c5.isSelected()){
            fac+="Cheque Book";
            
        }else if(c6.isSelected()){
            fac+="E-statement";
            
        }
        
        
        try{
            if(ae.getSource()==submit){
                if(aType.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the details ");
                }else{
                    Connectionn c1=new Connectionn();
                    String q1="insert into signup3 values('"+formNo+"','"+aType+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="insert into login values('"+formNo+"','"+cardno+"','"+pin+"')";
                    c1.st.executeUpdate(q1);
                    c1.st.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number : "+cardno+"\n pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }else if(ae.getSource()==cancel){
                System.exit(0);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
    }
    public static void main(String args[]){
        new signup3("");
    }
    
}
  