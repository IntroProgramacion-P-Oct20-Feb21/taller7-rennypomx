/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String cadenaEdades = "";
        String nombreJugador;
        String posicionCampo;
        double estatura;
        int edad;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        double sumaEstaturas = 0.0;
        int contadorIteraciones = 0;
        double promedioEdad;
        double promedioEstatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte, 
                "Listado de Jugadores");
        
        do {
            System.out.println("Ingrese el nombre del jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();
            
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            contadorIteraciones = contadorIteraciones + 1;
            
            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d, "
                    + "estatura %.2f\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);
            cadenaEdades = String.format("%s%d\n", cadenaEdades, edad);
            entrada.nextLine();
            System.out.println("Desea ingresar más información; digite: si\n"
                    + "Desea presentar el reporte; digite no");
            salir = entrada.nextLine();
            salir = salir.toLowerCase();
            if(!salir.equals("si")){
                bandera = false;
            }
        } while (bandera);
        if (salir.equals("no")){
            promedioEdad = (double)sumaEdades/contadorIteraciones;
            promedioEstatura = sumaEstaturas/contadorIteraciones;
            cadenaReporte = String.format("%sListado de Edades\n%s"
                    + "Promedio de edades: %.2f\n"
                    + "Promedio de estaturas: %.2f\n", 
                    cadenaReporte,
                    cadenaEdades,
                    promedioEdad,
                    promedioEstatura);
        } else {
            cadenaReporte = "Datos incorrectos";
        }
        
        System.out.printf("%s\n", cadenaReporte);
    }
    
}