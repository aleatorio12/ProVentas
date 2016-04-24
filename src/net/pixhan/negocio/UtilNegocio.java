/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.negocio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import net.pixhan.utilidades.DatosProducto;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 9/04/2016 
 * Hora: 06:12:26 PM
 * Web: https://reproducir.net
 */

public class UtilNegocio {

    private static final int SIN_ERROR = 0;
    
    public static boolean agregarAreaNegocio ( String nombre, String descripcion, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.agregarAreaNegocio(?, ?, ?)}");
            
        cstmt.setString("nombre", nombre);
        cstmt.setString("descripcion", descripcion);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {

            return true;
            
        }

        return false;
        
    }
    
    public static boolean agregarClasePrimaria ( int areaNegocio, String nombre, String descripcion, Connection conexion ) throws SQLException
    {
        int ocurreError;
            
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.agregarClasePrimaria(?, ?, ?, ?)}");
            
        cstmt.setInt("areaNegocio", areaNegocio);
        cstmt.setString("nombre", nombre);
        cstmt.setString("descripcion", descripcion);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
            
        cstmt.execute();
            
        ocurreError = cstmt.getInt("existeError");
            
        cstmt.close();
            
        if ( ocurreError == SIN_ERROR )
        {               
            return true;        
        }

        return false;
        
    }

    public static boolean agregarClaseSecundaria ( int clasePrimaria, String nombre, String descripcion, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.agregarClaseSecundaria(?, ?, ?, ?)}");
            
        cstmt.setInt("clasePrimaria", clasePrimaria);
        cstmt.setString("nombre", nombre);
        cstmt.setString("descripcion", descripcion);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {

            return true;
            
        }

        return false;
        
    }
    
    public static boolean agregarClaseTercearia ( int claseSecundaria, String nombre, String descripcion, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.agregarClaseTercearia(?, ?, ?, ?)}");
            
        cstmt.setInt("claseSecundaria", claseSecundaria);
        cstmt.setString("nombre", nombre);
        cstmt.setString("descripcion", descripcion);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {

            return true;
            
        }

        return false;
        
    }

    public static boolean agregarProducto ( 
            String nombre,
            String descripcion,
            String fabricante,
            int producto,
            int existencia,
            int alerta,
            int usuario,
            int areaNegocio,
            int clasePrimaria,
            int claseSecundaria,
            int claseTercearia,
            float costo,
            float precioVenta,
            float descuento,
            Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.agregarProducto(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ? )}");
            
        cstmt.setString("nombre", nombre);
        cstmt.setString("descripcion", descripcion);
        cstmt.setString("fabricante", fabricante);
        cstmt.setInt("producto", producto);
        cstmt.setInt("existencia", existencia);
        cstmt.setInt("alerta", alerta);
        cstmt.setInt("usuario", usuario);
        cstmt.setInt("areaNegocio", areaNegocio);
        cstmt.setInt("clasePrimaria", clasePrimaria);
        cstmt.setInt("claseSecundaria", claseSecundaria);
        cstmt.setInt("claseTercearia", claseTercearia);
        cstmt.setFloat("costo", costo);
        cstmt.setFloat("precioVenta", precioVenta);
        cstmt.setFloat("descuento", descuento);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {

            return true;
            
        }

        return false;
        
    }    

    public static boolean agregarUsuario ( int usuario, String primerNombre, String primerApellido, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.agregarUsuario(?, ?, ?, ?)}");
            
        cstmt.setInt("usuario", usuario);
        cstmt.setString("primerNombre", primerNombre);
        cstmt.setString("primerApellido", primerApellido);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {

            return true;
            
        }

        return false;
        
    }    

    public static boolean asignarSaldosIniciales ( int usuario, float cantidadAsignada, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.asignarSaldosIniciales(?, ?, ?)}");
            
        cstmt.setInt("usuario", usuario);
        cstmt.setFloat("cantidadAsignada", cantidadAsignada);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {

            return true;
            
        }

        return false;
        
    }

    public static boolean comprarProducto ( int producto, int cantidad, int usuario, float costo, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.comprarProducto(?, ?, ?, ?, ?)}");
            
        cstmt.setInt("producto", producto);
        cstmt.setInt("cantidad", cantidad);
        cstmt.setInt("usuario", usuario);
        cstmt.setFloat("costo", costo);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {

            return true;
            
        }

        return false;
        
    }    

    public static boolean insertarTransaccion ( String tipo, int usuario, float cantidad, Connection conexion ) throws SQLException
    {

        int ocurreError;        
        if ( tipo.equalsIgnoreCase("i") || tipo.equalsIgnoreCase("e") )
        {        
            CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.insertarTransaccion(?, ?, ?, ?)}");

            cstmt.setString("tipo", tipo);
            cstmt.setInt("usuario", usuario);
            cstmt.setFloat("cantidad", cantidad);
            cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
            cstmt.execute();

            ocurreError = cstmt.getInt("existeError");
 
            cstmt.close();
        
            if ( ocurreError == SIN_ERROR )
            {

                return true;
            
            }
        }
        return false;
        
    }    

    public static boolean venderProducto ( int producto, int usuario, float cantidad, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.venderProducto(?, ?, ?, ?)}");

        cstmt.setInt("producto", producto);
        cstmt.setInt("usuario", usuario);
        cstmt.setFloat("cantidad", cantidad);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();

        ocurreError = cstmt.getInt("existeError");
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {

            return true;
            
        }

        return false;
        
    }    
    
    public static int seleccionarProducto ( int producto, String nombreProducto, Connection conexion ) throws SQLException
    {
        int existencia;
        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.seleccionarProducto(?, ?, ?, ?)}");

        cstmt.setInt("producto", producto);
        cstmt.setString("nombre", nombreProducto);
        cstmt.registerOutParameter("existencia", java.sql.Types.SMALLINT);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();
 
        existencia = cstmt.getInt("existencia");
        ocurreError = cstmt.getInt("existeError");            
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {

            return existencia;
            
        }

        return 0; //Significa que ha ocurrido un error
        
    }

    public static boolean actualizarDatosProducto ( int producto, int alerta, int descuento, float precioVenta, String nombreProducto, String descripcion, Connection conexion ) throws SQLException
    {

        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.actualizarDatosProducto(?, ?, ?, ?, ?, ?, ?)}");

        cstmt.setInt("producto", producto);
        cstmt.setInt("alerta", alerta);
        cstmt.setInt("descuento", descuento);
         cstmt.setFloat("precioVenta", precioVenta);
        cstmt.setString("nombre", nombreProducto);
        cstmt.setString("descripcion", descripcion);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();
 
        ocurreError = cstmt.getInt("existeError");            
 
        cstmt.close();
        
        if ( ocurreError == SIN_ERROR )
        {

            return true;
            
        }

        return false;
    }    

    public static DatosProducto cargarDatosProducto ( int producto, Connection conexion ) throws SQLException
    {

        DatosProducto datosProducto = null;
        int ocurreError;
        
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.cargarDatosProducto(?, ?, ?, ?, ?, ?, ?)}");

        cstmt.setInt("producto", producto);
        cstmt.registerOutParameter("alerta", java.sql.Types.SMALLINT);
        cstmt.registerOutParameter("descuento", java.sql.Types.TINYINT);
        cstmt.registerOutParameter("precioVenta", java.sql.Types.FLOAT);
        cstmt.registerOutParameter("nombreProducto", java.sql.Types.VARCHAR);
        cstmt.registerOutParameter("descripcion", java.sql.Types.VARCHAR);
        cstmt.registerOutParameter("existeError", java.sql.Types.TINYINT);
        
        cstmt.execute();
 
        ocurreError = cstmt.getInt("existeError");            
 
        if ( ocurreError == SIN_ERROR )
        {

            datosProducto.setAlerta(cstmt.getInt("alerta"));
            datosProducto.setDescuento(cstmt.getInt("descuento"));
            datosProducto.setPrecio(cstmt.getFloat("precioVenta"));
            datosProducto.setNombreProducto(cstmt.getString("nombreProducto"));
            datosProducto.setDescripcion(cstmt.getString("descripcion"));
           
        }        

        cstmt.close();

        return datosProducto;
    }    
    
    /**
     *
     * @param tipo
     * @param Connection
     * @return
     */
    public static ArrayList<DatosClases> devolverNombresClases ( String tipo, Connection conexion ) throws SQLException
    {
        ArrayList<DatosClases> datosClases = new ArrayList<DatosClases>();
        try{  
        CallableStatement cstmt =  conexion.prepareCall("{call punto_venta.devolverNombresClases( ? )}");

        cstmt.setString("tipo", tipo);        
        cstmt.execute();
  
        final ResultSet rs = cstmt.getResultSet();
        
        while ( rs.next() ){
            DatosClases datos = new DatosClases( rs.getString("NOMBRE"), rs.getInt("ID") );
            System.out.println( rs.getString("NOMBRE") );
            System.out.println( rs.getInt("ID") );
            datosClases.add(datos);            
        }
        
        cstmt.close();

        }catch(SQLException e){
            System.out.println( e.getErrorCode() );
        }
        return datosClases;
    }    
    
}
