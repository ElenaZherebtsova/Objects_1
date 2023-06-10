public class Book {
    private String bookName;
    private String bookAuthor;
    private int bookYear;

    public Book(String bookName, String bookAuthor, int bookYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
}
