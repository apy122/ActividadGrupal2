package javabean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**Esta clase es un conversor de unidades
 * @author apy122
 * @version 1.0
 **/
public class ConversionUnidades{
    private List<String> menu;
    private double celsius, fahrenheit, grados, radianes;
    private Scanner scanner;

    /**Constructor sin parametros*/
    public ConversionUnidades() {
    }

    /**Constructor con parametros*/
    public ConversionUnidades(ArrayList<String> menu, double celsius, double fahrenheit, double grados, double radianes, Scanner scanner) {
        this.menu = menu;
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.grados = grados;
        this.radianes = radianes;
        this.scanner = scanner;
    }
    /**Get and set*/
    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<String> menu) {
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

    /**Muestra el menu y ejecucuion de cada opcion
     *@param opcion elegir el tipo de conversion(
     *             1. Celsius a Fahrenheit
     *             2. Fahrenheit a Celsius
     *             3. Grados a Radianes
     *             4. Radianes a Grados
     *             5. Salir)
     */

    public void menu(int opcion){
        do{
            System.out.println("\n--- Conversor de Unidades ---");
            menu= Arrays.asList(
            "1. Celsius a Fahrenheit",
            "2. Fahrenheit a Celsius",
            "3. Grados a Radianes",
            "4. Radianes a Grados",
            "5. Salir");
        System.out.print("Elige opcion");
        menu.forEach(System.out::println);
        }while(opcion !=5);

        switch (opcion){
            case 1:
                System.out.print( "Ingrese los grados celsius" );
                celsius = Scanner.next.Double( );
                farenheit = ConversionCelsiusFahrenheit(celsius);
                System.out.print( "Resultado=" + " " + fahrenheit);
                break;
            case 2:
                System.out.print( "Ingrese los grados farenheit" );
                farenheit = Scanner.next.Double( );
                celsius = ConversionFahrenheitCelsius( fahrenheit);
                System.out.print( "Resultado=" + " " + celsius );
                break;
            case 3:
                System.out.print( "Ingrese los grados" );
                grados = Scanner.next.Double( );
                radiales = ConversionGradosRadianes( grados);
                System.out.print( "Resultado=" + " " + radiales );
                break;
            case 4:
                System.out.print( "Ingrese los radiales" );
                radiales = Scanner.next.Double( );
                grados = ConversionRadianesCelsius(radianes);
                System.out.print( "Resultado=" + " " + grados );
                break;
            case 5:
                break;
            }

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

