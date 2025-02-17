package org.example;

import javabean.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static List<String> menuGeneral;
    public static Scanner sc = new Scanner( System.in );
    public static  Suma suma = new Suma();
    Resta  resta = new Resta();
    public static Producto producto = new Producto();
    Cociente cociente = new Cociente();
    Modulo modulo = new Modulo();
    public static ConversionUnidades conversionUnidades = new ConversionUnidades();
    static Estadistica estadistica = new Estadistica();
    Trigonometria trigonometria = new Trigonometria();
    public static LogaritmosyExponenciales logaritmosyExponenciales= new LogaritmosyExponenciales();

    public static void main(String[] args) {
        mainMenu( );
    }

    public static void mainMenu() {
        int opcion;
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
            menuGeneral.forEach( System.out::println);
            System.out.print( "Elige Opcion: " );
            opcion = sc.nextInt();

            if(opcion <'0'|| opcion >'9')
                throw new IllegalArgumentException( "Opcion no valido." );
            else{
                switch (opcion) {
                    case '1':
                        Suma.pintarMenu();
                        break;
                    case '2':
                        /*resta.menuResta();*/
                        break;
                    case '3':
                        producto.menu();
                        break;
                    case '4':
                        /*cociente.menu();*/
                        break;
                    case '5':
                        Modulo.modMenu();
                        break;
                    case '6':
                        conversionUnidades.menu();
                        break;
                    case '7':
                        estadistica.menu();
                        break;
                    case '8':
                        /*trigonometria.menu();*/
                        break;
                    case '9':
                        logaritmosyExponenciales.menu();
                        break;
                    case '0':
                        sc.close();
                        return;
                    default:
                        throw new NumberFormatException( "Opcion no valida" );
                }
            }
        }while (true);
    }
}