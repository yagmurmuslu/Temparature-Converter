package com.yagmurmuslu.test;

import org.junit.jupiter.api.Test;
import com.yagmurmuslu.TemperatureConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTests {

    @Test
    public void temperatureTranslate_f_to_c()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(1,2, -40);
        assertEquals(-40, result, 0);
    }

    @Test
    public void temperatureTranslate_f_to_k()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(1,3, 40);
        assertEquals(277.59, result, 0);
    }

    @Test
    public void temperatureTranslate_f_to_rankine()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(1,4, 20);
        assertEquals(479.67, result, 0);
    }

    @Test
    public void temperatureTranslate_f_to_Réaumur()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(1,5, 10);
        assertEquals(-9.78, result, 0);
    }

    @Test
    public void temperatureTranslate_c_to_f()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(2,1, 15);
        assertEquals(59, result, 0);
    }

    @Test
    public void temperatureTranslate_c_to_k()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(2,3, 25);
        assertEquals(298.15, result, 0);
    }

    @Test
    public void temperatureTranslate_c_to_rankine()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(2,4, 35);
        assertEquals(554.67, result, 0);
    }

    @Test
    public void temperatureTranslate_c_to_Réaumur()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(2,5, 45);
        assertEquals(36, result, 0);
    }

    @Test
    public void temperatureTranslate_k_to_f()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(3,1, 10);
        assertEquals(-441.67, result, 0);
    }

    @Test
    public void temperatureTranslate_k_to_c()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(3,2, 10);
        assertEquals(-263.15, result, 0);
    }

    @Test
    public void temperatureTranslate_k_to_rankine()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(3,4, 10);
        assertEquals(18, result, 0);
    }

    @Test
    public void temperatureTranslate_k_to_Réaumur()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(3,5, 10);
        assertEquals(-210.52, result, 0);
    }

    @Test
    public void temperatureTranslate_rankine_to_f()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(4,1, 10);
        assertEquals(-449.67, result, 0);
    }

    @Test
    public void temperatureTranslate_rankine_to_c()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(4,2, 10);
        assertEquals(-267.59, result, 0);
    }

    @Test
    public void temperatureTranslate_rankine_to_k()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(4,3, 10);
        assertEquals(5.56, result, 0);
    }

    @Test
    public void temperatureTranslate_rankine_to_Réaumur()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(4,5, 10);
        assertEquals(-214.08, result, 0);
    }

    @Test
    public void temperatureTranslate_Réaumur_to_f()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(5,1, 10);
        assertEquals(54.50, result, 0);
    }

    @Test
    public void temperatureTranslate_Réaumur_to_c()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(5,2, 10);
        assertEquals(12.50, result, 0);
    }

    @Test
    public void temperatureTranslate_Réaumur_to_k()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(5,3, 10);
        assertEquals(285.65, result, 0);
    }
    @Test
    public void temperatureTranslate_Réaumur_to_rankine()
    {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.temperatureTranslate(5,4, 10);
        assertEquals(514.17, result, 0);
    }


}
