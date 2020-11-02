package com.bookrepository.data_access;

import com.bookrepository.data_access.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer> {
}
