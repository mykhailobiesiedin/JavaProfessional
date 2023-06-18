package lesson1;

public class Person {
    private String name;
    protected boolean presence;

    public Person (String name, boolean presence) {
        this.name = name;
        this.presence = presence;
    }

    boolean comes() {
        return true;
    }

    boolean leaves() {
        return false;
    }
}
