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
        assertEquals(15.5, Resta.restaReal(10.5,-5.0),"El resultado debe ser 5.5");
    }

    @Test
    public void restaRealNegativoPositivo() {
        assertEquals(-15.5, Resta.restaReal(-10.5,5.0),"El resultado debe ser -5.5");
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
        assertEquals(15, Resta.restaEntero(10,-5),"El resultado debe ser 5");
    }

    @Test
    public void restaEnteroNegativoPositivo() {
        assertEquals(-15, Resta.restaEntero(-10,5),"El resultado debe ser 5");
    }

    @Test
    public void restaTresRealPositivoPositivoPositivo() {
        assertEquals(5.0,Resta.restaTresReal(10.0,2.5,2.5),"El resultado debe ser 5");
    }

    @Test
    public void restaTresRealNegativoPositivoPositivo() {
        assertEquals(-15.0,Resta.restaTresReal(-10.0,2.5,2.5),"El resultado debe ser 5");
        //assertThrows(IllegalArgumentException.class, () -> Resta.restaTresReal(-10.0,2.5,2.5));
    }


    @Test
    public void restaTresRealNegativoNegativoNegativo() {
        assertEquals(-5,Resta.restaTresReal(-10.0,-2.5,-2.5),"El resultado debe ser -5");
    }

    @Test
    public void restaTresRealPositivoNegativoNegativo() {
        assertEquals(15.0,Resta.restaTresReal(10.0,-2.5,-2.5),"El resultado debe ser 5");
        //assertThrows(IllegalArgumentException.class, () -> Resta.restaTresReal(10.0,-2.5,-2.5));
    }

    @Test
    public void restaTresRealSoloUnoResta() {
        assertEquals(10, Resta.restaTresReal(10.0, 2.5,-2.5),"El resultado debe ser 7.5");
    }

    @Test
    public void restaAcumuladaPositivoPositivo() {
        resta.setRestaAcumulada(10);
        resta.acumulaResta(5);
        assertEquals(5,resta.getRestaAcumulada(), "El resultado debe ser 5");
    }

    @Test
    public void restaAcumuladaPositivoNegativo() {
        resta.setRestaAcumulada(10);
        resta.acumulaResta(-5);
        assertEquals(15,resta.getRestaAcumulada(), "El resultado debe ser 5");
    }

    @Test
    public void restaAcumuladaNegativoPositivo() {
        resta.setRestaAcumulada(-10);
        resta.acumulaResta(5);
        assertEquals(-15,resta.getRestaAcumulada(), "El resultado debe ser -5");
    }

    @Test
    public void restaAcumuladaNegativoNegativo() {
        resta.setRestaAcumulada(-10);
        resta.acumulaResta(-5);
        assertEquals(-5,resta.getRestaAcumulada(), "El resultado debe ser 5");
    }


    @Test
    public void restaAcumuladaCero() {
        resta.setRestaAcumulada(0);
        resta.acumulaResta(-5);
        assertEquals(-5,resta.getRestaAcumulada(), "El resultado debe ser 5");
    }
}
