package org.example;

import javabean.*;

import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static List<String> menuGeneral;
    public static Scanner sc = new Scanner( System.in );
    public static  Suma suma = new Suma();
    Resta  resta = new Resta();
    public static Producto producto = new Producto();
    static Cociente cociente = new Cociente();
    Modulo modulo = new Modulo();
    public static ConversionUnidades conversionUnidades = new ConversionUnidades();
    Trigonometria trigonometria = new Trigonometria();
    public static LogaritmosyExponenciales logaritmosyExponenciales= new LogaritmosyExponenciales();

    public static void main(String[] args) {
        mainMenu( );
    }

    public static void mainMenu() {
        int opcion;
        menuGeneral = Arrays.asList( "Opciones:",
                "1. SUMAR\n",
                "2. RESTAR\n",
                "3. MULTIPLICAR\n",
                "4. DIVIDIR\n",
                "5. CALCULAR MODULO\n",
                "6. CONVERSION DE UNIDADES\n",
                "7. ESTADISTICA\n",
                "8. TRIGONOMETRIA\n",
                "9. CALCULO LOGARITMICO Y EXPONENCIAL\n",
                "0. SALIR\n" );
        do {
            try{
                menuGeneral.forEach( System.out::println);
                System.out.print( "Elige Opcion: " );
                if (!sc.hasNextInt()) {
                    throw new InputMismatchException("Error: Solo se permiten numeros\n");
                }
                opcion = sc.nextInt();
                if(opcion <0|| opcion >9)
                    throw new IllegalArgumentException( "Opcion no valido. Seleccione un opcion valida entre 0 y 9" );
                else{
                    switch (opcion) {
                        case 1:
                            Suma.menuSuma();
                            break;
                        case 2:
                            Resta.menuResta();
                            break;
                        case 3:
                            producto.menu();
                            break;
                        case 4:
                            cociente.menuCociente();
                            break;
                        case 5:
                            Modulo.modMenu();
                            break;
                        case 6:
                            conversionUnidades.menu();
                            break;
                        case 7:
                            Estadistica.menu();
                            break;
                        case 8:
                            Trigonometria.menuTrigonometria();
                            break;
                        case 9:
                            logaritmosyExponenciales.menu();
                            break;
                        case 0:
                            sc.close();
                            return;
                        default:
                            throw new IllegalStateException( "Opcion no valida. Solo numeros\n" );
                    }
                }
            }catch (InputMismatchException e) {
                System.out.print( e.getMessage());
                sc.nextLine ();
            }catch (IllegalArgumentException e){
                System.out.println( e.getMessage() );
                sc.nextLine();
                break;
            }catch(IllegalStateException e){
                System.out.println( e.getMessage());
                sc.nextLine();
                return;
            }
        }while (true);
    }
}