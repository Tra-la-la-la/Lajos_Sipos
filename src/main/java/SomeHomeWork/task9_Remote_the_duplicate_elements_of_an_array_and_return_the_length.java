package SomeHomeWork;

import java.util.Scanner;

public class task9_Remote_the_duplicate_elements_of_an_array_and_return_the_length {

    public static int removeDuplicateElements(int myArray[], int n) { /** we created a static "integer n" in order to check the numbers in "myArray" array,
     for which we must check if any input from the array is different or it is the same as any other input in the array*/

        if (n == 0 || n == 1) { /** we check if the "integer n" have two different inputs or data*/
            return n;   /** and we return it's value*/
        }

        int[] array = new int[n]; /** here we allocated the "n" as the input in to an "array" of integers*/
        int x = 0; /** we created an "integer x" as another value to compare with, in our arrays*/

        for (int i = 0; i < n - 1; i++) { /** we use the for loop to check if an "integer i" it's smaller than the value of the "integer n minus 1" input,*/
            if (myArray[i] != myArray[i + 1]) { /** where the "integer i" it is an input from "myArray" array which is different from another "integer i" as input from myArray
             //array, where the second input, the "integer i" it is increased by one to make it different*/
                array[x++] = myArray[i]; /** we assigned the incremented value of the "integer x" in the "array" array which we assigned as the value of the "integer i" from
                 to "myArray" array, be able to check and so to compare the values in our arrays, which we have to create as values of: n, i and x in "myArray" array*/
            }
        }

        array[x++] = myArray[n - 1]; /** here we assigned the "array" of "incremented x" array as
         the value of the "integer n-1" in "myArray" array*/
        /** so, we are adding the compared value of "integer n" as a value in "myArray" array*/
        for (int i = 0; i < x; i++) { /** so, now we need to check that the value of the "integer i" it is different of the value of the "integer n", where "integer i" it is
         smaller than the "integer x", */
            myArray[i] = array[i]; /**and so we assigned the value of "integer i" from "myArray" array as the same "integer i" from the "array" array.*/
        }
        return x; /**we request to return the value of "n" which is different than "i", which is different than "n"*/
    }

    public static void main(task17_About_Strings[] args) {

        /**9. Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
         Sample array: [20, 20, 30, 40, 50, 50, 50]
         After removing the duplicate elements the program should return [20, 30, 40, 50] as the array without duplicates. */

        System.out.println("Enter the length of the array: "); /** we request to insert the length of an array from the keyboard */

        System.out.println("\n"); /** this will print an empty line */

        Scanner insertData = new Scanner(System.in); /** We created a scanner to insert different inputs */

        int lengthOfArray = insertData.nextInt(); /** we created and integer lengthOfArray to request to insert the length for the array list */

        int myArray[] = new int[lengthOfArray]; /** here we assigned "myArray" array as the inserted data as the array length */

        for (int i = 0; i < myArray.length; i++) { /** here we created a loop with an input i, which is smaller than the length of the "myArray" array,
         incrementing the i to end the loop*/
            System.out.println("Enter the values for the inserted array length [" + i + "] :"); /** we request to insert the values in the array from the keyboard */
            myArray[i] = insertData.nextInt(); /** we assigned the input "i" as the values of the "myArray" array, which must be inserted from the keyboard */
        }

        System.out.println("\n"); /** this will print an empty line */

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("The Value of the array [" + i + "] is " + myArray[i]);
        }

        //    int myArray [] = {20, 20, 30, 40, 50, 50, 50}; /** this is the given array list to be checked.*/
        int myArrayLength = myArray.length; /** here we check the length of myArray array as an integer*/
        myArrayLength = removeDuplicateElements(myArray, myArrayLength); /** here we request to remove the duplicate elements from the length of myArray*/
        for (int i = 0; i < myArrayLength; i++) { /** we created a for loop to check the array input to be smaller as
         it's length, once the duplicate elements were removed*/
            System.out.println(myArray[i] + " ");
        }
    }
}
