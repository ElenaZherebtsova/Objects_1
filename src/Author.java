public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }


    public boolean equals (Author other) {
        if (this.getAuthorName() != other.getAuthorName() && this.getAuthorSurname() != other.getAuthorSurname()) {
            return false;
        }
        Author a2 = (Author) other;
        return authorName.equals(a2.authorName);

    }

    public int hashCode() {
        return java.util.Objects.hash(authorName);
    }
        public String toString() {
        return "Автор " + this.authorName + this.authorSurname;
    }
}
