

import java.util.Scanner;
 public class Switchcase {
public static void main(String[] args) {
//taking input from user
Scanner sc=new Scanner(System.in);
System.out.print ("Enter name:");
String name=sc.nextLine();
sc.close(); 
//switch case statement
switch(name){
case "nakul":System.out.println("switch case is easy for nakul"); 
break;
case "vidyut":System.out.println("switch case is easy for vidyut"); 
break;
case "rakesh":System.out.println("switch case is easy for rakesh");
break;
case "sam":System.out.println("switch case is for sam");
break;
case "amit":System.out.println("switch case is easy for virat");
break;
case "parul":System.out.println("switch case is easy for parul");
break;
default:System.out.println("name not match");
}
}
}