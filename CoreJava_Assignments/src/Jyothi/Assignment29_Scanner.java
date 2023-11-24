package Jyothi;

import java.util.Scanner;
//Scanner Class

public class Assignment29_Scanner {
	static Scanner s1 = new Scanner(System.in);

	static void add() {
		
		System.out.println("Enter the value A");
		int a = s1.nextInt();
		System.out.println("Enter the value B");
		int b = s1.nextInt();
		int ADD = a + b;
		System.out.println("Add= " + ADD);		
	}
	static void sub() {
		System.out.println("Enter the value A");
		int a = s1.nextInt();
		System.out.println("Enter the value B");
		int b = s1.nextInt();
		int SUB = a - b;
		System.out.println("SUB= " + SUB);
		}
	void mul() {
		System.out.println("Enter the value A");
		int a = s1.nextInt();
		System.out.println("Enter the value B");
		int b = s1.nextInt();
		int MUL = a * b;
		System.out.println("Multiply= " + MUL);	
	}
	void div() {
		System.out.println("Enter the value A");
		int a = s1.nextInt();
		System.out.println("Enter the value B");
		int b = s1.nextInt();
		int DIV = a / b;
		System.out.println("Division= " + DIV);	
	}
	public static void main(String[] args) {
		add();
		sub();
		Assignment29_Scanner a1 = new Assignment29_Scanner();
		a1.mul();
		a1.div();
		s1.close();
	}

}
