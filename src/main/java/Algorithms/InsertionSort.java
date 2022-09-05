package Algorithms;

import java.util.Arrays;

public class InsertionSort {


    public static int[] insertionSort(int[] inputArr){

        for(int i=1; i<inputArr.length; i++){
            int temp=inputArr[i];

            int j=i-1;

            while(j>=0 && temp<inputArr[j]){
                inputArr[j+1]=inputArr[j];
                j--;
            }
            inputArr[j+1] = temp;

        }


        return inputArr;
    }
    public static void main(String[] args) {
        int[] input = {3,2,6,8,34,2,435,62,24,67,1,34};

        System.out.println(Arrays.toString(input));

        System.out.println(Arrays.toString(BubbleSort.bubbleSort(input)));
        System.out.println(Arrays.toString(SelectionSort.selectionSort(input)));
        System.out.println(Arrays.toString(insertionSort(input)));


    }
}

