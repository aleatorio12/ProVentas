/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.seguridad;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import net.pixhan.utilidades.DatosUsuario;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 4/04/2016 
 * Hora: 08:22:34 PM
 * Web: https://reproducir.net
 */

public class UtilSeguridad {
    
    private static final int AUTORIZADO = 1;
    private static final int SIN_ERROR = 0;
      
    public static DatosUsuario autenticarUsuario( String username, String pass, Connection conexion ) throws SQLException
    {
        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call security_proventas.autenticarUsuario(?, ?, ?, ?, ?, ?, ?)}");
            
        cstmt.setString("username", username);
        cstmt.setString("pass", pass);
        cstmt.registerOutParameter("primerNombre", java.sql.Types.VARCHAR);
        cstmt.registerOutParameter("primerApellido", java.sql.Types.VARCHAR);
        cstmt.registerOutParameter("idUsuario", java.sql.Types.TINYINT);
        cstmt.registerOutParameter("rol", java.sql.Types.TINYINT);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();


        ocurreError = cstmt.getInt("existeError");        
        
        if ( ocurreError == SIN_ERROR )
        {

            DatosUsuario datosUsuario = new DatosUsuario();

            datosUsuario.setUsername(username);
            datosUsuario.setRol( cstmt.getInt("rol") );
            datosUsuario.setUsuario( cstmt.getInt("idUsuario") );
            datosUsuario.setPrimerNombre( cstmt.getString("primerNombre") );
            datosUsuario.setPrimerApellido( cstmt.getString("primerApellido") );
            
            return datosUsuario;
        }

        cstmt.close();        

        return null;
        
/*        String nuevaString;
        
        nuevaString = PasswordASha.getSha( password );
        System.out.println( nuevaString );
        System.out.println( nuevaString.length() );

 */
    }
    
    public static boolean poseePermiso ( int rol, int permiso, Connection conexion ) throws SQLException
    {

        int poseePermiso;
        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call security_proventas.poseePermiso(?, ?, ?, ?)}");
            
        cstmt.setInt("rol", rol);
        cstmt.setInt("permiso", permiso);
        cstmt.registerOutParameter("poseePermiso", java.sql.Types.TINYINT);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();

        poseePermiso = cstmt.getInt("poseePermiso");
        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {
            if ( poseePermiso == AUTORIZADO )
            {
                return true;
            }
        }

        return false;
        
    }

    public static boolean asignarPermiso ( int rol, int permiso, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call security_proventas.asignarPermiso(?, ?, ?)}");
            
        cstmt.setInt("rol", rol);
        cstmt.setInt("permiso", permiso);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {
            return false;
        }

        return true;
    }

    public static boolean agregarUsuario ( 
            String primerNombre,
            String segundoNombre,
            String tercerNombre,
            String primerApellido,
            String segundoApellido,
            String apellidoCasada,
            String username,
            String contrasenia,
            int rol,
            boolean esActivo,
            Connection conexion )
            throws SQLException
    {

        int ocurreError;
        String actividad;
        
        if ( esActivo == true ){
            actividad = "1";
        }else{
            actividad = "0";
        }

        if ( username.length() > 0 ){

            CallableStatement cstmt =  conexion.prepareCall("{call security_proventas.agregarUsuario(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            
            cstmt.setString("primerNombre", primerNombre);
            cstmt.setString("segundoNombre", segundoNombre);
            cstmt.setString("tercerNombre", tercerNombre);
            cstmt.setString("primerApellido", primerApellido);
            cstmt.setString("segundoApellido", segundoApellido);
            cstmt.setString("apellidoCasada", apellidoCasada);
            cstmt.setString("username", username);
            cstmt.setString("contrasenia", contrasenia);
            cstmt.setString("esActivo", actividad);
            cstmt.setInt("rol", rol);
            cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
            cstmt.execute();

            ocurreError = cstmt.getInt("existeError");
 
            cstmt.close();
        
            if ( ocurreError == SIN_ERROR )
            {
                return false;
            }
        }        
        return true;
    }

    public static boolean revocarPermiso ( int rol, int permiso, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call security_proventas.revocarPermiso(?, ?, ?)}");
            
        cstmt.setInt("rol", rol);
        cstmt.setInt("permiso", permiso);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {
            return false;
        }

        return true;
    }

    public static boolean agregarPermiso ( String nombre, String descripcion, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call security_proventas.agregarPermiso(?, ?, ?)}");
            
        cstmt.setString("nombre", nombre);
        cstmt.setString("descripcion", descripcion);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {
            return false;
        }

        return true;
    }

    public static boolean agregarRol ( String nombre, String descripcion, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call security_proventas.agregarRol(?, ?, ?)}");
            
        cstmt.setString("nombre", nombre);
        cstmt.setString("descripcion", descripcion);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {
            return false;
        }

        return true;
    }

    public static int obtenerIdUsuario ( String username, Connection conexion ) throws SQLException
    {

        int ocurreError;
        int idUser = 0;
        
        CallableStatement cstmt =  conexion.prepareCall("{call security_proventas.obtenerIdUsuario(?, ?, ?)}");

        cstmt.setString("nombre", username);
        cstmt.registerOutParameter("idUsuario", java.sql.Types.SMALLINT);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();
 
        ocurreError = cstmt.getInt("existeError");
        idUser = cstmt.getInt("idUsuario");
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {
            return idUser;
        }

        return 0;

    }        
    
}