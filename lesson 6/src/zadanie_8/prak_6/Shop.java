package zadanie_8.prak_6;

import zadanie_6.prak_6.Printable;
import zadanie_7.prak_6.Book;

public class Shop implements Printable {
    private Book[] books;

    public Shop() {
        books = new Book[0];
    }
    public Shop(int countBooks){
        books = new Book[countBooks];
    }
    public Shop(String[] bookSName){
        books = new Book[bookSName.length];
        for (int i = 0; i < books.length; i++){
            books[i].setName(bookSName[i]);
        }
    }
    public Shop(String[] bookSName, int[] paches){
        books = new Book[bookSName.length];
        for (int i = 0; i < books.length; i++){
            books[i].setName(bookSName[i]);
            books[i].setPaches(paches[i]);
        }
    }
    public void addBook(Book book){
        Book[] arr = new Book[books.length + 1];
        for (int i = 0; i < this.books.length; i++){
            arr[i] = books[i];
        }
        arr[books.length] = book;
        books = new Book[arr.length];
        for (int i = 0; i < arr.length; i++){
            books[i] = arr[i];
        }
    }

    @Override
    public void print() {
        if (books.length > 0) {
            System.out.print("BOOKS:\n\n");
            for (int i = 0; i < books.length; i++){
                System.out.println(i + 1 + ". " + books[i].getName());
            }
        }else {
            System.out.println("There aren't books");
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Book book = new Book("Time");
        shop.addBook(book);
        book = new Book("1+1");
        shop.addBook(book);
        book = new Book("Jentelmans");
        shop.addBook(book);
        shop.print();
    }
}
