package HomeWork;

import java.util.Scanner;

public class task6_A_calculator_using_if_else_to_check_the_inserted_data {
    public static void main(playingWithStrings[] args) {
        /**6. Change the implementation of the calculator from the previous meeting to use only if-else instead of switch.*/

        Scanner sc = new Scanner(System.in);    /** here we created a scanner in order to be able to add an input from the keyboard*/
        double a;   /** we created a double as the input which can be inserted from the keyboard to be able to return a float number too*/
        double b;   /** we created a second double as the input which can be inserted from the keyboard to be able to return a float number too*/
        System.out.println("");

        System.out.println("Insert the first number: ");
        a = sc.nextInt(); /** we request to insert the first input from the keyboard*/

        System.out.println("Insert the math operation you want to apply, as: " +
                "+ for addition, " +
                "- for subtraction, " +
                "* for multiplication," +
                "/ for division," +
                "% ");
        String operation = sc.next(); /** we request the operation which can be*/

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
        } else if (operation == "-") {
            System.out.println("The reminder of the inserted numbers is: " + (a % b));
        }return;

    }
}
