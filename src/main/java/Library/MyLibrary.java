package Library;

import java.util.LinkedList;
import java.util.Scanner;

public class MyLibrary extends MyBookList /** implements bookBoolean implements bookType*/{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList <String> Books = new LinkedList<>();

        Book.addBook("",0);
        Book.addBook("",0);
        Book.addBook("",0);

        String Raft = Books.get(0); /** we defined the object named*/
        System.out.println(Raft);

        Books.set(0,"");
    }
}
