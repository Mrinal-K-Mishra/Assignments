package com;
public class Employees {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	
	Employees(long id, String name, String address, long phone) {
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
		
	}
	
	void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println(salary);
	}
	
//	void display() {
//		System.out.println(employeeId + " " + employeeName + " " + employeeAddress + " " + employeePhone);
//	}
	
	void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;
		System.out.println(transportAllowance);
	}

}

class Manager extends Employees {
	
	Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		basicSalary = salary;
	}
	
	void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		
		System.out.println(transportAllowance);
	}
	
//	void display() {
//		System.out.println(employeeId + " " + employeeName + " " + employeeAddress + " " + employeePhone + " " + basicSalary);
//	}

}

class Trainee extends Employees {
	Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		basicSalary = salary;
	}
	
}