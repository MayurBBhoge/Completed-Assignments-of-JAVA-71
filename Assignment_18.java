package assignments;

//Assignment 18 = " WAP to check person can vote only if he/she is 18 or above
//                  and should not vote if age is less."

public class Assignment_18 
{

	public static void CanVote()
	{
		int  age = 18;
		
		if (age >=18 )
		{
			System.out.println("Person is eligible to vote as he is above 18 ");
		}
		else
		{
			System.out.println("Person is not eligible to vote as he is below 18 ");
		}
	}
		
		public static void CanNotVote()
		{
			int  age2 = 16;
			
			if (age2 >=18 )
			{
				System.out.println("Person is eligible to vote as he is above 18 ");	
			}
			else
			{
				System.out.println("Person is not eligible to vote as he is below 18 ");
			}
	}
	
	public static void main(String[] args) 
	{
		CanVote();
		CanNotVote();
	}
}
