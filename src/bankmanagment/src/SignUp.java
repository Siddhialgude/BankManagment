/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagment.src;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.util.*;
import javax.swing.JFrame;
import java.sql.*;
/**
 *
 * @author algud
 */
public class SignUp extends JFrame implements ActionListener
{
    Random ran=new Random();
    JRadioButton rb1,rb2,m1,m2,m3;
    long first4=(ran.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(first4);
    JDateChooser dateChooser;
    JButton next;
    JTextField txtName,txtFname,txtEmail,txtadd,txtcity,txtpin,txtstate;
    
    public SignUp(){
        
        
        super("APPLICATION FORM");
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
        
        
        JLabel lbl1=new JLabel("APPLICATION FORM NO : "+first);
        lbl1.setBounds(160,20,600,40);
        lbl1.setFont(new Font("Raleway",Font.BOLD,38));
        add(lbl1);
        
        
        JLabel lbl2=new JLabel("Page 1");
        lbl2.setFont(new Font("Raleway",Font.BOLD,22));
        lbl2.setBounds(330,70,600,30);
        add(lbl2);
        
        JLabel lbl3=new JLabel("Personal Details");
        lbl3.setFont(new Font("Raleway",Font.BOLD,22));
        lbl3.setBounds(290,90,600,30);
        add(lbl3);
        
        
        JLabel lblName=new JLabel("Name : ");
        lblName.setFont(new Font("Raleway",Font.BOLD,20));
        lblName.setBounds(100,190,100,30);
        add(lblName);
        
        txtName=new JTextField();
        txtName.setFont(new Font("Raleway",Font.BOLD,14));
        txtName.setBounds(300,190,400,30);
        add(txtName);
        
        
        JLabel lblfName=new JLabel("Father's Name : ");
        lblfName.setFont(new Font("Raleway",Font.BOLD,20));
        lblfName.setBounds(100,240,200,30);
        add(lblfName);
        
        txtFname=new JTextField();
        txtFname.setFont(new Font("Raleway",Font.BOLD,14));
        txtFname.setBounds(300,240,400,30);
        add(txtFname);
         
        JLabel lblG=new JLabel("Gender");
        lblG.setFont(new Font("Raleway",Font.BOLD,20));
        lblG.setBounds(100,290,200,30);
        add(lblG);
        
        rb1=new JRadioButton("Male");
        rb1.setBackground(new Color(222,255,228));
        rb1.setFont(new Font("Raleway",Font.BOLD,14));
        rb1.setBounds(300,290,60,30);
        add(rb1);
        
        rb2=new JRadioButton("Female");
        rb2.setBackground(new Color(222,255,228));
        rb2.setFont(new Font("Raleway",Font.BOLD,14));
        rb2.setBounds(450,290,120,30);
        add(rb2);
        
        ButtonGroup btngrp=new ButtonGroup();
        btngrp.add(rb1);
        btngrp.add(rb2);
        
        JLabel dob=new JLabel("Date Of Birth");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,340,200,30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);
        
        JLabel lblEmail=new JLabel("Email Address : ");
        lblEmail.setBounds(100,390,200,30);
        lblEmail.setFont(new  Font("Raleway",Font.BOLD,20));
        add(lblEmail);
         
        
        txtEmail=new JTextField();
        txtEmail.setFont(new Font("Raleway",Font.BOLD,14));
        txtEmail.setBounds(300,390,400,30);
        add(txtEmail);
        
        
        JLabel lblms=new JLabel("Marital Status : ");
        lblms.setBounds(100,440,200,30);
        lblms.setFont(new  Font("Raleway",Font.BOLD,20));
        add(lblms);
         
        m1=new JRadioButton("Married");
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBounds(300,440,100,30);
        add(m1);
        
        m2=new JRadioButton("UnMarried");
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBounds(450,440,100,30);
        add(m2);
        
        m3=new JRadioButton("Other");
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBounds(635,440,100,30);
        add(m3);
        
        
        ButtonGroup btngrp1=new ButtonGroup();
        btngrp1.add(m1);
        btngrp1.add(m2);
        btngrp1.add(m3);
         
        
        
        JLabel lblAdd=new JLabel("Address  : ");
        lblAdd.setBounds(100,490,200,30);
        lblAdd.setFont(new  Font("Raleway",Font.BOLD,20));
        add(lblAdd);
         
        
        txtadd=new JTextField();
        txtadd.setFont(new Font("Raleway",Font.BOLD,14));
        txtadd.setBounds(300,490,400,30);
        add(txtadd);
        
        
        JLabel lblcity=new JLabel("City  : ");
        lblcity.setBounds(100,540,200,30);
        lblcity.setFont(new  Font("Raleway",Font.BOLD,20));
        add(lblcity);
         
        
        txtcity=new JTextField();
        txtcity.setFont(new Font("Raleway",Font.BOLD,14));
        txtcity.setBounds(300,540,400,30);
        add(txtcity);
        
        
        JLabel lblPin=new JLabel("Pin Code  : ");
        lblPin.setBounds(100,590,200,30);
        lblPin.setFont(new  Font("Raleway",Font.BOLD,20));
        add(lblPin);
         
        
        txtpin=new JTextField();
        txtpin.setFont(new Font("Raleway",Font.BOLD,14));
        txtpin.setBounds(300,590,400,30);
        add(txtpin);
        
        JLabel lblstate=new JLabel("State : ");
        lblstate.setBounds(100,640,200,30);
        lblstate.setFont(new  Font("Raleway",Font.BOLD,20));
        add(lblstate);
         
        
        txtstate=new JTextField();
        txtstate.setFont(new Font("Raleway",Font.BOLD,14));
        txtstate.setBounds(300,640,400,30);
        add(txtstate);
        
          
        
        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);
        
         
        
        
        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        String formNo=first;
        String name=txtName.getText();
        String fname=txtFname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        
        if(rb1.isSelected()){
            gender="Male";
        }else if(rb2.isSelected()){
            gender="Female";
        } 
        
        String email=txtEmail.getText();
        String marital=null;
        
        if(m1.isSelected()){
            marital="Married";
        }else if(m2.isSelected()){
            marital="Unmarried";
        }else if(m3.isSelected()){
            marital="Other";
        }
        
        String address=txtadd.getText();
        String city=txtcity.getText();
        String pincode=txtpin.getText(); 
        String state=txtstate.getText();
        
        
        try{
            if(txtName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill the Details");
            }else{
                Connectionn c1=new Connectionn();
                String q="insert into signup values('"+formNo+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c1.st.executeUpdate(q);
                new signup2(formNo);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
        
        
                
                
        
    }
    public static void main(String args[]){
        new SignUp();
    }
    
}
