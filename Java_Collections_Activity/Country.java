package Lab;

import java.util.HashSet;
import java.util.Iterator;
		/* Q-1 Develop a java class with a instance variable Country HashSet (H1) add a method
		storeCountryNames(String CountryName) , the method should add the passed country to
		a HashSet (H1) and return the added HashSet(H1).*/

		public class Country {
		//creating Hashset objects
		HashSet<String> H1 = new HashSet<String>();
		//logic to add value in HashSet
		HashSet<String> storeCountryNames(String CountryName) {
		H1.add(CountryName);
			return H1;
		}
		/*Q-2 Develop a method retrieveCountry(String CountryName) which iterates through the
		HashSet and returns the country if exist else return null.*/
		
		 String retrieveCountry(String CountryName) {
			Iterator<String> itr = H1.iterator();
			
			while (itr.hasNext()) {
			if (itr.next().equals(CountryName))
				return CountryName;
			}
			return null;
		 	}
			public static void main(String[] args) {
				Country c = new Country(); //creating object
				//adding storeCountryNames method
				c.storeCountryNames("India");
				c.storeCountryNames("France");
				c.storeCountryNames("Australia");
				c.storeCountryNames("China");
				System.out.println("India: " + c.retrieveCountry("India"));
				System.out.println("UAE: " + c.retrieveCountry("UAE"));	
		}
	}