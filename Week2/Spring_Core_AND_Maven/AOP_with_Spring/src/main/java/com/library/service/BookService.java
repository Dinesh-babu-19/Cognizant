package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBookDetails() {

        System.out.println("Book Service Method Started");

        bookRepository.getBookDetails();

        System.out.println("Book Service Method Completed");
    }
}