package lab2.ex7;

public class Book {
    private String author;
    private String name;
    private int publicationDate;

    public Book(String author, String name, int publicationDate){
        this.author = author;
        this.name = name;
        this.publicationDate = publicationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
