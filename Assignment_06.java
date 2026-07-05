package assignments;

//Assignment 6 = WAP overload static methods

public class Assignment_06 
{

	public static void Addition (int A, char D)
	{
		System.out.println("First Static method");
	}
	
	public static void Addition (char A, int D)
	{
		System.out.println("Second Static method");

	}
	
	static void Addition (char A, char D)
	{
		System.out.println("Third Static method");
	}
	
	public static void main(String[] args) 
	{
	
		Addition(10,'M');
		Addition('F', 40);
		Addition('W','s');
		
	}
	
	
}
