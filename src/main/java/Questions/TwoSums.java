package Questions;

public class TwoSums {

    int[] input = {2,7,11,15};
    int target = 9;
    //int[] output = {0,1}

    public TwoSums() {
    }

    public int[] twoSum(int[] nums, int target) {
        //take each number add with all others individually and compare with target
        int [] result = new int[2];
        int a = 0;
        int b = 0;
        int index = 0;
        int counter=1;

        int length = nums.length; //3

        while (index<length){
            while (counter<length){
                a = nums[index];
                b = nums[counter];

                if (a+b == target){
                    result[0] = index;
                    result[1] = counter;
                    //return result;
                }
                counter++;
            }
            index++;
            counter=index+1;
        }
        return result;
    }
}
