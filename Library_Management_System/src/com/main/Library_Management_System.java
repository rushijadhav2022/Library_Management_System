package com.main;

import java.util.Scanner;

import com.controller.*;

public class Library_Management_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookController bc = new BookController();
		System.out.println("Welcome to library management system");
		char ch;
		do {
			System.out.println("Press 1 to add book");
			System.out.println("Press 2 to remove book");
			System.out.println("Press 3 to search book by title");
			System.out.println("Press 4 to search book by author");
			System.out.println("Press 5 to display book list");
			System.out.println("Press 6 to search book by genre");
			System.out.println("Please enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				bc.operation(1);
				break;
			case 2:
				bc.operation(2);
				break;
			case 3:
				bc.operation(3);
				break;
			case 4:
				bc.operation(4);
				break;
			case 5:
				bc.operation(5);
				break;
			case 6:
				bc.operation(6);
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue : y | n ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		System.out.println("Thanks for using application.........");

	}

}
