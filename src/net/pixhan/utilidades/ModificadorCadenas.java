/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.utilidades;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 10/04/2016 
 * Hora: 03:11:22 AM
 * Web: https://reproducir.net
 */

public class ModificadorCadenas {

    public static String eliminaCaracteres(String cadena, String caracteres)
    {
        String nueva_cadena = "";
        Character caracter = null;
        boolean valido = true;
 
        /*
        Va recorriendo la cadena s_cadena y copia a la cadena que va a regresar,
        sólo los caracteres que no estén en la cadena s_caracteres */
        for (int i = 0; i < cadena.length(); i++)
        {
            valido = true;
            for (int j = 0; j < caracteres.length(); j++)
            {
                caracter = caracteres.charAt( j );
 
                if ( cadena.charAt(i) == caracter )
               {
                    valido = false;
                    break;
               }
            }
            if (valido)
            nueva_cadena += cadena.charAt(i);
        }
 
        return nueva_cadena;
    }

    public static int cadenaAEntero(String cadena)
    {
        return Integer.parseInt(cadena.trim());        
    }
    
    public static float cadenaADecimal( String cadena ){
        return Float.parseFloat(cadena);
    }
    
}
