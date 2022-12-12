package zadanie_9.prak_6;

import zadanie_6.prak_6.Printable;
import zadanie_7.prak_6.Book;

public class tester {
    public static void main(String[] args) {
        Printable[] printables = new Printable[] {
                new Book("1+1"),
                new Magazine("Cosmopolitan"),
                new Book( 356, "Time"),
                new Magazine("Maxim", 45)
        };
        for (int i = 0; i < printables.length; i++){
            printables[i].print();
        }
    }
}
