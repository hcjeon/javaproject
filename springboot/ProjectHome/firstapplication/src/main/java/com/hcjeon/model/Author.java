package com.hcjeon.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.hcjeon.main.BookViewClass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Author {
    @JsonView(BookViewClass.Complex.class)
    private Long id;

    @JsonView(BookViewClass.Complex.class)
    private String firstName;

    @JsonView(BookViewClass.Complex.class)
    private String lastName;

    private String email;

    private String address;

    private Date joinedDate;
}
