/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagment.src;
  import java.sql.*;
/**
 *
 * @author algud
 */
public class Connectionn
{
    Connection conn;
    Statement st;
    public Connectionn(){
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","sa123");
            st=conn.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    public static void main(String args[]){
        
    }

    class statement
    {

        public statement()
        {
        }
    }
    
}
