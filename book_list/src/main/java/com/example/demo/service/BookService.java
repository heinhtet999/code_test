package com.example.demo.service;

import com.example.demo.entity.Book;


import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book findById(int theId);

    Book save(Book thBook);

    void deleteById(int theId);
}
