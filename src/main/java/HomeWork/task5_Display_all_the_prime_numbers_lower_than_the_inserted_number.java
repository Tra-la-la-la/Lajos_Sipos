package HomeWork;

import java.util.Scanner;

public class task5_Display_all_the_prime_numbers_lower_than_the_inserted_number {
    public static void main(playingWithStrings[] args) {
        /**5. Display all the prime numbers lower than a given number, read the number from keyboard*/

        System.out.println("Please insert a number in order to return the prime numbers until your inserted number: ");
        Scanner insertTheNumberValue = new Scanner(System.in);
        /** here we created a scanner in order to be able to add an input from the keyboard */

        /*if (insertedNumber % 2 == 1) { // if insertedNumber reminder (modulo) is 2 equal 1 than the inserted number is a prime number
        System.out.println("The number you inserted it is something I don't understand in math: " + insertedNumber);
        } else {
        System.out.println("The number you inserted " + insertedNumber + " it is the same thing which I don't understand in math yet.");
        }*/

        int i, x, startToAccountFrom; /** We created 3 different integers as i, x, and startToAccountFrom to have a reference to account the prime numbers */

        int n = insertTheNumberValue.nextInt(); /** here we created an "integer n" representing a number in order to request an input from the keyboard */

        System.out.println("Prime numbers between 2 to " + n + " are: ");
        System.out.println("number 1 is always a prime number, so it's not necessary to be accounted.");

        for (x = 1; x <= n; x++) { /** in this loop we check the "integer x" with a value of one, it's smaller than the inserted value from the keyboard,
         incrementing the x, where x is different from 0, in order */
            startToAccountFrom = 0; /** to check with a integer with a reference zero*/
            for (i = 2; i <= x; i++) { /** where the "integer i" it is 2 and it is smaller or equal to the "integer x", incrementing the "i", and if  */
                if (x % i == 0) { /** the rest between the "integer x" and the "integer i", will start to account from the integer incrementing from zero */
                    startToAccountFrom++;
                }
            }
            if (startToAccountFrom == 1 || startToAccountFrom == 2) /** and so, if the "integer startToAccountFrom" it is 1 or 2, to return the value of x, which */
               System.out.print(x + ", "); /** in our case shall be a prime number*/
        }
    }
}