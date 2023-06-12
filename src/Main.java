public class Main {

    public static void main(String[] args) {

        Author dostoevsky = new Author("Фёдор ", "Достоевский");
        Book prestuplenie = new Book("Преступление и наказание", dostoevsky, 1866);
        System.out.println("prestuplenie.bookName = " + prestuplenie.getBookName());
        System.out.println("prestuplenie.bookAuthor = " + prestuplenie.getBookAuthor().getAuthorSurname());
        System.out.println("prestuplenie.bookYear = " + prestuplenie.getBookYear());

//        System.out.println("dostoevsky.surname = " + dostoevsky.authorSurname);
//        System.out.println("dostoevsky.name = " + dostoevsky.authorName);
//        prestuplenie.bookName = "Преступление и наказание";
//        prestuplenie.bookAuthor = dostoevsky.authorName + dostoevsky.authorSurname;
//        prestuplenie.bookYear = 1866;

        System.out.println();
        Author ostrovsky = new Author("Александр ", "Островский");
        Book groza = new Book("Гроза", ostrovsky, 1859);
        System.out.println("groza.bookName = " + groza.getBookName());
        System.out.println("groza.bookAuthor = " + groza.getBookAuthor().getAuthorSurname());
        System.out.println("groza.bookYear = " + groza.getBookYear());
        groza.setBookYear(1861);
        System.out.println("groza.getBookYear = " + groza.getBookYear());

        System.out.println();
        Author turgenev = new Author("Иван ", "Тургенев ");
        Book mumu = new Book("Муму", turgenev, 1852);
        System.out.println("mumu.bookName = " + mumu.getBookName());
        System.out.println("mumu.bookAuthor = " + mumu.getBookAuthor().getAuthorSurname());
        System.out.println("mumu.bookYear = " + mumu.getBookYear());


    }
}