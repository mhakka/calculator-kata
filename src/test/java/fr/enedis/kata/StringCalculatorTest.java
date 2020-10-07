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

    @Test
    public void whenStringIsEqualsOne(){

        //given
        StringCalculator stringCalculator = new StringCalculator();

        //when
        int res = stringCalculator.add("1");
        //then
        Assert.assertEquals(1,res);
    }
}
