package com;
/*
@author: Arnab Kumar Hoodati
*/
public class AdultUser implements LibraryUser {	//create class which implements the interface
	//Two instance variables
	private int age;
	private String bookType;
	
	public void setAge(int age) {	//setter method of age
		this.age = age;
	}
	public int getAge() {	//getter method of age
		return age;
	}
	public void setBookType(String bookType) {	//setter method of Book Type
		this.bookType = bookType;
	}
	public String getBookType() {	//getter method of Book Type
		return bookType;
	}
	public void registerAccount() {	//Method 1
		if(age>12)	//condition
			System.out.println("You have successfully registered under an Adult Account");	// massage displaying
		if(age<12)	//condition
			System.out.println("Sorry, Age must be greater than 12 to register as an adult" );	// massage displaying
	}
	public void requestBook() {	//Method 2
		if(bookType.equals("Fiction"))	//Define book type
			System.out.println("Book Issued successfully, please return the book within 7 days");	// massage displaying
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");	// massage displaying
		
	}	
}
