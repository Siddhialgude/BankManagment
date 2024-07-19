/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author algud
 *
 */
package bankmanagment.src;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Login extends JFrame implements ActionListener
{       JLabel lbl1,lbl2,lbl3;
        JTextField textField1;
        JPasswordField passwordField1;
        JButton btn1,btn2,btn3;
        Login(){
 
            super("Bank Managment System");
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/bank.png"));
            Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image=new JLabel(i3);
            image.setBounds(350,10,100,100);
            add(image);
            
            ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/card.png"));
            Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon ii3=new ImageIcon(ii2);
            JLabel iimage=new JLabel(ii3);
            iimage.setBounds(630,350,100,100);
            add(iimage);
            
            lbl1=new JLabel("WELCOME TO ATM ");
            lbl1.setBounds(230,125,450,40);
            lbl1.setForeground(Color.WHITE);
            lbl1.setFont(new Font("AvantGarde",Font.BOLD,38));
            add(lbl1);
           // lbl1.setForeground();
            
           lbl2=new JLabel("Card NO : ");
           lbl2.setFont(new Font("Ralway",Font.BOLD,28));
           lbl2.setForeground(Color.WHITE);
           lbl2.setBounds(150,190,375,30);
           add(lbl2);
           
           textField1=new JTextField(15);
           textField1.setBounds(325,190,230,30);
           textField1.setFont(new Font("Arial",Font.BOLD,14));
           add(textField1);
           
           passwordField1=new JPasswordField(15);
           passwordField1.setBounds(325,250,230,30);
           passwordField1.setFont(new Font("Arial",Font.BOLD,14));
           add(passwordField1);
           
           
           
           lbl3=new JLabel("PIN : ");
           lbl3.setFont(new Font("Ralway",Font.BOLD,28));
           lbl3.setForeground(Color.WHITE);
           lbl3.setBounds(150,250,375,30);
           add(lbl3);
           
           btn1=new JButton("SIGN IN");
           btn1.setFont(new Font("Arial",Font.BOLD,14));
           btn1.setForeground(Color.WHITE);
           btn1.setBackground(Color.BLACK);
           btn1.setBounds(300,300,100,30);
           btn1.addActionListener(this);
           add(btn1);
            
           btn2=new JButton("CLEAR");
           btn2.setFont(new Font("Arial",Font.BOLD,14));
           btn2.setForeground(Color.WHITE);
           btn2.setBackground(Color.BLACK);
           btn2.setBounds(430,300,100,30);
           btn2.addActionListener(this);
           add(btn2);
           
           btn3=new JButton("SIGN UP");
           btn3.setFont(new Font("Arial",Font.BOLD,14));
           btn3.setForeground(Color.WHITE);
           btn3.setBackground(Color.BLACK);
           btn3.setBounds(300,350,230,30);
           btn3.addActionListener(this);
           add(btn3);

            
             
            ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/backbg.png"));
            Image iii2=iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
            ImageIcon iii3=new ImageIcon(iii2);
            JLabel iiimage=new JLabel(iii3);
            iiimage.setBounds(0,0,850,480);
            
            add(iiimage);
            
            
            
            setLayout(null);
            setUndecorated(true);
            setSize(850,480);
            setLocation(450,200);
            setVisible(true);
            
        }
        @Override
        public void actionPerformed(ActionEvent e){
            
            try{
                
                if(e.getSource()==btn1){  //signin
                    
                    Connectionn c1=new Connectionn();
                    String cardno=textField1.getText(); 
                    String pin=passwordField1.getText();
                    String q="select *from login where card_no = '"+cardno+"' and pin = '"+pin+"'"; 
                    ResultSet rs=c1.st.executeQuery(q);
                    
                    if(rs.next()){
                        new main_class(pin);
                        setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null,"Incorrect Details");
                    }
                    
                }else if(e.getSource()==btn2){ //clear
                    
                    textField1.setText("");
                    passwordField1.setText("");
                    
                }else if(e.getSource()==btn3){ //sign up
                    new SignUp();
                    setVisible(false);
                }
            }catch(Exception E){
                
                E.printStackTrace();
              
                
            }
            
        }
        public static void main(String args[]){
            Login l=new Login();
        }
}
