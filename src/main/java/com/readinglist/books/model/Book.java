package com.readinglist.books.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "books")
@SQLDelete(sql = "UPDATE books SET deleted = true WHERE id = ?")
@Where(clause = "deleted=false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "deleted")
    private boolean deleted = Boolean.FALSE;
}

