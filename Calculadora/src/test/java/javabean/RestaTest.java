package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RestaTest {
    private Resta resta;

    @BeforeEach
    public void setUp() {
        resta = new Resta(10);
    }

    @Test
    public void restaRealPositivoPositivo() {
        assertEquals(5.5,Resta.restaReal(10.5,5.0),"El resultado debe ser 5");

    }

    @Test
    public void restaRealNegativoNegativo() {
        assertEquals(-5.5, Resta.restaReal(-10.5,-5.0),"El resultado debe ser -5");
    }

    @Test
    public void restaRealPositivoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Resta.restaReal(10.5,-5.0));
    }

    @Test
    public void restaRealNegativoPositivo() {
        assertThrows(IllegalArgumentException.class, () -> Resta.restaReal(-10.5,5.0));
    }

    @Test
    public void restaEnteroPositivoPositivo() {
        assertEquals(5, Resta.restaEntero(10,5),"El resultado debe ser 5");
    }


    @Test
    public void restaEnteroNegativoNegativo() {
        assertEquals(-5,Resta.restaEntero(-10,-5),"El resultado debe ser -5");
    }

    @Test
    public void restaEnteroPositivoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Resta.restaReal(10,-5));
    }

    @Test
    public void restaEnteroNegativoPositivo() {
        assertThrows(IllegalArgumentException.class, () -> Resta.restaEntero(-10,5));
    }

    @Test
    public void restaTresRealPositivoPositivoPositivo() {
        assertEquals(5.0,Resta.restaTresReal(10.0,2.5,2.5),"El resultado debe ser 5");
    }

    @Test
    public void restaTresRealNegativoPositivoPositivo() {
        assertThrows(IllegalArgumentException.class, () -> Resta.restaTresReal(-10.0,2.5,2.5));
    }


    @Test
    public void restaTresRealNegativoNegativoNegativo() {
        assertEquals(-5,Resta.restaTresReal(-10.0,-2.5,-2.5),"El resultado debe ser -5");
    }

    @Test
    public void restaTresRealPositivoNegativoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Resta.restaTresReal(10.0,-2.5,-2.5));
    }

    @Test
    public void restaTresRealSoloUnoResta() {
        assertEquals(10, Resta.restaTresReal(10.0, 2.5,-2.5),"El resultado debe ser 7.5");
    }

    @Test
    public void restaAcumuladaPositivo() {
        resta.acumulaResta(5);
        assertEquals(5,resta.getRestaAcumulada(), "El resultado debe ser 5");
    }

    @Test
    public void restaAcumuladaNegativo() {
        assertThrows(IllegalArgumentException.class, () -> resta.acumulaResta(-5));
    }

    @Test
    public void restaAcumuladaNegativoAcumulada() {
        resta.setRestaAcumulada(-1);
        assertThrows(IllegalArgumentException.class, () -> resta.acumulaResta(5));
    }
}
