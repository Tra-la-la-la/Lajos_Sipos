package SomeHomeWork;

import java.util.Scanner;

public class task13_Fibonacci_series {
    public static void main(task17_About_Strings[] args) {

        /**2. Write a Java method to print the first 25 terms of the Fibonacci series (without recursion).*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a value until which you want to return the fibonacci series: ");
        int insertedData = sc.nextInt();

        int result = fibonacci(insertedData); /** returning the cycle of n*/
        System.out.println(result);
    }

    public static int fibonacci(int n) { /** calculate the fibonacci argument*/
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}