package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**@author Alvaro P'erez Yuguero (aka alvaro.perez532@comunidadunir.net - apy122/alvaro)*/
public class ProductoTest {
    Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto();
    }
    @Test
    void productoReal() {
        assertEquals( 14.7, producto.productoReal(3.5, 4.2), 1e-6);
        assertEquals( -2306.1364, producto.productoReal(-36.34, 63.46), 1e-6 );
        assertEquals( 1309.44, producto.productoReal(-24.8,-52.8), 1e-6 );
    }

    @Test
    void productoEntero() {
        assertEquals(40, producto.productoEntero(5, 8));
        assertEquals(-702, producto.productoEntero(234, -3));
        assertEquals(44, producto.productoEntero(-22, -2));
    }

    @Test
    void producto3Reales() {
        assertEquals( 280,producto.producto3Reales(5,7,8) );
        assertEquals( -80,producto.producto3Reales(5,-2,8) );
        assertEquals( -144,producto.producto3Reales(-8,-9,-2) );
    }

    @Test
    void potencia() {
        assertEquals(243, producto.potencia( 3,5 ) );
        assertThrows(IllegalArgumentException.class, () -> producto.potencia( 3,-5 ) );
        assertEquals(-78125, producto.potencia( -5,7 ) );

    }
}