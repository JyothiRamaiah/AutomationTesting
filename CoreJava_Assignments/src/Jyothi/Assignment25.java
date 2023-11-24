package Jyothi;   //SIB and IIB Block

public class Assignment25 {
	
	static
	{
		System.out.println("I am SIB Block1");// SIB should declare outside the Main method,SIB execute automatically 
	}
	static
	{
		System.out.println("I am SIB Block2");
	}
	static
	{
		System.out.println("I am SIB Block3");
	}
	static
	{
		System.out.println("I am SIB Block4");
	}
	static
	{
		System.out.println("I am SIB Block5");
	}
	{// Creating IIB Block
		System.out.println("I am IIB Block");
	}
	{// Creating IIB Block
		System.out.println("I am IIB Block2");
	}
	Assignment25()// creating Constructor
	{
		System.out.println("I am Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment25();
		new Assignment25();
		System.out.println("I am Main method");// Execution Order is SIB,Main method,IIB,Constructor
		
		
	}

}
