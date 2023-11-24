package Jyothi;

public class Assignment05 {

	 void add() {
		int a;
		a= 100;
		int b = 90;
		int c = a + b;
		System.out.println(c);
	}

	 void sub() {
		int a = 900;
		int b = 20;
		int c = a - b;
		System.out.println(c);
	}

	static void add(int a) {
		int b = 15;
		int c = a - b;
		System.out.println(c);
	}

	 void sub(int a, double b) {
		double c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		Assignment05 w1=new Assignment05();
		w1.add(10); //Non static member calling using ref variable
		w1.sub();
		w1.add(109);
		w1.sub(17, 9.8);

	}
}
