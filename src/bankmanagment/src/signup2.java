/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagment.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author algud
 */
public class signup2 extends JFrame implements ActionListener
{
    String formNo;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField txtpan,txtadhar;
    JRadioButton rb1,rb2,eb1,eb2;
    JButton next;
    
    
    signup2(String first){
        super("Application form");
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bankmanagment/src/icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);
        
        this.formNo=first;
            
        JLabel lbl1=new JLabel("Page 2 : ");
        lbl1.setFont(new Font("Raleway",Font.BOLD,22));
        lbl1.setBounds(300,30,600,40);
        add(lbl1);
        
        JLabel lbl2=new JLabel("Additional details");
        lbl2.setFont(new Font("Raleway",Font.BOLD,22));
        lbl2.setBounds(300,60,600,40);
        add(lbl2);
       
        JLabel lbl3=new JLabel("Religion : ");
        lbl3.setFont(new Font("Raleway",Font.BOLD,18));
        lbl3.setBounds(100,120,100,30);
        add(lbl3);
        
        
        String religion []={"Hindu","Muslim","Christen","Sikh","Other"};
        
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleways",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);
        
        JLabel lbl4=new JLabel("Category : ");
        lbl4.setFont(new Font("Raleway",Font.BOLD,18));
        lbl4.setBounds(100,170,100,30);
        add(lbl4);
        
        
        String category []={"General","OBC","ST","NT","VJ-NT","Other"};
        
        comboBox2=new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleways",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);
        
        
        JLabel lbl5=new JLabel("Income : ");
        lbl5.setFont(new Font("Raleway",Font.BOLD,18));
        lbl5.setBounds(100,220,200,30);
        add(lbl5);
        
        
        String income []={"Null","<1,50,000","<2,50,000","5,00,000","upto 10,00,000","above 10,00,000"};
        
        comboBox3=new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleways",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);
        
        
        JLabel lbl6=new JLabel("Educational : ");
        lbl6.setFont(new Font("Raleway",Font.BOLD,18));
        lbl6.setBounds(100,270,200,30);
        add(lbl6);
        
        
        String education []={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        
        comboBox4=new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleways",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);
        
        
        
        JLabel lbl7=new JLabel("Occupation : ");
        lbl7.setFont(new Font("Raleway",Font.BOLD,18));
        lbl7.setBounds(100,340,200,30);
        add(lbl7);
        
        
        String occupation []={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        
        comboBox5=new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleways",Font.BOLD,14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);
        
        
        JLabel lbl8=new JLabel("PAN number : ");
        lbl8.setFont(new Font("Raleway",Font.BOLD,18));
        lbl8.setBounds(100,390,150,30);
        add(lbl8);
        
        txtpan=new JTextField();
        txtpan.setFont(new Font("Raleway",Font.BOLD,18));
        txtpan.setBounds(350,390,320,30);
        add(txtpan);
        
        JLabel lbl9=new JLabel("Aadhar number : ");
        lbl9.setFont(new Font("Raleway",Font.BOLD,18));
        lbl9.setBounds(100,440,250,30);
        add(lbl9);
        
        txtadhar=new JTextField();
        txtadhar.setFont(new Font("Raleway",Font.BOLD,18));
        txtadhar.setBounds(350,440,320,30);
        add(txtadhar);
        
        
        JLabel lbl10=new JLabel("Senior Citizen : ");
        lbl10.setFont(new Font("Raleway",Font.BOLD,18));
        lbl10.setBounds(100,490,250,30);
        add(lbl10);
        
        rb1=new JRadioButton("Yes");
        rb1.setFont(new Font("Raleway",Font.BOLD,14));
        rb1.setBackground(new Color(252,208,76));
        rb1.setBounds(350,490,100,30);
        add(rb1);
        
        rb2=new JRadioButton("No");
        rb2.setFont(new Font("Raleway",Font.BOLD,14));
        rb2.setBackground(new Color(252,208,76));
        rb2.setBounds(460,490,100,30);
        add(rb2);
        
        
        JLabel lbl11=new JLabel("Existing Account : ");
        lbl11.setFont(new Font("Raleway",Font.BOLD,18));
        lbl11.setBounds(100,540,250,30);
        add(lbl11);
        
        eb1=new JRadioButton("Yes");
        eb1.setFont(new Font("Raleway",Font.BOLD,14));
        eb1.setBackground(new Color(252,208,76));
        eb1.setBounds(350,540,100,30);
        add(eb1);
        
        eb2=new JRadioButton("No");
        eb2.setFont(new Font("Raleway",Font.BOLD,14));
        eb2.setBackground(new Color(252,208,76));
        eb2.setBounds(460,540,100,30);
        add(eb2);
        
        
        JLabel lbl12=new JLabel("Form No : ");
        lbl12.setFont(new Font("Raleway",Font.BOLD,16));
        lbl12.setBounds(680,10,350,30);
        add(lbl12);
        
        
        JLabel lbl13=new JLabel(formNo);
        lbl13.setFont(new Font("Raleway",Font.BOLD,18));
        lbl13.setBounds(760,10,250,30);
        add(lbl13);
        
        
        next=new JButton("next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setForeground(Color.BLACK);
        next.setBackground(Color.WHITE);
        next.setBounds(570,640,100,30);
        
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        
        
           
        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,170,76));
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        
        String rel=(String)comboBox.getSelectedItem();
        String cate=(String)comboBox2.getSelectedItem();
        String inc=(String)comboBox3.getSelectedItem();
        String edu=(String)comboBox4.getSelectedItem();
        String occ=(String)comboBox5.getSelectedItem();
        
        String pan=txtpan.getText();
        String aadhar=txtadhar.getText();
        
        String scitizen=null;
        if(rb1.isSelected()){
            scitizen="Yes";
            
        }else if(rb2.isSelected()){
            scitizen="No";
        }
        
        
        String eAccount=null;
        
        if(eb1.isSelected()){
            
            eAccount="Yes";
        }else if(eb2.isSelected()){
            
            eAccount="No";
        }
        
        try{
            if(txtpan.getText().equals("")||txtadhar.getText().equals("")){
                
                JOptionPane.showMessageDialog(null,"Fill all the fields");
                
            }else{
                Connectionn c1=new Connectionn();
                String q="insert into signup2 values('"+formNo+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.st.executeUpdate(q);
                new signup3(formNo);
                setVisible(false);
            }
            
        }catch(Exception ae){ 
            ae.printStackTrace();
        }
        
        
    }
    public static void main(String args[]){
        
        new signup2("");
    }
    
}
