package SomeHomeWork;

public class task15_Finding_all_the_pairs_of_elements_in_an_array {
    public static void main(task17_About_Strings[] args) {
        /**4. Write a Java method to find all pairs of elements in an array whose sum is equal to
         * a given number.*/
        int arr[] = {3, 2, 15, 4, 14, 16, 7, 8, 9, 10, 17, 18, 1, 13, 11, 5, 6, 12, 20, 19};
        int sum = 30; // this is the sum we want to account
        int low = 0; // this represents the lower input of our array, which always starts from 0
        int high = arr.length - 1; //the higher integer it's represented by the length of the array minus 1

        while (low < high) {
            if (arr[low] + arr[high] > sum) {
                high--; // if the smallest integer from the length of the array + the biggest integer it's bigger than the sum decrement
                System.out.println("To high!");
            } else if (arr[low] + arr[high] < sum) {
                low++; // if the smallest integer from the length of the array + the biggest integer it's smaller than the sum increment
                System.out.println("To high!");
            } else if (arr[low] + arr[high] == sum) {
                low++; // if the smallest integer from the length of the array + the biggest integer it's equal to the sum, increment
                high--; // if the smallest integer from the length of the array + the biggest integer it's equal to the sum, decrement
                System.out.println("Bingo! the Pair are: ( " + arr[low] + " , " + arr[high] + " ).");
            }
        }
        System.out.println("Tra-la-la! La-la-la! Laaa-la-la!");
    }
}
