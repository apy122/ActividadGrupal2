package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrigonometriaTest {

    private Trigonometria trigonometria;
    @BeforeEach
    void setUp() {
        trigonometria = new Trigonometria();
    }

    @Test
    void trigonometriaSeno() {
        assertEquals(1, trigonometria.seno(90), "El resultado de seno de 90 debe ser 1.");
        assertEquals(-0.7071067811865475, trigonometria.seno(-45), "El resultado de seno de -45 debe ser -0.7071067811865475.");
    }

    @Test
    void trigonometriaCoseno() {
        assertEquals( 1e-15, trigonometria.coseno(90), "El resultado de coseno de 90 debe ser  1e-15.");
        assertEquals(0.70710678, trigonometria.coseno(-45), "El resultado de coseno de -45 debe ser 0.70710678.");
    }

    @Test
    void trigonometriaTangente() {
        assertEquals(-5.671281819617711, trigonometria.tangente(100), "El resultado de tangente de 100 debe ser -5.671281819617711.");
        assertEquals(-1, trigonometria.tangente(-45), "El resultado de tangente de -45 debe ser -1.");
    }


}