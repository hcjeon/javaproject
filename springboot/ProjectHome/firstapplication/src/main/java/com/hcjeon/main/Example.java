package com.hcjeon.main;

import com.fasterxml.jackson.annotation.JsonView;
import com.hcjeon.model.Author;
import com.hcjeon.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "ss";
    }

    @GetMapping("/books")
    @JsonView(BookViewClass.Complex.class)
    public List<Book> getBooks() {
        return books();
    }

    private List<Book> books() {
        Author author = new Author();
        author.setFirstName("Jeon");
        author.setLastName("HongChan");
        author.setEmail("email.com");
        author.setId(0001L);
        author.setAddress("address");
        author.setJoinedDate(new Date());

        HashSet<Author> authors = new HashSet<>();
        authors.add(author);

        Book book = new Book();
        book.setId(01L);
        book.setTitle("book title");
        book.setIsbn("ISBL");
        book.setPublished(new Date());
        book.setAuthors(authors);

        return Arrays.asList(book);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
