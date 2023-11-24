package Jyothi;//nested if

public class Assignment09 {
	
	static void ns()
	{
	int a=65;
	
	if(a>18)
	{
		  if(a>60)
		  {
			  System.out.println("print senior citizen ticket");
		  }
		  else
		  {
			  System.out.println("Print Adult ticket");
		  }	 
		  
	}
	else 
	{ 
		System.out.println("Print child ticket");
	}
	}
	
	public static void main(String[] args) {

		ns();
	}
	
}


