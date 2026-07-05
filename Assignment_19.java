package assignments;

//Assignment 19 = WAP using switch case to display days of the week:1 for Monday,2 for Tuesday etc 7 for Sunday.
//                if the input is not in between 1-7 ,print "Invalid Day"

public class Assignment_19 
{

	public static void main(String[] args) 
	{
		
		switch(5)
		{
		case 1: System.out.println("Today is = Monday");
		        break;
			
		case 2: System.out.println("Today is = Tuesday");		
		        break;
			
		case 3: System.out.println("Today is = Wednesday");		
		        break;
		case 4: System.out.println("Today is = Thursday");		
		        break;
		case 5: System.out.println("Today is = Friday");	
		        break;        
		case 6: System.out.println("Today is = Saturday");		
		        break;
		case 7: System.out.println("Today is = Sunday");		
		        break;
		default: System.out.println("Input is wrong");		

		}
		
	}
	
	
}
