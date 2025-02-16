package org.example;

import javabean.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class MainMenu {
    public static List<String> menuGeneral;
    public static Scanner sc = new Scanner( System.in );
    public static ConversionUnidades conv = new ConversionUnidades();

    public static void main(String[] args) {
        mainMenu( );
    }

    public static void mainMenu() {
        char opcion;
        menuGeneral = Arrays.asList( "Opciones:",
                "1. SUMAR\n",
                "2. RESTAR\n",
                "3. MULTIPLICAR\n",
                "4. DIVIDIR\n",
                "5. CALCULAR MODULO\n",
                "6. CONVERSION DE UNIDADES\n",
                "7. ESTADISTICA\n",
                "8. TRIGONOMETRIA\n",
                "9. CALCULO LOGARITMICO Y EXPONENCIAL\n",
                "0. SALIR\n" );
        do {
            for (String opcionMen : menuGeneral) {
                System.out.print( opcionMen );
            }
            System.out.print( "Elige Opcion: " );
            opcion = sc.next( ).charAt( 0 );
            switch (opcion) {
                case '1':
                    /*Suma.menu();*/
                    break;
                case '2':
                    /*Resta.menu();*/
                    break;
                case '3':
                    /*Producto.menu();*/
                    break;
                case '4':
                    /*Cociente.menu();*/
                    break;
                case '5':
                    /*Modulo.menu();*/
                    break;
                case '6':
                    conv.menu();
                    break;
                case '7':
                    /*Estadistica.menu();*/
                    break;
                case '8':
                    /*Trigonometria.menu();*/
                    break;
                case '9':
                    /*LogaritmosyExponenciales.menu( );*/
                    break;
                default:
                    throw new NumberFormatException( "Opcion no valida" );
            }
        }while (opcion != 0) ;
    }
}