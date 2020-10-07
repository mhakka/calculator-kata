package fr.enedis.kata;

public class StringCalculator {

    public int add(String numbers) {
        switch (numbers) {

            case "" : return 0;
            default : return -1;
        }
    }
}
