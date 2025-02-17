package javabean;

import java.util.Scanner;

/**
 * Esta clase proporciona funciones para calcular logaritmos y exponenciales
 * @author Aless-Mereu
 */
public class LogaritmosyExponenciales {

        /**
         * Calcula el logaritmo natural/neperiano (base e) de un número.
         * @param x Número de entrada (x > 0)
         * @return log_e(x)
         * @throws IllegalArgumentException si x <= 0
         */
        public static double logaritmoNatural(double x) {
           if (x <= 0) {
               throw new IllegalArgumentException("El número no puede ser menor o igual a cero");
           }
            return Math.log(x);
        }

        /**
         * Calcula el logaritmo en base 10 de un número.
         * @param x Número de entrada (x > 0)
         * @return log_10(x)
         * @throws IllegalArgumentException si x <= 0
         */
        public static double logaritmoBase10(double x) {
            if(x <= 0) {
                throw new IllegalArgumentException("El número no puede ser menor o igual a cero");
            }
            return Math.log10(x);
        }

        /**
         * Calcula la exponencial (número de Euler) de (e^x).
         * @param x Exponente
         * @return e^x
         */
        public static double exponencial(double x) {

            return Math.exp(x);
        }

    /**
     * Método para ejecutar el menú para realizar los cálculos logarítmicos y exponencial.
     */

    public static void menu() {//Objeto Scanner para leer la entrada del usuario.
        Scanner sc = new Scanner(System.in);
        char opcion; //variable para almacenar la opción del usuario
        boolean continuar = true; // Controla el bucle para repetir el menu hasta que el usuario decida salir.
        do {//Menu de opciones.
            System.out.println("1. Logaritmo Natural");
            System.out.println("2. Logaritmo Base10");
            System.out.println("3. Exponencial");
            System.out.println("4. Salir");

            opcion = sc.next().charAt(0); // Lectura de opcion.
            try {
                switch (opcion) {
                    case '1':
                        System.out.println("Calcula el logaritmo natural de : ");
                        System.out.println("El resultado es: " + logaritmoNatural(sc.nextDouble()));
                        break;
                    case '2':
                        System.out.println("Calcula el logaritmo en base 10 de : ");
                        System.out.println(LogaritmosyExponenciales.logaritmoBase10(sc.nextDouble()));
                        break;
                    case '3':
                        System.out.println("Calcula el exponencial (e) de : ");
                        System.out.println(LogaritmosyExponenciales.exponencial(sc.nextDouble()));
                        break;
                    case '4':
                        System.out.println("Programa finalizado");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no valida");

                }
            }catch (IllegalArgumentException e) { // Captura las excepciones
                System.out.println(e.getMessage()); //Lanza mensaje por consola.
            }

        }while (continuar); // Sigue ejecutando el bucle hasta que el usuario pulse Salir.

        sc.close();

        }

    }





