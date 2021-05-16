package com.service;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pojos.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
