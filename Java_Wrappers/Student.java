package Wrapper.Lab;

import java.util.Scanner;


public class Student {
long studentId;
char studentGrade;
double monthlyFees, Fees;
boolean isScholarshipEligible;

	//this method will calculate Fees exempted
		public void calculateFeesStructure(Long studentId,Character studentGrade,Double monthlyFees,Boolean isScholarshipEligible) {
			if (studentId!=0 && studentGrade=='A' && isScholarshipEligible==true) {
				Double Fees = (monthlyFees -monthlyFees *10/100);//logic
				System.out.println("Grade:"+studentGrade);
				System.out.println("Monthly Fees:"+monthlyFees);
				System.out.println("10% of Fees is exempted, the calculated Fees is : "+Fees);
			}
			else if (studentId!=0 && studentGrade=='B' && isScholarshipEligible==true) {
				Double Fees = (monthlyFees -monthlyFees *8/100);//logic
				System.out.println("Grade:"+studentGrade);			
				System.out.println("Monthly Fees:"+monthlyFees);
				System.out.println("8% of Fees is exempted, the calculated Fees is : "+Fees);
			}
			else if (studentId!=0 && studentGrade=='C' && isScholarshipEligible==true) {
				Double Fees = (monthlyFees -monthlyFees *6/100);//logic
				System.out.println("Grade:"+studentGrade);			
				System.out.println("Monthly Fees:"+monthlyFees);
				System.out.println("6% of Fees is exempted, the calculated Fees is : "+Fees);
			}
			else if (studentId!=0 && studentGrade=='D' && isScholarshipEligible==true) {
				Double Fees = (monthlyFees -monthlyFees *4/100);//logic
				System.out.println("Grade:"+studentGrade);		
				System.out.println("Monthly fess:"+monthlyFees);
				System.out.println("4% of Fees is exempted, the calculated Fees is : "+Fees);
			}
			else {
				System.out.println("Grade:"+studentGrade);	
				System.out.println("Not Eligible for Exemption");
			}
		}
		//create a method for compare marks
	public void	compareMarks(Long Maths,Double English) {
		
		if(Maths>English) {
			System.out.println("Maths mark is higher than English");
		}
		else if(Maths<English) {
			System.out.println("English mark is higher than Maths");
		}
		else {
			System.out.println("Both Are Equal");
		}
	}
	//create a method to validate Fees
	public void validateFees(Double Fees) {
		if(Fees.isInfinite()) {//logic
			System.out.println("Fees is infinite");
		}
		else {
			System.out.println("Fees is not infinite");
		}
	}
		
		//main method
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
//			
			Student s=new Student();
			s.calculateFeesStructure((long)254, 'C', (double)600.0, true );
			s.calculateFeesStructure((long)115, 'B', (double)909.50, true );
			s.calculateFeesStructure((long)980, 'G', (double)1810, false );
			
			System.out.println("Comparing marks");
			System.out.println("Enter marks of english:");
			double english =sc.nextDouble();
		   System.out.println("Enter marks of math:");
		    long maths =sc.nextLong();
		    s.compareMarks(maths, english);
		    
		    System.out.println("Validating");
		    System.out.println("Enter fess :");
		    double Fees=sc.nextDouble();
		    s.validateFees(Fees);
			

		}

	}