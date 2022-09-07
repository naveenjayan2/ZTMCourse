package DynamicProgramming;

import java.util.HashMap;

public class DynamicPrograms {

    private HashMap<Integer,Integer> cache = new HashMap<>();
    public int memoizedAddTo80(int n){
        if (cache.get(n) == null) {
            System.out.println("Calculating");
            cache.put(n, n + 80);
        }
        return cache.get(n);
    }

    public static void main(String[] args) {
        DynamicPrograms dp = new DynamicPrograms();
        System.out.println(dp.memoizedAddTo80(8));
        System.out.println(dp.memoizedAddTo80(8));
        System.out.println(dp.memoizedAddTo80(9));
    }
}
