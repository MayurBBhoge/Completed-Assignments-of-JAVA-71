package assignments;

//Assignment 9 = WAP overload both methods[static and non-static] and the constructor in a single program

public class Assignment_09 
{

	public static void StaticMethod ()
	{
		System.out.println("Static method 1");
		
	}
	
	public static void StaticMethod (int A, int B)
	{
		
		System.out.println("Static method 2");

	}
	
	public void NonStaticMethod(double G, int J)
	{
		System.out.println("Non - Static method 1");

	}
	
	public void NonStaticMethod(char D, int B)
	{
		System.out.println("Non Static method 2");

	}
	
	Assignment_09()
	{
		System.out.println("Constructor 1");

	}
	
	Assignment_09(int A, String H)
	{
		System.out.println("Constructor 2");

	}
	
	public static void main(String[] args) 
	{
	StaticMethod();
	StaticMethod(10, 6);
	Assignment_09 obj3 = new Assignment_09();
	obj3.NonStaticMethod(33.33, 87);
	obj3.NonStaticMethod('q',56);
	new Assignment_09(10, "Mayur");
		
	}
}
