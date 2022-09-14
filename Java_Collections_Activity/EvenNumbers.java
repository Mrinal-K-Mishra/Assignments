package Lab;

import java.util.ArrayList;
import java.util.Iterator;
//Problem Statement 1:
public class EvenNumbers {
		/*Q-1 Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store even
		numbers from 2 to N, where N is a integer which is passed as a parameter to the method
		storeEvenNumbers(). The method should return the ArrayList (A1) created.*/
		//creating A1 arrayList to store even numbers
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		ArrayList<Integer> storeEvenNumbers(int N) {
		for (int i = 2; i <= N; i=i+2) {	//loop
			 A1.add(i);
		}
		return A1;
		}
		/*Q-2 In the same class create a method printEvenNumbers()which iterates through the arrayList
		A1 in step 1, and It should multiply each number with 2 and display it in format 4,8,12….2*N.
		and add these numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be
		returned.*/
		ArrayList<Integer> printEvenNumbers() {
			ArrayList<Integer> A2 = new ArrayList<Integer>();
		for (int i : A1) {
		A2.add(i*2);
		System.out.println(i*2);
		}
		return A2;
		}
		/*Q-3 . Create a method retrieveEvenNumber(int N) parameter is a number N. This method
		should search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it
		should return the Number else return zero.*/
		Integer retrieveEvenNumber(int N) {
			Iterator<Integer> itr = A1.iterator();
			while (itr.hasNext()) {
			if (itr.next().equals(N))
				return N;
			}
			return 0;
		}
		public static void main(String[] args) {
		EvenNumbers en = new EvenNumbers(); //creating object 
		en.storeEvenNumbers(20);
		en.printEvenNumbers();
		en.retrieveEvenNumber(0);
	}
}