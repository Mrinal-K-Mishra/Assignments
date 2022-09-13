package Lab;

import java.util.HashMap;

public class CountryCapital {
	public static void main(String[] args) {
		CountryMap cm = new CountryMap();
		cm.storeCountryCapital("India", "Delhi");
		cm.storeCountryCapital("Japan", "Tokyo");
		System.out.println(cm.retrieveCapital("India"));
		System.out.println(cm.retrieveCountry("Tokyo"));
		System.out.println(cm.toArrayList());
		HashMap<String, String> M2 = cm.swapKeyValue();
		System.out.println(M2);
	}
}