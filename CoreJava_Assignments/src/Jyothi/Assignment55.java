package Jyothi;// Case 3 - Typecasting

class WildAnimal {
	void lion() {
		System.out.println("King of the jungle");
	}
	void Tiger() {
		System.out.println("I am a Tiger");
	}
}
class DomesticAnimal extends WildAnimal {
	void Cow() {
		System.out.println("I am a cow");
	}
	void Cat() {
		System.out.println("I am a Cat");
	}
}
public class Assignment55 extends DomesticAnimal {

	void Aquatic() {
		System.out.println("fish lives in Aquatic");
	}
	public static void main(String[] args) {

		WildAnimal w1 = new Assignment55(); // upcasting implicit way
		w1.lion();
		w1.Tiger();
		Assignment55 w = (Assignment55)w1 ;// Downcasting Explicit way
		w.lion();
		w.Tiger();
		w.Cow();
		w.Cat();
		w.Aquatic();

	}
}
