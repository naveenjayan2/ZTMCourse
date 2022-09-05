package DataStructures;

import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {
        char[] anArray = {'a','b','c','d'};


        System.out.println(anArray);


        String aPalindrome = "Malayalam";

        char[] strArray = aPalindrome.toCharArray();

        System.out.println(strArray);


        System.out.println(reverseString(strArray));
    }

    public static String reverseString(char[] charArray){
        char[] reverseArray = new char[charArray.length];
        int j=0;
        for(int i=charArray.length-1; i>=0; i--){
            reverseArray[j] = charArray[i];
            j++;
        }

        return String.valueOf(reverseArray);
    }

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    Integer[] integers = new Integer[2];
}
