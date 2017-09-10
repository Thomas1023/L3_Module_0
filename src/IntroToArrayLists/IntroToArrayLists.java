package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> words = new ArrayList<String>();
		//2. Add five Strings to your list
		words.add("teaki");
		words.add("ramen");
		words.add("code");
		words.add("keybord");
		words.add("space");
		System.out.println("for");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		System.out.println("each");
		//4. Print all the Strings using a for-each loop
		for(String j : words){
			System.out.println(j);
			
		}
		System.out.println("even");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < words.size(); i++) {
			if(i%2==0)
			System.out.println(words.get(i));
		}
		System.out.println("reverce");
		//6. Print all the Strings in reverse order.
		for (int i = words.size()-1; i > 0 ; i--) {
			System.out.println(words.get(i));
		}
		System.out.println("with e");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).contains("e")) {
				System.out.println(words.get(i));
			}
			
		}
	}
}
