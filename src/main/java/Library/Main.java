package Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book b = new Book(Book.getBookName(), Book.getNumberOfPages());
        System.out.println(b.bookName + b.numberOfPages);

        MyLibraryCapacity lC = new MyLibraryCapacity(0);
        System.out.println(lC);

        MyBookList elementBList = new MyBookList();
        System.out.println(elementBList);

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter below the book name and the number of pages this book have : ");

        String bName1 = scan.nextLine();
        int bNumberOfPages1 = scan.nextInt();

        System.out.println("The book name : \"" + bName1 + "\" have\"" + bNumberOfPages1 + "\" pages.");
    }

}
