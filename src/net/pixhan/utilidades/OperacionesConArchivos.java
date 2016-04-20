/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import net.pixhan.globales.VariablesGlobales;
import net.pixhan.seguridad.Encriptacion;
/*import org.apache.commons.io.FileUtils;*/

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 12/04/2016 
 * Hora: 12:47:00 AM
 * Web: https://reproducir.net
 */

public class OperacionesConArchivos {

    private static final int TOTAL_VARIABLES_GLOBALES = 6;
    
    public static VariablesGlobales leerVariables( String ubicacionArchivo ) throws IOException{

        File archivo = new File(ubicacionArchivo);
//        byte[] org.apache.commons.io.FileUtils.readFileToByteArray( archivo );
//        List lines = FileUtils.readLines(archivo, "UTF-8");
        
        boolean errorEncontrado = true;
//        File archivo = new File( ubicacionArchivo );
        BufferedReader entrada;
        VariablesGlobales variablesGlobales = new VariablesGlobales();
        try {
            entrada = new BufferedReader( new FileReader( archivo ) );
            if ( entrada.ready() )
            {
                variablesGlobales.setNegocioBD(entrada.readLine());
                System.out.println(variablesGlobales.getNegocioBD());
            }
            if ( entrada.ready() )
            {
                variablesGlobales.setNegocioUser(entrada.readLine());
            }
            if ( entrada.ready() )
            {
                variablesGlobales.setNegocioPass(entrada.readLine());
            }
            if ( entrada.ready() )
            {
                variablesGlobales.setNegocioHost(entrada.readLine());
            }            
            if ( entrada.ready() )
            {
                variablesGlobales.setSeguridadBD(entrada.readLine());
            }
            if ( entrada.ready() )
            {
                variablesGlobales.setSeguridadUser(entrada.readLine());
            }
            if ( entrada.ready() )
            {
                variablesGlobales.setSeguridadPass(entrada.readLine());
            }
            if ( entrada.ready() )
            {
                variablesGlobales.setSeguridadHost(entrada.readLine());
                errorEncontrado = false;
            }
            if ( errorEncontrado )
            {
                return null;
            }
            else
            {
                return variablesGlobales;
            }
            
        }catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
        
    }
    
    public static boolean escribirVariables( String ubicacionArchivo, VariablesGlobales variablesGlobales) throws FileNotFoundException, IOException{
            
        FileOutputStream stream = new FileOutputStream(ubicacionArchivo);
        try {
            stream.write(Encriptacion.encriptar(variablesGlobales.getNegocioBD()));
            stream.write(Encriptacion.encriptar(variablesGlobales.getNegocioUser()));
            stream.write(Encriptacion.encriptar(variablesGlobales.getNegocioPass()));
            stream.write(Encriptacion.encriptar(variablesGlobales.getNegocioHost()));
            stream.write(Encriptacion.encriptar(variablesGlobales.getSeguridadBD()));
            stream.write(Encriptacion.encriptar(variablesGlobales.getSeguridadUser()));
            stream.write(Encriptacion.encriptar(variablesGlobales.getSeguridadPass()));
            stream.write(Encriptacion.encriptar(variablesGlobales.getSeguridadHost())); 
        
        }catch( IOException e )
        {
            return false;
        }        
        finally {
            stream.close();
        }
        
        return true;
        
    }

}