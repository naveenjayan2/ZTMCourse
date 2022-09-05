package Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// nums = [3,2,4]
// target = 6
class Solution {

    public int[] twoSum(int[] inputArray, int target){
        int[] outputArray = new int[2];
        HashMap<Integer, Integer> lookupMap = new HashMap<Integer,Integer>( ); //<entry,index>
        Set<Integer> keySet = lookupMap.keySet();

        for(int i=0; i<inputArray.length; i++){
            int entry = inputArray[i]; // 3, 2, 4
            if(lookupMap.get(target - entry) != null){ // 3, 4, 2
                outputArray[0]=i; //2
                outputArray[1]=lookupMap.get(target - entry); //1
            }
            else{
                lookupMap.put(entry,i); //<(3,0),(2,1),()
            }

        }
        return outputArray; //[2,1]

    }
}
