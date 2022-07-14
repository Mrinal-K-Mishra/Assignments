package com;

public class LibraryInterfaceDemo {
		public static void main(String[] args) {
			System.out.println("KidUser Class");
			System.out.println();
			KidUsers k = new KidUsers();
			k.setAge(10);
			k.registerAccount();
			k.setAge(18);
			k.registerAccount();
			
			k.setBookType("Kids");
			k.requestBook();
			k.setBookType("Fiction");
			k.requestBook();
			
			
			System.out.println("AdultUser Class");
			System.out.println();
			AdultUsers A = new AdultUsers();
			A.setAge(5);
			A.registerAccount();
			A.setAge(23);
			A.registerAccount();
			
			A.setBookType("Kids");
			A.requestBook();
			A.setBookType("Fiction");
			A.requestBook();
		}

	}


