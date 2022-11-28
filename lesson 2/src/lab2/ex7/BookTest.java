package lab2.ex7;

public class BookTest {
    public static void main(String[] args) {
       Book book1 = new Book("Толстой","Война и мир",1945);
        Book book2 = new Book("","",1985);
        Book book3 = new Book("Достоевский","Преступление и наказание",1900);
        Book book4 = new Book("Тургенев","Муму",1888);
        book2.setAuthor("Пушкин");
        book2.setName("Евгений Онегин");
        BookShelf bookShelf = new BookShelf();
        bookShelf.setBooks(book1, book2, book3, book4);
        System.out.println(bookShelf.maxPublicationDate());
        System.out.println(bookShelf.minPublicationDate());
        System.out.println();
        bookShelf.sortBook();


    }
}
