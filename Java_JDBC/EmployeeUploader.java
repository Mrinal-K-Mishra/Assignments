package Jdbc.Lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeUploader {
	int Department_ID, Employee_Id, Employee_Salary;
	String Department_Name, Department_Head, Department_Description, Employee_Name, Employee_Address;
	long Employee_Contact_No;
	double PF;
	//create method for storing department details
	public void storeDepartmentDetails()  throws SQLException, Exception{
		//creating scanner object of user input
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		
		System.out.println("Enter Department Id: ");
		Department_ID = sc1.nextInt();
		
		System.out.println("Enter department name: ");
		Department_Name = sc2.nextLine();
		
		System.out.println("Enter department head: ");
		Department_Head = sc3.nextLine();
		
		System.out.println("Enter department description: ");
		Department_Description = sc4.nextLine();
		//get connection from helper class
		Connection conn = Helper.con();
		//creating statement
		PreparedStatement pst = conn.prepareStatement("insert into department values(?,?,?,?)");
		//execute query fetch data from database
		ResultSet rs = pst.executeQuery("select Department_ID from department where Department_ID = "+Department_ID);
		while(rs.next()) { 	//iteration
			Department_ID=rs.getInt(1);
		}
		//Problem # 5: Exception Scenarios for department
		if(Department_ID!=Department_ID){	//condition
			throw new departmentNotPresentException ("Department does not exists");
		}
		else {
		//query for store department details in database
		pst.executeUpdate("insert into department values("+Department_ID+", '"+Department_Name+"', '"+Department_Head+"', '"+Department_Description+"')");
		
		System.out.println("Deprtment details stored ...");
		}
		//close database connection
		pst.close();
		conn.close();
		rs.close();
	}
	//creating a method for store employee details 
	public void storeEmployeeDetails() throws SQLException,Exception{
		//creating scanner object for user input
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		Scanner scan5 = new Scanner(System.in);
		Scanner scan6 = new Scanner(System.in);
		
		System.out.println("Enter employee id: ");
		Employee_Id = scan1.nextInt();
		
		System.out.println("Enter employee name: ");
		Employee_Name = scan2.nextLine();
		
		System.out.println("Enter employee salary: ");
		Employee_Salary = scan3.nextInt();
		
		System.out.println("Enter employee contact no. : ");
		Employee_Contact_No = scan4.nextLong();
		
		System.out.println("Enter employee address: ");
		Employee_Address = scan5.nextLine();
		
		System.out.println("Enter department id: ");
		Department_ID = scan6.nextInt();
		
		//get connection from helper class
		Connection conn = Helper.con();
		//creating statement
		PreparedStatement pst = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
		//execute query fetch data from database
		ResultSet rs = pst.executeQuery("select Employee_Id, Employee_Name, Employee_Contact_No, Employee_Salary, Employee_Address from employee where Employee_Id="+Employee_Id);
		while(rs.next()) {	//iteration
			
			Employee_Id = rs.getInt(1);
			Employee_Name = rs.getString(2);
			Employee_Contact_No = rs.getInt(3);
			Employee_Salary = rs.getInt(4);
			Employee_Address = rs.getString(5);
		}
		//Problem # 5: Exception Scenarios for employee
		if((Employee_Id!=Employee_Id) || (Employee_Name!=Employee_Name) || (Employee_Contact_No!=Employee_Contact_No)){
			throw new duplicateDataException("Employee already exists");
		}
		if(Employee_Salary<1000) {	//Problem # 5: Exception Scenarios for employee salary
			throw new lessSalaryAmountException("Salary should not be less than 1000 !!");
		}
		else {
		//query for store employee details in database
		pst.executeUpdate("insert into employee values("+Employee_Id+", '"+Employee_Name+"', "
		+Employee_Salary+", "+Employee_Contact_No+", '"+Employee_Address+"', "+Department_ID+")");
		
		System.out.println("Employee details stored...");
		}
		//close database connection
		pst.close();
		conn.close();
		rs.close();
	}
		//create a method for retrieve employee details
		public void retrieveEmployeeDetails() throws SQLException{
			
			Scanner sc = new Scanner(System.in);	//creating scanner object for user input
			System.out.println("Enter Employee Id : ");
			Employee_Id = sc.nextInt();
			//get connection from helper class
			Connection conn = Helper.con();
			//creating statement
			PreparedStatement pst = conn.prepareStatement("insert into employee values(?,?,?,?)");
			//execute query fetch data from database
			ResultSet rs = pst.executeQuery("select Employee_Id, Employee_Name, Employee_Contact_No, Employee_Address, Department_Name, Department_Head from employee, department where Employee_Id="+Employee_Id);
			while(rs.next()) {	//iteration
				Employee_Id = rs.getInt(1);
				Employee_Name = rs.getString(2);
				Employee_Contact_No = rs.getInt(3);
				Employee_Salary = rs.getInt(4);
				Employee_Address = rs.getString(5);
				Department_Name = rs.getString(5);
				Department_Head = rs.getString(6);
			}
			if(Employee_Id==0) {	//condition
				System.out.println("Employee ID not found...");
			}else {				
				System.out.println("Employee Id ='"+Employee_Id+"', Employee name ='"+Employee_Name+"', "
						+ "Employee contact no. ='"+Employee_Contact_No+"', Employee address='"+Employee_Address+"', "
						+ "Department name='" +Department_Name+ "', Department head='"+Department_Head+"'");
			}
			//close database connection
			pst.close();
			conn.close();
			rs.close();
	}
		//creating a method for calculate PF
		public void calculatePF() throws SQLException{
			//creating scanner object for user input
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Employee Id : ");
			Employee_Id =s.nextInt();
			//get connection from helper class
			Connection conn = Helper.con();
			//creating statement
			PreparedStatement pst = conn.prepareStatement("insert into employee values(?,?)");
			//execute query fetch data from database
			ResultSet rs = pst.executeQuery("select Employee_Id, Employee_Salary from employee where Employee_Id = "+Employee_Id);
			while(rs.next()) {	//iteration
				Employee_Id = rs.getInt(1);
				Employee_Salary = rs.getInt(2);	
			}
			if(Employee_Id==0) {	//condition
				System.out.println("Employee ID not present...");
			}else {				
				if((Employee_Salary>=1000)&&(Employee_Salary<=10000)) {
					PF = Employee_Salary*0.05;
				}
				if((Employee_Salary>=10000)&&(Employee_Salary<=100000)) {
					PF = Employee_Salary*0.06;
				}
				if(Employee_Salary>100000) {
					PF = Employee_Salary*0.07;
				}
				System.out.println("Employee PF amount is: "+PF);
			}
			//close database connection
			pst.close();
			conn.close();
			rs.close();
		}
	}