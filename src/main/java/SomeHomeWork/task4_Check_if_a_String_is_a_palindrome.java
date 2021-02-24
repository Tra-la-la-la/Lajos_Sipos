package SomeHomeWork;

import java.util.Scanner;

public class task4_Check_if_a_String_is_a_palindrome {
    public static void main(task17_About_Strings[] args) {
        /**git p4. Check if a number is palindrom ( e.g palindrom 1221, 34143), read the number from keyboard.*/

        String insertedData;
        String theDataWeHaveToReverse = "";
        /** Here we created an object of Strings called: the first String: "insertedData",
        and the second String: "theDataWeHaveToReverse" which is not defined yet*/

        Scanner insertedString = new Scanner(System.in);    /** We created a scanner called "insertedString" in order to add our data*/
        System.out.println("Enter a string to check if it's a palindrome");
        insertedData = insertedString.nextLine();           /** we assigned the scanner insertedString to the unallocated String from above "insertedData"*/

        int inputController = insertedData.length();
        /** here we created an integer called controller which
         have assigned the same value of the insertedData from the scanner*/

        for (int i = inputController - 1; i >= 0; i--) {
            /** in this loop we created an integer i assigned as the controller - 1,
            where the integer i is smaller or equal to 0, and the
            integer i decrements, as we check the insertedData by each character, so*/
            theDataWeHaveToReverse = theDataWeHaveToReverse + insertedData.charAt(i);
            /** the "theDataWeHaveToReverse" string is assigned to the "insertedData" from the scanner, and checked by each character as i*/
        }

        if (insertedData.equals(theDataWeHaveToReverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string isn't a palindrome.");
        }
    }
}
