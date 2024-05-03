package com.chainys.day7;

public class Library {
	public String bookId;
	public String bookName;
	public String Author;
	public String dateOfPublish;
	
	public Library(String bookId, String bookName, String author, String dateOfPublish) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		Author = author;
		this.dateOfPublish = dateOfPublish;
	}
	public Library() {
		// TODO Auto-generated constructor stub
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getDateOfPublish() {
		return dateOfPublish;
	}
	public void setDateOfPublish(String dateOfPublish) {
		this.dateOfPublish = dateOfPublish;
	}
	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", bookName=" + bookName + ", Author=" + Author + ", dateOfPublish="
				+ dateOfPublish + "]";
	}
	
	
}
