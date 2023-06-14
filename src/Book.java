import java.util.Objects;

public class Book {
    private String bookName;
    private Author bookAuthor;
    private int bookYear;
    private Author author;

    public Book(String bookName, Author author, int bookYear) {
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getBookAuthor() {
        return this.author;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int bookYear) {
        if (bookYear < 0) {
            throw new IllegalArgumentException("Год не может быть отрицательным!");
        }
        this.bookYear = bookYear;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(author, book.author) &&
                Objects.equals(bookYear, book.bookYear);
    }


    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
    public String toStringBook() {
        return "Книга " + this.bookName + " была написана в " + this.bookYear + " году";
    }
}
