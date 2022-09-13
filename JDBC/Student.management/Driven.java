package Jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class Driven {     // main method
	
	public static void main(String[] args) {    // main method
		Driven dr = new Driven(); // create an object of the class
		Scanner sc = new Scanner(System.in); //creating scanner object
		int c;
		// to select what to be done from user
		do {
			System.out.println(" 1 Insert");
			System.out.println(" 2 Update");
			System.out.println(" 3 Display");
			System.out.println(" 4 Delete");
			System.out.println(" 5 Exit");
			System.out.print("Enter your choice: ");
			
			c = sc.nextInt();	// read the user input
			
			
			// switch case to choose the the operation
			switch(c) {
			// 1 Insert
			case 1: 
				
				dr.insertData();
				break;
				
				// 2 Update
				case 2:

					dr.updateData();
					break;
					
			// 3 Display
			case 3:
				
				dr.displayData();
				break;
				
			// 4 Delete	
			case 4:
				
				dr.deleteData();
				break;
				
			// 5. Exit	
			case 5:
				System.out.println("Ok good luck !");
				
			default:
				break;
			}
			
		} while (c != 5);	// condition
	}
	// declare a method for connection
	public Connection getConnection() {
		try {
			// register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// get connection 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arnabdb","root","root");
			
			return conn;
		} catch (Exception e) {	//exception handling
			System.out.println(e);
		}
		return null;
	}
	// declare a method for insert the data
	public void insertData() {
		// creating scanner objects
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		
		Student s = new Student();	// create a  object of the class
		

		System.out.print("Enter Id: ");
		s.setid(sc1.nextInt());

		System.out.print("Enter Name: ");
		s.setname(sc2.nextLine());

		System.out.print("Enter Address: ");
		s.setaddress(sc3.nextLine());

		System.out.print("Enter Phone No. : ");
		s.setphone (sc4.nextInt());
		try {
			// call getConnection() method
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arnabdb","root","root");
			//inserting data in database table
			PreparedStatement ps;
			String sql = "insert into student values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			// get all data insert into table
			ps.setInt(1, s.getid());
			ps.setString(2, s.getname());
			ps.setString(3, s.getaddress());
			ps.setLong(4, s.getphone ());
			// execute the statement
			ps.execute();
			System.out.println("inserted succesfully...");
			// close the objects
			ps.close();
			conn.close();
		// catch block	
		} catch (Exception e) {
			System.out.println("Duplicate entry!"+e);
		}
		
	}

	// create a method for display the data
	public void displayData() {
		try {
			// called getConnection() method
			Connection conn = getConnection();
			//displaying data in database table
			PreparedStatement ps = conn.prepareStatement("select * from student");
			//execute query fetch data from database
			ResultSet rs = ps.executeQuery();
			
			// traversing through table
			while (rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			// close the objects
			rs.close();
			ps.close();
			conn.close();
		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	// method to update the data
		public void updateData() {
			// created scanner object
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Scanner sc3 = new Scanner(System.in);
			Scanner sc4 = new Scanner(System.in);
			// created a student class object
			Student st = new Student();

			System.out.print("Enter ID to update: ");
			int id = sc1.nextInt();
			st.setid(id);

			System.out.print("Enter Name to update: ");
			String name = sc2.nextLine();
			st.setname(name);

			System.out.print("Enter Address to update: ");
			String address = sc3.nextLine();
			st.setaddress(address);

			System.out.print("Enter Phone No. to update: ");
			int num = sc4.nextInt();
			st.setphone (num);

			try {
				// called getConnection() method
				Connection conn = getConnection();
				//updating data in database table
				PreparedStatement ps;
				String s = "update student set ?,?,?,?";
				ps = conn.prepareStatement(s);
				
				// get all data
				ps.setString(1, st.getname());
				ps.setString(2, st.getaddress());
				ps.setInt(3, st.getphone());
				ps.setInt(4, st.getid());
				// execute for update
				int n = ps.executeUpdate();
				// closing database connection
				ps.close();
				conn.close();
				// condition to check the update done or not
				if(n==1) {
					System.out.println("Updated successfully");
				}
				else {
					System.out.println("Not updated");
				}

			} catch (Exception e) {	//exception handling
				System.out.println(e);
			}
		}
	// declare a method for delete the data
	public void deleteData() {
		try {
			
			// created a scanner object
			Scanner s = new Scanner(System.in);
			int id;
			System.out.print("Enter id which you want to delete: ");
			// read user input
			id = s.nextInt();
			// called the connection method
			Connection conn = getConnection();
			//deleting data in database table
			PreparedStatement ps = conn.prepareStatement("delete from student where id = ?");
			ps.setInt(1, id);
			
			// execute for update
			int n = ps.executeUpdate();
			// condition to check operation done or not
			if(n==1) { 
				System.out.println("Deleted successfully");
			}
			else {
				System.out.println("Data not match");
			}
			// close objects
			ps.close();
			conn.close();
		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}