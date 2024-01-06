package hw;

import java.util.ArrayList;

public class HWDemo {

	// Instruction: Each team member pushes at least once by adding 1 method
	// Practice Cloning, Pulling, Pushing, Stashing

	public static void main(String[] args) {

		
		System.out.println("Dogs are the best");
		
		// java is fun
		
		// i like java
		
		// this is going well--Brian
		
		//Ahmed Aly added this ArrayList
				ArrayList <String> marketTeam3 = new ArrayList <> (); 

			marketTeam3.add("Ahmed");
			marketTeam3.add("Alishan");
			marketTeam3.add("Brian");
			marketTeam3.add("Cindy");
			marketTeam3.add("Kamy");
			marketTeam3.add("Ellen");
			marketTeam3.add("Jackie");
			marketTeam3.add("Sabina");
			marketTeam3.add("Ehsen");
			marketTeam3.add("Akbr");
			marketTeam3.add("Kayla");
			marketTeam3.add("Soli");
			marketTeam3.add("Faraz");
	System.out.println(marketTeam3);

				
		
       //I can't wait to hit the market Ahmed "coming from gitHub"
		
		HWDemo obj = new HWDemo();
		
		System.out.println(obj.isEven(8));
		System.out.println(obj.isEven(3));
		System.out.println(obj.isEven(9));

	}
	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void dog(String bark) {

		System.out.println("bark");
	// alishan added this
	}
	//Solia
	public static void add(int a, int b){
		System.out.println(a+b); 
	} 
	
	public static void num(String name) {

		// this is from git to java, alishan
		
	}
	
	public boolean isEven(int num) {
		if(num%2==0) return true;
		return false;
	}
	//all the line spacing in the code drives me nuts! -Ellen
}
