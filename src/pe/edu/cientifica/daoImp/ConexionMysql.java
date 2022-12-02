/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cientifica.daoImp;


import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author José
 */
public class ConexionMysql {
    Connection conectar=null;
    public Connection conexion(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bdmatricula","root","123456");
           
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error"+e.getMessage());  
        }
        return conectar; 
    }
}

