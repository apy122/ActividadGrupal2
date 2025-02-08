package javabean;
import java.util.Scanner;

/**
 * La clase Estadística forma parte de una calculadora.
 * Contiene métodos pertenecientes a las ramas de la estadística.
 *
 * <p>Ejemplo de uso:</p>
 * <pre>{@code
 *  double[] numeros = {1,2,3,4,5};
 *  System.out.println("La Media de los números es:" + Estadistica.mediaAritmetica(numeros));
 *  System.out.println("La Varianza de los números es:" + Estadistica.varianza(numeros));
 *  System.out.println("La Desviación Estándar de los números es:" + Estadistica.desviacionEstandar(numeros));
 * }</pre>
 *
 * @author Lucía Ramírez Verdú (aka lucia.ramirez491@comunidadunir.net - lrv491)
 * @version 1.1
 */

public class Estadistica {
    private static Scanner sc = new Scanner(System.in);

    /**
     * Hace la media aritmética de un array de double
     *
     * @param numeros array de double, debe de haber al menos un número.
     * @throws IllegalArgumentException si el array está vacío.
     * @return La solución de la media aritmética
     */

    public static double mediaAritmetica(double[] numeros){
        if(numeros.length == 0)
            throw new IllegalArgumentException("El array de numeros no puede ser nulo");

        double media = 0;

        for(double num : numeros){
            media += num;
        }
        return media/numeros.length;
    }

    /**
     * Hace la varianza de un array de double
     *
     * @param numeros array de double, debe de haber al menos un número.
     * @throws IllegalArgumentException si el array está vacío.
     * @return La solución de la varianza
     */

    public static double varianza(double[] numeros){
        if(numeros.length == 0)
            throw new IllegalArgumentException("El array de numeros no puede ser nulo");

        double media = mediaAritmetica(numeros);
        double var = 0;
        for(double num : numeros){
            var += Math.pow(num - media, 2);
        }
        return var/numeros.length;
    }

    /**
     * Hace la desviación estándar de un array de double
     *
     * @param numeros array de double, debe de haber al menos un número.
     * @throws IllegalArgumentException si el array está vacío.
     * @return La solución de la desviación estándar
     */

    public static double desviacionEstandar(double[] numeros){
        if(numeros.length == 0)
            throw new IllegalArgumentException("El array de numeros no puede ser nulo");

        return Math.sqrt(varianza(numeros));
    }

    private static double[] arrayNuevo(){
        System.out.println("¿Cuántos numeros quiere añadir?");
        int leer = sc.nextInt();

        double[] arrayNuevo = new double[leer];

        for(double num : arrayNuevo){
            System.out.println("Numero " + num + ": ");
            leer = sc.nextInt();
            arrayNuevo[leer] = num;
        }
        return arrayNuevo;
    }

    /**
     * Es un menú para que el usuario pueda utilizar y saber que tipo de operaciones puede usar,
     * o que tipo de operaciones están implementadas.
     */

    public static void main() {
        boolean continuar = true;
        double[] numeros;
        System.out.println("ESTADÍSTICA");

        while(continuar){
            System.out.println("\n1. Media Aritmética");
            System.out.println("2. Varianza");
            System.out.println("3. Desviación Estándar");
            System.out.println("4. Salir\n");
            int leer = sc.nextInt();

            switch(leer){
                case 1:
                    numeros = arrayNuevo();
                    System.out.println("La Media Aritmética es: " + mediaAritmetica(numeros));
                    break;

                case 2:
                    numeros = arrayNuevo();
                    System.out.println("La Varianza es: " + varianza(numeros));
                    break;

                case 3:
                    numeros = arrayNuevo();
                    System.out.println("La Desviación Estándar es: " + desviacionEstandar(numeros));
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        System.out.println();
    }
}
