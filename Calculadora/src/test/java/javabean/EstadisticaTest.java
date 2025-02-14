package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EstadisticaTest {

    private Estadistica estadistica;

    @BeforeEach
    void setUp() {

        Estadistica estadistica = new Estadistica();
    }

    @Test
    void mediaAritmeticaPositivos() {
        double[] numeros = new double[]{1, 7, 9, 5};

        assertEquals(5.5,Estadistica.mediaAritmetica(numeros));

    }
    @Test
    void mediaAritmeticaNegativos() {
        double[] numeros = new double[]{-1, -7, -9, -5};
        assertEquals(-5.5,Estadistica.mediaAritmetica(numeros));

    }
   @Test
   void mediaAritmeticaCero() {
       double[] numeros = new double[]{0, 0, 0, 0};
       assertEquals(0,Estadistica.mediaAritmetica(numeros));

    }
    @Test
    void mediaAritmeticaVacio() {
    double[] numeros = new double[0];
        assertThrows(IllegalArgumentException.class, () -> Estadistica.mediaAritmetica(numeros));
    }

    @Test
    void varianza() {
        double[] numeros = new double[]{1, 7, 9, 5};
        assertEquals(8.75,Estadistica.varianza(numeros));
    }

    @Test
    void desviacionEstandar() {
        double[] numeros = new double[]{1, 7, 9, 5};
        assertEquals(2.95,Estadistica.desviacionEstandar(numeros), 0.01);
    }

    @Test
    void menu() {

    }
}
