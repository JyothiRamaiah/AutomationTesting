package Jyothi;

public class Assignment51 {

	public static void main(String[] args) {
		
		byte a= 123;
		
		long b=a;
		System.out.println(b); //Implicit way   Widening
		
		byte c=127;
		long d=(byte)c;
		System.out.println(d); //Explicit way
		

	}

}
