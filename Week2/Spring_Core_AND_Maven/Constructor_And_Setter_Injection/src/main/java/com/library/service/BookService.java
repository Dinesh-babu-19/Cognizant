package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository constructorRepository;
    private BookRepository setterRepository;

    // Constructor Injection
    public BookService(BookRepository constructorRepository) {
        this.constructorRepository = constructorRepository;
        System.out.println("Constructor Injection Performed");
    }

    // Setter Injection
    public void setSetterRepository(BookRepository setterRepository) {
        this.setterRepository = setterRepository;
        System.out.println("Setter Injection Performed");
    }

    public void displayBookDetails() {

        System.out.println("Using Constructor Injected Repository:");
        constructorRepository.getBookDetails();

        System.out.println("Using Setter Injected Repository:");
        setterRepository.getBookDetails();
    }
}