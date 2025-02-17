package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {

    private Suma suma;
    @BeforeEach
    void setUp() {

        Suma suma = new Suma();
    }

    @Test
    void suma () {
        suma.suma(4,7);
        assertEquals(11, suma.suma(4,7), "Debe sumar 11");
    }
}


