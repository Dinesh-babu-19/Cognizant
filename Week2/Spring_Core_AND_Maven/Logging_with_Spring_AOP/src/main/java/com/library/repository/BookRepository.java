package com.library.repository;

public class BookRepository {

    public void getBookDetails() {

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fetching book details from repository...");
    }
}