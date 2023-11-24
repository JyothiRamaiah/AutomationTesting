package Jyothi;//SIB and IIB BLOCK

import java.util.Scanner;

public class Assignment26{
	static Scanner s1 = new Scanner(System.in);
	static {

		System.out.println("I am SIB 1");
		System.out.println(" Perform addition Addition"); // SIB Block
		System.out.println("Enter A");
		int a = s1.nextInt();
		System.out.println("Enter B");
		int b = s1.nextInt();
		int c = a + b;
		System.out.println("Result =" + c);
	}

	{
		System.out.println("I am IIB 1");
		System.out.println("Enter age");
		int age = s1.nextInt();
		if (age > 18) {
			System.out.println("I am eligible for vote"); // IIB block
		} else {
			System.out.println("I am not eligible for vote");
		}
	}

	Assignment26() {
		System.out.println("I am Contructor 1"); // Constructor 1
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	static {
		System.out.println("I SIB block 2");
		System.out.println(" Perform subtraction"); // Static Block 2
		System.out.println("Enter A");
		int a1 = s1.nextInt();
		System.out.println("Enter B");
		int b1 = s1.nextInt();
		int c1 = a1 - b1;
		System.out.println("Result =" + c1);
	}
	{
		System.out.println("I am IIB 2");
		System.out.println("Enter age");
		int age = s1.nextInt();
		if (age > 18) {
			System.out.println("I am eligible for DRIVE"); // IIB block 2
		} else {
			System.out.println("I am not eligible for DRIVE");
		}
	}

	Assignment26(int a) {
		System.out.println("I am Contructor 2"); // //Constructor 2
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		s1.close();
	}

	public static void main(String[] args) {
		new Assignment26();
		new Assignment26(20);
		System.out.println("I am Main method");
	}

}
