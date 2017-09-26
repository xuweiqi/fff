package com.zr.app.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.zr.app.dao.BookDao;
import com.zr.app.domain.Book;
import com.zr.app.service.BookService;

@Transactional
public class BookServiceImpl implements BookService{
	private BookDao bookdao;

	
	public void setBookdao(BookDao bookdao) {
		this.bookdao = bookdao;
	}

	@Override
	public List<Book> findAll() {
		return this.bookdao.findAll();
	}

	@Override
	public boolean add(Book book) {
		if(this.bookdao.add(book)){
			return true;
		}else{
		return false;
		}
	}

	

	@Override
	public Book findById(int id) {
		return bookdao.get(id);
	}

	@Override
	public boolean update(Book book) {
		boolean bb=bookdao.update(book);
		if(bb){
			return true;
		}else{
		return false;
		}
	}

	@Override
	public boolean delete(Book book) {
		boolean ss=this.bookdao.delete(book);
		if(ss){
			return true;
		}else{
		return  false;
		}
	}

	@Override
	public List<Book> listPage(String query, int currentPage, int pageSize) {
		return this.bookdao.listPage(query, currentPage, pageSize);
	}


	
}
