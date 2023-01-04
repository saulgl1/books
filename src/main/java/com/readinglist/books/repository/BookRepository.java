package com.readinglist.books.repository;
import com.readinglist.books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    // Custom methods go here...
}

