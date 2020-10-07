package fr.enedis.kata;

public class StringCalculator {

    public int add(String numbers) {
        if("".equals(numbers)) {
            return 0;
        }else{
            int somme = 0;
            String [] nums = numbers.split(",");

            for(String num:nums){

                somme+=Integer.parseInt(num);

            }
            return somme;
        }

    }
}
