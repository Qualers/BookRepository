package com.bookrepository.view;

import com.bookrepository.service.BookService;
import com.bookrepository.service.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/books")
class BookViewController {

    @Autowired
    private BookService bookService;

    @GetMapping("/new")
    public ModelAndView getCreateBookView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("bookForm");
        modelAndView.addObject("book", new BookDTO());
        return modelAndView;
    }

    @GetMapping
    public ModelAndView getBookView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("books");
        List<BookDTO> bookDTOList = bookService.getAllBooks();
        modelAndView.addObject("books", bookDTOList);
        return modelAndView;
    }


    @PostMapping("/news")
    public String saveBook(@Valid @ModelAttribute("book") BookDTO book, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("book", book);
            return "bookForm";
        }

        bookService.createBook(book);
        return "redirect:/books";
    }
}