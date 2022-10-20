package Questions;

import java.util.HashMap;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        char[] inputString = sentence.toCharArray();

        HashMap<Character,Integer> lookup = new HashMap<>();

        for(int i=0;i<inputString.length;i++){
            if(lookup.get(Character.toLowerCase(inputString[i]))==null){
                lookup.put(Character.toLowerCase(inputString[i]),1);
            }
        }

        if(lookup.keySet().size()==26){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        String inputA="thequickbrownfoXjumpsoverthelazydog";
        String inputB="something";

        Pangram pangram = new Pangram();
        System.out.println(pangram.checkIfPangram(inputA));
        System.out.println(pangram.checkIfPangram(inputB));

    }
}
