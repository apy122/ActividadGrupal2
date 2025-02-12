package org.example;

import javabean.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class MainMenu {
    public static List<String> menuGeneral;
    public static Scanner sc = new Scanner(System.in);
    public static ConversionUnidades conv= new ConversionUnidades( );
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        char opcion;

        do {
            menuGeneral= Arrays.asList("Opciones:",
                    "1. SUMAR",
                    "2. RESTAR",
                    "3. MULTIPLICAR",
                    "4. DIVIDIR",
                    "5. CALCULAR MODULO",
                    "6. CONVERSION DE UNIDADES",
                    "7. ESTADISTICA",
                    "8. TRIGONOMETRIA",
                    "9. CALCULO LOGARITMICO Y EXPONENCIAL",
                    "0. SALIR");

            opcion = sc.next().charAt(0);
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
                case'6':
                    conv.menu();
                    break;
                case'7':
                    /*Estadistica.menu();*/
                    break;
                case'8':
                    /*Trigonometria.menu();*/
                    break;
                case '9':
                    LogaritmosyExponenciales.menu();
                    break;
                default:
                    throw new NumberFormatException("Opcion no valida");
            }
        }while(sc.nextInt() !=0);
    }
    }