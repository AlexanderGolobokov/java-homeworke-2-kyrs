package lab2.ex7;

public class BookShelf {
    private int n = 0;
    private Book[] books = new Book[5];


    public Book maxPublicationDate() {

        Book max = books[0];

        for (int i = 0; i < this.books.length; i++) {
            if (books[i] != null) {
                if (books[i].getPublicationDate() > max.getPublicationDate()) {
                    max = books[i];
                }
            }
        }
        return max;
    }

    public Book minPublicationDate() {
        Book min = books[0];
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getPublicationDate() < min.getPublicationDate()) {
                    min = books[i];
                }
            }
        }
        return min;
    }

    public void sortBook() {
        Book temp;

        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length; j++) {
                if (books[i] != null && books[j] != null) {
                    if (books[i].getPublicationDate() < books[j].getPublicationDate()) {
                        temp = books[j];
                        books[j] = books[i];
                        books[i] = temp;
                    }
                }
            }
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book... books) {
        if (this.books.length - n >= books.length) {
            for (Book book : books) {
                this.books[n] = book;
                n++;
            }
            System.out.println("Успешно добавлено " + books.length + " книг");
        } else {
            System.out.println("На полке не хватает места \n Доступно: " + (this.books.length - n));
        }
    }
}
