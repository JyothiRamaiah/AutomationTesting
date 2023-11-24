package Jyothi;

import java.util.Scanner;

public class Day14ScannerArthimaticOperator {

	static Scanner s1=new Scanner(System.in);
	
	void Methods()
	{
		System.out.println("Enter integer value");
		int a1=s1.nextInt();
		System.out.println("Enter integer value of is "+a1);
		
		System.out.println("Enter Byte value");
		byte a2=s1.nextByte();
		System.out.println("Enter Byte value of is "+a2);
		
		System.out.println("Enter Short Value");
		short a3=s1.nextByte();
		System.out.println("Enter Short Value is "+a3);
		
		System.out.println("Enter Long value ");
		long a4=s1.nextLong();
		System.out.println("Enter Long value is "+a4);
		
		System.out.println("Enter float value ");
		float a5=s1.nextFloat();
		System.out.println("Enter float value is "+a5);
		
		System.out.println("Enter Double value ");
		double a6=s1.nextFloat();
		System.out.println("Enter Double value is"+a6);
		
		System.out.println("Enter Boolean value ");
		boolean a7=s1.nextBoolean();
		System.out.println("Enter Boolean value is"+a7);
		s1.close();
		
	}
	public static void main(String[] args) {
		
		Day14ScannerArthimaticOperator d1=new Day14ScannerArthimaticOperator();
		d1.Methods();

	}

}
