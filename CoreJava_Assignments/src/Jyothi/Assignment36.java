package Jyothi;

abstract class Google_Login   //Parent1 
{
 abstract void GoogleEmail();
 abstract void GooglePassword();
}
abstract class Fb_Login extends Google_Login    //Parent2
{
	abstract void FbEmail();
	abstract void FbPassword();
}
public class Assignment36 extends Fb_Login{  
																//Child class
		static  void ZoomEmail()
		 {System.out.println("Ener Zoom mail id");}
		 void ZoomPassword() {
		  System.out.println("Ener zoom mail Password");} 
		 
	public static void main(String[] args) 
	{
		Assignment36 a1=new Assignment36();
		a1.GoogleEmail();
		a1.GooglePassword();
		a1.FbEmail();
		a1.FbPassword();
		ZoomEmail();
		a1.ZoomPassword();
	}
	void FbEmail() {
		System.out.println("Ener Fb mail id");
	}
	void FbPassword() {
		System.out.println("Ener Fb mail Password");
	}
	void GoogleEmail() {
		System.out.println("Ener Google mail id");
	}
	void GooglePassword() {
		System.out.println("Ener Google Password");
	}
}
