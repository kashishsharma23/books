package com.nagarro.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.books.entity.Book;
import com.nagarro.books.services.BookService;

@RestController
public class BooksController {
	
	
	BookService bookService=new BookService();
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}


}
