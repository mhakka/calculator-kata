package fr.enedis.kata;

import org.junit.Test;
import static  org.junit.Assert.*;

public class StringCalculatorTest {


@Test
 public void testAjouter(){
    //given
    String vide = "";
    String one = "1";
    String tow = "1,2";

    //when
    int ajoutVide = StringCalculator.ajouter("");
    int ajoutOne = StringCalculator.ajouter("1");
    int ajoutAny = StringCalculator.ajouter("1,2,3,4");

    //then

    assertEquals(0, ajoutVide);
    assertEquals(1, ajoutOne);
    //assertEquals(3, ajoutTow);
    assertEquals(10, ajoutAny);


}

    // Right tests here

}
