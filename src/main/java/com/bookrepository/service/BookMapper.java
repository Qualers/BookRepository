package com.bookrepository.service;

import com.bookrepository.data_access.entity.Book;
import com.bookrepository.service.dto.BookDTO;
import org.springframework.stereotype.Component;


@Component
public class BookMapper {

    public BookDTO mapToDTO(Book book) {

        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setPublishmentyear(book.getPublishmentyear());
        bookDTO.setCategory(book.getCategory());
        return bookDTO;
    }


    public Book mapToEntity(BookDTO bookDTO) {

        Book book = new Book();
        book.setId(bookDTO.getId());
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setPublishmentyear(bookDTO.getPublishmentyear());
        book.setCategory(bookDTO.getCategory());
        return book;
    }
}