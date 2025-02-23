package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Clase de prueba para la clase Modulo.
 * Esta clase contiene los métodos de prueba para verificar el correcto funcionamiento
 * de los métodos modulo() y vAbsoluto() de la clase Modulo.
 */
public class ModuloTest {

    // Instancia de la clase Modulo para métodos de instancia (si es necesario)
    private Modulo Modulo;

    /**
     * Este método se ejecuta antes de cada test.
     * Se utiliza para inicializar el objeto Modulo para métodos no estáticos.
     */
    @BeforeEach
    void setUp() {
        Modulo = new Modulo(); // Se crea solo si hay métodos de instancia a probar.
    }

    /**
     * Prueba para el método estático modulo().
     * Se verifica el cálculo del módulo para diferentes casos:
     * - Cuando ambos números son positivos.
     * - Cuando el dividendo es negativo.
     * - Cuando el divisor es negativo.
     * - Cuando el divisor es 0, lo que debería generar una excepción.
     */
    @Test
    void modulo() {
        // 4 % 2 = 0
        assertEquals(0, Modulo.modulo(4, 2));  // Llamada a método estático

        // -4 % 2 = 0
        assertEquals(0, Modulo.modulo(-4, 2));

        // 4 % -2 = 0
        assertEquals(0, Modulo.modulo(4, -2));

        // 4 % 3 = 1
        assertEquals(1, Modulo.modulo(4, 3));

        //4 % -3 = 1
        assertEquals(1, Modulo.modulo(4, -3));

        //-4 % -3 = -1
        assertEquals(-1, Modulo.modulo(-4, -3));

        // 4 % 0 debe lanzar una excepción ArithmeticException
        assertThrows(ArithmeticException.class, () -> Modulo.modulo(4, 0));
    }

    /**
     * Prueba para el método vAbsoluto().
     * Se verifica que el valor absoluto funcione correctamente con diferentes números:
     * - Números positivos.
     * - Números negativos.
     * - Cero.
     * - Números decimales negativos.
     */
    @Test
    void vAbsoluto() {
        // Valor absoluto de 4
        assertEquals(4, Modulo.vAbsoluto(4));

        // Valor absoluto de -4
        assertEquals(4, Modulo.vAbsoluto(-4));

        // Valor absoluto de 0
        assertEquals(0, Modulo.vAbsoluto(0));

        // Valor absoluto de -2.5
        assertEquals(2.5, Modulo.vAbsoluto(-2.5));
    }
}