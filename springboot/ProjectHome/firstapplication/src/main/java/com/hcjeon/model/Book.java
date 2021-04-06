package com.hcjeon.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.hcjeon.main.BookViewClass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class Book {

    @JsonView(BookViewClass.class)
    private Long id;

    @JsonView(BookViewClass.class)
    private String isbn;

    @JsonView(BookViewClass.class)
    private Date published;

    @JsonView({BookViewClass.Simple.class, BookViewClass.Complex.class})
    private Set<Author> authors;

    @JsonView(BookViewClass.class)
    private String title;
}
