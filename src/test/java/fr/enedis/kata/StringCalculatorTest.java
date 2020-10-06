package fr.enedis.kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void should_return_0_if_string_is_empty () {
        assertEquals(0, stringCalculator.add(""));
    }


    @Test
    public void should_return_1_if_string_is_1 () {
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void should_return_2_if_string_is_2 () {
        assertEquals(2, stringCalculator.add("2"));
    }

    @Test
    public void should_return_3_if_string_is_1comma2 () {
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void should_return_13_if_string_is_13 () {
        assertEquals(13, stringCalculator.add("13"));
    }

    @Test
    public void should_return_19_if_string_is_12comma7 () {
        assertEquals(19, stringCalculator.add("12,7"));
    }

    @Test
    public void should_return_19_if_string_is_4comma15 () {
        assertEquals(19, stringCalculator.add("4,15"));
    }

    @Test
    public void should_return_110_if_string_is_35comma75 () {
        assertEquals(110, stringCalculator.add("35,75"));
    }

    //Etape 2
    @Test
    public void should_return_6_if_string_is_1comma2comma3 () {
        assertEquals(6, stringCalculator.add("1,2,3"));
    }

    @Test
    public void should_return_17_if_string_is_1comma2comma10comma4 () {
        assertEquals(17, stringCalculator.add("1,2,10,4"));
    }
}
