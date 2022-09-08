package Questions;

import java.util.HashMap;
/**
 * Accepted
 * */
public class HouseRobber {

    HashMap<Integer, Integer> lookup = new HashMap<>();
    public int rob(int[] nums){

        if(nums.length==1){
            return nums[0];
        }

        int sumA = recursiveRob(0, nums);
        lookup.put(0,sumA);
        int sumB = recursiveRob(1, nums);
        lookup.put(1,sumB);
        return Math.max(sumA,sumB);
    }

    public int recursiveRob(int startingHouse, int[] inputArr){

        int lootA=0;
        int lootB=0;

        if(startingHouse>=inputArr.length){
            lookup.put(startingHouse,0);
            return 0;
        }
        else{
            if(lookup.get(startingHouse+2)==null){
                lootA = inputArr[startingHouse] + recursiveRob(startingHouse+2,inputArr);
            } else{
                lootA = inputArr[startingHouse] + lookup.get(startingHouse+2);
            }
            if(lookup.get(startingHouse+3)==null){
                lootB = inputArr[startingHouse] + recursiveRob(startingHouse+3, inputArr);
            } else{
                lootB = inputArr[startingHouse] + lookup.get(startingHouse+3);
            }

            lookup.put(startingHouse,Math.max(lootA,lootB));
            return Math.max(lootA, lootB);
        }

    }


    public static void main(String[] args) {
        int[] input = {2,7,9,3,1};
        int[] inputB = {1,2,1,1};
        int[] inputC = {3};
        int[] inputD = {1,3,1,6,4,6,8,2,1,3,6,8,9,4,2,1,4,6,8,2,1,6,8,4,4,3,4};

        HouseRobber houseRobber = new HouseRobber();
        HouseRobber houseRobber1 = new HouseRobber();
        HouseRobber houseRobberC = new HouseRobber();
        HouseRobber houseRobberD = new HouseRobber();

        System.out.println(houseRobber.rob(input));
        System.out.println(houseRobber1.rob(inputB));
        System.out.println(houseRobberC.rob(inputC));
        System.out.println(houseRobberD.rob(inputD));

    }
}
