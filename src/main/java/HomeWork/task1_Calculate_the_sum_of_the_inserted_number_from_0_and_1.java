package HomeWork;

import java.util.Scanner;

public class task1_Calculate_the_sum_of_the_inserted_number_from_0_and_1 extends scanner {

    public task1_Calculate_the_sum_of_the_inserted_number_from_0_and_1(Scanner i) {
        super(i);
    }

    public void setInsertInt(int a) {

//    public static void main(String[] args) {

        /**1. Calculate the sum of the first 100 prime numbers.*/

        Scanner insertTheFirstValue = new Scanner(System.in);  /** here we created a scanner in
        order to be able to add an input from the keyboard */
        System.out.println("Please insert your first value: ");
//        int a = insertTheFirstValue.nextInt();      /** here we request to the person to insert
//        the first value from the keyboard as an integer */

        int FirstNumberZero = 0;
        int FirstNumberOne = 1;

        int sum = (a / 2) * (FirstNumberZero + a);  /** I'm using the formula from Carl
         Gauss to account the first 100 numbers: (n / 2) * (first number + last number) = sum*/
        System.out.println("If the first number is 0, the result is: " + sum);

        int sum1 = (a / 2) * (FirstNumberOne + a);
        System.out.println("If the first number is 1, the result is: " + sum1);

    }
}