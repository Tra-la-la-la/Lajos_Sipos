package HomeWork;

import java.util.Scanner;

public class task11_Print_the_number_of_the_days_specific_to_each_month_in_a_year {
    public static void main(playingWithStrings[] args) {
        /**11. Print the number of days specific to each month in year.
         input: Month (string) of index of the month(1, 2, ... 12)
         output: 31, 30, 28*/
        Scanner insertData = new Scanner(System.in); // we created a scanner insertData in order to request a data from the keyboard
        int numberOfDays = 0; // we created a integer in order to return the number of the days specific to each month of the year
        String month = ""; // we created a string without to allocate any data in, as this input will be inserted from the keyboard

        System.out.println("Enter the name of the month in lower case: ");
        String nameOfMonth = insertData.nextLine(); // next.line as we request a String

        System.out.println("Enter the year: ");
        int year = insertData.nextInt(); // next.int as we request a integer

        switch (nameOfMonth) { /** in this switch case we check that the inserted month name return the numbers of days the month have*/
            case "january":
                month = "January";
                numberOfDays = 31;
                break;
            case "february":
                month = "February"; /** the this case of february we check if the year it is a leap year or not*/
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            case "march":
                month = "March";
                numberOfDays = 31;
                break;
            case "april":
                month = "April";
                numberOfDays = 30;
                break;
            case "may":
                month = "May";
                numberOfDays = 31;
                break;
            case "june":
                month = "June";
                numberOfDays = 30;
                break;
            case "july":
                month = "July";
                numberOfDays = 31;
                break;
            case "august":
                month = "August";
                numberOfDays = 31;
                break;
            case "september":
                month = "September";
                numberOfDays = 30;
                break;
            case "october":
                month = "October";
                numberOfDays = 31;
                break;
            case "november":
                month = "November";
                numberOfDays = 30;
                break;
            case "december":
                month = "December";
                numberOfDays = 31;
                break;
        }
        System.out.println("In the year: " + year + //We print the year
                "\nthe month of: " + month + //we print the month of the year on the next line
                "\nnumber of days: " + numberOfDays); // we print the number of days on the next line
    }
}
