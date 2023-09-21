package com.example.demo.rest;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookRestController {

    private BookService bookService;


    public BookRestController(BookService theBookService) {
        bookService = theBookService;
    }

    @GetMapping("/book")
    public List<Book> findAll(){
        return bookService.findAll();
    }


    @GetMapping("/book/{bookId}")
    public Book getBook(@PathVariable int bookId){
        Book theBook=bookService.findById(bookId);
        if(theBook == null){
            throw new RuntimeException("Book is not found"+bookId);
        }
        return theBook;
    }

    @PostMapping("/book")
    public Book theBook(@RequestBody Book theBook){


        theBook.setId(0);

        Book dbBook = bookService.save(theBook);
        return dbBook;
    }

    @PutMapping("/book")
    public  Book updateBook (@RequestBody Book theBook){
        Book dbBook = bookService.save(theBook);
        return dbBook;
    }

    @DeleteMapping("/book/{bookId}")
    public String deleteBook (@PathVariable int bookId){
        Book tempBook = bookService.findById(bookId);


        if(tempBook == null){
            throw new RuntimeException("Book is not found " + bookId);
        }

        bookService.deleteById(bookId);
        return "The deleted book - " + bookId;
    }
}
