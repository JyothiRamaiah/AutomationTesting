package Jyothi;

class Java_Mentor1 {

	Java_Mentor1(int a) {
		System.out.println("I am a mentor constructor with explicit method super calling statement ");
	}
}

class Java_Student1 extends Java_Mentor1

{
	Java_Student1() {
		super(10);
		System.out.println("I am a student constructor");
		
	}
}

public class Assignment41 {

	public static void main(String[] args) {

		new Java_Student1();

	}

}
