package Library;

import java.util.ArrayList;

public class MyBookList {
    public static void main(String[] args) {

        Book c1 = new Book("Scriptures - The Nag Hammadi",864);
        Book c2 = new Book("The complete book of Enoch",184);
        Book c3 = new Book("The complete Dead Sea Scrolls in English",720);
        Book c4 = new Book("Dune - ereticii dunei",684);
        Book c5 = new Book("Java de la 0 la expert",864);
        Book c6 = new Book("Python - Machine Learning",324);
        Book c7 = new Book("Machine Learning in Java",302);
        Book c8 = new Book("Core Java",222);
        Book c9 = new Book("Eloquent JavaScrip",472 );
        Book c10 = new Book("Web Development with jQuery",672);

        Book[] carti = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10}; /** we created and array of books (appealing the class book),
         named carti, which have some elements, as: c1 to c10 (c from carti) */

        for (Book c : carti){ /** we appeal to the book class constructor to make our carti c to set, to borrow, to remove, to return*/
            c.setBook("",0);
            c.getBookName();
            c.addBook("",0);
            c.borrowBook("",0);
            c.removeBook("",0);
            c.returnBook("",0);
        }

//        String bookTypes[] = new String[3]; /** we create a String as an array where we define some elements of our String named bookTypes
//         here the elements which can be used are limited to a certain number given to the String[] */
//        bookTypes[0] = "Art Albums";
//        bookTypes[1] = "Novels";
//        bookTypes[2] = "Technical";
//        System.out.println(bookTypes[1]);

        /** the array list is a very flexible list to work with.
         * Can be used in many different places, as:
         *  library where the number of books can grow by adding books or decrease by removing books
         *  subscribers to a link which can grow or decrease... */

        ArrayList <String>bookType = new ArrayList<>(); /** we create a list of array containing our String elements */

        bookType.add("Art Albums"); /** in this way we add elements to our arrayList */
        bookType.add("Novels");
        bookType.add("Technic");
        bookType.add("History");
        bookType.add("History");

        String elementBookList = bookType.get(0); /** we defined the object named elementBookList*/
        System.out.println(elementBookList);

        bookType.set(0,"");

        bookType.remove("History"); /** in this way we remove a certain element from the arrayList*/

//        bookList.clear(); /** in this way we clear all the elements in the arrayList...*/

        bookType.contains("History"); /** in this way we check if an element exists in the arrayList */
        System.out.println(bookType.contains("History")); /** in this way we print using true or false if the arrayList contains a certain element*/

        System.out.println(bookType); /** we call to print our elements from our array bookList */

    }
}
