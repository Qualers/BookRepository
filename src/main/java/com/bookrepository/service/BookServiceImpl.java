package com.bookrepository.service;

import com.bookrepository.data_access.BookRepository;
import com.bookrepository.data_access.entity.Book;
import com.bookrepository.service.dto.BookDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;
    private final BookRepository bookRepository;

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = bookMapper.mapToEntity(bookDTO);
        book.setId(null);
        Book savedBooks = bookRepository.save(book);
        return bookMapper.mapToDTO(savedBooks);
    }

    @Override
    public List<BookDTO> getAllBooks() {

        List<Book> allBooks = bookRepository.findAll();
        return allBooks.stream()
                .map(bookMapper::mapToDTO)
                .collect(Collectors.toList());
    }
}