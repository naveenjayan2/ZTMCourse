package DynamicProgramming;

import java.util.HashMap;

public class Fibonacci {

    int calculations=0;
    public int fibonacciOld(int n){
        calculations++;
        if(n < 2){
            return n;
        }

        return fibonacciOld(n-1) + fibonacciOld(n-2);
    }
    int anothercal=0;
    HashMap<Integer, Integer> lookup = new HashMap<>();
    public int fibonacciNew(int n){
        anothercal++;
        if(n<2){
            return n;
        }
        else if(lookup.get(n)!=null){
            return lookup.get(n);
        }
        int sum = fibonacciNew(n-1) + fibonacciNew(n-2);
        lookup.put(n,sum);

        return lookup.get(n);
    }

    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();
        System.out.println(fb.fibonacciOld(10 ));
        System.out.println(fb.calculations);
        System.out.println(fb.fibonacciNew(10));
        System.out.println(fb.anothercal);
    }
}
