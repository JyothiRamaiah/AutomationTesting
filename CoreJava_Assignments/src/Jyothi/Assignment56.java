package Jyothi; //Case 4 

class A{
	void add()
	{
		System.out.println("1");
	}
}
class B extends A{
	void sub()
	{
		System.out.println("2");
	}
}
public class Assignment56 extends B {
void div()
{
	System.out.println("3");
}
	public static void main(String[] args) {
		
		A a1=new B();  // implicit upcasting
		A a2=(A)new B();//Explicit upcasting ,ONLY SUPER MOST CLASS METHOD CAN ACCESS
		a1.add();
		
		B b1=(B)a1;	//explicit DownCasting, Acess both A and B class
		b1.add(); 
		b1.sub();
		
	}

}
