package Questions;

import java.util.*;

public class AmazonAssessment {

    static HashMap<Integer, Integer> lookup = new HashMap<>();
    public static int maxSetSize(List<Integer> riceBags) {
        // Write your code here
        riceBags.sort(Comparator.naturalOrder());
//        [2,3,4,9,16]
        System.out.println(riceBags);
        for (Integer riceBag : riceBags) {
            lookup.put(riceBag, 1);
            checkRoot(lookup, riceBag);
        }
//        System.out.println("lookup: " + lookup);
        int maxValue=0;
        Set<Integer> lookupKeys = lookup.keySet();
        for(int j : lookupKeys){
            int lookupVal = lookup.get(j);
            System.out.println("lookupVal: " + lookupVal);
            maxValue = lookup.get(j)>maxValue?lookup.get(j):maxValue;
        }
        if(maxValue==1){
            maxValue=-1;
        }
        return maxValue;
    }

    public static void checkRoot(HashMap<Integer,Integer> lookup, int root){
        double sqrt = Math.sqrt(root);
        if( sqrt != (int) sqrt){
            return;
        }
//        System.out.println(lookup +"...." + root + "...." + (int) sqrt);
        if(lookup.containsKey((int) sqrt)){
            checkRoot(lookup,(int) sqrt);
            lookup.put((int) sqrt,lookup.get((int) sqrt)+1);
        }
    }

    public static void main(String[] args) {
//        System.out.println(Math.sqrt(15));
//        System.out.println((int) Math.sqrt(15));

        List<Integer> input = new ArrayList<>(Arrays.asList(3,4));
        System.out.println(AmazonAssessment.maxSetSize(input));
    }
}
