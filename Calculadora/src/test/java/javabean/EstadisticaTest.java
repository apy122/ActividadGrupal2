package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstadisticaTest {

    private Estadistica estadistica;

    @BeforeEach
    void setUp() {

        Estadistica estadistica = new Estadistica()
    }

    @Test
    void mediaAritmeticaPositivos() {
        double[] numeros = {1,7,9,5}

        double resultado = Estadistica.mediaAritmetica(numeros);




    }
    @Test
    void mediaAritmeticaNegativos() {
        Estadistica.mediaAritmetica(-1,-7,-9,-5);

    }
   @Test
   void mediaAritmeticaCero(0) {
       Estadistica.mediaAritmetica();

    }
    @Test
    void mediaAritmeticaVacio() {
        Estadistica.mediaAritmetica();
    @Test
    void varianza() {
    }

    @Test
    void desviacionEstandar() {
    }

    @Test
    void menu() {
    }
}
