import java.util.Scanner;
public class BloodDonation
{
  public static void main(String[] args)
  {
    int age,wgt;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your age :");
	age=sc.nextInt();
	System.out.print("Enter your weight :");
	wgt=sc.nextInt();
	if(age>=25)
	{
	  if(wgt>=48)
	System.out.print("Eligible to donate blood");
	else
	System.out.print("Not eligible to donate blood");
	}
  }
}