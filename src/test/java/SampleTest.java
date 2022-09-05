import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.IntStream;

public class SampleTest {


    @Test
    public void somethingTest(){
        int intArray[] = {1,2,3};
        int largeArray[] = IntStream.range(0,10000).toArray();
        int i = 0;
        double startTime = System.currentTimeMillis();
        System.out.println("Start time: " + startTime);
        while (i<largeArray.length){
            if(largeArray[i] > 0){
                System.out.println("this is 2");
            }
            i++;
        }

        double endTIme = System.currentTimeMillis();
        System.out.println("End time: " + endTIme);
        System.out.println("Call to find value took " + (endTIme-startTime) + "ms");
    }

    @Test
    public void test2(){
        char array1[] = {'a','b','c','x'};
        char array2[] = {'z','y','a'};

        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
            for (int j=0;j<array2.length;j++){
                System.out.println(array2[j]);
                if(array1[i]==array2[j]){
                    System.out.println(true);
                    break;
                }
            }
        }
        System.out.println(false);
    }

    @Test
    public void test3(){
        char array1[] = {'a','b','c','x'};
        System.out.println(array1);
        char array2[] = {'z','y','r'};
        Map<Character, Boolean> map = new HashMap<>();
        Hashtable<Character, Boolean> table = new Hashtable<>();

        for (int i=0; i<array1.length; i++){
            if(!map.containsKey(array1[i])){
                map.put(array1[i],true);
            }
        }
        System.out.println(map);

        for(int j=0; j<array2.length;j++){
            if(map.containsKey(array2[j])){
                System.out.println(true);
            }
        }
    }

    @Test
    public void mergeSortedArrays(){
        int[] array1 = {1,2,7};
        int[] array2 = {3,6,5};

        int[] mergedArray = new int[array1.length+array2.length];
        int k = 0;
        for(int i = 0; i<array1.length;i++){
            mergedArray[k] = array1[i];
            k++;
        }

        for(int j = 0; j<array2.length;j++){
            mergedArray[k] = array2[j];
            k++;
        }

        System.out.println(Arrays.toString(mergedArray));
    }

    @Test
    public void sortTes(){
        int[] array1 = {1,7,64,2,9};
        System.out.println(array1);
    }

}


