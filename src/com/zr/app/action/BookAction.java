package com.zr.app.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zr.app.domain.Book;
import com.zr.app.service.BookService;

public class BookAction extends BaseAction implements ModelDriven<Book>{
	private Book book=new Book();
	private String nextPage;
	private BookService bookservice;
	private int currentPage;
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public void setBookservice(BookService bookservice) {
		this.bookservice = bookservice;
	}
	public String getNextPage() {
		return nextPage;
	}
	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}
	
	public String find(){
		//当前页
		int currentPage=1;
		//每页显示的条数
		int pageSize=5;
		if(this.currentPage!=0){
			currentPage=this.currentPage;
		}
		List<Book> list1=this.bookservice.listPage("from Book",currentPage, pageSize);
		//总记录数
		int totalCount=this.bookservice.findAll().size();
		//总页数
		int totalPage=(totalCount%pageSize==0)?totalCount/pageSize:totalCount/pageSize+1;
		
			request.put("totalCount", totalCount);
			request.put("totalPage", totalPage);
			request.put("currentPage", currentPage);
			request.put("pageSize", pageSize);
			request.put("list1", list1);
			
		
		this.nextPage="findall.jsp";
		return "ff";
	}
	
	public String add(){
		if(this.bookservice.add(book)){
			this.nextPage="addsucc.jsp";
			return "add";
		}else{
		this.nextPage="addfail.jsp";
		return "addfail";
		}
	}
	public String preupdate(){
		System.out.println(book.getId());
		Book book1=this.bookservice.findById(book.getId());
		System.out.println(book1);
		if(book1!=null){
			request.put("book1", book1);
			this.nextPage="updatebook.jsp";
			return "update";
		}else{
		this.nextPage="findall.jsp";
		return "updatefail";
		}
	}
	public String update(){
		boolean dd=this.bookservice.update(book);
		if(dd){
			this.nextPage="findall.jsp";
			return "updatesucc";
		}else{
			this.nextPage="updatefail.jsp";
		return "updatefail";
		}
	}
	public String predelete(){
		
		Book book1=this.bookservice.findById(book.getId());
		
		if(book1!=null){
			request.put("book1", book1);
			this.nextPage="deletebook.jsp";
			return "delete";
		}else{
		this.nextPage="findall.jsp";
		return "deletefail";
		}
	}
	public String delete(){
		boolean ii=this.bookservice.delete(book);
		if(ii){
				this.nextPage="findall.jsp";
				return "deletesucc";
	    }else{
		this.nextPage="deletefail.jsp";
		return "deletefail";
	}
	}
	
	@Override
	public Book getModel() {
		// TODO Auto-generated method stub
		return book;
	}

}
