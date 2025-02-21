package javabean;
import java.util.Scanner;

/** La clase Suma implementará métodos relacionados con la suma de una calculadora.
 *
 * <p>Ejemplos de uso:</p>
 * <pre>{@code
 * int[] numeros = {1,2};
 * system.out.println("La suma de los dos números enteros es igual a: " + suma.suma(numeros));
 *
 * double[] numeros = {1.5,2.5};
 * system.out.println("La suma de los dos números reales es igual a: " + sumaReal(numeros));
 *
 * double[] numeros = {1.5,2.5,3.5};
 * system.out.println("La suma de los tres números reales es igual a: " + sumaTresReal(numeros));
 *
 * double[] numeros = {1,2.5,3,4.5,5,6.5,7};
 * system.out.println("La suma total de todos los números es igual a: " + sumaAcumulada(numeros));
 *}</pre>
 *
 * @author Lorena portatil (aka lorena.sanchez744@comunidadunir.net)
 * @see <a href="https://github.com/LorenaSanchezErroz">Mi repositorio GitHub</a>
 * @version 1.0
 */
public class Suma {

    /**
     * Suma de dos números enteros:
     * @param a Primer parámetro de entrada.
     * @param b Segundo parámetro de entrada.
     * @return resultado de la suma de a + b.
     */
    public int suma(int a, int b) {
        return a + b;
    }

    /**
     * Suma de dos números reales:
     * @param a Primer parámetro de entrada.
     * @param b Segundo parámetro de entrada.
     * @return resultado de la suma de a + b.
     */
    public double sumaReal(double a, double b) {
        return a + b;
    }

    /**
     * Suma de tres números reales:
     * @param a Primer parámetro de entrada.
     * @param b Segundo parámetro de entrada.
     * @param c Tercer parámetro de entrada.
     * @return resultado de la suma de a + b + c.
     */
    public double sumaTresReal(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * Suma con valor acumulado.
     * @param a parámetro de entrada
     * @return resultado de la suma de todos los números introducidos.
     */
    public double sumaAcumulada(double a) {
        double acumulada = a++;
        return acumulada;
    }

    /**Uso de la clase Scanner para que el usuario pueda introducir datos
     * con los siguientes fines:
     * - Elegir entre la operaciones que puede realizar.
     * - Introducir números para realizar las sumas.
     */
    public static Scanner leer = new Scanner(System.in);

    public static void MenuSuma(String[] args) {
        /** Menú suma con cuatro opciones de suma y una de salida de la aplicación:
         * @param 1 parámetro de entrada para la suma de dos números enteros.
         *          @return opción suma de dos números enteros.
         * @param 2 parámetro de entrada para la suma de dos números reales.
         *          @return opción suma de dos números reales.
         * @param 3 parámetro de entrada para la suma de tres números reales.
         *          @return opción suma de tres números reales.
         * @param 4 parámetro de entrada para  la suma acumulada.
         *          @return opción suma de números acumulados
         * @param 5 parámetro de entrada para salir del Menú Suma.
         */

        /** Creación de objeto suma de la clase Suma para llevar
         a cabo los métodos.
         */
        Suma suma = new Suma();

        /**Creación de variable int opción para poder elegir la operación a realizar*/
        int opcion = 0;

        /**Bucle de condicionales de una o más repeticiones "do - while" para ejecutar
         * la operación elegida.
         */
        do {
            /**Método pintarMenu, el cual está desarrollado después del do-while
             para realizar la suma seleccionada, nos dirige al do-while.  */
            opcion = pintarMenu();

            /**Alternativa switch con los siguientes casos para realizar los diferentes tipos de suma*/

            switch (opcion) {
                /** Opción 1.- Suma de dos números enteros.
                 * @return Petición de parámetros de entrada.
                 * @param a Primer parámetro de entrada.
                 * @param b Segundo parámetro de entrada.
                 * @return Respuesta con el resultado de la suma de a + b.
                 */
                case 1:
                    System.out.println("Introduce dos números enteros, por favor");
                    int a = leer.nextInt();
                    int b = leer.nextInt();
                    System.out.println("La suma de " + a + " y " + b + " es igual a: " + suma.suma(a, b));
                    break;

                /** Opción 2.- Suma de dos números reales.
                 * @return Petición de parámetros de entrada.
                 * @param c Primer parámetro de entrada.
                 * @param d Segundo parámetro de entrada.
                 * @return Respuesta con el resultado de la suma de c + d.
                 */
                case 2:
                    System.out.println("Introduce dos números reales, por favor");
                    double c = leer.nextDouble();
                    double d = leer.nextDouble();
                    System.out.println("La suma de " + c + " y " + d + " es igual a: " + suma.sumaReal(c,d));
                    break;

                /** Opción 3.- Suma de tres números reales.
                 * @param e Primer parámetro de entrada.
                 * @param f Segundo parámetro de entrada.
                 * @param g Tercer parámetro de entrada.
                 * @return Respuesta con el resultado de la suma de e + f + g.
                 */
                case 3:
                    System.out.println("Introduce 3 números reales, por favor");
                    double e = leer.nextDouble();
                    double f = leer.nextDouble();
                    double g = leer.nextDouble();
                    System.out.println("La suma de " + e + ", " + f + " y " + g + " es igual a: "
                            + suma.sumaTresReal(e,f,g));
                    break;

                /** Opción 4.- Suma de números acumulados.
                 * @param h parámetro de entrada
                 * @return resultado de la suma de todos los números introducidos.
                 */
                case 4:
                    System.out.println("Introduce los números que quieras sumar y pulsa " +
                            "enter para saber el resultado de la suma de todos ellos, por favor.");
                    double h = leer.nextDouble();
                    System.out.println("La suma de todos los númeos introducidos es igual a: "
                            + suma.sumaAcumulada(h));
                    break;
            }
        }
        /** Opción 5.- Salida.
         * @return Salida de la suma.
         */
        while (opcion != 5);
    }
    /** Método pintarMenu para elegir la operación a realizar y que lleva al bucle do-while
     * para que se ejecute la suma elegida.
     * @return información de opciones de suma a realizar y elegir una.
     * @param opcion de entrada; el usuario teclea un número comprendido entre 1 y 5,
     *               inclusive, para elegir la operación que desea realizar.
     * @return tipo de suma elegida para operar.
     */
    public static int pintarMenu() {

        int opcion = 0;

        System.out.println("1.- Suma de dos números enteros");
        System.out.println("2.- Suma de dos números reales");
        System.out.println("3.- Suma de tres números reales");
        System.out.println("4.- Suma de números acumulados");
        System.out.println("5.- Salir");

        System.out.print("Teclea una opcion, por favor.");

        opcion = leer.nextInt();

        while (opcion < 1 || opcion > 5) {
            System.out.println("Opcion no válida. Números del 1 al 5");
            opcion = leer.nextInt();
            throw new IllegalArgumentException("el número no puede ser menor de 1 y mayor de 5");
        }
        return opcion;
    }

}
