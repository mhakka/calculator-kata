package fr.enedis.kata;

public class StringCalculator {

    public int add(String numbers) {
        if ("".equals(numbers)) return 0;
        if (numbers.startsWith("//")) {
            String separator = numbers.substring(2,3);
            String secondLine = numbers.split("\n", 2)[1];
            return sumOfNumbers(secondLine, "\\" + separator);
        }
        return sumOfNumbers(numbers, ",|\n");
    }

    private int sumOfNumbers(String numbers, String separator) {
        String[] numbersTab = numbers.split(separator);
        int result = 0;
        for (String number : numbersTab) {
            result += Integer.parseInt(number);
        }
        return result;
    }
}
