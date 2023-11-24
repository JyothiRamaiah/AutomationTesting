package Jyothi;

public class Assignment27 {

	  int a; //final variable value cannot be change throughout the class
	static int b;
	public static void main(String[] args) {
		Assignment27 a1=new Assignment27();
		a1.a=50;
			b=60;
		System.out.println(b);
		System.out.println(a1.a);
		
	}

}
