/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class Conexion {
    Connection connection;
    
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_g54_db";
    String usuario = "root";
    String contrasena ="";
    
 public Conexion(){
     
     try{
         Class.forName(driver);
         connection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
         
         if(connection!=null){
             System.out.println("Conexion exitosa con la base de datos");
         }
     } catch (ClassNotFoundException | SQLException e){
         System.out.println("No se pudo establecer conexion con la base de datos");
     }
         
 }
   
  public Connection getConnection(){
      return connection;
  } 
    
}
