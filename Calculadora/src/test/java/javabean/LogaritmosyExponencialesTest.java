package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LogaritmosyExponencialesTest {
    public static LogaritmosyExponenciales log1;

    @Test
    public void setUp() {
        log1=new LogaritmosyExponenciales();
    }
    /*primer caso numero natural de e es 1*/
    @Test
    public void logaritmoNatural() {
        assertEquals(1, LogaritmosyExponenciales.logaritmoNatural(Math.E), 1e-6);
        assertThrows(IllegalArgumentException.class, () -> LogaritmosyExponenciales.logaritmoNatural(0));
        assertThrows(IllegalArgumentException.class, () -> LogaritmosyExponenciales.logaritmoNatural(-5));
    }


    @Test
    public void logaritmoBase10() {
        assertEquals(2, LogaritmosyExponenciales.logaritmoBase10(100), 1e-6);
        assertEquals(4, LogaritmosyExponenciales.logaritmoBase10(10000), 1e-6);
        assertThrows(IllegalArgumentException.class, () -> LogaritmosyExponenciales.logaritmoBase10(0));
        assertThrows(IllegalArgumentException.class, () -> LogaritmosyExponenciales.logaritmoBase10(-10000));
    }

    @Test
    public void exponencial() {
        assertEquals(1, LogaritmosyExponenciales.exponencial(0), 1e-6);
        assertEquals(Math.E, LogaritmosyExponenciales.exponencial(1), 1e-6);
        assertEquals(1 / Math.E, LogaritmosyExponenciales.exponencial(-1), 1e-6);
    }
}