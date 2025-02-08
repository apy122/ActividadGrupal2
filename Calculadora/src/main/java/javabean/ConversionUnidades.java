package javabean;
import java.util.*;

/**Esta clase es un conversor de unidades
 * @author apy122
 * @version 1.0
 **/
public class ConversionUnidades {
    private ArrayList menu;
    private Scanner scanner;

    public ConversionUnidades() {
    }

    public ConversionUnidades(ArrayList menu, Scanner scanner) {
        this.menu = menu;
        this.scanner = scanner;
    }

    public ArrayList getMenu() {
        return menu;
    }

    public void setMenu(ArrayList menu) {
        this.menu = menu;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ConversionUnidades{" +
                "menu=" + menu +
                ", scanner=" + scanner +
                '}';
    }

    /**Muestra el menu y ejecucuion de cada opcion
     * @param celsius unidad en celsius
     * @param Fahrenheit unidad en Fahrenheit
     * @param  radiales unidad en radiales
     * @param  Grados unidad en grados
     *@param opcion elegir el tipo de conversion(
     *             1. con "1. Celsius a Fahrenheit
     *             2. Fahrenheit a Celsius
     *             3. Grados a Radianes
     *             4. Radianes a Grados
     *             5. Salir)
     *@return  retorna el tipo de valor solicitado*/

    public void mostratMenu(int opcion){
        do{
            System.out.println("\n--- Conversor de Unidades ---",)
            menu= Arrays.as List(
            "1. Celsius a Fahrenheit",
            "2. Fahrenheit a Celsius",
            "3. Grados a Radianes",
            "4. Radianes a Grados",
            "5. Salir");
        System.out.print("Elige opcion");
        menu.forEach(System.out::println);
        }
        while (opcion !=6){
            switch (opcion){
                case 1:
                    System.out.print("Ingrese los grados celsius");
                    double celsius= Scanner.next.Double();
                    double farenheit= ConversionCelsiusFahrenheit(celsius);
                    System.out.print("Resultado="+" "+ farenheit );
                    break;
                case 2:
                    System.out.print("Ingrese los grados farenheit");
                    double farenheit= Scanner.next.Double();
                    double celsius= ConversionFahrenheitCelsius(double fahrenheit);
                    System.out.print("Resultado="+" "+ celsius );
                    continue;
                    break;
                case 3:
                    System.out.print("Ingrese los grados");
                    double grados = Scanner.next.Double();
                    double radiales= ConversionGradosRadianes(double grados);
                    System.out.print("Resultado="+" "+ radiales);
                    continue;
                    break;
                case 4:
                    System.out.print("Ingrese los radiales");
                    double radiales = Scanner.next.Double();
                    double grados= ConversionRadianesCelsius(double radianes);
                    System.out.print("Resultado="+" "+ grados);
                    continue;
                    break;

            }

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
        return grados

    }
}
