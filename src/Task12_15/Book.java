package Task12_15;

import java.util.Objects;

public class Book implements Cloneable, Comparable<ProgrammerBook> {
    private String title;
    private String author;
    private int price;
    private String edition;
    private int isbn;

    public Book() {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return price == book.price &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(edition, book.edition);
    }

    @Override
    public int hashCode() {
        long hash = price;
        hash = hash * 31 + Objects.hashCode(title);
        hash = hash * 31 + Objects.hashCode(author);
        hash = hash * 31 + Objects.hashCode(edition);
        return (int) (hash ^ (hash >>> 32));
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", edition='" + edition + '\'' +
                '}';
    }

    @Override
    public int compareTo(ProgrammerBook o) {
        return Integer.compare(getIsbn(), o.getIsbn());
    }
}
