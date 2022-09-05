//package Questions;
//
//public class MaxSubArray {
//
////    static int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//
//    static int[] nums = {5,4,-1,7,8};
////    Input: nums = [1,-9,8,-5,-3,9,5,1,-2,5,-5]
//
//    public static void main(String[] args) {
//        System.out.println(maxSubArray(nums));
//    }
//    public static int maxSubArray(int[] nums) {
//        int higheststartIndex = 0; //0,1
//        int tempStartIndex = 0; //0,1
//
//        int highestEndIndex = 0; //0,1
//        int tempEndIndex = 0; //0,1
//
//        int tempSum = 0;//1,0,8;
//        int highestSum = 0;//1
//
//
//        for (int i=0; i<nums.length; i++){
//            tempSum += nums[i];
//
//            if(i>=nums.length-1){
//                highestSum = highestSum >= tempSum-nums[i] ? highestSum : tempSum-nums[i];
//            }
//
//            if(tempSum <= highestSum) {
//                highestSum = highestSum >= tempSum-nums[i] ? highestSum : tempSum-nums[i];
//                higheststartIndex = highestSum >= tempSum-nums[i] ? higheststartIndex : tempStartIndex;
//                highestEndIndex = highestSum >= tempSum-nums[i] ? highestEndIndex : i-1;
//                tempStartIndex = i+1;
//                tempSum = 0;
//            }
//
//            else if(tempSum > highestSum){
//                tempEndIndex = i;
//
//            }else
//
//        }
//        return highestSum;
//
//    }
//
//}
