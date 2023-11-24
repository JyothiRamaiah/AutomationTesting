package Jyothi;

abstract class Wild_Animal
{
	abstract void Tiger();
	abstract void Lion();
	static void Monkey()
	{
		System.out.println("Monkey is a static class");
	}
	void Deer()
	{
		System.out.println("Deer is a non-static class");
	}}
abstract class Domestic_Animal extends Wild_Animal
{
	 abstract void Cow();
	 abstract void Dog();  
}
public class Assignment35 extends Domestic_Animal
{
	public static void main(String[] args) {
		Assignment35 a1=new Assignment35();
		a1.Tiger();
		a1.Lion();
		a1.Deer();
		a1.Cow();
		a1.Dog();
		Monkey();
	}
	void Tiger() {
		System.out.println("Tiger is absract class of Wild animal");
	}
	void Lion() {
		System.out.println("Lion is absract class of Wild animal");
		}
	void Cow() {
		System.out.println("Cow is absract class of Domestic_Animal");
	}
	void Dog() {
		System.out.println("Dog is absract class of Domestic_Animal");
		
	}

}
