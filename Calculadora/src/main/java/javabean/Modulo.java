package javabean;

/** Clase Módulo dentro de la Calculadora grupal.
 * <p>Ejemplo de uso</p>
 * @author David Sánchez
 * @version 1.0
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

    public int modulo(int a, int b){

        if(b==0){
            return ArithmeticException("El divisor no puede ser cero");
        }
        return a%b;
    }

    /**
     * 2ª Función. Cálculo del valor absoluto de un número.
     * @param a el numero del que queremos calcular el valor absoluto.
     * @return valor absoluto de a.
     * Como los valores absolutos son siempre positivos, añadimos un if.
     */

    public double vAbsoluto(double a){
        if (a >= 0){
            return a;
        }
        return -a;

    }
    


}
