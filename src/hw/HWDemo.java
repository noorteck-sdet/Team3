package hw;

import java.util.ArrayList;

public class HWDemo {

	// Instruction: Each team member pushes at least once by adding 1 method
	// Practice Cloning, Pulling, Pushing, Stashing

	public static void main(String[] args) {

		System.out.println("Dogs are the best");// Ellen
		System.out.println("Hello GitHub....");// Akbar is Comment
		// System.out.println("Hello GitHub....");// Akbar is Comment 1111111

		// java is fun

		// i like java

		// this is going well--Brian

		// Ahmed Aly added this ArrayList
		ArrayList<String> marketTeam3 = new ArrayList<>();

		marketTeam3.add("Ahmed");
		marketTeam3.add("Alishan");
		marketTeam3.add("Brian");
		marketTeam3.add("Cindy");
		marketTeam3.add("Kamy");
		marketTeam3.add("Ellen");
		marketTeam3.add("Jackie");
		marketTeam3.add("Sabina");
		marketTeam3.add("Ehsan");
		marketTeam3.add("Akbar");
		marketTeam3.add("Kayla");
		marketTeam3.add("Soli");
		marketTeam3.add("Faraz");
		System.out.println(marketTeam3);

		// I can't wait to hit the market Ahmed "coming from gitHub"

		HWDemo obj = new HWDemo();

		System.out.println(obj.isEven(8));
		System.out.println(obj.isEven(3));
		System.out.println(obj.isEven(9));

		hw();

	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void dog(String bark) {

		System.out.println("bark");
		// Alishan added this
	}

	// Solia
	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void num(String name) {

		// this is from Git to java, Alishan

	}

	public boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		return false;
	}

	// pulling from GitHub

	public static void multiply(int c, int d) {
		System.out.println(c / d);

		// hello from Git - Sabina
	}

	public static void GitHub(int a, String git) {
		System.out.println(a + "git");// Brian did this
	}

	public static void divide(int e, int f) {
		System.out.println(e / f);// Ellen

		// stashing again

		// pulling from Git

		System.out.println("Sunday Funday");// Ellen
	}

	// Git to Java--Brian
	String str = "We're going to crush it!";

	public static void jobMarket(String str) {

		System.out.println(str);
	}
	// Hope Everything Is Good SOLIANA

	// Kayla is pushing to team 3
	// pulling from GitHub

	public void comment() {
		System.out.println("Demo Comment");
		// Print Demo Comment

	}

	public void myMethod() {
		System.out.println("Demo Method");

		// print Demo Method
	}

	// Kayla is pushing to team 3

	// kayla making changes
	// Cats are the best!!!!

	// Kamy's note
	// Kamy's note coming from Github

	// Akbar Start Practicing

	public static final String hw() {
		return "Homework is done...";

		// Made some final changes before we wrap up this homework... good job everyone! -Ehsan
	}

}
