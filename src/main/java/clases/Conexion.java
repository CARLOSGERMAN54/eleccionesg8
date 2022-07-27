/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Conexion{
    protected  String server;
    protected  String port;
    protected  String base;
    protected  String user;
    protected  String password;
    public  Statement stmt;;


    public Conexion() {
        this.server = "localhost";
        this.port = "3306";
        this.base = "eleccionesg8";
        this.user = "root";
        this.password = "";
        this.stmt = null;
    }
    
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://"+this.server+":"+this.port+"/"+this.base+"",this.user,this.password);
            return con;
        }
        catch(Exception ex)
        {
          return  null;
        }
    }


 
 
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/eleccionesg8","root","");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("Connected");  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }  
}