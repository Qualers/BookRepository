package com.bookrepository.service;

import com.bookrepository.service.dto.BookDTO;
import java.util.List;

public interface BookService {

    BookDTO createBook(BookDTO bookDTO);

    List<BookDTO> getAllBooks();
}