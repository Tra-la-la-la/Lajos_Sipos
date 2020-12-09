package HomeWork;

public class Inheritance_multilevel { //This is our main class where we appeal all the other classes using
    void mainClass(){
        System.out.println("Why did I complicated this?!");
    }
    public static void main(String[] args) { // the public static void main(String[] args) method

        System.out.println("\n"+" T h i s   i s   a   n e w   l i n e . ");
        myLibraryCatalog theObject = new myLibraryCatalog(); // this is the first class object! and this can appeal only functions from the class or from the extend class, which is this one! :))
        theObject.mainClass();  // here we call the method "mainClass" from the "Inheritance_multilevel" class
        theObject.firstClass(); // here we call the method "firstClass" from the "firstClass" class
//        theObject.secondClass(); /* this type of calling will not work as it is not a loop! and so "theObject" will not be able to call a subclass*/
//        theObject.thirdCLass(); /* this type of calling will not work as it is not a loop! and so "theObject" will not be able to call a subclass*/
        System.out.println("\n"+" T h i s   i s   a   n e w   l i n e . ");

        myBookCatalog ourObject = new myBookCatalog();/* here we created our object named "ourObject" in order*/
        ourObject.getClass();
        ourObject.mainClass();
        ourObject.firstClass();
//        ourObject.thirdCLass(); /* this type of calling will not work as it is not a loop! and so "ourObject" will not be able to call a subclass*/
        System.out.println("\n"+" T h i s   i s   a   n e w   l i n e . ");

        Novels otherObject = new Novels();
        otherObject.secondClass();
        otherObject.thirdCLass();
        otherObject.mainClass();
        otherObject.firstClass();

    }
}
class myLibraryCatalog extends Inheritance_multilevel{
    void firstClass() { /*This is the prime base class. And this is not necessary to extend any other classes. However, " +
                "I like to play, and so: this class extends the Inheritance_multilevel class," +
                "and so this class extends the second class, which extends the third class. It's quite nice in here here! */
        System.out.println("This is the prime base class. ");
    }
}

class myBookCatalog extends myLibraryCatalog {
    void secondClass() { /*This is the second class, which appeals the first class, which appeal the main class Inheritance_multilevel. " +
                "This class is appealed by the third class.*/
        System.out.println("This is the second class.");
    }
}

class Novels extends myBookCatalog {
    void thirdCLass(){/* This is the third class, which appeals the second class, which appeal the first class, which appeal the main Inheritance_multilevel class.*/
        System.out.println("This is the third class.");
    }
}

class ArtAlbums {

    public void setS(String s) {
        System.out.println("insert the name: ");
    }

    public static void main(String[] args) {

        String name;
        int pages;


    }


}
