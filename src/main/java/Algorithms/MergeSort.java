package Algorithms;

public class MergeSort {

    public int[] mergeSortFunc(int[] input){
        if(input.length==1){
            return input;
        }

        int[] left = new int[input.length/2];
        int[] right = new int[input.length/2];

        for(int i=0; i<input.length/2;i++){
            left[i] = input[i];
            right[i] = input[input.length/2 + i];
        }

        return merge(mergeSortFunc(left),mergeSortFunc(right));

    }

    public int[] merge(int[] left, int[] right){
        int[] returnArr = new int[left.length+right.length];
        int j=0;
        int k=0;

        while(j<left.length || k<right.length){
            if(left[j]<right[k]){
                returnArr[j+k]=left[j];
                j++;
            }
        }
        return returnArr;
    }

}
