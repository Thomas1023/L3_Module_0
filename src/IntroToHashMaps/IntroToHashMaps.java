package IntroToHashMaps;

import java.util.HashMap;

public class IntroToHashMaps {
	double square;
	public static void main(String[] args) {
		IntroToHashMaps IntroToHashMaps = new IntroToHashMaps();
		IntroToHashMaps.setup();
	}
	void setup(){
	//1. Create a HashMap called roots with Integers for the keys and Doubles for the values.
	HashMap<Integer, Double> roots = new HashMap<Integer, Double>();
	//2. Using a for-loop, add 500 entries to your HashMap. The key entry will be the 
	//   current iteration of the loop (i). The value entry will be the square root of i.
	for(int i=0; i<500 ;i++) {
		square= Math.sqrt(i);
		roots.put(i,square);
		
	}
	for(int i=0; i<500 ;i++) {
		System.out.println("The square Root of "+i+" is "+roots.get(i));
		
	}
	System.err.println(Math.sqrt(-1));
	//3. Iterate through all the entries in your HashMap displaying the keys with their respective
	//   square roots (values). Use the following format.
	
	//   The square Root of 0 is 0.0
	//   The square Root of 1 is 1.0
	//   The square Root of 2 is 1.4142135623730951
	//   The square Root of 3 is 1.7320508075688772
	}
}






