package com.zr.app.dao;


import java.util.List;

import com.zr.app.domain.Book;

public interface BookDao {
	public List<Book> findAll();
	public boolean add(Book book);
	public Book get(int id);	
	public boolean update(Book book);
	public boolean delete(Book book);
	public List<Book> listPage(final String q, final int currentPage, final int pageSize);
}
