package javabean;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que proporciona métodos para realizar operaciones de producto y potencia
 * sobre números reales y enteros.
 * @author Eduardo
 * @version 1.0
 */
public class Producto {
    private List<String> menu;
    private Scanner scanner = new Scanner(System.in);
    int num1, num2;
    double num_A, num_B, num_C, base, exponente;

    /*Constructor vacio/
    public Producto() {
        super();
    }

    /*Get and set/
    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getNum_A() {
        return num_A;
    }

    public void setNum_A(double num_A) {
        this.num_A = num_A;
    }

    public double getNum_B() {
        return num_B;
    }

    public void setNum_B(double num_B) {
        this.num_B = num_B;
    }

    public double getNum_C() {
        return num_C;
    }

    public void setNum_C(double num_C) {
        this.num_C = num_C;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getExponente() {
        return exponente;
    }

    public void setExponente(double exponente) {
        this.exponente = exponente;
    }

    /**to string */
    @Override
    public String toString() {
        return "Producto{" +
                "menu=" + menu +
                ", scanner=" + scanner +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", num_A=" + num_A +
                ", num_B=" + num_B +
                ", num_C=" + num_C +
                ", base=" + base +
                ", exponente=" + exponente +
                '}';
    }

    /*Crea y muestra el menu/
    public void menu(){
        int opcion;
        menu= Arrays.asList(
                "1. Producto de numeros reales",
                "2. Producto de numeros enteros",
                "3. Producto de 3 numeros reales",
                "4. Potencia",
                "0. Salir",
                "Elige opcion: "
        );
        do{
            menu.forEach(System.out::println);
            opcion= scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el primer numero real: ");
                    num_A= scanner.nextInt();
                    System.out.println("Ingrese el segundo numero real: ");
                    num_B=scanner.nextInt();
                    System.out.println("El resultado es:"+ " "+productoReal(num_A, num_B));
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero entero: ");
                    num1= scanner.nextInt();
                    System.out.println("Ingrese el segundo numero entero: ");
                    num2=scanner.nextInt();
                    System.out.print( "El resultado es:"+" "+productoEntero(num1, num2));
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero entero: ");
                    num_A= scanner.nextInt();
                    System.out.println("Ingrese el segundo numero entero: ");
                    num_B=scanner.nextInt();
                    System.out.println("Ingrese el primer numero entero: ");
                    num_C= scanner.nextInt();
                    System.out.print( "El resultado es:"+" "+ producto3Reales( num_A, num_B, num_C ));
                    break;
                case 4:
                    System.out.println("Ingrese la base: ");
                    num_A= scanner.nextInt();
                    System.out.println("Ingrese el exponente: ");
                    num_B=scanner.nextInt();
                    System.out.print( "El resultado es:"+" "+ potencia( num_A, num_B ));
                    break;
                case 0:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcion);
            }

        }while(true);
    }


    /**
     * Calcula el producto de dos números reales.
     *
     * @param num_A El primer número real.
     * @param num_B El segundo número real.
     * @return El producto de los dos números reales.
     */
    public double productoReal(double num_A, double num_B) {
        return num_A * num_B;
    }

    /**
     * Calcula el producto de dos números enteros.
     *
     * @param num1 El primer número entero.
     * @param num2 El segundo número entero.
     * @return El producto de los dos números enteros.
     */
    public int productoEntero(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Calcula el producto de tres números reales.
     *
     * @param num_A El primer número real.
     * @param num_B El segundo número real.
     * @param num_C El tercer número real.
     * @return El producto de los tres números reales.
     */
    public double producto3Reales(double num_A, double num_B, double num_C) {
        return num_A * num_B * num_C;
    }

    /**
     * Calcula la potencia de un número con base y exponente.
     * Si el exponente es negativo, lanza una excepción.
     *
     * @param base El número base.
     * @param exponente El exponente al que se elevará la base.
     * @return El resultado de la base elevada al exponente.
     * @throws IllegalArgumentException Si el exponente es negativo.
     */
    public double potencia(double base, double exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("Exponente negativo");
        }
        return Math.pow(base, exponente);
    }
}
