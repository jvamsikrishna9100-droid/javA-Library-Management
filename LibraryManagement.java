package com.Project;

import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		System.out.println("main methos started");
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("------- LIBRARY MANNGEMNENT SYSTEM -------");
		System.out.println("DO YOU HAVE A LIBRARY CARD(YES/NO)");
		String card = sc.next();
		if (card.equalsIgnoreCase("y")) {
			System.out.println("Enter number of books already borrowed");
			int books = sc.nextInt();
			if (books > 3) {
				System.out.println("Borrowing Limit Reached");
				System.out.println("You cannot borrow another book");
			}

			else {
				System.out.println("Select  a book category :");
				System.out.println("1.Fiction");
				System.out.println("2.Scince");
				System.out.println("3.History");

				System.out.println("Enter your choice :");
				int choice = sc.nextInt();
				switch (choice) {

				case 1 -> {
					System.out.println("Category Fiction :");
					System.out.println("Borrowing Period is : 7 Days");
				}

				case 2 -> {
					System.out.println("Category Scince :");
					System.out.println("Borrowing Period is : 14 Days");
				}

				case 3 -> {
					System.out.println("Category History :");
					System.out.println("Borrowing Period is : 21 Days");
				}

				default -> System.out.println("Invalid Category");
				}
			}

		} else {
			System.out.println("Library card required to borrow books");

		}
		sc.close();

	}

}
