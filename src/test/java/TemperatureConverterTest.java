import org.example.TemperatureConverter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();


    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);
    }

    @Test
    public void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-50));
        assertFalse(converter.isExtremeTemperature(20));
        assertTrue(converter.isExtremeTemperature(60));
    }
    @Test
    public void testKelvinToCel() {
        assertEquals(0.0, TemperatureConverter.kelvinToCel(273.15F), 0.001);
    }
    @Test
    public void convertKeltoFarTest() {
        double test =Math.round(converter.kelvinToFah(300.1));
        assertEquals(59.0, test);
    }
}
