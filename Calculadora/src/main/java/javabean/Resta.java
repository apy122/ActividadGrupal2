package javabean;

import java.util.Scanner;

/** La clase Resta proporcionará métodos relacionados con las restas de una calculadora.
 *
 * @author Diego Sainz (aka diesainzg https://github.com/Diesainzg)
 * @version 1.0
 */

public class Resta {

    /**
     * Resta de dos números reales:
     *
     * @param a Primer parámetro de entrada.
     * @param b Segundo parámetro de entrada.
     * @return Resultado de la resta a - b.
     */
    public double restaReal(double a, double b) {
        return a - b;
    }

    /**
     * Resta de dos números enteros:
     *
     * @param a Primer parámetro de entrada.
     * @param b Segundo parámetro de entrada.
     * @return Resultado de la resta de a - b.
     */
    public int restaEntero(int a, int b) {
        return a - b;
    }

    /**
     * Resta de tres números reales:
     *
     * @param a Primer parámetro de entrada.
     * @param b Segundo parámetro de entrada.
     * @param c Tercer parámetro de entrada.
     * @return Resultado de la resta de a - b - c.
     */
    public double restaTresReal(double a, double b, double c) {
        return a - b - c;
    }

    /**
     * Resta con valor acumulado.
     *
     * @param a Parámetro de entrada.
     * @return Resultado de la resta de todos los parámetros introducidos.
     */
    public double restaAcumulada(double a) {
        double acumulada = a++;
        return acumulada;
    }
}

