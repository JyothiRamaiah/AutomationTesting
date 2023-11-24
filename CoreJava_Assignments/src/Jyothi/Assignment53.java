package Jyothi;

class Highway {

	public void NH44() {
		System.out.println("National Highway 44");
	}
	 void NH4() {
		System.out.println("National Highway 4");
	}
	}
public class Assignment53 extends Highway {

	public void SH22() {
		System.out.println("State Highway 22");
	}
	 void SH23() {
		System.out.println("State Highway 23");
	}

	public static void main(String[] args) {

		Highway h1 = new Assignment53();
		h1.NH44();
		h1.NH4();
		
		

	}

}
