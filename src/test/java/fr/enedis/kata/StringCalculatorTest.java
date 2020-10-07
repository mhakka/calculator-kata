package fr.enedis.kata;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    // Right tests here


    @Test
    public void whenStringIsEmpty(){

        //given
        StringCalculator stringCalculator = new StringCalculator();

        //when
        int res = stringCalculator.add("");
        //then
        Assert.assertEquals(0,res);
    }
}
