package Recursion;

//Finds the nth number in the fibonacci series
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
public class Fibonacci {
    static int fibonacci(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }
}
