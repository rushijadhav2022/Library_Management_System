package com.service_implementation;

import java.util.*;
import java.util.Map.Entry;

import com.service.Book;
import com.service.Book_Notfound_Exception;
import com.service.Library_Management;

public class Library_service_implementation implements Library_Management {

	HashMap<Integer, Book> hs = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addBook() {
		System.out.println("Pls enter the size of Book");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter the Id of book");
			int id = sc.nextInt();
			System.out.println("Please enter the title of book");
			String title = sc.next();
			System.out.println("Please enter the author of book");
			String author = sc.next();
			System.out.println("Please enter the Genre of book");
			String genre = sc.next();
			System.out.println("Please enter the year of book");
			int year = sc.nextInt();
			System.out.println("Please enter the quantity of book");
			int quantity = sc.nextInt();

			hs.put(id, new Book(title, author, genre, year, quantity));

		}
		System.out.println(hs);
	}

	@Override
	public void removeBook() {
		System.out.println("Please enter id of book to remove");
		int ids = sc.nextInt();
		if (hs.isEmpty()) {
			throw new Book_Notfound_Exception();
		} else if (hs.containsKey(ids)) {
			Set<Integer> key = hs.keySet();
			System.out.println(key);
			Iterator<Integer> itr = key.iterator();
			while (itr.hasNext()) {
				Integer i = itr.next();
				if (ids == i) {
					itr.remove();
					System.out.println("Removed Successfully........");
				}
			}

		} else {
			throw new Book_Notfound_Exception();
		}
	}

	@Override
	public void searchByTitle() {
		System.out.println("Please enter the title to search book");
		String title = sc.next();
		if (hs.isEmpty()) {
			throw new Book_Notfound_Exception();
		} else if (hs.containsValue(title)) {
			for (Map.Entry<Integer, Book> bk : hs.entrySet()) {
				if (title.equals(bk.getValue().getTitle())) {
					System.out.println(bk.getKey() + " " + bk.getValue());
				}
			}
		}
	}

	@Override
	public void searchByAuthor() {
		System.out.println("Please enter author name to search book");
		String author = sc.next();
		for (Map.Entry<Integer, Book> bk : hs.entrySet()) {
			if (author.equals(bk.getValue().getAuthor())) {
				System.out.println(bk.getKey() + " " + bk.getValue());
			}
		}
	}

	@Override
	public void displayAllBooks() {

		for (Map.Entry<Integer, Book> bk : hs.entrySet()) {
			System.out.println(bk.getKey() + " " + bk.getValue());
		}

	}

	@Override
	public void booksByGenre() {
		System.out.println("Please enter genre of book to search book");
		String genre = sc.next();
		for (Map.Entry<Integer, Book> bk : hs.entrySet()) {
			if (genre.equals(bk.getValue().getGenre())) {
				System.out.println(bk.getKey() + " " + bk.getValue());
			}
		}
	}

}
