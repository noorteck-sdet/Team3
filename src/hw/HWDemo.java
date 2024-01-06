package hw;

import java.util.ArrayList;

public class HWDemo {

	// Instruction: Each team member pushes at least once by adding 1 method
	// Practice Cloning, Pulling, Pushing, Stashing

	public static void main(String[] args) {

		
		System.out.println("Cats are the best");
		
		// java is fun
		
		// i like java
		


		System.out.println("Cats are the best");// Ellen
		
		HWDemo obj = new HWDemo();
		
		System.out.println(obj.isEven(8));
		System.out.println(obj.isEven(3));


	}
	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void dog(String bark) {
		System.out.println("bark");

	


	}
	//Solia
	public static void add(int a, int b){
		System.out.println(a+b); 
	} 
	
	public boolean isEven(int num) {
		if(num%2==0) return true;
		return false;
	}
}
