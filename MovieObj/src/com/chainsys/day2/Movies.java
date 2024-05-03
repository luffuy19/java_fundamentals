package com.chainsys.day2;

import java.util.Scanner;

public class Movies {
	public static void main(String[] args) {
		String movieName;
		String genre = "Gangster";
		String director="Quienten tarantino";
		double rating=8.9;
		boolean hasRealeased=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the movie Name");
		movieName=sc.nextLine();
		System.out.println("Movie Name : " + movieName);
		System.out.println("genre : " + genre);
		System.out.println("director : " + director);
		System.out.println("Rating : " + rating);
		System.out.println("hasRealeased : " + hasRealeased);	
	}
}
