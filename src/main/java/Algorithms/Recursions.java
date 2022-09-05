package Algorithms;

public class Recursions {

    public static void inception(){
        inception();
    }

    public static int fibonacci(int n){
        if (n==0) {
            return 0;
        }
        else if (n<=2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(49));
    }

    public static int factorial(int n){
        if ( n==1 ){
            return 1;
        }
        return n * factorial(n-1);
    }
}
