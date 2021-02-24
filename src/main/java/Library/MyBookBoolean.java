package Library;

public class MyBookBoolean extends Book {

    public static void main(String[] args) {

        boolean setBook = true; /** this is true only if 1 == 1 */
        boolean deleteBook = false; /** in this case 1 is not equal to 1 */
        boolean listBooks = false; /** if is equal to all counted books then will return true */
        int countBooks = 0; /** this starts from 0 in order to account all the books */

        for(int sum = 0; sum == countBooks; sum++){
            System.out.println("The total number of books in our library ar: " + sum);
        }

        if (deleteBook){ /** this one will be skipped by the program as it's a removed book */
            System.out.println("You deleted a book!");
            countBooks = countBooks -1; /** we added plus one as the account starts from zero, so this is the first book */
        }

        if (setBook){
            System.out.println("We set a book!");
            countBooks = countBooks +1; /** we added plus one as the account starts from zero, so this is the second book */
        }
        if (setBook){
            System.out.println("We set another book!");
            countBooks = countBooks +1; /** we added plus one as the account starts from zero, so this is the third book */
        }

        if (countBooks >= 0){ /* by changing the value of the countBooks here we influence the result of the listBooks */
            listBooks = true;
        }

        if (listBooks){
            System.out.println("This is a true value! books accounted are more then 0." + listBooks); // if the value is true will return this line
        }else{
            System.out.println("This is a false value!" + listBooks); // if the value is false will return this line
        }
    }
}
