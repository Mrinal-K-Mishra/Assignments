package String;
public class StringApi {
			public static void main(String[] args) {
			String s = "Welcome to Java world";		//creates a String object
			char ss = s.charAt(5); //charAt method to take character of 5th position of index

			System.out.println("character of 5th position is:"+ss);//Returns the character at 5th position and display it.
			System.out.println("compare:"+s.compareTo("Welcome"));//comparing

			String s1=s.concat("-Let us learn"); //Concatenates to the above string

			System.out.println("After concat result:"+s1); //printing after concatenates
			System.out.println("First occurance index of "+s1.indexOf('a')); //First occurrence of "a"

			String s2=s1.replace('a', 'e'); //replace a to e 
			System.out.println("Replacing 'a' to 'e'"+s2); //printing replaced string

			System.out.println("string between 4-10 index: "+s.substring(4, 11)); //return string between 4 to 10 index
			System.out.println("lowercase: "+s1.toLowerCase());//converting to small letter

			//problem statement2
			
			StringBuffer sb = new StringBuffer("This Is StringBuffer");//declaring StringBuffer
			sb.append("This is a sample program"); //adds the string to existing string 
			System.out.println(sb);
			sb.insert(21, "object"); //Inserting the string at 21st position
			System.out.println(sb);
			sb.replace(14, 20, "Builder");//Replaces the word Buffer with Builder

			System.out.println(sb);

			sb.reverse();//reverse the string 
			System.out.println(sb);

			//problem statement 3

			StringBuilder sr = new StringBuilder("C:\\\\082\\PROGRA\\DB2COPY.EXE"); //declaring stringBuilder 
			System.out.println("Drive: "+sr.substring(0, 3)); 

			//using substring and concat method to get the result 
			System.out.println("Folders: "+sr.substring(3, 6).concat("||")+sr.substring(7,10).concat(" || ")+
					sr.substring(11,18));
			System.out.println("File:"+sr.substring(20));
			}
}

			
		