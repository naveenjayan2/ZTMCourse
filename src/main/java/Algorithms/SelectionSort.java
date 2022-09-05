package Algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] inputArr){

        for(int i = 0; i<inputArr.length; i++){
            int tempInt ;
            int minInt= inputArr[i];
            int minIndex = i;
            int[] outputArr = new int[inputArr.length];
            int j = i;
            while (j<inputArr.length)
            {
                if ( inputArr[j] < minInt){
                    minInt = inputArr[j];
                    minIndex = j;
                }
                j++;
            }
            tempInt = inputArr[i];
            inputArr[i] = inputArr[minIndex];
            inputArr[minIndex] = tempInt;

        }
        return inputArr;
    }

    public static void main(String[] args) {
        int[] input = {3,2,6,8,34,2,435,62,24,67,1,34};

        System.out.println(Arrays.toString(input));

        System.out.println(Arrays.toString(selectionSort(input)));

    }
}
