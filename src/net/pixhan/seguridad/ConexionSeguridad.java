/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.seguridad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 25/03/2016 
 * Hora: 09:33:27 PM
 * Web: https://reproducir.net
 */

public class ConexionSeguridad {

        public static Connection GetConexionSeguridad(
            String hostDB,
            String usuarioDB,
            String passwordDB
            )
    {
        Connection conexion=null;
        
        try
        {
            Class.forName("org.mariadb.jdbc.Driver");
            String servidor = "jdbc:mysql://" + hostDB + "/security_proventas";
            conexion = DriverManager.getConnection(servidor,usuarioDB,passwordDB);
        }
        catch(ClassNotFoundException ex)
        {
            //JOptionPane.showMessageDialog(null, "Error: No se puede conectar ");
            conexion=null;
        }
        catch(SQLException ex)
        {
            //JOptionPane.showMessageDialog(null, "Error: Sin acceso al sistema");
            conexion=null;
        }
        catch(Exception ex)
        {
            //JOptionPane.showMessageDialog(null, "Error: No se puede realizar la conexion");
            conexion=null;
        }
        finally
        {
            return conexion;
        }
    }
    
}
