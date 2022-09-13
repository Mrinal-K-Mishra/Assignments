package Jdbc.Lab;


import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
	try {
		EmployeeUploader e = new EmployeeUploader();
		
			// press key what you want to store
			while(true) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Press 1 for Store Department Details");
				System.out.println("Press 2 for Store Employee Details");
				System.out.println("Press 3 for Retrieve Employee Details");
				System.out.println("Press 4 for Calculate PF");
				System.out.println("Press 5 for Exit");
				System.out.print("Enter your choice: ");
				
				int ch = scan.nextInt(); //user input
				
				switch(ch) {	// switch case
				
				case 1: 
					e.storeDepartmentDetails();
					break;
					
				case 2:
					e.storeEmployeeDetails();
					break;
						
				case 3:
					e.retrieveEmployeeDetails();
					break;
					
				case 4:
					e.calculatePF();
					break;
					
				// 5. Exit	
				case 5:
					System.out.println("Good Luck !");
					scan.close();
					break;
					
				default:
					System.out.println("Retry..");
					break;
				}
				if(ch==5) {
					break;
				}
			}
	}catch(Exception e) {
		System.out.println(e);
	}

	}

}