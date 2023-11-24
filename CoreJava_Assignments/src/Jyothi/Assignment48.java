package Jyothi;

public class Assignment48 {

	public static void main(String[] args) {
		
		float a[]= new float[3];
		
		 a[0]=10.2f;
		 a[1]=11.1f;
		 a[2]=13.8f;
		
		 try
		 {
			 a[3]=11.00f;
		 }
		catch(ArrayIndexOutOfBoundsException b)
		 {
			System.out.println("ArrayIndexOutOfBoundsException exception handled");
		 }

	}

}
