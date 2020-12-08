/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador = 1;
        int contador2 = 2;
        int contadorElementos = 1;
        int numero;
        String cadena = "";
        do {            
            numero = (contador * contador2) ;
            cadena = String.format("%s%d ", cadena,numero);
            contador = contador + 1;
            contador2 = contador2 + 1;
            contadorElementos = contadorElementos +1;
        } while (contadorElementos <= 10);
        System.out.printf("%s\n", cadena);
    }
    
}