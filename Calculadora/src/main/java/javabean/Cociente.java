package javabean;
import java.util.List;
import java.util.Scanner;

/** La clase Cociente divide dos números introducidos en la calculadora.
 *
 * <p>Ejemplos de uso:</p>
 * <pre>{@code
 * int[] numeros = {1,2};
 * system.out.println("La division de los dos numeros es igual a: " + suma.suma(numeros));
 *
 * double[] numeros = {1.5,2.5};
 * system.out.println("La division de los dos numeros reales es igual a: " + sumaReal(numeros));
 *
 * double[] numeros = {1.5,2.5,3.5};
 * system.out.println("La suma de los tres números reales es igual a: " + sumaTresReal(numeros));
 *
 * double[] numeros = {1,2.5,3,4.5,5,6.5,7};
 * system.out.println("La suma total de todos los números es igual a: " + sumaAcumulada(numeros));
 *}</pre>
 *
 * @author Javier Calvo Hidalgo (aka javier.calvo962@comunidadunir.net - https://github.com/Jacahi10)
 * @version 1.2
 */
public class Cociente {

    /*
    Creación de atributos de clase
     */

    private List<String> menu;
    private int cocienteEntero, dividendoEntero, divisorEntero;
    private double cocienteReal, dividendoReal, divisorReal, inverso, raiz;
    private Scanner leer = new Scanner(System.in);

    /*
    Constructor vacío
     */
    public Cociente() {
    }

    /*
    Getter and setter
     */

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public int getCocienteEntero() {
        return cocienteEntero;
    }

    public void setCocienteEntero(int cocienteEntero) {
        this.cocienteEntero = cocienteEntero;
    }

    public int getDividendoEntero() {
        return dividendoEntero;
    }

    public void setDividendoEntero(int dividendoEntero) {
        this.dividendoEntero = dividendoEntero;
    }

    public int getDivisorEntero() {
        return divisorEntero;
    }

    public void setDivisorEntero(int divisorEntero) {
        this.divisorEntero = divisorEntero;
    }

    public double getCocienteReal() {
        return cocienteReal;
    }

    public void setCocienteReal(double cocienteReal) {
        this.cocienteReal = cocienteReal;
    }

    public double getDividendoReal() {
        return dividendoReal;
    }

    public void setDividendoReal(double dividendoReal) {
        this.dividendoReal = dividendoReal;
    }

    public double getDivisorReal() {
        return divisorReal;
    }

    public void setDivisorReal(double divisorReal) {
        this.divisorReal = divisorReal;
    }

    public double getInverso() {
        return inverso;
    }

    public void setInverso(double inverso) {
        this.inverso = inverso;
    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }


    /**
     * Divide dos números enteros:
     *
     * @param dividendoEntero Primer parámetro de entrada.
     * @param divisorEntero   Segundo parámetro de entrada.
     * @return resultado de la división de dividendo / divisor.
     */

    public int cocienteEntero(int dividendoEntero, int divisorEntero) {
        if (dividendoEntero < 0) {
            throw new IllegalArgumentException("El dividendo no puede ser negativo");
        }
        else if (divisorEntero <= 0) {
            throw new IllegalArgumentException("El divisor no puede ser igual o menor que 0");
        }
        return Math.round(dividendoEntero / divisorEntero);
    }

    /**
     * Divide dos números reales:
     *
     * @param dividendoReal Primer parámetro de entrada.
     * @param divisorReal   Segundo parámetro de entrada.
     * @return resultado de la división de dividendo / divisor.
     */

    public double cocienteReal(double dividendoReal, double divisorReal) {
        if (dividendoReal < 0) {
            throw new IllegalArgumentException("El dividento no puede ser negativo");
        }
        else if (divisorReal <= 0) {
            throw new IllegalArgumentException("El divisor no puede ser igual o menor que 0");
        }
        return (dividendoReal / divisorReal) * 1.0;
    }

    /**
     * Inverso de número real
     *
     * @param inverso Parámetro de entrada.
     * @return resultado del inverso del número.
     */

    public double inverso(double inverso) {
        if (inverso < 0) {
            throw new IllegalArgumentException("El inverso no puede ser negativo");
        }
        double i = -inverso;
        return i;
    }

    /**
     * Raíz de un número
     *
     * @param raiz Parámetro de entrada.
     * @return resultado de salida
     */

    public double raiz(double raiz) {
        if (raiz < 0) {
            throw new IllegalArgumentException("La raíz no puede ser negativa");
        }
        return Math.sqrt(raiz);
    }

    /**
     * Menú cociente con cuatro opciones diferentes de operación, además de una de salida del menú cociente:
     *      1 Cociente de dos números reales.
     *      2 Cociente de dos números enteros.
     *      3 Inverso de un número real.
     *      4 Raíz de un número real.
     *      5 Salida del menú Cociente.
     * Se incluye también el objeto cociente para poder realizar las operaciones.
     * Se crea también una variable int del Scanner para poder seleccionar una opción del menú.
     */

    public static void menuCociente() {
        Scanner leer = new Scanner(System.in);
        Cociente cociente = new Cociente();
        int opcionCociente;

        /**Bucle de un do - while para poder realizar las operaciones de la opción
         * seleccionada.
         */
        do {
            System.out.println("Seleciona una opción para realizar un cociente/operación:");
            System.out.println("1. Cociente de dos números reales");
            System.out.println("2. Cociente de dos números enteros");
            System.out.println("3. Inverso de un número real");
            System.out.println("4. Raíz de un número real");
            System.out.println("5. Salida del menú Cociente");

            opcionCociente = leer.nextInt();

            switch (opcionCociente) {

                case 1:
                    System.out.println("Introduce el dividendo y divisor reales para realizar el cociente: ");
                    double dividendoReal1 = leer.nextDouble();
                    double divisorReal1 = leer.nextDouble();
                    System.out.println("El resultado del cociente " + dividendoReal1 + " entre " + divisorReal1 + " es: " + cociente.cocienteReal(dividendoReal1,divisorReal1));
                    break;
                case 2:
                    System.out.println("Introduce el dividendo y divisor enteros para realizar el cociente:\nEl resto de" +
                            "esta división será ignorado");
                    int dividendoEntero1 = leer.nextInt();
                    int divisorEntero1 = leer.nextInt();
                    System.out.println("El resultado del cociente " + dividendoEntero1 + " entre " + divisorEntero1 + " es: " + cociente.cocienteEntero(dividendoEntero1,divisorEntero1));
                    break;
                case 3:
                    System.out.println("Introduce un número real para recibir su inverso:");
                    double inverso= leer.nextDouble();
                    System.out.println("El resultado del inverso " + inverso + " es: " + cociente.inverso(inverso));
                    break;
                case 4:
                    System.out.println("Introduce un número real para recibir su raiz:");
                    double raiz1 = leer.nextDouble();
                    System.out.println("El resultado de la raíz de " + raiz1 + " es: " + cociente.raiz(raiz1));
                    break;
            }

        }
        while (opcionCociente != 5);
    }

}