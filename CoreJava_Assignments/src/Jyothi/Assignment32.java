package Jyothi;

abstract class Jyothi  {            //super most(Parent2)class First abstract class

	abstract void Ram_Login();     //First abstract class
	abstract void sitha_Login();   //second abstract class
	void Gowri() {
		System.out.println("I am non static method 1");  //Non static method1
	}
	static void Raghu() {
		System.out.println("I am static method 1");       //Static method1
	}}
	abstract class Ram extends Jyothi{  // super class(Parent1) second abstract class

		abstract void Ganvi_Login(); //Third abstract class
		abstract void Chirav_Login();//Fourth abstract class
		void Gowri2() {
			System.out.println("I am non static method 2");} //Non static method2
		static void Raghu2() {
			System.out.println("I am static method 2"); //Static method12
		}}
	public class Assignment32 extends Ram { //Sub class

		public static void main(String[] args) {
			Raghu();
			Raghu2();
			Assignment32 a1= new Assignment32();
			a1.Ganvi_Login();
			a1.Chirav_Login();
			a1.Ram_Login();
			a1.sitha_Login();			
			a1.Gowri();
			a1.Gowri2();
			
		}
		void Ganvi_Login() {
			System.out.println("Abstract method 1-Ganvi");
		}
		void Chirav_Login() {
			System.out.println("Abstract method 2-Chirav");
			
		}
		void Ram_Login() {
			System.out.println("Abstract method 3-Ram");
			
		}
		void sitha_Login() {
			System.out.println("Abstract method 4-Sitha");
		}
}
