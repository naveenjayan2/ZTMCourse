package Questions;

import java.util.HashMap;

public class FirstRecurringChar {

    public static void main(String[] args) {

        int[] inputArray = {1,2,3,2,3,7,1};
        System.out.println(firstRecurring(inputArray));
    }

    public static Integer firstRecurring(int[] inputArr){
        HashMap<Integer, Boolean> lookup = new HashMap<>();

        for (int i=0;i<inputArr.length;i++){
            if(lookup.get(inputArr[i])!= null){
                return inputArr[i];
            }
            else {
                lookup.put(inputArr[i],true);
            }
        }
        return null;
    }
}
