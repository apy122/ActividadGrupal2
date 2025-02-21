package javabean;

import java.util.Scanner;

/** La clase Resta proporcionará métodos relacionados con las restas de una calculadora.
 *
 * @author Diego Sainz (aka diesainzg https://github.com/Diesainzg)
 * @version 1.8
 */

public class Resta {

    /**
     * Creamos una variable para poder guardar las restas acumuladas en la clase
     */
    private double restaAcumulada;

    /**
     * Constructor con el parámetro de restaAcumulada
     */

    public Resta(double restaAcumulada) {
        this.restaAcumulada = 0;
    }

    /**
     * Constructor sin parámetros
     */
    public Resta() {
        super();
    }

    /**
     * Getters and setters
     */

    public double getRestaAcumulada() {
        return restaAcumulada;
    }

    public void setRestaAcumulada(double restaAcumulada) {
        this.restaAcumulada = restaAcumulada;
    }

    /**
     * Resta de dos números reales:
     *
     * @param a Primer parámetro de entrada.
     * @param b Segundo parámetro de entrada.
     * @throws IllegalArgumentException para parámetros negativos.
     * @return Resultado de la resta a - b.
     */
    public static double restaReal(double a, double b) {
        if((a>0 && b<0) || (a<0 && b>0)) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        return a - b;
    }

    /**
     * Resta de dos números enteros:
     *
     * @param a Primer parámetro de entrada.
     * @param b Segundo parámetro de entrada.
     * @throws IllegalArgumentException para parámetros negativos.
     * @return Resultado de la resta de a - b.
     */
    public static int restaEntero(int a, int b) {
        if((a>0 && b<0) || (a<0 && b>0)) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        return a - b;
    }

    /**
     * Resta de tres números reales:
     *
     * @param a Primer parámetro de entrada.
     * @param b Segundo parámetro de entrada.
     * @param c Tercer parámetro de entrada.
     * @throws IllegalArgumentException para parámetros negativos.
     * @return Resultado de la resta de a - b - c.
     */
    public static double restaTresReal(double a, double b, double c) {
        if((a<0 && b>0 && c>0) || (a>0 && b<0 && c<0)) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        return a - b - c;
    }

    /**
     * Resta con valor acumulado.
     *
     * @param acumulaResta Parámetro de entrada.
     * @throws IllegalArgumentException para parámetros negativos.
     * @throws IllegalArgumentException para parámetros negativos.
     */
    public void acumulaResta(double acumulaResta) {
        if(restaAcumulada < 0) {
            throw new IllegalArgumentException("La resta acumulada no puede ser negativa");
        }
        if(acumulaResta < 0) {
            throw new IllegalArgumentException("El resultado total no puede ser negativo");
        }
        if (restaAcumulada == 0) {
            restaAcumulada = acumulaResta;
        } else {
        this.restaAcumulada -= acumulaResta;
        }
    }

    /**
     * Menú resta con cuatro opciones diferentes de resta, además de una de salida del menú resta:
     *      1 Resta de dos números reales.
     *      2 Resta de dos números enteros.
     *      3 Resta de tres números reales.
     *      4 Resta acumulada.
     *      5 Salida del menú Resta.
     * Se incluye también el objeto resta para poder realizar las operaciones.
     * Se crea también una variable int para poder seleccionar una opción del menú.
     */
    public static void menuResta() {
        Scanner leer = new Scanner(System.in);
        Resta resta = new Resta();
        int opcionResta;

        /**Bucle de un do - while para poder realizar las restas seleccionando cada opción.
         */

        do {
            System.out.println("Seleciona una opción para realizar una resta");
            System.out.println("1. Resta de dos números reales");
            System.out.println("2. Resta de dos números enteros");
            System.out.println("3. Resta de tres números reales");
            System.out.println("4. Resta de números acumulados");
            System.out.println("5. Salir del menú Resta");

            opcionResta = leer.nextInt();

            switch (opcionResta) {

                case 1:
                    System.out.println("Introduce dos números reales para realizar la resta: ");
                    double restReal1 = leer.nextDouble();
                    double restReal2 = leer.nextDouble();
                    System.out.println("El resultado de la resta es: " + resta.restaReal(restReal1, restReal2));
                    break;
                case 2:
                    System.out.println("Introduce dos números enteros para realizar la resta");
                    int restEntero1 = leer.nextInt();
                    int restEntero2 = leer.nextInt();
                    System.out.println("El resultado de la resta es: " + resta.restaEntero(restEntero1, restEntero2));
                    break;
                case 3:
                    System.out.println("Introduce tres números reales para realizar la resta");
                    double restReal3 = leer.nextDouble();
                    double restReal4 = leer.nextDouble();
                    double restReal5 = leer.nextDouble();
                    System.out.println("El resultado de la resta es: " + resta.restaTresReal(restReal3, restReal4, restReal5));
                    break;
                case 4:
                    System.out.println("Introduce un primer número y posteriormente introduce otros para restarlos. " + "Pulsa 0 para terminar");
                    boolean acumularRestas = true;
                    while (acumularRestas) {
                        double acumulaResta = leer.nextDouble();
                        if (acumulaResta == 0) {
                            acumularRestas = false;
                        } else {
                            resta.acumulaResta(acumulaResta);
                            System.out.println("La resta de todos los números acumulados es: " + resta.getRestaAcumulada());
                        }

                    }
                    break;
                default:
                    System.out.println("Opción incorrecta. Inténtalo de nuevo");
                    break;
            }


        }
        while (opcionResta != 5);

    }
}

