package com.service;

public class Book_Notfound_Exception extends RuntimeException {

	public Book_Notfound_Exception() {
		System.out.println("No record found");
	}

	public Book_Notfound_Exception(String msg) {
		super(msg);
	}

}
