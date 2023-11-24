package Jyothi;
class Land_Vehicle{
	void cycle()
	{
		System.out.println("Cycle");
	}
	void Bus()
	{
		System.out.println("Bus");
	}
}
class Air_Vehicle extends Land_Vehicle{
	void flait()
	{
		System.out.println("Flait");
	}
	void Rocket()
	{
		System.out.println("Rocket");
	}
}
public class Assignment57 extends Air_Vehicle {
	void Ship() {
		System.out.println("Ship");
	}
	public static void main(String[] args) {
		Land_Vehicle l1= new Assignment57(); // implicit Upcasting
		l1.cycle();
		l1.Bus();
		Air_Vehicle a= new Assignment57();//(Not possible to downcast without upcasting)	
		Assignment57 a1=(Assignment57)a; //Down casting 
		a1.cycle();
		a1.Bus();
		a1.flait();
		a1.Rocket();
		a1.Ship();
	}

}
