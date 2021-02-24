package Library;

public class MyLibraryCapacity extends MyBookList {
    public MyLibraryCapacity(int lbCap) {
        System.out.println(lbCap);
    }

    public static void main(String[] args) {

        int lbCap;{ /**Here is an int lbCap which refers to the capacity of the Library */
            lbCap = 100; /**Here I've gave a maximum size capacity to the library */
        }

        if (lbCap >= 90 && lbCap <= 100) { /** Here I've added values to the library from 100 to 0*/
            System.out.println("Library capacity is between 90% to 100%.");
        } else if (lbCap >= 80 && lbCap <= 90) {
            System.out.println("Library capacity is between 80% to 90%.");
        } else if (lbCap >= 70 && lbCap <= 80) {
            System.out.println("Library capacity is between 70% to 80%.");
        } else if (lbCap >= 60 && lbCap <= 70) {
            System.out.println("Library capacity is between 60% to 70%.");
        } else if (lbCap >= 50 && lbCap <= 60) {
            System.out.println("Library capacity is between 50% to 60%.");
        } else if (lbCap >= 40 && lbCap <= 50) {
            System.out.println("Library capacity is between 40% to 50%.");
        } else if (lbCap >= 30 && lbCap <= 40) {
            System.out.println("Library capacity is between 30% to 40%.");
        } else if (lbCap >= 20 && lbCap <= 30) {
            System.out.println("Library capacity is between 20% to 30%.");
        } else if (lbCap >= 10 && lbCap <= 20) {
            System.out.println("Library capacity is between 10% to 20%.");
        } else if (lbCap >= 0 && lbCap <= 10) {
            System.out.println("Library capacity is between 0% to 10%.");
        } else { /** If the returned values is not fitted in the values of the library will return the following sentence.*/
            System.out.println("It is not a valid value.");
        }
    }
}