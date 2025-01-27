package com.amigoscode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1, "Arthur C Clarke"),
            new Author(2, "Cixin Lui"),
            new Author(3, "Blake Crouch")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(b -> b.id.equals(id))
                .findFirst();
    }
}
