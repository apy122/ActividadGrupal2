package org.example;

import javabean.ConversionUnidades;
import javabean.LogaritmosyExponenciales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MainMenu {
    public static ConversionUnidades conv1 = new ConversionUnidades();
    public static ArrayList<String> menuGeneral;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("Que quieres hacer?");
            menuGeneral= (ArrayList<String>) Arrays.asList(
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
                    /*Conv1.menu();*/
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

