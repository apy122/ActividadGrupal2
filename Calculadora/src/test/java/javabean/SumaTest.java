package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {

    private Suma suma;
    @BeforeEach
    void setUp() {

        suma = new Suma();
    }

    @Test
    void suma () {
        suma.suma(4,7);
        assertEquals(11, suma.suma(4,7), "El resultado de la suma debe ser igual a 11");
    }

    @Test
    void sumaNegativo() {
        suma.suma(-4,12);
        assertEquals(8, suma.suma(-4, 12), "El resultado de la suma debe ser igual a 8");
    }

    @Test
    void sumaNegativo2() {
        suma.suma(-20,-8);
        assertEquals(-28, suma.suma(-20,-8), "El resultado de la suma debe ser igual a -28");
    }

    @Test
    void sumaReal() {
        suma.sumaReal(34.5, 12.3);
        assertEquals(46.8, suma.sumaReal(34.5, 12.3), "El resultado de la suma debe ser igual a 46.8");
    }

    @Test
    void sumaRealNegativo() {
        suma.sumaReal(-12.5, -4.3);
        assertEquals(-16.8, suma.sumaReal(-12.5, -4.3), "El resultado de la suma debe ser igual a -16.8");
    }

    @Test
    void sumaTres() {
        suma.sumaTresReal(23, 12.6, 8);
        assertEquals(43.6, suma.sumaTresReal(23, 12.6, 8), "El resultado de la suma debe ser igual a 43.6");
    }

    @Test
    void sumaTresNegativo() {
        suma.sumaTresReal(4, -13, 7);
        assertEquals(-2, suma.sumaTresReal(4, -13, 7), "El resultado de la suma debe ser igual a -2");
    }

    @Test
    void sumaAcumulada() {
        double A[] = {5, 3, 4};
        for (int i = 0; i > A.length; i++) {
            suma.sumaAcumulada(A[i]);
            assertEquals(12, suma.sumaAcumulada(A[i]), "El resultado de la suma debe ser igual a 12");
        }
    }

    @Test
    void sumaAcumulada2() {
        double B[] = {4, -8, -1};
        for (int i = 0; i > B.length; i++) {
            suma.sumaAcumulada(B[i]);
            assertEquals(-5, suma.sumaAcumulada(B[i]), "El resultado de la suma debe ser igual a -5");
        }
    }
}


