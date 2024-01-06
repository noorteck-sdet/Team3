package hw;

public class HWDemo {

	// Instruction: Each team member pushes at least once by adding 1 method
	// Practice Cloning, Pulling, Pushing, Stashing

	public static void main(String[] args) {

		System.out.println("Dogs are the best");// Ellen

		count100();

	}

	public static void count100() {
		int count = 1;
		for (int i = 0; i < 100; i++) {
			System.out.println(count);
			count++;
		}
	}

	public void dog(String bark) {
		System.out.println("bark");

	

	}
}
