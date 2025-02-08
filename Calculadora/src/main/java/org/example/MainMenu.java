package org.example;

import javabean.ConversionUnidades;
import javabean.LogaritmosyExponenciales;

import java.util.Scanner;
public class MainMenu {
    public static ConversionUnidades conversionUnidades = new ConversionUnidades();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. CALCULAR MODULO");
            System.out.println("6. CONVERSION DE UNIDADES");
            System.out.println("7. ESTADISTICA");
            System.out.println("8. TRIGONOMETRIA");
            System.out.println("9. CALCULO LOGARITMICO Y EXPONENCIAL");
            System.out.println("0. SALIR");

            opcion = sc.next().charAt(0);
            switch (opcion) {
                case '1':
                    Suma.menu();
                    break;
                case '2':
                    Resta.menu();
                    break;
                case '3':
                    Producto.menu();
                    break;
                case '4':
                    Cociente.menu();
                    break;
                case '5':
                    Modulo.menu();
                    break;
                case'6':
                    ConversionUnidades.menu();
                    break;
                case'7':
                    Estadistica.menu();
                    break;
                case'8':
                    Trigonometria.menu();
                    break;
                case '9':
                    LogaritmosyExponenciales.menu();
                    break;
                default:
                    System.out.println("Opción no valida");

            }
        }while(sc.nextInt() !=0);
        }
    }

