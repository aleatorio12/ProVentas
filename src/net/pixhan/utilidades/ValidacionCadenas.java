/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.utilidades;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 10/04/2016 
 * Hora: 01:33:20 AM
 * Web: https://reproducir.net
 */

public class ValidacionCadenas {
    
    public void validarSoloLetras( JTextField campo )
    {
        campo.addKeyListener( new KeyAdapter()
        {
            public void keyTyped( KeyEvent e )
            {
                char caracter = e.getKeyChar();
                
                if ( Character.isDigit(caracter) )
                {
                    e.consume();
                }
                
            }
        }
        );
    }

    public void validarSoloNumeros( JTextField campo )
    {
        campo.addKeyListener( new KeyAdapter()
        {
            public void keyTyped( KeyEvent e )
            {
                char caracter = e.getKeyChar();
                
                if ( !Character.isDigit(caracter) )
                {
                    e.consume();
                }
                
            }
        }
        );
    }

    public void limitarCaracteres( JTextField campo, int cantidad )
    {
        campo.addKeyListener( new KeyAdapter()
        {
            public void keyTyped( KeyEvent e )
            {
                char caracter = e.getKeyChar();
                int cant = campo.getText().length();
                
                if ( cant >= cantidad )
                {
                    e.consume();
                }
                
            }
        }
        );
    }    

    public void validarNumerosYPuntos( JTextField campo )
    {
        campo.addKeyListener( new KeyAdapter()
        {
            public void keyTyped( KeyEvent e )
            {
                char caracter = e.getKeyChar();
                int codigo = (int) e.getKeyChar();
                System.out.println(caracter);

                if ( !Character.isDigit(caracter) )
                {
                    if ( caracter != '.' )
                    {
                        e.consume();
                    }
                }
            }
        }
        );
    }
    
}
