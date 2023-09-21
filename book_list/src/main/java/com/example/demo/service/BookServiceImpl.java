package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository theBookRepository) {
         bookRepository = theBookRepository ;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int theId) {
        Optional<Book> result = bookRepository.findById(theId);
        Book theBook=null;
        if (result.isPresent()){
            theBook=result.get();
        }
        else {

            throw new RuntimeException("Didn't found book" + theId);
        }

        return theBook;
    }

    @Override
    public Book save(Book thBook) {
        return bookRepository.save(thBook);
    }

    @Override
    public void deleteById(int theId) {
        bookRepository.deleteById(theId);

    }
}
