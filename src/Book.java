import java.util.Arrays;

public class Book {
    public String name;
    public int pages;
    public String[] Author;
    public double price;

    public Book(String s, int i, String[] strings, double v) {
        this.name = name;
        this.pages = pages;
        this.Author = Author;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", Author=" + Arrays.toString(Author) +
                ", price=" + price +
                '}';
    }

    public Book() {
    }
}
