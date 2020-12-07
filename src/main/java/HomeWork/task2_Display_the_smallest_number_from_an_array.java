package HomeWork;

public class task2_Display_the_smallest_number_from_an_array {
    public static void main(playingWithStrings[] args) {

        /**2. Display the smallest number from an array of numbers (2 versions: with normal for and with foreach)*/

        int myArray [] = {5, 6, 7, 8, 9, 10}; // we created an array with some values inside

        int max = myArray[0];   // we created an int called max to be able to appeal values from the array
        int min = myArray[0];   // we created an int called max to be able to appeal values from the array

        // iterate and compare from the array index
        for (int i = 0; i < myArray.length; i++) {  // we read this sentence as: for an integer i which is equal to the value of zero,
                                                    // where the integer i is smaller then the myArray length,
                                                    // then the integer i increment
            if (max < myArray[i]) {         // if the integer max is smaller than myArray of integer i from myArray length incremented,
                max = myArray[i];           // then integer max is assigned as the myArray of integer i from myArray length incremented
            } else if (min > myArray[i]) {  // else if the integer min is higher than myArray of integer i from myArray length incremented,
                min = myArray[i];           // then the integer min is assigned as the myArray of integer i from myArray length incremented
            }
        }
        System.out.println("Maximum array number is: " + max + "."); // returning the maximum array number
        System.out.println("Minimum array number is: " + min + "."); // returning the minimum array number
    }
}