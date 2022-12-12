package zadanie_7.prak_6;

import zadanie_6.prak_6.Printable;

public class Book implements Printable {
    private int paches;
    private String name;

    public Book() {
        paches = 0;
        name = "no name";
    }
    public Book(String name){
        paches = 0;
        this.name = name;
    }

    public Book(int paches, String name) {
        this.paches = paches;
        this.name = name;
    }

    public int getPaches() {
        return paches;
    }

    public void setPaches(int paches) {
        this.paches = paches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("It's " + name + " book. This book has " + paches + " paches.");
    }
}
