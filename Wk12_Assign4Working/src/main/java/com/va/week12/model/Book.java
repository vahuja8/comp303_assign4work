package com.va.week12.model;

public class Book {
	
	private int bookId;
	private String author;
	private String title;
	private String price;
	private String available;
	
	public int getBookId() {
		return bookId;
	}
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	public String getPrice() {
		return price;
	}
	public String getAvailable() {
		return available;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	public Book(int bookId, String author, String title, String price, String available) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.title = title;
		this.price = price;
		this.available = available;
	}


}
