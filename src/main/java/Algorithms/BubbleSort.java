package Algorithms;


import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] inputArr){

        for(int i = inputArr.length; i>0; i--){
            int tempInt;
            int j = 0;
            int k = 1;
            while (k<i)
            {
                if(inputArr[j]>inputArr[k]){
                    tempInt = inputArr[j];
                    inputArr[j] = inputArr[k];
                    inputArr[k] = tempInt;
                }
                j++;
                k++;
            }
        }
        return inputArr;
    }

    public static void main(String[] args) {
        int[] input = {3,2,6,8,34,2,435,62,24,67,1,34};

        System.out.println(Arrays.toString(input));

        System.out.println(Arrays.toString(bubbleSort(input)));

    }
}
