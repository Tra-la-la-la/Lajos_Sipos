package SomeHomeWork;

import java.util.Scanner;

public class task8_Calculate_and_display_a_factorial_given_number {
    public static void main(task17_About_Strings[] args) {
        /** 8. Calculate and display the factorial of a given number n. (ex: 4! = 1*2*3*4)*/

        Scanner sc = new Scanner(System.in);    // here we created a scanner in order to be able to add an input from the keyboard
        double a;   // we created a double as the input which can be inserted from the keyboard to be able to return a float number too
        double b;   // we created a second double as the input which can be inserted from the keyboard to be able to return a float number too
        System.out.println("");

        System.out.println("Insert the first number: ");
        a = sc.nextInt(); // we request to insert the first input from the keyboard

        System.out.println("Insert the math operation you want to apply, as: " +
                "+ for addition, " +
                "- for subtraction, " +
                "* for multiplication, " +
                "/ for division, " +
                "% for the reminder:");

        String operation = sc.next(); // we request the operation which can be

        System.out.println("Insert the second number: ");
        b = sc.nextInt();

        if (operation == "+") {
            System.out.println("The sum of the inserted numbers is: " + (a + b));
        } else if (operation == "-") {
            System.out.println("The subtraction of the inserted numbers is: " + (a - b));
        } else if (operation == "*") {
            System.out.println("The multiplication of the inserted numbers is: " + (a * b));
        } else if (operation == "/") {
            System.out.println("The division of the inserted numbers is: " + (a / b));
        } else if (operation == "%") {
            System.out.println("The reminder of the inserted numbers is: " + (a % b));
        }

    }
}
