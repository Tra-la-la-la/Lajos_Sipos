package Library;

public class Book {
    public static String bookName; /** any book have a name */
    public static int numberOfPages; /** the certain number of pages */

    public static String getBookName() {
        return bookName;
    }
    public static int getNumberOfPages() {
        return numberOfPages;
    }

    public void setBook(String nameOfTheBook, int numberOfThePages) {
        bookName = nameOfTheBook; numberOfPages = numberOfThePages; }

    public static void addBook (String nameTheBook, int numberOfThisPages){
        bookName = nameTheBook; numberOfPages = numberOfThisPages;
        System.out.println("The book with the name \"" + nameTheBook + "\" have \"" +
                numberOfThisPages + "\" number of pages, was added to the library.");
    }

    public void removeBook(String removeNameOfTheBook, int removeNumberOfPages){
        bookName = removeNameOfTheBook; numberOfPages = removeNumberOfPages;
        System.out.println("Was removed from the library the book with the name \"" + removeNameOfTheBook +
                "\" which had \"" + removeNumberOfPages + "\" number of pages.");
    }

    public void borrowBook(String borrowNameBook, int borrowNumberPages){
        bookName = borrowNameBook; numberOfPages = borrowNumberPages;
        System.out.println("The book \"" + borrowNameBook + "\" which have \"" + borrowNumberPages + "\" number of pages was borrowed.");
    }

    public void returnBook(String returnNameBook, int returnNumberPages){
        bookName = returnNameBook; numberOfPages = returnNumberPages;
        System.out.println("The book \"" + returnNameBook + "\" which have \"" + returnNumberPages + "\" number of pages was returned.");
    }

    public Book(String bName, int bNrOfPages){
        bookName = bName; numberOfPages = bNrOfPages;
    }
    Book(){}
}