package Questions;

public class BinarySearch {
    int status = -1;
    public int search(int[] nums, int target) {

        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }else{
                return -1;
            }
        }
        searchByMidIndex(nums,0, nums.length-1,target);
        return status;
    }

    public void searchByMidIndex(int[] input, int startIndex,int endIndex, int target){

        if(endIndex-startIndex == 1){
            if(input[startIndex]==target){
                status=startIndex;
            }else if (input[endIndex]==target){
                status=endIndex;
            }else{
                status=-1;
            }
            return;
        }
        int mid = midpoint(endIndex+startIndex);

        if(input[mid]==target){
            status = mid;
            return;
        }else if (input[mid]>target){
            searchByMidIndex(input,startIndex,mid,target);
        }else{
            searchByMidIndex(input,mid,endIndex,target);
        }
    }
    public int midpoint(int length){
        if(length%2==0){
            return length/2;
        }else
            return (length-1)/2;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
//        System.out.println(bs.midpoint(9));
//        System.out.println(bs.midpoint(11));
//        System.out.println(bs.midpoint(6));
//        System.out.println(bs.midpoint(11));
//        System.out.println(bs.midpoint(1));

        int[] sortedArray = {5};
        int target = 7;
        System.out.println(bs.search(sortedArray,target));
    }
}
