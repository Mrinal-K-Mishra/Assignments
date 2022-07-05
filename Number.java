import java.util.Scanner;
public class Number
{
  public static void main(String[] args)
  {
    int no;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number :");
	no=sc.nextInt();
	if(no>0)
	System.out.print("It is positive number");
	else if(no<0)
	System.out.print("It is a negative number");
	else
	System.out.println("The number is 0");
  }
}