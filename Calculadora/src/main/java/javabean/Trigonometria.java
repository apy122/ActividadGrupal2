package javabean;


import java.util.List;
import java.util.Scanner;

/**
 * La clase trigonometría tendrá métodos para resolver seno coseno y tangente en la calculadora
 *
 * @author Mario Ortega Navarro (aka mortegaDAM@github.com)
 * @version 0.1
 */

public class Trigonometria {

    private List<String> menu;
    private double seno, coseno, tangente, angulo;

    //constructor vacío
    public Trigonometria() {
    }

    //Getter and setter

    public double getSeno() {
        return seno;
    }

    public void setSeno(double seno) {
        this.seno = seno;
    }

    public double getCoseno() {
        return coseno;
    }

    public void setCoseno(double coseno) {
        this.coseno = coseno;
    }

    public double getTangente() {
        return tangente;
    }

    public void setTangente(double tangente) {
        this.tangente = tangente;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    /**
     * Metodo para conseguir el coseno de un angulo
     */

    public double seno(double angulo){
        return Math.sin(Math.toRadians(angulo));
    }

    /**
     * metodo para el coseno de un angulo
     */

    public double coseno(double angulo){
        return Math.cos(Math.toRadians(angulo));
    }

    /**
     * metodo para conseguir la tangente de un angulo
     */

    public double tangente(double angulo)

        throws ArithmeticException{
            if(Math.abs(Math.cos(Math.toRadians(angulo))) < 1e-10){
                throw new ArithmeticException("Error: La tangente es indefinida en 90º y 270º.");
            }

        return Math.tan(Math.toRadians(angulo));
    }

    /**
     * Menú trigonometria con cuatro opciones diferentes de operación, además de una de salida del menú trigonometria:
     *      1 Seno de un angulo(radianes).
     *      2 Coseno de un angulo(radianes).
     *      3 Tangente de un angulo(radianes).
     *      4 Salida del menu Trigonometria
     * Se incluye también el objeto trigonometria para poder realizar las operaciones.
     * Se crea una variable int del Scanner para poder seleccionar una opción del menú.
     */

    public static void menuTrigonometria(){
        Scanner leer = new Scanner(System.in);
        Trigonometria trigonometria = new Trigonometria();
        int opcionTrigonometria;

        do {
            System.out.println("Seleciona una opción para realizar una operacion de trigonometria:");
            System.out.println("1. Seno de un angulo (radianes) ");
            System.out.println("2. Coseno de un angulo (radianes)");
            System.out.println("3. Tangente de un angulo (radianes)");
            System.out.println("4. Salida del menú Trigonometria");

            opcionTrigonometria = leer.nextInt();
            double angulo;

            switch (opcionTrigonometria) {
                case 1:
                    System.out.println("Introduzca el angulo en radianes");
                    angulo = leer.nextDouble();
                    try{
                        System.out.println("El seno del angulo es : " + trigonometria.seno(angulo));
                    } catch(ArithmeticException error){
                        System.out.println("Error!" + error.getMessage());
                    }

                    break;

                case 2:
                    System.out.println("Introduzca el angulo en radianes");
                    angulo = leer.nextDouble();
                    try{
                        System.out.println("El coseno del angulo es : " + trigonometria.coseno(angulo));
                    } catch(ArithmeticException error){
                        System.out.println("Error!" + error.getMessage());
                    }

                    break;

                case 3:
                    System.out.println("Introduzca el angulo en radianes");
                    angulo = leer.nextDouble();
                    try{
                        System.out.println("La tangente del angulo es : " + trigonometria.tangente(angulo));
                    } catch(ArithmeticException error){
                        System.out.println("Error!" + error.getMessage());
                    }

                    break;

                case 4:
                    System.out.println("Refreso al menú principal");
                    break;

                default:
                    System.out.println("Opcion incorrecta. Intentalo de nuevo.");
                    break;


            }

        }
        while (opcionTrigonometria != 4);


    }
}

