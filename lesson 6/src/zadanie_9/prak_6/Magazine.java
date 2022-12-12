package zadanie_9.prak_6;

import zadanie_6.prak_6.Printable;

public class Magazine implements Printable {
    private String name;
    private int number;

    {
        this.name = "no name";
        this.number = 0;
    }

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public Magazine(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("It's " + name + " magazine. It's " + number + " serias.");
    }
}
