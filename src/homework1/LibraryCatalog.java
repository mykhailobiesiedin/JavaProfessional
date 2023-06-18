package homework1;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    public static void main(String[] args) {

        List<PrintedEdition> catalog = new ArrayList<>();
        catalog.add(new Book("BO1", "Harry Potter", 750, 6, "ISBN1"));
        catalog.add(new Book("BO2", "Lord of Rings", 1500, 7, "ISBN2"));
        catalog.add(
                new Magazine("MAG1", "The Times", 1200, 4, 2021, 12));
        catalog.add(
                new Magazine("MAG2", "Nature", 800, 2, 2023, 13));

        for (PrintedEdition media: catalog){
            if (media instanceof Magazine && media.getPrice() < 1000 ){
                System.out.println("Magazine: " + media.getName() + ";" + " Year of publishing : "
                        + ((Magazine) media).getYearOfPublishing() + ";" + " Magazines number : " + ((Magazine) media).getMagazinesNumber() );
            } else if (media instanceof Book && media.getPrice() < 1000){
                System.out.println("Book : " + media.getName() + ";" + " ISBN: " + ((Book) media).getIsbn());
            }
        }
    }
}
