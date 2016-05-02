/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.seguridad;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.pixhan.utilidades.DatosUsuario;



public class ConexionDB {
   
        public static void main(String[] args) throws SQLException {
        // TODO code application logic here
    
        boolean puedeConectarse = false;                
        boolean conectese1 = false;
        Connection miConexion;
        miConexion = ConexionSeguridad.GetConexionSeguridad("localhost", "root", "");
     
        if (miConexion != null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
        else
            {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al conectar a la BD");
            }

        DatosUsuario datos = null;

//        conectese1 = UtilSeguridad.agregarRol("Ingeniero", "General de todo", miConexion);        
//        conectese1 = UtilSeguridad.agregarRol("Administrador", "General de todo", miConexion);
//        conectese1 = UtilSeguridad.agregarRol("Vendedor", "General de todo", miConexion);
//        conectese1 = UtilSeguridad.agregarPermiso("Iniciar Sesión", "Iniciar sesión general", miConexion);
//        conectese1 = UtilSeguridad.agregarPermiso("Cerrar sesión", "Cerrar sesión general", miConexion);
//        conectese1 = UtilSeguridad.agregarUsuario("Alan", "Guillermo", null, "Samayoa", "Hernández", null, "taco", "123456", false, 1, miConexion);
//        conectese1 = UtilSeguridad.agregarUsuario("Victor", "Manuel", null, "Matías", "Raymundo", null, "vitomany", "123456", true, 2, miConexion);
//        conectese1 = UtilSeguridad.agregarUsuario("Cesar", "Emanuel", null, "Cifuentes", "Monterroso", null, "baloo", "123456", true, 2, miConexion);
//        conectese1 = UtilSeguridad.asignarPermiso(1, 1, miConexion);
//        conectese1 = UtilSeguridad.asignarPermiso(2, 1, miConexion);
//        conectese1 = UtilSeguridad.poseePermiso(1, 1, miConexion);
//        conectese1 = UtilSeguridad.asignarPermiso(2, 1, miConexion);
//        datos = UtilSeguridad.autenticarUsuario("vitomany", "123456", miConexion);	
//        datos = UtilSeguridad.autenticarUsuario("taco", "123456", miConexion);
//        conectese1 = UtilSeguridad.revocarPermiso(2, 1, miConexion);        
        
 /*       puedeConectarse = UtilSeguridad.poseePermiso( 1, 1, miConexion);
        
        if ( puedeConectarse == true )
        {
                JOptionPane.showMessageDialog(null, "Todo Ok, puede iniciar sesion");
        }
        else
        {
                JOptionPane.showMessageDialog(null, "Error, no posee el permiso");
        }
*/
//        conectese1 = UtilSeguridad.agregarRol("Administrador", "De todas las chivas", miConexion);
//        conectese1 = UtilSeguridad.agregarPermiso("Agregar usuarios", "Permiso de añadicicion", miConexion);
//        conectese1 = UtilSeguridad.asignarPermiso(1, 1, miConexion);
//        conectese1 = UtilSeguridad.agregarUsuario("Victor", "Manuel", null, "Matías", "Raymundo", null, "vitomany", "123456", 1, miConexion);
//        conectese1 = UtilSeguridad.agregarUsuario("Alan", "Guillermo", null, "Samayoa", "Hernández", null, "taco", "123456", 1, miConexion);

        if ( puedeConectarse == true )
        {
                JOptionPane.showMessageDialog(null, "Todo Ok, puede iniciar sesion");
        }
        else
        {
                JOptionPane.showMessageDialog(null, "Error, no posee el permiso");
        }
        
        datos = UtilSeguridad.autenticarUsuario("vitomany", "123456", miConexion);
        if ( datos != null )
        {
                JOptionPane.showMessageDialog(null, "Todo Ok, puede iniciar sesion");
        }
        else
        {
                JOptionPane.showMessageDialog(null, "Error, no se puede autenticar");
        }
        
        String password = "12345";
        
        String nuevaString;
        
        nuevaString = PasswordASha.getSha( password );
        System.out.println( nuevaString );
        System.out.println( nuevaString.length() );
        
    }
      
}