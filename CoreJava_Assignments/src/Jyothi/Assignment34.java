package Jyothi;

 interface Googlephotos_login {
	void email();                //super most class
	void password();
}
abstract class Postman_Login  implements Googlephotos_login {  //abstract class
	abstract void signup_google();
	abstract void signup_Registration();           //2 abstract method      
	
	void signin_Postman()
	{  
		System.out.println("Enter postman credentials"); 
		System.out.println("Enter Email");
		System.out.println("Enter Password ");     //1 non static method
	}
	static void signin_Linkedin()
	{
		System.out.println("Enter Linkedin credentials");
		System.out.println("Enter EmailId");
		System.out.println("Enter Password");      //1 static method
	}	
}
public class Assignment34 extends Postman_Login {  //sub class
	
	void signin_youtube()         //non static method
	{
		System.out.println("Signup youtube using google credentials");
	}
	static void signin_Naukri()   //static method
	{
		System.out.println("signup Naukri using Linkedin profile");
	}
	
	public static void main(String[] args) {
		
		Assignment34 a1=new Assignment34(); 
		
		a1.email();
		a1.password();
		a1.signup_google();
		a1.signup_Registration(); // call non static and abstract methods
		a1.signin_Postman();
		a1.signin_youtube();
		
		signin_Linkedin();  //call static methods
		signin_Naukri();
		
	}
	public void email() {
		
	System.out.println("Enter existing Google mail id -Google photo");
		
	}
	public void password() {
		
		System.out.println("Enter existing Google password-Google photo");
	}

	void signup_google() {
		
		System.out.println("Enter valid credentials to login Google mail");
	}

	void signup_Registration() {
		System.out.println("To create postman Account");
		System.out.println("Enter Username");
		System.out.println("Enter Mail id");
		System.out.println("Enter phone no");
		System.out.println("Enter password");
		
	}

}
