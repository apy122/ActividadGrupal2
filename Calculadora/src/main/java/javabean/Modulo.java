package javabean;

import java.util.Scanner;

/** Clase Módulo dentro de la Calculadora grupal.
 *
 * <p>Esta clase devuelve el módulo de dos números o el valor absoluto de un número.
 * Para elegir qué opción queremos, añado un menú.</p>
 *
 * <h2>Ejemplo de uso</h2>
 * <pre>{@code
 *  int resultadoModulo = Modulo.modulo(10, 3); // Devuelve 1
 *  double valorAbs = Modulo.vAbsoluto(-3.5);  // Devuelve 3.5
 * }</pre>
 *
 * @author David Sánchez (aka david-sanara)
 * @see https://github.com/david-sanara
 * @version 6.1
 *
 * V. 2. Corregida función "modulo", sustituyendo return por throw new en la excepción.
 * V. 3. Inserté static en las funciones "módulo" y "vAbsolut" para poder incluirla en el menú
 * V. 4. No logré usar la excepción. Modifico el mét_odo 1 y añado un return 0 y un mensaje.
 * V. 5. Tras trabajar con el compañero que me testea (Alessandro) vuelvo a usar
 *  ArithmeticException.
 * V. 6. He añadido try-catch para poder manejar ArithmeticException. Además, mejoro el JavaDoc.
 * V. 6.1 Añadido perfil de GitHub
 */

public class Modulo {

    /**
     * Cálculo del módulo de dos números enteros. (Residuo de una división entera).
     * @param a es el dividendo.
     * @param b es el divisor.
     * @return módulo entre a y b.
     * @throws ArithmeticException si el divisor es cero.
     */

    public static int modulo(int a, int b){

        if(b==0){
            throw new ArithmeticException("El divisor no puede ser cero");
        }
        return a % b;
    }

    /**
     * Cálculo del valor absoluto de un número.
     * @param a el número del que queremos calcular el valor absoluto.
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
     * Menú para elegir que función queremos usar.
     * <ul>
     *     <li>La primera opción realiza la función módulo con dos números
     *     insertados. Añado un try, que prueba a ejecutar el módulo, y un catch,
     *     que captura el throw ArithmeticException y devuelve mensaje de error.</li>
     *
     *     <li>La segunda opción nos da el valor absoluto del número insertado.</li>
     *
     *     <li>La tercera opción, vuelve al menú principal de la Calculadora.</li>
     * </ul>
     * Uso @param Scanner para que se puedan insertar parámetros en la terminal.
     * Como las opciones serán numéricas será variable int (entero).
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

                    try {
                        int resultMod = modulo(a, b);
                        System.out.println("El modulo es: " + resultMod);
                    } catch (ArithmeticException errorCero) {
                        System.out.println("Error! " + errorCero.getMessage());
                    }
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
