/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.utilidades;

import java.io.IOException;
import javax.swing.JOptionPane;
import net.pixhan.globales.VariablesGlobales;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 12/04/2016 
 * Hora: 01:23:33 AM
 * Web: https://reproducir.net
 */

public class PruebasTexto {

    public static void main(String[] args) throws IOException {
        
        VariablesGlobales globales = new VariablesGlobales("1", "2", "3", "4", "5", "6", "7", "8");
        boolean escribirArchivo = false;
        escribirArchivo = OperacionesConArchivos.escribirVariables("archivo.dat", globales);
        if ( escribirArchivo )
        {
            JOptionPane.showMessageDialog(null, "Archivo escrito exitosamente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ocurrió un error");
        }

        
 /*       VariablesGlobales globales = OperacionesConArchivos.leerVariables("archivo.txt");
        if ( globales != null ){
        
            JOptionPane.showMessageDialog(null, "Archivo leido exitosamente");
            System.out.println(globales.getNegocioBD());
            System.out.println(globales.getNegocioUser());
            System.out.println(globales.getNegocioPass());
            System.out.println(globales.getNegocioHost());
            System.out.println(globales.getSeguridadBD());
            System.out.println(globales.getNegocioUser());
            System.out.println(globales.getNegocioPass());
            System.out.println(globales.getNegocioHost());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No funciono :'(");        
        }
  */      
    }
    
}
