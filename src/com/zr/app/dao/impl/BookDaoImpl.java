package com.zr.app.dao.impl;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zr.app.dao.BookDao;
import com.zr.app.domain.Book;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao{

	@Override
	public List<Book> findAll() {
		List<Book> list=	this.getHibernateTemplate().find("from Book ");
		for(Book book:list){
			System.out.println(book);
		}
		return list;
	}

	@Override
	public boolean add(Book book) {
		this.getHibernateTemplate().save(book);
		return  true;
	}

	@Override
	public Book get(int id) {
		Book book1=this.getHibernateTemplate().get(Book.class, id);
		return book1;
	}

	@Override
	public boolean update(Book book) {
		this.getHibernateTemplate().update(book);
		return true;
	}

	@Override
	public boolean delete(Book book) {
		this.getHibernateTemplate().delete(book);
		return true;
	}

	@Override
	public List<Book> listPage(final String q, final int currentPage,final int pageSize) {
	List list=this.getHibernateTemplate().executeFind(new HibernateCallback(){

		@Override
		public Object doInHibernate(Session session) throws HibernateException, SQLException {
			Query query=session.createQuery(q);
			query.setMaxResults(pageSize);
			query.setFirstResult((currentPage-1)*pageSize);
			return query.list();
		}
	});
		return list;
	}

	
}
