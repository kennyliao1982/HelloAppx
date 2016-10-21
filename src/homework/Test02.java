package homework;

public class Test02 {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("i : " + i);
		System.out.println("++i : " + ++i); // Pre-increment
		System.out.println("i++ : " + i++); // Post-increment
		System.out.println("i : " + i);
		System.out.println("--i : " + --i); // Pre-decrement
		System.out.println("i-- : " + i--); // Post-decrement
		System.out.println("i : " + i);

		System.out.println("ac123" == "ac123");

		int t = 0;
		for (int ii = 0; ii < 5; ii++) {
			t++;
			for (int j = 0; j < ii + t; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
