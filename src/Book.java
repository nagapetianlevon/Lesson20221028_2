import java.util.Arrays;

public class Book {
    public String name;
    public int pages;
    public String[] Author;
    public double price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", Author=" + Arrays.toString(Author) +
                ", price=" + price +
                '}';
    }
}
