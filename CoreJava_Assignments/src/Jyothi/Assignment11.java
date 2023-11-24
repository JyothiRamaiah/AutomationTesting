package Jyothi;

public class Assignment11{
	
	static void Areaofsqure()
	{
		int a=10;
		int Area= a*a;
		System.out.println("Area of Square " + Area);
	}
	static void Areaofrectangle()
	{
		int l;
		l=18;
		int b;
		b=20;
		int Area;
		Area= (l*b);
		System.out.println("Area of Rectangle"+Area);
	}
	static void Areaofcircle()
	{
		float pi=3.14f;
		int r=10;
		double Area= pi*r*r;
		System.out.println("Area of circle" + Area);
	}
	static void Areaoftriangle()
	{
		int b=10;
		int h=5;
		int Area=(b*h)/2;
		System.out.println("Area of Triangle" + Area);	
	}
	public static void main(String[] args) {
		System.out.println("Area of square, rectangle,Circle triangle,");
		Areaofsqure();
		Areaofrectangle();
		Areaofcircle();
		Areaoftriangle();
	}
}