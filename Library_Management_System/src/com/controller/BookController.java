package com.controller;

import com.service.Book_Notfound_Exception;
import com.service_implementation.Library_service_implementation;

public class BookController {

	public Library_service_implementation ls;

	public BookController() {
		super();
		this.ls = new Library_service_implementation();
	}

	public void operation(int option) {
		switch (option) {

		case 1:
			ls.addBook();
			break;
		case 2:
			try {
				ls.removeBook();
			} catch (Book_Notfound_Exception e) {
				e.getMessage();
			}
			break;
		case 3:
			ls.searchByTitle();
			break;
		case 4:
			ls.searchByAuthor();
			break;
		case 5:
			ls.displayAllBooks();
			break;
		case 6:
			ls.booksByGenre();
			break;
		default:
			System.out.println("Invalid option");

		}

	}
}
