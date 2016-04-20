package net.pixhan.negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
//import org.mariadb.jdbc.Driver.*;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 25/03/2016 
 * Hora: 08:56:17 PM
 * Web: https://reproducir.net
 */

public class ConexionNegocio {
    
    public static Connection GetConexionNegocio(
            String hostDB,
            String usuarioDB,
            String passwordDB
            )
    {
        Connection conexion=null;
        
        try
        {
            Class.forName("org.mariadb.jdbc.Driver");
            String servidor = "jdbc:mysql://" + hostDB + "/punto_venta";
            conexion = DriverManager.getConnection(servidor,usuarioDB,passwordDB);
        }
        catch(ClassNotFoundException ex)
        {
            //JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(SQLException ex)
        {
            //JOptionPane.showMessageDialog(null, ex, "Sin acceso al sistema"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(Exception ex)
        {
            //JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        finally
        {
            return conexion;
        }
    }
}
