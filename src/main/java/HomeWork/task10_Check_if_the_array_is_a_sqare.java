package HomeWork;

public class task10_Check_if_the_array_is_a_sqare {
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


        int arraySquare[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arrayNotSquare[][] = {{1, 3}, {4, 5, 6}, {7, 8, 9}};

        if (isSquare(arraySquare) == true) {
            System.out.println("Array is square");
        }

        if (isSquare(arrayNotSquare) == true) {
            System.out.println("Array is square");
        } else {
            System.out.println("Array not square");
        }
    }

    public static boolean isSquare(int[][] array) {

        int firstLevelElements = 0;
        boolean square = true;

        for (int i = 0; i < array.length; i++) {
            firstLevelElements = firstLevelElements + 1;
            int secondLevelElements = 0;

            for (int j = 0; j < array[i].length; j++) {
                secondLevelElements = secondLevelElements + 1;
            }

            if (array.length != secondLevelElements) {
                square = false;
            }
        }

        if (square == true) {
            // System.out.println("The array is square");
            return square;
        } else {
            //System.out.println("The array is not square");
            return square;
        }
    }
}