package Inheritance;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	
class Division
{
	void div()
	{
		int a =120;
		int b=60;
		int result=a/b;
		System.out.println("Divide" +result);
	}
}
class Multiplication extends Division
{
	void Mul()
	{
		int a =120;
		int b=60;
		int result=a*b;
		System.out.println("Mul"+result);
	}
}
class Subtraction extends Multiplication
{
	void sub()
	{
		int a=80;
		int b=40;
		int result= a-b;
		System.out.println("sub"+result);
	}
}
class Addition extends Subtraction
{
	void Add()
	{
		int a =120;
		int b=60;
		int c=a+b;
		System.out.println("Add"+c);
	}
}
 class AssignmentInheritance extends Addition
 
{
	
	void ArthimaticOperations()
	{
		System.out.println("Arthimatic operations");
	
	}
	public static void main(String[] args) {
		
		 AssignmentInheritance a1=new AssignmentInheritance();
		a1.ArthimaticOperations();
		a1.Add();
		a1.sub();
		a1.Mul();
		a1.div();
		
		
	}
}

