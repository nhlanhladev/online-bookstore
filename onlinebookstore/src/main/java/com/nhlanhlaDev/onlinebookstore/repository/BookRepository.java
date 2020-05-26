package com.nhlanhlaDev.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhlanhlaDev.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long > {

}
