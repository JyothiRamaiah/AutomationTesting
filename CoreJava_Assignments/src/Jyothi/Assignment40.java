package Jyothi;

class Mentor_Class
{
	
	Mentor_Class()
	{
	System.out.println("I am a mentor constructor with implicit super calling statement ");
	}
}
class Student_class extends Mentor_Class

{
	Student_class()
	{
		
		System.out.println("I am a student constructor");
	}
}
public class Assignment40 {

	public static void main(String[] args) {
		
		new Student_class();
	}
}
