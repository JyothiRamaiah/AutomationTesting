package Jyothi;
//write a program and make use of super key-word to stop Super class method from getting overridden.
class Method_override{
	void Ganvi()
	{
		System.out.println("Super is a Keyword it is used in the concept of Methodoverriding");
		System.out.println("I am a Super class");
	}
}
	public class Assignment37 extends Method_override
	{
		
	 void Ganvi()
	{
		super.Ganvi();
		System.out.println("super keyword can be used in non static methods");
		System.out.println("I am a Super class");
		
	}
	public static void main(String[] args) { 
		
		Assignment37 a1=new Assignment37();
		a1.Ganvi();
	   // we cant use super keyword inside static class
		
		
	}

}
