package com;

import java.util.Scanner; 

public class Circle {	//main class
        float radius;  
        float pi=3.5f;
        
        public Circle(){ 	//constructor 1
        	radius=1.5f;
        }
        public Circle(float radius) { 	//constructor 2
        	this.radius=radius;
        }
        public Circle(float radius, float pi){	//constructor 3
        	this.radius=radius;		// constructor chaining using constructor 2
        	this.pi=3.5f;
        }
        public float calculateArea(float radius) { 	//create a method for calculating area
        	return pi*radius*radius;
        }
        public float calculateCircumference(float radius) { 	//create a method for calculating circumference
        return 2*pi*radius;
        }
        public static void main(String[] args) {	//main method
        	Circle obj = new Circle();	//creating object of the class
        	//creating scanner object
        	Scanner sc=new Scanner(System.in);	//creating scanner object
        	System.out.println("Enter the value of radius:");	//print the line
        	float Radius = sc.nextFloat();
        	sc.close();
        	System.out.println("Area is : "+obj.calculateArea(Radius));	//displaying for radius value
        	System.out.println("Circumference is : "+obj.calculateCircumference (Radius));	//displaying for circumference value
        }
	}