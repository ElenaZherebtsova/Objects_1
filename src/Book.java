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

    public boolean equals (Book other) {
        if (this.getBookName() != other.getBookName()) {
            return false;
        }
        Book b2 = (Book) other;
        return bookName.equals(b2.bookName);
    }


    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
    public String toStringBook() {
        return "Книга " + this.bookName + " была написана в " + this.bookYear + " году";
    }
}
