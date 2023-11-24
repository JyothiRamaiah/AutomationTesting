package Jyothi;

public class Assignment24 {

	public static void main(String[] args) {

		int a = 6;
		int b = 10;

		if (a > 5 || b == a) {
			System.out.println("False");
		}
		if (a == b && b == 10) {
			System.out.println("False1"); // Both statement are false so not enter into block
		}
		if (!(a == b && b >= 6)) {
			System.out.println("True");
		}
		if (!(a == b && b >= 6)) {
			System.out.println("True1");

		}
	}
}