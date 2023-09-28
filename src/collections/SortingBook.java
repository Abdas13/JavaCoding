package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingBook {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();

        books.add(new Book("Elif Shafak","Sut",356));
        books.add(new Book("Orhan Pamuk","BBB",444));
        books.add(new Book("M Akif Ersoy","Safahat",558));
        books.add(new Book("Ahmet Umit","AAA",476));
        Collections.sort(books);
        System.out.println(books);
        books.sort(new BookComparator().reversed());
        System.out.println(books);


    }
}
