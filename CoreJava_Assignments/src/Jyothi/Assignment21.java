package Jyothi;

public class Assignment21 {
	
	Assignment21()
	{
		System.out.println("constructor special method in Java");
	}
	Assignment21(int a) 
	{
		System.out.println("constructor is same as class ");
	}
	Assignment21(double a)
	{
		System.out.println("constructor has all type of access specifiers ");
	}
	public Assignment21(float a, String b)
	{
		System.out.println("constructor can be parameterized and non parameterized ");
	}
	protected Assignment21(float a, String b,char c)
	{
		System.out.println("constructor always non static in nature ");
	}
	Assignment21(String b)
	{
		System.out.println("constructor automatically called ,when moment creation of object ");
	}
	public static void main(String[] args) {
		
	    new Assignment21();
		new Assignment21(10);
		new Assignment21(111.1);
		new Assignment21(1.1f,"Constructor");
		new Assignment21(1.1f,"Constructor",'c');	
		new Assignment21("Co");
		
		
	}

}
