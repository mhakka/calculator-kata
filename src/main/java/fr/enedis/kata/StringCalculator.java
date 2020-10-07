package fr.enedis.kata;

public class StringCalculator {

    public static int ajouter(String s) {

        if(s == ""){
            return 0;
        }else{
            if(s.length() == 1){
                return Integer.parseInt(s);
            }else{
                String[] result = s.split(",|\\\n");
                int somme = 0 ;
                for(int i = 0 ; i < result.length; i++){
                    somme = somme + Integer.parseInt(result[i]);
                }
                return somme;
            }
        }


    }

    public int add(String numbers) {
        return -1;
    }
}
