package javabean;

import java.util.Scanner;

/** Clase Módulo dentro de la Calculadora grupal.
 * <p>Ejemplo de uso</p>
 * @author David Sánchez
 * @version 4.0
 * V. 2 Corregida función "modulo", sustituyendo return por throw new en la excepción.
 * V. 3. Inserté static en las funciones "módulo" y "vAbsolut" para poder incluirla en el menú
 * V. 4. No logré usar la excepción. Modifico el mét_odo 1 y añado un return 0 y un mensaje.
 */

public class Modulo {

    /**
     * Esta clase tiene dos funciones:
     *
     * 1º Cálculo del módulo de dos números enteros. (Residuo de una división entera).
     * @param a es el dividendo.
     * @param b es el divisor.
     * @return devuelve el residuo de la división entera.
     * @throws IllegalArgumentException si el divisor es 0.
     */

    public static int modulo(int a, int b){

        if(b==0){
            System.out.println("El divisor no puede ser cero");
            return 0;
        }
        return a % b;
    }

    /**
     * 2ª Función. Cálculo del valor absoluto de un número.
     * @param a el numero del que queremos calcular el valor absoluto.
     * @return valor absoluto de a.
     * Como los valores absolutos son siempre positivos, añadimos un if.
     */

    public static double vAbsoluto(double a){
        if (a >= 0){
            return a;
        }
        return -a;

    }

    /**
     * Menú para elegir cual de los dos métodos módulo queremos usar
     * La primera opción realiza la función módulo con dos números insertados.
     * La segunda función nos da el valor absoluto del número insertado.
     * Uso @param Scanner para que se puedan insertar parámetros en la terminal.
     * Como las opciones serán numéricas será variable int (entero).
     * En el caso 1 damos el resultado del módulo con resultMod.
     */

    public static void modMenu(){
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige que opción quieres: ");
            System.out.println("1. Módulo");
            System.out.println("2. Valor Absoluto");
            System.out.println("3. Regresar al menú principal");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el primer valor: ");
                    int a = leer.nextInt();
                    System.out.println("Ingresa el segundo valor: ");
                    int b = leer.nextInt();

                    int resultMod = modulo(a,b);
                    System.out.println("El modulo es: " + resultMod);
                    break;

                 case 2:
                     System.out.println("Ingresa un número para calcular su valor absoluto");
                     double numero = leer.nextDouble();
                     System.out.println("El valor absoluto es: " + vAbsoluto(numero));
                     break;

                 case 3:
                     System.out.println("Regreso al menú principal");
                     break;

                     default:
                         System.out.println("Opción incorrecta. Inténtalo de nuevo");
                         break;
            }
        }while (opcion != 3);
    }

}
