package com;

import java.util.Scanner;

public class AreaCalculator {
	public static void main(String[] args) {	
		Rectangle r = new Rectangle();	
		Scanner sc = new Scanner(System.in);	
		//taking input from user
		System.out.println("Input lenght and breadth of your rectangle : ");	
		int lenght=sc.nextInt();
		int breadth=sc.nextInt();
		//output
		r.calculateArea(lenght, breadth); 	
		sc.close();
	}
}