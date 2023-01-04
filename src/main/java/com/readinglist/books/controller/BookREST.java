package com.readinglist.books.controller;
import com.readinglist.books.model.Book;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public interface BookREST {

    @GetMapping
    List<Book> getAllBooks();

    @GetMapping("/{id}")
    Book getBookById(@PathVariable Long id);

    @PostMapping
    Book addBook(@RequestBody Book book);

    @PostMapping("/{id}")
    Book updateBook(@PathVariable Long id, @RequestBody Book book);

    @DeleteMapping("/{id}")
    void deleteBook(@PathVariable Long id);
}
