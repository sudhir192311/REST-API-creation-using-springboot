package com.example.devtools.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.devtools.entities.Book;
@Component
public class BookService {
	public static List<Book> list=new ArrayList<>();
	static {

		list.add(new Book(1,"sudhir","java"));
		list.add(new Book(2,"sonu","python"));
		list.add(new Book(3,"ankit","python"));
	}
	public List<Book> getAllBook(){
		return list;
	}
	
   public Book getBookById(int id) {
	   Book book=null;
	  book= list.stream().filter(e->e.getId()==id).findFirst().get();
	  return book;
	   
   }
   public Book addBook(Book e) {
	   list.add(e);
	   return e;
   }
   public void dltBook(int bid) {
	   list=list.stream().filter(e->e.getId()!=bid).
	   collect(Collectors.toList());
   }
   
   public void updateBook(Book book,int bookid) {
	   list=list.stream().map(b->{
		   if(b.getId()==bookid) {
			   
			   b.setName(book.getName());
			   b.setStatus(book.getStatus());
		   }
		   return b;
	   }).collect(Collectors.toList());
   }
   
}
