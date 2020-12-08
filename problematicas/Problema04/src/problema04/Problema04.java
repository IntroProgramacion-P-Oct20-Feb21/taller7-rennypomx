/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numerador = 1;
        int contadorDenominador = 3;
        String cadena = "";
        double operacion = 0;
        
        cadena = String.format("%s%d", cadena, numerador);
        operacion = operacion + numerador;
        
        for (int i = 1; i <= 7; i++) {
            if ((i % 2) == 0){
                cadena = String.format("%s + %d/%d",
                        cadena,
                        numerador,
                        contadorDenominador);
                operacion = operacion + (double)numerador/contadorDenominador;
            } else {
                cadena = String.format("%s - %d/%d",
                        cadena,
                        numerador,
                        contadorDenominador);
                operacion = operacion - (double)numerador/contadorDenominador;
            }
            contadorDenominador = contadorDenominador + 2;
        }
        
        cadena = String.format("%s = %.3f",cadena, operacion);
        System.out.printf("%s\n", cadena);
    }
    
}

