package SomeHomeWork;

import java.util.Scanner;

public class task0_Scanner {

    Scanner scan = new Scanner(System.in);

    int i = scan.nextInt();
    double d = scan.nextDouble();
    String s = scan.nextLine();

    // to get and set the int input
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
        System.out.println("This input will set an integer: ");
    }

    // to get and set the double input
    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
        System.out.println("This input will set a double: ");
    }

    // to get and set the String input
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
        System.out.println("This input will set a String: ");
    }

    // to get and set the scanner input
    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
        System.out.println("This input will set a scanner ");
    }

    public task0_Scanner(Scanner scan) {
        if (scan.hasNextInt()) { /** read in int value*/
            i = scan.nextInt();
        } else if (scan.hasNextLine()) { /** read in String value*/
            s = scan.nextLine();
        }
    }

}