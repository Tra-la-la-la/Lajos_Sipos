package SomeHomeWork;

import java.util.Scanner;

public class task3_Display_the_maximum_digit_from_a_inserted_number {

    public static void main(task17_About_Strings[] args) {

        /**3. Display the max digit from a number, read the number from keyboard.*/

        Scanner insertTheNumberValue = new Scanner(System.in);
        /** here we created a scanner in order to be able to add an input from the keyboard */
        System.out.println("Enter a number: ");
        int n = insertTheNumberValue.nextInt();
        /** here we request to the person to insert the first value from the keyboard as an
         integer */

    }

//    public t3_Display_the_maximum_digit_from_a_inserted_number(Scanner i) {
//        super(i);
//    }
//
//    public void setInsertInt(int i) {

    public static int sumOfDigits (int s){
        /** We use the following function to compute the "sum" of digits in a given number "x"*/
        int sum = 0; /** we use an "integer sum" with a value zero */
        while (s != 0) { /** where the "integer x" it is different from 0, and */
            sum += s + 1; /** the sum it is equal or incremented with x and the  */
            s = s / 10; /** where x it is subtracted by 10 */
        }
        return sum;
    }

    public static int sumOfDigitsFrom1ToN (int i){ /** "N" represents the number which we inserted
     from the keyboard*/
        int result = 0; /** we initialize the "result" with a value of "zero"
         (!!! not null !!!)*/

        for (int x = 1; x <= i; x++) /** We compute the sum of digits in every number
         from "1" to "n", where the "integer x" it's smaller or equal to the " integer n",
         inserted from the keyboard */
            result += sumOfDigits(x += i); /** where the result it is equal or
         increased by the sum of x */
        return result;
    }

}