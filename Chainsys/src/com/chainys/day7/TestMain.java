package com.chainys.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		List<Library> al=new ArrayList<Library>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the BookId");
		String id=sc.next();
		id = Validation.validateId(id);
		System.out.println("Enter the Books Name");
		String bookName=sc.next();
		bookName=Validation.validateWord(bookName);
		System.out.println("Enter the Author Name");
		String author=sc.next();
		author=Validation.validateWord(author);
		System.out.println("Enter Value in date Format (DD-MM-YYYY)");
		String date=sc.next();
		date=Validation.validateDate(date);
		Library lib1=new Library(id,bookName,author,date);
		al.add(lib1);
		Library lib2=new Library();
		lib2.setBookId("1");
		lib2.setBookName("One Piece");
		lib2.setAuthor("Oda Sensai");
		lib2.setDateOfPublish("20/45/1997");
		al.add(lib2);
		al.forEach(item -> System.out.println(item));
		sc.close();
	}
}
