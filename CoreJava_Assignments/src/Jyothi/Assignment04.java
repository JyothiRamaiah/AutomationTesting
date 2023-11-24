package Jyothi;

public class Assignment04 {
	
	static void county() {
		
		System.out.println("india");
	}
	
		static void county2() {
		
		System.out.println("nepal");
	}
		void county3() {
			
			System.out.println("srilanka");
		}
	public static void main(String[] args) {
		Assignment04 w1=new Assignment04();// created object to call non static member
		w1.county3();// call nonstatic method using ref variable
		county2();
		county();// call static method using method name 
		

	}

}
