package assignments;

//Assignment 17 = Write a Program on nested if Else Block_Case

public class Assignment_17 
{

	
	public static void NestedIfElseBlock()
	{
		
		int A = 10;
		int B = 20;
		if (A>1)
		{
		
			System.out.println("Main If block executed");
			if(B<=10)
			{
				System.out.println("Nested If block executed");

			}
			else if(A==10)
			{
				System.out.println("Nested If else block executed");
			}
			else
			{
				System.out.println("Nested else block executed");

			}	
		}
	}
	
	public static void main(String[] args) 
	
	{
		NestedIfElseBlock();
	}
	
	
	
	
}
