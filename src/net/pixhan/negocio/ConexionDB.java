/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.negocio;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 25/03/2016 
 * Hora: 09:03:27 PM
 * Web: https://reproducir.net
 */

public class ConexionDB {

        public static void main(String[] args) throws SQLException {
        // TODO code application logic here
    
        boolean conectese1 = false;
        Connection miConexion;
        miConexion = ConexionNegocio.GetConexionNegocio("localhost", "root", "");
     
        if(miConexion != null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }

        conectese1 = UtilNegocio.agregarAreaNegocio("Librería", "Librería 2.0", miConexion);
        conectese1 = UtilNegocio.agregarAreaNegocio("Fotocopiadora", "Fotocopiadora 2.0", miConexion);
        conectese1 = UtilNegocio.agregarClasePrimaria(1, "Lapicero", "Lapiceros", miConexion);
        conectese1 = UtilNegocio.agregarClasePrimaria(2, "Borrador", "Lapiceros", miConexion);
        conectese1 = UtilNegocio.agregarClaseSecundaria(1, "Bic", "Lapiceros Bic", miConexion);
        conectese1 = UtilNegocio.agregarClaseSecundaria(2, "Bic", "Borrador Bic", miConexion);
        conectese1 = UtilNegocio.agregarClaseTercearia(1, "Azul", "Lapiceros Bic Azul", miConexion);
        conectese1 = UtilNegocio.agregarClaseTercearia(2, "Azul", "Borrador Bic Azul", miConexion);

        conectese1 = UtilNegocio.agregarUsuario(1, "Alan", "Samayoa", miConexion);
        conectese1 = UtilNegocio.agregarUsuario(2, "Victor", "Matías", miConexion);
        conectese1 = UtilNegocio.agregarUsuario(3, "César", "Cifuentes", miConexion);
        
        conectese1 = UtilNegocio.asignarSaldosIniciales(1, 100.25f, miConexion);
        conectese1 = UtilNegocio.asignarSaldosIniciales(2, 100.25f, miConexion);
        conectese1 = UtilNegocio.asignarSaldosIniciales(3, 100.25f, miConexion);

        conectese1 = UtilNegocio.agregarProducto("Pilot", "Lap. Pilot Bic", "Bic", 1111, 100, 10, 1, 1,1,1,1, 10.5f, 12.5f, 0.5f, miConexion);
        conectese1 = UtilNegocio.agregarProducto("Pelicano", "Borrador pelícano", "Pelicano", 1121, 100, 10, 1, 1,1,1,1, 10.5f, 12.5f, 0.5f, miConexion);

        conectese1 = UtilNegocio.comprarProducto(1111, 10, 1, 11.5f, miConexion);
        conectese1 = UtilNegocio.comprarProducto(1121, 10, 1, 11.5f, miConexion);        

        conectese1 = UtilNegocio.insertarTransaccion("I", 1, 100, miConexion);
        conectese1 = UtilNegocio.insertarTransaccion("E", 2, 10, miConexion);
        
        conectese1 = UtilNegocio.venderProducto(1111, 1, 20, miConexion);
        conectese1 = UtilNegocio.venderProducto(1121, 2, 20, miConexion);
        
    }

    
}
