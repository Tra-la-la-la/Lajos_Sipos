package HomeWork;

import java.util.HashMap;
import java.util.Map;

/** 1. Create a small application that mimics a library catalog. It needs to be able to add books,
 delete books and list books. Books are of two kinds: novels and art albums. They both have names and
 number of pages. Novels have type (like mystery, sf, etc.) while albums have paper quality.

 Model these entities (book, novel, album) with different classes and inheritance.*/

enum Books{ /** Here we created an enum in order to enumerate the book options from our library, as: */
    NOVELS,
    ALBUMS,
    TECHNICAL
}

public class task15_Mimic_a_library_catalog {
    public static void main(String[] args) {

        Map<Object, Object> myMap = new HashMap<Object, Object>(); /** We created a map called "myMap" in order to add objects in, as: "title" and "name", and we use a hashMap as
         this is the random type of map*/
        myMap.put("Scriptures", new Novel("The Nag Hammadi collection")); // we put a "title" and a "name" to the first input in our map
        myMap.put("The Complete book of enoch",Books.NOVELS);// we refer to another "title" as being part from Novels, without adding a name
        myMap.put(Books.ALBUMS,"Picasso"); // we add a "title" to Albums, without adding a "name"

        Novel novel = new Novel("Bible"); // we created a new novel with the "name" ...
        myMap.put(novel, "Torah"); // we add new novel
        myMap.put(novel, "Qur'an"); // we add new novel
        myMap.put(new Albums(),"Rafael"); // we added a new album with the "title" ...

        Books Java = Books.TECHNICAL;
        System.out.println(myMap.get(Java));

        System.out.println(myMap.get("Scriptures"));
        System.out.println(myMap.get("The Complete book of enoch"));
        System.out.println(myMap.get("Picasso"));
        System.out.println(myMap.get("Bible"));
        System.out.println(myMap.get("Torah"));
        System.out.println(myMap.get("Qur'an"));
        System.out.println("Rafael");


    }
}
class Novel{
    public String name;

    public Novel(String n){name = n;}

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Novel) && (((Novel)obj).name.equals(name));
    }

    public int hasCode() {return name.length();}

    @Override
    public String toString() {
        return "Novels {" +
                "name = " + name + "\'" +
                "}";
    }
}

class Albums{}
class Technical{}
