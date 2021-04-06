//package com.example.controller;
//
//import com.example.demo.Message;
//import com.example.service.MessageService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class MessageController {
//
//    @Autowired
//    MessageService messageService;
//
//    @RequestMapping("/")
//    public List<Message> getAllMessages() {
//        return messageService.getAll();
//    }
//
//    @RequestMapping("/with-recipients")
//    public List<Message> getAllMessagesWithRecipients() {
//        return messageService.getAll();
//    }
//
//    @RequestMapping("/{id}")
//    public Message getMessage(@PathVariable Long id) {
//        return messageService.get(id);
//    }
//
//    @PostMapping("/")
//    public Message create(@RequestBody Message message) {
//        return messageService.create(message);
//    }
//}
