package fr.enedis.kata;

public class StringCalculator {

    public int add(String numbers) {
        if ("".equals(numbers)) return 0;
        String[] numbersTab = numbers.split(",");
        if (numbersTab.length == 2) {
            return Integer.parseInt(numbersTab[0])
                    + Integer.parseInt(numbersTab[1]);
        }
        return Integer.parseInt(numbersTab[0]);
    }
}
