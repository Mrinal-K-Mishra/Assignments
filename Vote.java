import java.util.Scanner;
public class Vote
{
  public static void main(String[] args)
  {
    int age;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your age :");
	age=sc.nextInt();
	if(age>=18)
	System.out.print("Eligible for vote");
	else
	System.out.print("Not eligible for vote");
  }
}