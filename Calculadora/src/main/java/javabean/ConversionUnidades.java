package javabean;
import java.util.*;

/**Esta clase es un conversor de unidades
 * @author apy122
 * @version 1.0
 **/
public class ConversionUnidades {
    protected ArrayList menu= new  ArrayList<>();
    private Scanner scanner= new Scanner(System.in);

    public void mostratMenu(int opcion){
        do{
            System.out.println("\n--- Conversor de Unidades ---");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Grados a Radianes");
            System.out.println("4. Radianes a Grados");
            System.out.println("5. Salir")
        }
        while (opcion !=6){
            switch (opcion){
                case 1:
                    System.out.print("Ingrese los grados celsius");
                    double celsius= Scanner.next.Double();
                    ConversionCelsiusFahrenheit(celsius)
                    System.out.print("Resultado="+" "+ farenheit );
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
        return (fahrenheit -32)*5/9;

    }

    /**Conversor grados a radianes
     * @param grados pedir la cantidad de grados a convertir a Radianes
     * @return la cantidad en radianes*/
    public double ConversionGradosRadianes(double grados) {
        return radianes= grados* Math.PI/180;
    }

    /**Conversor grados a radianes
     * @param radianes pedir la cantidad de radianes a convertir a grados
     * @return la cantidad en grados*/
    public double ConversionRadianesCelsius(double radianes) {
        return radianes*180/Math.PI;
    }
}
