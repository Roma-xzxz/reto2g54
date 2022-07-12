/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Modelo.Conexion;
import reto1programacion.*;



/**
 *
 * @author USUARIO
 */
public class RETO1PROGRAMACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   {
        // TODO code application logic here
        Conexion conexionDB = new Conexion();
        
        Loginn login = new Loginn();
        login.setVisible(true);
        
        
        
        //UserMenu userMenu = new UserMenu();
        //userMenu.setVisible(true);
    }
    
}
