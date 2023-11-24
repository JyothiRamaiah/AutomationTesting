package Jyothi;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	
class Division
{
	void div()
	{
		int a =120;
		int b=60;
		int result=a/b;
		System.out.println("Divide " +result);
	}
}
class Multiplication extends Division
{
	void Mul()
	{
		int a =120;
		int b=60;
		int result=a*b;
		System.out.println("Multiply "+result);
	}
}
class Subtraction extends Multiplication
{
	void sub()
	{
		int a=80;
		int b=40;
		int result= a-b;
		System.out.println("Subtraction "+result);
	}
}
class Addition extends Subtraction
{
	void Add()
	{
		int a =120;
		int b=60;
		int c=a+b;
		System.out.println("Add  "+c);
	}
}
 class Assignment30 extends Addition
 
{
	
	void ArthimaticOperations()
	{
		System.out.println("Arthimatic operations");
	
	}
	public static void main(String[] args) {
		
		 Assignment30 a1=new Assignment30();
		a1.ArthimaticOperations();
		a1.Add();
		a1.sub();
		a1.Mul();
		a1.div();
		
		
	}
}

