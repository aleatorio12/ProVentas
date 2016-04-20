/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.seguridad;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 12/04/2016 
 * Hora: 12:06:38 AM
 * Web: https://reproducir.net
 */

public class Encriptacion {

    private static final String LLAVE_SIMETRICA = "holamundocruel12";
    
    public static byte[] encriptar( String mensajeDescodificado ){

        SecretKeySpec key = new SecretKeySpec(LLAVE_SIMETRICA.getBytes(), "AES");
        Cipher cipher;      
        
        try{
            cipher = Cipher.getInstance("AES");   
       //Comienzo a encriptar
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] campoCifrado = cipher.doFinal(mensajeDescodificado.getBytes());
//            String mensajeOriginal = new String(campoCifrado.toString());
//            System.out.println(mensajeOriginal);
            return campoCifrado;
 
        }catch( NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e ){
            return null;
        }
    }

    public static String desencriptar( byte[] mensajeCodificado ){


        SecretKeySpec key = new SecretKeySpec(LLAVE_SIMETRICA.getBytes(), "AES");
        Cipher cipher = null;
        try{
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] datosDecifrados = cipher.doFinal( mensajeCodificado );
            String mensajeOriginal = new String(datosDecifrados); 
            System.out.println(mensajeOriginal);
            return mensajeOriginal;
        } 
        catch( Exception e ){
            return null;
        }
    }    

}