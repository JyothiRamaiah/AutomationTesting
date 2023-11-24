package Jyothi;

class Hierachical_inheritance {

	public void Methd_1() {
		System.out.println("Non static method");
	}

	public static void Methd_2() {
		System.out.println("static method");
	}
}
public class Assignment31 extends Hierachical_inheritance {
	public static void main(String[] args) {
		System.out.println("Main method ");//only one child will execute
		Assignment31 a1=new Assignment31();
		a1.Methd_1();
		Methd_2();
	}

	public class Assignment31_1 extends Hierachical_inheritance {
		public static void main(String[] args) {
			System.out.println("Main method 1");

		}}

		public class Assignment31_2 extends Hierachical_inheritance {
			public static void main(String[] args) {
				System.out.println("Main method 2");
		}}

			public class Assignment31_3 extends Hierachical_inheritance  {
				public static void main(String[] args) {
					System.out.println("Main method 3");

				}}
}

