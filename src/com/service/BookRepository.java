package com.service;


import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Book;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(value ="SELECT B.id, B.name, B.author, B.price from Book B where B.id = ?1", nativeQuery = true)
    Book retrieveBookById(Long bookId);
}
