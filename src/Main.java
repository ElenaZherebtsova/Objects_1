public class Main {

    public static void main(String[] args) {

        Author dostoevsky = new Author("Фёдор ", "Достоевский");
        Book prestuplenie = new Book("Преступление и наказание", dostoevsky, 1866);
        System.out.println("prestuplenie.bookName = " + prestuplenie.getBookName());
        System.out.println(prestuplenie.getBookAuthor());
        System.out.println("prestuplenie.bookYear = " + prestuplenie.getBookYear());


        System.out.println();
        Author ostrovsky = new Author("Александр ", "Островский");
        Book groza = new Book("Гроза", ostrovsky, 1859);
        System.out.println("groza.bookName = " + groza.getBookName());
        System.out.println(groza.getBookAuthor());
        System.out.println("groza.bookYear = " + groza.getBookYear());
        groza.setBookYear(1861);
        System.out.println("groza.getBookYear = " + groza.getBookYear());


        Author a1 = ostrovsky;
        Author a2 = dostoevsky;
        System.out.println(a1.equals(a2));


        System.out.println();
        Author turgenev = new Author("Александр ", "Островский ");
        Book mumu = new Book("Гроза", turgenev, 1859);
        System.out.println(mumu.toStringBook());
        System.out.println( mumu.getBookAuthor());
//        System.out.println("mumu.bookYear = " + mumu.toStringBook());

        Book b1 = groza;
        Book b2 = mumu;
        System.out.println(b1.equals(b2));


    }
}