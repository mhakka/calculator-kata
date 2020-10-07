package fr.enedis.kata;

import org.junit.Test;
import static  org.junit.Assert.*;

public class StringCalculatorTest {


@Test
 public void testAjouter(){
    //given
    String vide = "";
    String one = "1";
    String any = "1,2,3,4";
    String chariot = "1\n2,3";


    //when
    int ajoutVide = StringCalculator.ajouter(vide);
    int ajoutOne = StringCalculator.ajouter(one);
    int ajoutAny = StringCalculator.ajouter(any);
    int ajoutChariot = StringCalculator.ajouter(chariot);

    //then

    assertEquals(0, ajoutVide);
    assertEquals(1, ajoutOne);
    //assertEquals(3, ajoutTow);
    assertEquals(10, ajoutAny);
    assertEquals(6, ajoutChariot);


}

    // Right tests here

}
