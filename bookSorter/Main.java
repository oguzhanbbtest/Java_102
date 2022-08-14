import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> book=new TreeSet<>();

        Book b1=new Book("Canlar Kimin Icin Caliyor",636, "Ernest Hemingwaty", 1940);
        Book b2=new Book("Nutuk", 643, "Mustafa Kemal ATATURK",1927);
        Book b3=new Book("Atomik Alışkanlıklar",  352,"James Clear ", 2020);
        Book b4=new Book("Eski Atina'da Bir Gün", 256, "William Stearns Davis",2012);

        book.add(b1);
        book.add(b2);
        book.add(b3);
        book.add(b4);

        System.out.println("sort by name:");
        for(Book bookName:book){
            System.out.println("Book Name: "+bookName.getBookName()+
                    "\nNumber of page: "+bookName.getNumberOfPages()+
                    "\nAuthor Name: "+bookName.getAuthorName()+
                    "\nReleased Date: "+bookName.getReleaseDate());
            System.out.println("..........................................");
        }

        TreeSet<Book> books=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book a1, Book a2) {
                return a1.getNumberOfPages()-a2.getNumberOfPages();
            }
        });

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        System.out.println("=====================================");
        System.out.println();
        System.out.println("sorted by number of page");
        for(Book bookPage:books){
            System.out.println("Book Name: "+bookPage.getBookName()+
                    "\nNumber of page: "+bookPage.getNumberOfPages()+
                    "\nAuthor Name: "+bookPage.getAuthorName()+
                    "\nReleased Date: "+bookPage.getReleaseDate());
            System.out.println();
            System.out.println("=======================================");
        }



    }
}