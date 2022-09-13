
//Check the given number is positive or negetive or zero

import java.util.Scanner;

public class PositiveNegetiveZero {
	public static void main(String[] args) {

        int num;		//Declaring variables

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number:");
        num = sc.nextInt();
        
        if(num>0) {		//condition statement
        	System.out.println("The number is Positive");
        }else if(num<0) {
        	System.out.println("The number is Negetive");
        }else {
        	System.out.println("The number is Zero");
        }

}
}