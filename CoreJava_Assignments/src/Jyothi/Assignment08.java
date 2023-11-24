package Jyothi;//Comparison Operators

public class Assignment08{

	// TODO Auto-generated method stub
	static void CO() {
		int a = 10;
		int b = 30;
		int c = 40;
		int d = a + b;

		if (c == d) {
			System.out.println("Print a=d");
		} else {
			System.out.println("Print a not equal to d");
		}
		if (a > b) {
			System.out.println("Print a>b");
		} else {
			System.out.println("Print a is less than b");
		}
		if (a < b) {
			System.out.println("Print a<b");
		} else {
			System.out.println("Print a is greater than b");
		}
		if (a >= d) {
			System.out.println("Print a>=d");
		} else {
			System.out.println("Print a is not >= d");
		}
		if (a <= d) {
			System.out.println("Print a<=d");
		} else {
			System.out.println("Print a is not <= d");
		}
	}
	public static void main(String[] args) {
		CO();
	}

}
