package Exception;

public class CalculateSimulator {
	public static void main (String[] args) {
		TaxCalculator tc = new TaxCalculator();		//creating object of tax calculator
		System.out.println("Tax amount For John :" +tc.calculateTax("John", false, 56000));	//Test Case 1
		System.out.println("Tax amount For Clark :" +tc.calculateTax("Clark", true, 6000));		//Test Case 2
		System.out.println("Tax Amount For Ben :" +tc.calculateTax("Ben", true, 38000));	//Test Case 3
		System.out.println("Tax Amount For Null :" +tc.calculateTax(" ", true, 43000));		//Test Case 4
	}
}