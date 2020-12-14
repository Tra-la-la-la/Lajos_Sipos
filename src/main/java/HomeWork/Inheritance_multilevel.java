package HomeWork;

public class Inheritance_multilevel { //This is our main class where we appeal all the other classes using

    static void Library(int books[]) { // we created a library which hold books
        int Library = books[0]; // we set the books as a part of the library starting from zero
        for (int in = 1; in < books.length; in++) { /** we created an "in" wich represents the inputs of books*/
            if (Library < books[in]) { /**  */
                Library = books[in]; /**  */
            }
            System.out.println(Library); /** Return the library */
        }

    }

    void mainClass() {
        System.out.println("Why did I complicated this?!");
    }

    String tile;
    String name;
    int numberOfPages;

    public Inheritance_multilevel(String tile, String name, int numberOfPages) { // here we created a constructor using our input data, the 2 Strings and the integer
        this.tile = tile;
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public static void main(String[] args) { // the public static void main(String[] args) method

        myBookCatalog[] book = new myBookCatalog[]{
        book[1].setName("The Grudge");
        book[2].setNumberOfPages(500);
        book[0].setTile("Biblie");
        book[0].setName("The Bible");
        book[0].setNumberOfPages(900);

        };


        System.out.println("\n" + " T h i s   i s   a   n e w   l i n e . ");
        myLibraryCatalog theObject = new myLibraryCatalog(); // this is the first class object! and this can appeal only functions from the class or from the extend class, which is this one! :))
        theObject.mainClass();  // here we call the method "mainClass" from the "Inheritance_multilevel" class
        theObject.firstClass(); // here we call the method "firstClass" from the "firstClass" class
//        theObject.secondClass(); /* this type of calling will not work as it is not a loop! and so "theObject" will not be able to call a subclass*/
//        theObject.thirdCLass(); /* this type of calling will not work as it is not a loop! and so "theObject" will not be able to call a subclass*/
        System.out.println("\n" + " T h i s   i s   a   n e w   l i n e . ");

        myBookCatalog ourObject = new myBookCatalog();/* here we created our object named "ourObject" in order*/
        ourObject.getClass();
        ourObject.mainClass();
        ourObject.firstClass();
//        ourObject.thirdCLass(); /* this type of calling will not work as it is not a loop! and so "ourObject" will not be able to call a subclass*/
        System.out.println("\n" + " T h i s   i s   a   n e w   l i n e . ");

        Novels otherObject = new Novels();
        otherObject.secondClass();
        otherObject.thirdCLass();
        otherObject.mainClass();
        otherObject.firstClass();

    }
}

class myLibraryCatalog extends Inheritance_multilevel {
    public myLibraryCatalog(String tile, String name, int numberOfPages) {
        super(tile, name, numberOfPages);
    }

    void firstClass() { /*This is the prime base class. And this is not necessary to extend any other classes. However, " +
                "I like to play, and so: this class extends the Inheritance_multilevel class," +
                "and so this class extends the second class, which extends the third class. It's quite nice in here here! */
        System.out.println("This is the prime base class. ");
    }
}

class myBookCatalog extends myLibraryCatalog {
    public myBookCatalog(String tile, String name, int numberOfPages) {
        super(tile, name, numberOfPages);
    }

    void secondClass() { /*This is the second class, which appeals the first class, which appeal the main class Inheritance_multilevel. " +
                "This class is appealed by the third class.*/
        System.out.println("This is the second class.");
    }
}

class Novels extends myBookCatalog {
    public Novels(String tile, String name, int numberOfPages) {
        super(tile, name, numberOfPages);
    }

    void thirdCLass() {/* This is the third class, which appeals the second class, which appeal the first class, which appeal the main Inheritance_multilevel class.*/
        System.out.println("This is the third class.");
    }
}

class ArtAlbums {

    public void setS(String s) {
        System.out.println("insert the name: ");
    }

}