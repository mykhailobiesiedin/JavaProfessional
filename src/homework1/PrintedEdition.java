package homework1;

public class PrintedEdition {
    private String catalogueNumber;
    private String name;
    private int price;
    private int locationOnShelf;

    public PrintedEdition(String catalogueNumber, String name, int price, int locationOnShelf) {
        this.catalogueNumber = catalogueNumber;
        this.name = name;
        this.price = price;
        this.locationOnShelf = locationOnShelf;
    }

    public int getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }

}



