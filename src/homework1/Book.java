package homework1;

public class Book extends PrintedEdition {
    private String isbn;

    public Book(String catalogueNumber, String name, int price, int locationOnShelf, String isbn) {
        super(catalogueNumber, name, price, locationOnShelf);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                '}';
    }
}
