package assignments;

//Assignment 8 = WAP overload constructors

public class Assignment_08 
{

	
	Assignment_08()
	{
		System.out.println("Constructor 1");
	}
	
	Assignment_08(double A, float B)
	{
		System.out.println("Constructor 2");

	}

	
	Assignment_08(String H, int J)
	{
		System.out.println("Constructor 3");

	}
	public static void main(String[] args) 
	{
		Assignment_08 obj2 = new Assignment_08();
		new Assignment_08(10.69, 5.78f);
		new Assignment_08("Mayur", 67);
		
	}
	
}
