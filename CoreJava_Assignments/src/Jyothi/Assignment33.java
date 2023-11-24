package Jyothi;
//WAP using interface and achieve single level inheritance with 1 sub class and 1 interface.
interface intereface_class1 
{
	void AboutInterface();    
	void AboutInterface2(); 
	void AboutInterface3();	
}
public class Assignment33 implements intereface_class1 {

	public static void main(String[] args) {
		Assignment33 a1=new Assignment33();
		a1.AboutInterface();
		a1.AboutInterface2();
		a1.AboutInterface3();
	}
	public void AboutInterface() {
		
		System.out.println("Interface is used to achieve 100% abstraction");
		System.out.println("If use interface class no need mention abstract keyword infront of abstract class");	
	}
	public void AboutInterface2() {
		System.out.println("Interface can have only abstract method");
		System.out.println("Acess specifier of Interface is only Public and default");
	}
	public void AboutInterface3() {
		System.out.println("The relation between class and Interface class use keyword implements");
		System.out.println("The relation between Interface and Interface class use keyword extends");
		System.out.println("The relation between Interface class and class is not possible");
	}
}
