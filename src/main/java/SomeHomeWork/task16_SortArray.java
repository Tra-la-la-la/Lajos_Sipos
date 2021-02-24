package SomeHomeWork;

import java.util.LinkedHashMap; //used for the second program
import java.util.Map; // used for the first program
import java.util.Set;

public class task16_SortArray {
    public static void main(task17_About_Strings[] args) {
        int[] myArray = {15, 5, 87, 68, 46, 860, 98};
        int y = myArray.length;

        for (int a = 0; a < y - 1; a++) {
            for (int b = 1; b < y - 1; b++) {
                if (myArray[a] < myArray[b]) {
                    int x = myArray[a];
                    myArray[a] = myArray[b];
                    myArray[b] = x;
                }
            }
        }
        System.out.println("Array elements sorted in ascending order: ");
        for (int i = 0; i < y - 1; i++) {
            System.out.println(myArray[i] + " , ");
        }
        System.out.println(myArray[y - 1]);

        System.out.println("The second program starts here: ");

        java.lang.String x = "paralelipipedicelor"; /** We created a String in order to be checked and to remove all the double characters */
        char z[] = x.toCharArray(); /** Here we created an undefined array of a character "z", which we allocated to the "String x" */
        int size = z.length; /** Here we allocated the z character to the length of the String x, by using an integer which we named "size" to check the length of the String */

        Map<Character, Integer> map = new LinkedHashMap<>(); /** here we created an empty linked hash map to use it to insert the string in and to iterate it in a loop to get our desired value
         the linked hash map sorts the character in the inserted order (same order as it is inserted) -
         the hash map sorts the map in a random order;
         the tree map sorts the map in alphabetical order; -
         */

        /** in the next loop we insert the String x from above using the empty hash map initiated above) */

        int i = 0; /** here the int "i" from input, start from zero as all the array account starts from 0*/
        while (i != size ){ /** while the i is not equal to the size (size, which represents the length of the array of the char z, which is the inserted String), and so*/
            if (map.containsKey ( z [i] ) == false){ /** if the inserted map contains keys in the length of the inserted String, as the input i being a value to the characters, equals false*/
                map.put( z [i] , 1); /** the map will put the character i only 1 time*/
            }else{
                int oldvalue = map.get ( z [i]); /** else the old value of the char z which was i times, will */
                int newvalue = oldvalue + 1; /** get a new value which is the old value only 1 time, and so */
                map.put (z [i], newvalue); /** the map will put to the char z the value of i as a new value (which is only once)*/
            }i++; /** we itterate i++ to close the loop */
        }

        Set<Map.Entry<Character, Integer>> toCheckInOurMap = map.entrySet();

        java.lang.String res = ""; /** Here we created an empty String named "res" from result */
        for(Map.Entry<Character, Integer> data : toCheckInOurMap) { /** in this for loop we are checking usign a map*/
            res = "" + data.getKey();
        }
        System.out.println(res);
    }
}
