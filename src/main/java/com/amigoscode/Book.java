package com.amigoscode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId) {
    public static List<Book> books =
            Arrays.asList(
                    new Book(9721, "Rendezvous With Rama", 550, 1),
                    new Book(4839, "The Forever War", 620, 1),
                    new Book(7077, "The Three Body Problem", 745, 2),
                    new Book(5691, "The Dark Forest", 821, 2),
                    new Book(9876, "Deaths End", 911, 2),
                    new Book(4443, "Dark Matter", 612, 3),
                    new Book(1112, "Recursion", 598, 3)
            );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(b -> b.id.equals(id))
                .findFirst();
    }
}
