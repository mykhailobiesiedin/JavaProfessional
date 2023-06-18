package lesson1;

public abstract class CleverHouse {
    private boolean functionality;

    abstract String turnOff();
    abstract String turnOn();

    Person person = new Person("Iryupin", false);
    public boolean isFunctionality() {
        return functionality;
    }

    public CleverHouse(boolean functionality) {
        this.functionality = false;



    }
}
