package javabean;
import java.util.Scanner;
public class Estadistica {
    private static Scanner sc = new Scanner(System.in);

    public static double mediaAritmetica(double[] numeros){
        if(numeros.length == 0)
            throw new IllegalArgumentException("El array de numeros no puede ser nulo");

        double media = 0;

        for(double num : numeros){
            media += num;
        }
        return media/numeros.length;
    }

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

    public static void menu() {
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
