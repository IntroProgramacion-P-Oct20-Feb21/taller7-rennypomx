/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador = 3;
        int contadorElementos = 1;
        int numero = 2;
        String cadena = "";
        cadena = String.format("%s%d ", cadena,numero);
        do {            
            numero = numero + contador;
            cadena = String.format("%s%d ", cadena,numero);
            contador = contador + 2;
            
            contadorElementos = contadorElementos + 1;
        } while (contadorElementos <= 5);
        System.out.printf("%s\n", cadena);
        
        
    }
    
}
