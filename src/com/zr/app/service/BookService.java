package com.zr.app.service;


import java.util.List;
import com.zr.app.domain.Book;


public interface BookService {
	public List<Book>  findAll();
	public boolean add(Book book);
	public Book findById(int id);
	public boolean update(Book book);
	public boolean delete(Book book);
	public List<Book> listPage(String query, int currentPage, int pageSize);
	

}
