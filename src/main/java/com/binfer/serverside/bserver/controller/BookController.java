/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.binfer.serverside.bserver.controller;

import com.binfer.serverside.bserver.dao.BookRepository;
import com.binfer.serverside.bserver.h2.model.Book;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author samzi
 */
@RestController
public class BookController {
    
    @Autowired
    private BookRepository repository;
    
    @PostMapping("/saveBook")
    public String saveBook(@RequestBody Book book) {
        repository.save(book);
        return "Book saved...";
    }
    
    @GetMapping("/getAllBooks")
    public List<Book> getAll() {
        return repository.findAll();
    }
    
    @GetMapping("/getBook/{id}")
    public Book getBookById(@PathVariable int id) {
        return repository.findById(id);
    }
    @DeleteMapping("/deleteBook/{id}")
    public void deleteBookById(@PathVariable int id) {
        repository.deleteById(id);
    }
}
