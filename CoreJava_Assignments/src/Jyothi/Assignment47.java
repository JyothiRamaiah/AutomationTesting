package Jyothi;

import java.util.Scanner;

public class Assignment47 {

	public static void main(String[] args) {
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter Age");
		int age=S1.nextInt();
		if (age >= 18)
		{
        System.out.println("https://google.com");
		}

		else
		{
			throw new ArithmeticException("You are still Young");
		}
	S1.close();
	}
	

}
