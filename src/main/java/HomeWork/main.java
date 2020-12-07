package HomeWork;

import java.util.Scanner;

public class main {
    public static void main(playingWithStrings[] args) {

        System.out.println("PLease insert your data as: \n" +
                "for integer: 42\n" +
                "for double: 3.1415\n" +
                "for String: Welcome to HackerRank's Java tutorials!" +
                ": \n");

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        java.lang.String s = scan.nextLine();

        if (scan.hasNextInt()) { //read in int value
            i = scan.nextInt();
        } else if (scan.hasNext()) { //read in String value
            s = scan.nextLine();
        } else if (scan.hasNextInt() || scan.hasNext()){
            System.out.println ("\n");
        }
//        42
//        3.1415
//        Welcome to Java!

//        s=s.replaceAll("[0-99]", "");


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
