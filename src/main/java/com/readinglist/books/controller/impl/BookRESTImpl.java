package com.readinglist.books.controller.impl;
import com.readinglist.books.controller.BookREST;
import com.readinglist.books.model.Book;
import com.readinglist.books.service.BookService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRESTImpl implements BookREST {

    private final BookService bookService;

    public BookRESTImpl(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @Override
    public Book getBookById(Long id) {
        return bookService.getBookById(id);
    }

    @Override
    public Book addBook(Book book) {
        return bookService.addBook(book);
    }

    @Override
    public Book updateBook(Long id, Book book) {
        return bookService.updateBook(id, book);
    }

    @Override
    public void deleteBook(Long id) {
        bookService.deleteBook(id);
    }
}
