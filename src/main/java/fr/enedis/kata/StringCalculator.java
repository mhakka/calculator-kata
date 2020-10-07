package fr.enedis.kata;

public class StringCalculator {

    public int add(String numbers) {
        if("".equals(numbers)) return 0;

        String[] nums = numbers.split(",");

        int sum = 0;

        for(String num : nums){
            sum+=Integer.parseInt(num);
        }
        return sum;
    }
}
