package com.zr.app.domain;

import java.io.Serializable;

public class Book implements Serializable{
	private Integer id;
	private String bname;
	private Double price;
	private String press;
	private String author;
	
	public Book() {
		super();
	}
	public Book(Integer id, String bname, Double price, String press, String author) {
		super();
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.press = press;
		this.author = author;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", price=" + price + ", press=" + press + ", author=" + author
				+ "]";
	}
	

}
