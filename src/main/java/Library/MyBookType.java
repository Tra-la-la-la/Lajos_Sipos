package Library;

import java.util.Objects;

public class MyBookType extends Book {

    private String type;

    public MyBookType(String newName, int newNumberOfPages, String Type) {
        super(newName, newNumberOfPages);
        type = Type;
    }

    public String getType() {
        return type;
    }

    public void setBookType(String typeOfTheBook) {
        type = typeOfTheBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyBookType MyBookType = (MyBookType) o;
        return type.equals(MyBookType.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }


    @Override
    public String toString() {
        return "bookType{" +
                "type='" + type + '\'' +
                '}';
    }
}