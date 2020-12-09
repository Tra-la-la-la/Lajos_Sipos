package HomeWork;

import java.util.Scanner;

public class task10_Check_if_the_array_is_a_sqare{
    public static void main(playingWithStrings[] args) {
        /**10. Write a method that checks if the array is square (i.e. every row has the same length as a itself).
         a. for input:

         {{1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}}
         should return true

         b. for input:
         {{1},
         {5, 7, 4},
         {7, 8}}
         should return false

         method definition should be:
         public static boolean isSquare(int[][] array)*/

        System.out.println("Enter the length of the array: ");
        Scanner thisScanner = new Scanner(System.in); // we appealed the scanner function in order to add our inputs from the keyboard
        int myArrayLength = thisScanner.nextInt(); // we created an int myArrayLength which will be inserted from the keyboard
        int myArrayX [] = new int[myArrayLength]; // we create the array "myArrayX" as equal the length of our array, and this named "myArrayLenght",
        // which will be inserted from the keyboard
        int myArrayY [] = new int[myArrayLength]; // we create the array "myArray" as equal the length of our array, and this  named "myArrayLenght",
        // which will be inserted from the keyboard
        System.out.println("\n"); // to print a blank line
        System.out.println("Enter the value of the array [" +myArrayLength+ "] : " );// we enter the values of our array

        myArrayX[myArrayLength] = thisScanner.nextInt(); //
        myArrayY[myArrayLength] = thisScanner.nextInt(); //
    }
}
