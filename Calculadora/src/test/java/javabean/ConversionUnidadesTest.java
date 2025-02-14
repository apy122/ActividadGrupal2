package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionUnidadesTest {

    ConversionUnidades conv;

    @BeforeEach
    void setUp() {
        conv = new ConversionUnidades();
    }

    @Test
    void conversionCelsiusFahrenheit() {
        conv.ConversionCelsiusFahrenheit(1.0);
        assertEquals(33.8,conv.ConversionCelsiusFahrenheit(1.0));
    }

    @Test
    void conversionFahrenheitCelsius() {
        conv.ConversionFahrenheitCelsius(33.8);
        assertEquals(0.9999999999999984, conv.ConversionFahrenheitCelsius(33.8));
    }

    @Test
    void conversionGradosRadianes() {
        conv.ConversionGradosRadianes(1.0);
        assertEquals(0.017453292519943295,conv.ConversionGradosRadianes(1.0));
    }

    @Test
    void conversionRadianesCelsius() {
        conv.ConversionRadianesCelsius(1.0);
        assertEquals(57.29577951308232, conv.ConversionRadianesCelsius(1.0));
    }
}
