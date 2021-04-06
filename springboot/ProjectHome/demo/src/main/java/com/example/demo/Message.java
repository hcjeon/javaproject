package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Message {

    private Long id;

    private LocalDate created;

    private String title;

    private User author;

    private List<User> recipients;

    private String body;

    public Message() {
        this.created = LocalDate.now();
    }

    public Message(Long id, String title, String body, User author, User... recipients) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.recipients = Arrays.asList(recipients);
        this.body = body;
    }
}
