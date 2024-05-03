package com.chainsys.day2;

public class Book {
	public static void main(String[] args) {
		{
		int serialNo=1;
		String bookName="Harry Potter";
		String dateOfPublish="19/5/1995";
		String author="JK Rowling";
		boolean hasEbookAvaidable=true;
		System.out.println("serialNo : "+serialNo);
		System.out.println("bookName : "+bookName);
		System.out.println("dateOfPublish : "+dateOfPublish);
		System.out.println("author : "+author);
		System.out.println("hasEbookAvaidable : "+hasEbookAvaidable);
		}
//		System.out.println(bookName); we can not use outside the scope
	}
}
