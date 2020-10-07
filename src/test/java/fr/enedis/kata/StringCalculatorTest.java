package fr.enedis.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {

    // Right tests here

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        StringCalculator stringCalculator = new StringCalculator();

        assertEquals(0, stringCalculator.add(""), "\"\" must be equals to 0");
        assertEquals(1, stringCalculator.add("1"), "\"1\" must be equals to 1");
        assertEquals(3, stringCalculator.add("1,2"), "\"1,2\" must be equals to 3");
    }

}
