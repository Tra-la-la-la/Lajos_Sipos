package SomeHomeWork;

import java.util.Scanner;

public class main_for_scanner {
    public static void main(task17_About_Strings[] args) {

        System.out.println("PLease insert your data as: \n" +
                "for integer: 10\n" +
                "for double: 1.1234\n" +
                "for String: This is a text" +
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
