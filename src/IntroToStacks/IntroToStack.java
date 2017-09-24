package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	static Random rand;
	static double tempRand;
	  static double y;
	static double x;
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> stack = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for(int i=0;i<100;i++) {
			double random = (double )(Math. random() * 100);
			stack.push(random);
			System.out.println(random);
		}
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String a=JOptionPane.showInputDialog("give one number");
		String b=JOptionPane.showInputDialog("more");
		y=Integer.parseInt(a);
		x=Integer.parseInt(b);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
	System.out.println("Popping elements off stack...");
	System.out.println("Elements between 65 and 75:");
		for(int i=0;i<100;i++) {
			tempRand=stack.pop();
			
			if(tempRand<y && tempRand>x || tempRand>y && tempRand<x )
			System.out.println(tempRand);
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
