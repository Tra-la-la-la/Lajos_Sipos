package HomeWork;

import java.util.*;

public class playingWithStrings {

    public static void main(String[] args) {

        //in the next lines I'll gonna play with the String

        String x = "Our text is this one."; // we use this sentence to appeal a String only when the class it's named String! try to avoid that!
        // work better if you give a different name to the class and so you call the String as:" String x = "Our text is this one."; "

        /** 1. How to print a char from a certain position */

        System.out.printf("%c", x.charAt(6)); /** we print the char from the position 6*/

        /** 2.a. Computing the length of string using a method, in which we concatenate the characters and we account them
         to be difference one from each other */

        String thisString = "Your inserted string is this one.";
        thisString = thisString.concat("\0"); // our inserted string will be returned by concat as return a char sequence of null
        char y[] = thisString.toCharArray(); //the array of the character "y" represents the "thisString" as a String
        int count = 0; // the iteration will be accounted from the position 0, as the arrays start to be accounted from 0
        int i = 0; // this integer i will represent in our cases the position of each character in the array of characters "y", which represent our inserted String

        while (y[i] != '\0') // while the array of characters y have the input i not equal to null
        {
            count++; // keep accounting, by
            i++; // iterating the input i
        }
        System.out.printf("%d", count); // the result it's an accounted integer (represented by "%d"), counted by iteration of each element of the array

        /** 2.b. Computing the length of string*/

        System.out.printf("%d", thisString.length()); /** using the length method*/

        /** 3. How to copy a string into another*/

        String copyAStringToAnotherString = "Your inserted string is a new one.";
        char l[] = copyAStringToAnotherString.toCharArray();
        int size = l.length;
        char a[] = new char[size]; /** the char "a" it's equal to the length of the int "size", which represents the length of the String by appealing char "l" */
        int st = 0;

        while (st != size) { /* while int "st" is not equal to it's "size" ,assure us to travel to the entire length of the String*/
            a[st] = l[st]; /** where the array of char "a" have the input "st" assigned as the length of our string, which will iterate by*/
            st++; // incrementing "st" until the end of the string
        }
        System.out.println("The result is: " + l);
        System.out.println("The result is: " + a);

        /** 4. how to revers a string */

        String reversString = "Any other message you have to check.";
        char t[] = reversString.toCharArray();
        int sizeA = t.length;
        char z[] = new char[sizeA];
        int in = 0;

        while (in != sizeA) {// while the int "in" is equal to zero is not equal to the length of our String, this will assure us to travel to the entire length of the String
            z[sizeA - 1 - in] = t[in]; /** this will revers the array of char "t" to an array of char "z", and so the String */
            in++;
        }
        System.out.println("The result is: " + t);
        System.out.println("The result is: " + z);

        /** 5. how to check if a string it is or not a palindrome */

        String theString = "Your inserted string is this one.";
        char u[] = theString.toCharArray();
        int sizeB = u.length;
        char b[] = new char[sizeB];
        int iN = 0;

        while (iN != sizeB) {
            b[sizeB - 1 - iN] = u[iN]; /** this way will revers a string u to b*/
            iN++;
        }
        iN = 0;
        while (iN != sizeB) {
            if (b[iN] != u[iN]) {
                System.out.println("This is not a palindrome!");
                System.exit(0);
            } /** this way will revers a string u to b*/
            else {
                iN++;
                continue;
            }
        }
        System.out.println("The result is a palindrome");

        /** 6. how to convert lower case to uppercase and uppercase to lower case*/

        String xString = "Your inserted string is this one.";
        char c[] = xString.toCharArray();
        int sizeC = c.length;
        int inT = 0;
        while (inT != sizeC) {
            c[inT] = (char) (c[inT] - 32); // this is to convert lower case to uppercase as: from http://www.asciitable.com/ the char "a" have the code "96" - 32
            // (32 represents the difference in the position between lower and upper cases characters) in the same table for the char "A", and so on.
            c[inT] = (char) (c[inT] + 32); /** this will convert the uppercase to lowercase*/ // certainly won't be used followed by converting to uppercase method
            inT++; // incrementing inT to stop the loop
        }
        System.out.println("The result is: " + xString);
        System.out.println("The result is: " + c);

        /** 7. How to extract or to change only the first letter from a string in to a upper case */

        String xWord = "Your inserted string is this one.";
        char d[] = xWord.toCharArray();
        int sizeD = d.length;
        int inp = 0;

        d[0] = (char) (d[0] - 32); // as the array of char y have the first char on the position 0, ch
        inp = 1;

        while (inp != sizeD) {// i not equal to size assure us to travel to the entire length of the String
            if (d[inp] == ' ') { // if in the array of char "d" the int "inp" it's a blank spot, than
                d[inp + 1] = (char) (d[inp + 1] - 32); // the first char after the blank spot it's will change the char to a upper case char
            }
            inp++;
        }

        System.out.println("Your result is " + xWord );
        System.out.println("Your result is " + d );

        /** 8. How to print duplicate characters in a present String using Maps */

        /** The 3 different type of maps are:
         the LinkedHashMap sorts the map in the inserted characters order (same order as it is inserted)
         the HashMap sorts the map in a random order
         the TreeMap sorts the map in alphabetical order
         */
        String anotherString = "Your inserted string is this one.";
        char f[] = anotherString.toCharArray(); /** as this line it's used above I won't reuse it, just call it*/
        int sizeF = f.length; /** as this line it's used above I won't reuse it, just call it*/
        int inP = 0; /** as this line it's used above I won't reuse it, just call it*/

        anotherString = anotherString.replace(" ", ""); // with the replace method: ex a = a.replace(" ","") we eliminate the empty spaces
        inP = 0;
        Map<Character, Integer> map = new LinkedHashMap<>(); // this LinkedHashMap will get the String in to it in order to be able to check the values for each character
        // from the string
        while (inP != sizeF) {// "inP" not equal to size assure us to travel to the entire length of the String
            if (map.containsKey(f[inP]) == false) { // if our map contains in the array of the string "f" and input "inP" which equals false
                map.put(f[inP], 1); // the map will put the character "inP" in the string "f" with value 1
            } else {
                int oldVlaue = map.get(f[inP]); // and so will the value of the character "inP" in the string "f",
                int newValue = oldVlaue + 1; // as a new value with +1; and so if any character will repeat, each time is repeating it's
            }
            inP++; // increments the value with 1
        }

        Set<Map.Entry<Character, Integer>> thisMap = map.entrySet();
        for (Map.Entry<Character, Integer> data : thisMap) {
            if (data.getValue() > 1) {
                System.out.println(data.getKey());
                System.out.println(data.getValue());
            }
        }


        /** 9. Check a keyString if it's a rotational string or a non-rotational string from an original string: */

        String myString = "alandala"; // this is our string
        String keyString = "laandala"; // on this line we can insert in a random order the same letters from the myString
        // so on the line above it's the string we need to check
        String newString = myString.concat(myString);

        if (newString.contains(keyString)) {
            System.out.println("This is a rotational String.");
        } else {
            System.out.println("This is not a rotational String.");
        }

        /** 10.a. How to check if the string it's an anagram*/

        /** This program will not accept blank spaces and mixed characters (upper and lowe cases) anagrams as split Strings, like "This is a string" */

        String theFirstStringToCompare = "Chocollate";
        String theSecondStringToCompare = "dsftgrasad";

        char q[] = theFirstStringToCompare.toCharArray();
        char w[] = theSecondStringToCompare.toCharArray();

        Arrays.sort(q);
        Arrays.sort(w);

        Boolean result = Arrays.equals(q, w);

        if (result == true) {
            System.out.println("The string are anagrams");
        } else {
            System.out.println("The Strings are not anagrams");
        }

        /** 10.b. How to check if a String is an anagram, with blank spaces and mixed case characters */

        String theStringA = "I try to text something here";
        String theStringB = "AnD I still Try to DO so there";

        theStringA = theStringA.replace(" ", ""); // with the replace method: ex a = a.replace(" ","") we eliminate the empty spaces
        theStringB = theStringB.replace(" ", ""); // with the replace method: ex a = a.replace(" ","") we eliminate the empty spaces

        theStringA = theStringA.toLowerCase(); // we convert all the letters to lower case characters
        theStringB = theStringB.toLowerCase(); // we convert all the letters to lower case characters


        char e[] = theStringA.toCharArray(); // will copy the first lines of code - the inserted strings
        char r[] = theStringB.toCharArray(); // will copy the first lines of code - the inserted strings

        Arrays.sort(e); // this will solve the arrays of the first and the second Strings
        Arrays.sort(r); // this will solve the arrays of the first and the second Strings

        Boolean myResult = Arrays.equals(e, r); // this boolean will check if the inserted strings are equals as true or if not will return false

        if (myResult == true) { // we check if the result is true return that are anagrams,
            System.out.println("The string are anagrams");
        } else { // otherwise will return that are not anagrams
            System.out.println("The Strings are not anagrams");
        }

        /** 11. We check if a String it's a pangram - a pangram it's a String which contains all the letters from the alphabet in it */

        String pangramString = "The quick brown fox jumps over a lazy dog.";

        pangramString = pangramString.replace(" ", ""); // with the replace method: ex a = a.replace(" ","") we eliminate the empty spaces

        char g[] = pangramString.toCharArray(); /** as this line it's used above I won't reuse it, just call it*/
        int sizeG = g.length; /** as this line it's used above I won't reuse it, just call it*/
        int input = 0; /** as this line it's used above I won't reuse it, just call it*/
        int p[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //we initialised and array for a integer "p" with length of 26, with all positions on 0,
        // as to letter was checked yet
        input = 0; // "input" will start from the index of 0

        while (input != sizeG) {// i not equal to size assure us to travel to the entire length of the String
            int index = g[input] - 65; //we appeal from the ascii code the position of each letter from A to Z (minus) -65 in order to give to each letter a position from 0 to 25
            // where 25 represents the Z, as the maximum number of the english alphabet letters are 26,
            // here the array of the character "g" represents the inserted String which will be checked
            p[index] = 1; // so here in our new index which is ex: ascii code A have the code: 65 minus 65 will return in an array as the input 0 so Z will have 25, and the total
            // length of the array for comparison will be of the 26 characters
            input++; // incrementing the "input"
        }
        System.out.println("The result is: " + pangramString);

        while (input != 26) { // the maximum numbers of letters in the english alphabet
            if (p[input] == 1) { //if in our list with 26 positions the input represented by "input" for each letter from the inserted string equals to 1
                input++; // increment the i in order to check all the letters from the string, and if all are changed from 0 to 1, the result will be: "This is a pangram."
            } else { // else if any position from the 26 from the array of the integer "p" it's 0, the result is: "not a pangram!"
                System.out.println("not a pangram!");
                System.exit(0);
            }
        }
        System.out.println("This is a pangram.");

        /** 12. Check if a String has ALL UNIQUE CHARACTERS */

        String stillAString = "Your inserted string is this one.";
        char h[] = stillAString.toCharArray(); /** as this line it's used above I won't reuse it, just call it*/
        int sizeH = h.length; /** as this line it's used above I won't reuse it, just call it*/
        int inPUT = 0; /** as this line it's used above I won't reuse it, just call it*/

        stillAString = stillAString.replace(" ", ""); // with the replace method: ex a = a.replace(" ","") we eliminate the empty spaces
        inPUT = 0;
        Map<Character, Integer> newMap = new HashMap<>(); // this LinkedHashMap will get the String in to it in order to be able to check the values for each character from the string
        while (inPUT != sizeH) {
            if (newMap.containsKey(h[inPUT]) == false) { //if our map contains a key in our array "h" with the inputs represented by "inPUT", which are false
                newMap.put(h[inPUT], 1); // our map will put the new value to 1
            } else {
                int oldvlaue = newMap.get(h[inPUT]);
                int newvale = oldvlaue + 1; // we increment the value of each char from our array "h" of inputs "inPUT", represented by the inserted String with each repetition of the same value
                newMap.put(h[inPUT], newvale);
            }
            inPUT++;
        }

        Set<Map.Entry<Character, Integer>> fromThisNewMap = newMap.entrySet();
        for (Map.Entry<Character, Integer> data : fromThisNewMap) { // this for each loop verifies each iteration of the values in our string (array "h" of characters, with inputs "inPUT")
            if (data.getValue() > 1) {
                System.out.println("Doesn't contain only unique characters");
                System.exit(0);
            }
        }
        System.out.println("Contains only unique characters");

    }
}