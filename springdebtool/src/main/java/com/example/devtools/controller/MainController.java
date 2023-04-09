package com.example.devtools.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.devtools.entities.Book;
import com.example.devtools.services.BookService;

@RestController
public class MainController {
	@Autowired
	private BookService bookService;
	@GetMapping("/books")
	public List<Book> getBook() {
		
		
		return this.bookService.getAllBook();
	}
	@GetMapping("/books/{id}")
	public Book getbookid(@PathVariable("id") int id) {
		return bookService.getBookById(id);
		
		
	}
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		
		 Book b =this.bookService.addBook(book);
		 return b;
	}
	@DeleteMapping("/books/{bookid}")
	public void dtlBook(@PathVariable("bookid") int bookid) {
		 this.bookService.dltBook(bookid);
		 
		
	}
	
	@PutMapping("/books/{bookid}")
	public Book updateBook(@RequestBody Book book ,@PathVariable("bookid") int bookid) {
		this.bookService.updateBook(book,bookid);
		return book;
		
	}
	

}
