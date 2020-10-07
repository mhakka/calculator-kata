package fr.enedis.kata;

public class StringCalculator {

    public static int ajouter(String s) {
        if(s == ""){
            return 0;
        }else{
            if(s.length() == 1){
                return Integer.parseInt(s);
            }else{
                String[] result = s.split(",");
                return (Integer.parseInt(result[0]) + Integer.parseInt(result[1]));
            }
        }


    }

    public int add(String numbers) {
        return -1;
    }
}
