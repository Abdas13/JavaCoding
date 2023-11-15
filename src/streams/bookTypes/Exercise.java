package streams.bookTypes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {
        List<Book> books =  new ArrayList<>();
        books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
        books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
        books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
        books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
        books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
        books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
        books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));
        System.out.println(getType(books));
        System.out.println();
        System.out.println(mappingBookType(books));
    }
    public static List<String> getType(List<Book> books){
        List<String> typeNovel =  books.stream()
                       .filter(b-> b.getType()== Type.NOVEL)
                       .sorted(Comparator.comparing(Book::getPages))
                       .map(Book::getAuthor)
                       .collect(Collectors.toList());

        typeNovel.stream().forEach(System.out::println);

        return typeNovel;
    }
    public static List<String> mappingBookType(List<Book> books){
        // grouping by type
        Map<Type, List<Book>> booksByType = books
                .stream()
                .collect(Collectors.groupingBy(Book::getType));

        booksByType.entrySet().stream().forEach(System.out::println);

        // finding two longer books (more than 500 pages)
        List<String> longestBooks = books
                .stream()
                .filter(p-> p.getPages()>500)
                        .map(Book::getTitle)
                                .limit(2)
                                        .collect(Collectors.toList());
        longestBooks.stream().forEach(System.out::println);




        return null;
    }


}
