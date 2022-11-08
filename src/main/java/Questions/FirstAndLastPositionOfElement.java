package Questions;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {

    int startPositionOfTarget=Integer.MAX_VALUE;
    int endPositionOfTarget=-1;
    boolean found = false;
    public int[] searchRange(int[] nums, int target) {

        if(nums.length==1){
            if(nums[0]==target){
                return new int[]{0, 0};
            }else{
                return new int[]{-1,-1};
            }
        }else if(nums.length==0){
            return new int[]{-1,-1};
        }

        binarySearch(nums,0,nums.length-1,target);

        int [] output = new int[2];
        if(found){
            output[0] = startPositionOfTarget;
            output[1] = endPositionOfTarget;
        }else{
            output[0] = -1;
            output[1] = -1;
        }
        return output;
    }

    public void binarySearch(int[] input, int startIndex, int endIndex, int target){
        int midIndex = (startIndex+endIndex)/2;
        if ((endIndex-startIndex) <= 0){

            if(input[endIndex]==target){
                found = true;
                startPositionOfTarget = Math.min(midIndex, startPositionOfTarget);
                endPositionOfTarget = Math.max(midIndex,endPositionOfTarget);
            }
            return;
        }
        if(input[midIndex]==target){
            found = true;
            binarySearch(input,startIndex,midIndex,target);
            binarySearch(input,midIndex+1,endIndex,target);


        }else if(input[midIndex]<=target){
            binarySearch(input,midIndex+1,endIndex,target);
        }else{
            binarySearch(input,startIndex,midIndex,target);
        }
    }

    public static void main(String[] args) {
        int[] input = {1,4};
        FirstAndLastPositionOfElement ofElement = new FirstAndLastPositionOfElement();
        System.out.println(Arrays.toString(ofElement.searchRange(input, 4)));
    }
}
