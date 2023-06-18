package lesson5;

public class Document {
    private String text;

    public Document(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                '}';
    }

    public String getText() {
        return text;


    }
}
