package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CocienteTest {

    Cociente cociente;

    @BeforeEach
    void setUp() {
        cociente = new Cociente();
    }

    @Test
    void cocienteEntero() {
        assertEquals(8 ,cociente.cocienteEntero(32,4));
        assertThrows(IllegalArgumentException.class, () -> cociente.cocienteEntero(4,0));
    }

    @Test
    void cocienteReal() {
        assertEquals( 5.888888888888889 ,cociente.cocienteReal(26.5,4.5));
        assertThrows(IllegalArgumentException.class, () -> cociente.cocienteReal(4.6,0));
    }

    @Test
    void inverso() {
        assertEquals(-25.5, cociente.inverso(25.5));
        assertThrows(IllegalArgumentException.class, () -> cociente.inverso(-5));
    }

    @Test
    void raiz() {
        assertEquals(6, cociente.raiz(36));
        assertThrows(IllegalArgumentException.class, () -> cociente.raiz(-25));
    }
}
