package Lab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*Q-1 Develop a java class with a instance variable CountryMap HashMap (M1) add a method
storeCountryCapital(String CountryName, String capital) , the method should add the
passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country Value - Capital
India Delhi
Japan Tokyo*/
public class CountryMap {
		//creating Hashmap objects
	 	HashMap<String, String> M1= new HashMap<String, String>();
	 	HashMap<String,String> M2 = new HashMap<String, String>();
		public void storeCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital); //logic to adding values in HashMap
		}
		/*Q-2 Develop a method retrieveCapital(String CountryName) which returns the capital for the
		country passed from the Map M1 created in step 1.*/
		void retrieveCapital(String CountryName) {
			for(Map.Entry m : M1.entrySet()) {
				System.out.println(m.getKey());
			}
		}
		/*Q-3 Develop a method retrieveCountry(String capitalName) which returns the country for the
		capital name passed from the Map M1 created in step 1.*/
		void retrieveCountry(String capitalName) {
			for(Map.Entry m : M1.entrySet()) {
				System.out.println(m.getValue());
			}
		}
		/*Q-4 Develop a method which iterates through the map M1 and creates another map M2 with
		Capital as the key and value as Country and returns the Map M2.
		Key - Capital Value – Country
		Delhi India
		Tokyo Japan*/
		// Question #4
		public void NewMap() {
			for (Map.Entry<String,String> m :M1.entrySet()) {
				M2.put((String)m.getValue(), (String)m.getKey());
			}
		}
		public static void main(String[] args){ //main method
			CountryMap cm = new CountryMap(); //creating object
			
			//adding storeCountryNames method
			cm.storeCountryCapital("India","Delhi");
			cm.storeCountryCapital("Japan","Tokyo");
			System.out.println(cm.M1);
			//storing elements in M2
			cm.NewMap();
			System.out.println(cm.M2);
		}
	}