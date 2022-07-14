package com;

public interface LibraryUser {
		void registerAccount();
		void requestBook();

	}

	class KidUsers implements LibraryUser {
		int age;
		String bookType;
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setBookType(String bookType) {
			this.bookType = bookType;
		}
		
		public void registerAccount() {
			if(age<12)
				System.out.println("You have successfuly registered under a Kids Account");
			else
				System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
		public void requestBook() {
			if(bookType == "Kids" )
				System.out.println("Book issued successfully, please return the book within 10 days");
			else
				System.out.println("Oops, you are allowed to take only kids books");
		}
	}

	class AdultUsers implements LibraryUser {
		int age;
		String bookType;
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setBookType(String bookType) {
			this.bookType = bookType;
		}
		
		public void registerAccount() {
			if(age>12)
				System.out.println("You have successfuly registered under an adult Account");
			else
				System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
		public void requestBook() {
			if(bookType == "Fiction" )
				System.out.println("Book issued successfully, please return the book within 7 days");
			else
				System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	


