package HomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task14_Find_the_duplicate_character {

    public static int removeDuplicateElements(int[] myArray, int n) { /** we created a static "integer n" in order to check the numbers in "myArray" array,
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
        /** so, we are adding the compared value of "integer n" as a value in "myArray" array*/return x;
    }

    public static void main(playingWithStrings[] args) {
        /**3. Write a Java method to find the duplicate characters in a string. (Hint use str.toCharArray() to split the string into an array of characters)*/
        Scanner insertData = new Scanner(System.in); /** We created a scanner to insert different inputs */

        System.out.println("Insert the length of your array: ");
        int lengthOfArray = insertData.nextInt(); /** we created and integer lengthOfArray to request to insert the length for the array list */
        int myArray[] = new int[lengthOfArray]; /** here we assigned "myArray" array as the inserted data as the array length */

        System.out.println("Please insert your data String: ");
        java.lang.String myString = insertData.nextLine();

        for (int i = 0; i < myArray.length; i++) { /** here we created a loop with an input i, which is smaller than the length of the "myArray" array,
         incrementing the i to end the loop*/
            System.out.println("Enter the values for the inserted array length [" + i + "] :"); /** we request to insert the values in the array from the keyboard */
            myArray[i] = insertData.nextInt(); /** we assigned the input "i" as the values of the "myArray" array, which must be inserted from the keyboard */
        }

        for (int i = 0; i <= myString.length(); i++) {
            System.out.println(i);
        }

        /** the second option I use, I think it's a easyer and a better one to use: */
        System.out.println(" This is another option to find the duplicate using the Linked Hash Map: ");

        java.lang.String anotherString = "Your inserted string is this one.";
        char y[] = anotherString.toCharArray(); /** as this line it's used above I won't reuse it, just call it*/
        int size = y.length; /** as this line it's used above I won't reuse it, just call it*/
        int i = 0; /** as this line it's used above I won't reuse it, just call it*/

        anotherString = anotherString.replace(" ", ""); // with the replace method: ex a = a.replace(" ","") we eliminate the empty spaces

        Map<Character, Integer> map = new LinkedHashMap<>(); // this LinkedHashMap will get the String in to it in order to be able to check the values for each character from the string
        while (i != size) {// i not equal to size assure us to travel to the entire length of the String
            if (map.containsKey(y[i]) == false) { // if our map contains in the array of the string y and input i which equals false
                map.put(y[i], 1); // the map will put the character i in the string y with value 1
            } else {
                int oldVlaue = map.get(y[i]); // and so will the value of the character i in the string y,
                int newValue = oldVlaue + 1; // as a new value with +1; and so if any character will repeat, each time is repeating increments it's value with 1
            }
            i++;
        }

        Set<Map.Entry<Character, Integer>> thisMap = map.entrySet();
        for (Map.Entry<Character, Integer> data : thisMap) {
            if (data.getValue() > 1) {
                System.out.println(data.getKey());
                System.out.println(data.getValue());
            }
        }

    }

}
