package javabean;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase es un conversor de unidades.
 * @author apy122
 * @version 1.0
 **/
public class ConversionUnidades {
    private List<String> menu;
    private double celsius, fahrenheit, grados, radianes;
    private Scanner scanner = new Scanner(System.in);

    /** Constructor sin parámetros */
    public ConversionUnidades() {
        super();
    }

    /** Getters y Setters */
    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getRadianes() {
        return radianes;
    }

    public void setRadianes(double radianes) {
        this.radianes = radianes;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "ConversionUnidades{" +
                "menu=" + menu +
                ", celsius=" + celsius +
                ", fahrenheit=" + fahrenheit +
                ", grados=" + grados +
                ", radianes=" + radianes +
                ", scanner=" + scanner +
                '}';
    }

    /** Muestra el menú y ejecuta la opción seleccionada */
    public void menu() {
        char opcion;
        menu = Arrays.asList(
                "Conversion de unidades:",
                "1. Celsius a Fahrenheit",
                "2. Fahrenheit a Celsius",
                "3. Grados a Radianes",
                "4. Radianes a Grados",
                "5. Salir"
        );

        do {
            menu.forEach(System.out::println);
            System.out.print("Ingrese una opción: ");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.print("Ingrese los grados Celsius: ");
                    celsius = scanner.nextDouble();
                    fahrenheit = ConversionCelsiusFahrenheit(celsius);
                    System.out.println("Resultado: " + fahrenheit + " °F");
                    break;
                case '2':
                    System.out.print("Ingrese los grados Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = ConversionFahrenheitCelsius(fahrenheit);
                    System.out.println("Resultado: " + celsius + " °C");
                    break;
                case '3':
                    System.out.print("Ingrese los grados: ");
                    grados = scanner.nextDouble();
                    radianes = ConversionGradosRadianes(grados);
                    System.out.println("Resultado: " + radianes + " radianes");
                    break;
                case '4':
                    System.out.print("Ingrese los radianes: ");
                    radianes = scanner.nextDouble();
                    grados = ConversionRadianesGrados(radianes);
                    System.out.println("Resultado: " + grados + " grados");
                    break;
                case '5':
                    System.out.println("Saliendo del conversor...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != '5');
    }








    /**Conversor celsius a fahrenheit
     * @param celsius pedir cantidad de celsius a convertir a fahrenheit
     * @return La cantidad en fahrenheit*/
    public double ConversionCelsiusFahrenheit(double celsius) {
        fahrenheit=(celsius * 9/5) + 32;
        return  fahrenheit;
    }

    /**Conversor fahrenheit a celsius
     * @param  fahrenheit pedir la cantidad de fahrenheit a convertir celsius
     * @return La cantidad en celsius*/
    public double ConversionFahrenheitCelsius(double fahrenheit) {
        grados=(fahrenheit -32)*5/9;
        return grados;
    }

    /**Conversor grados a radianes
     * @param grados pedir la cantidad de grados a convertir a Radianes
     * @return la cantidad en radianes*/
    public double ConversionGradosRadianes(double grados) {
        radianes = grados * Math.PI / 180;
        return radianes;
    }
    /**Conversor grados a radianes
     * @param radianes pedir la cantidad de radianes a convertir a grados
     * @return la cantidad en grados*/
    public double ConversionRadianesCelsius(double radianes) {
        grados=radianes*180/Math.PI;
        return grados;

    }


}

