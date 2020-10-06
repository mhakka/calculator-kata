package fr.enedis.kata;

public class StringCalculator {

    public int add(String numbers) {
        if ("".equals(numbers)) return 0;
        String[] numbersTab = numbers.split(",|\n");
        int result = 0;
        for (String number : numbersTab) {
            result += Integer.parseInt(number);
        }
        return result;
    }
}
