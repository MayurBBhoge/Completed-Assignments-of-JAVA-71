package assignments;

//Assignemnt 7 = WAP overload non-static methods

public class Assignment_07 
{

	
	public void Test ()
	{
		System.out.println("Non Static method  - 1");
		
	}
	
	public void Test (int A, int B)
	{
		System.out.println("Non static menthod - 2");
	}
	
	public void Test (char D, String I)
	{
		System.out.println("Non static menthod - 3");
		
	}
	public static void main(String[] args) 
	{
	
		Assignment_07 obj = new Assignment_07();
		obj.Test();
		obj.Test(15, 89);
		obj.Test('y', "Mayur");
	
		
	}
	
	
}
