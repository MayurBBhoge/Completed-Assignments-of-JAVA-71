package assignments;

//Assignment 12 = In same cases variable is present both locally and globally then?

public class Assignment_12 
{
 
	static int A = 10;
	       int B = 20; 
	       
	       public static void Both()
	       {
	    	   int A= 100;
	    	   System.out.println("This is to execute same local variable by direct name =" +A);
	    	   
	    	   System.out.println("This is to execute same static global variable with the help ofclass name =" +Assignment_12.A);
	    	   
	    	   Assignment_12 obj = new Assignment_12();
	    	   System.out.println("This is to execute same non static global variable with referance variable after creating object =" +obj.B);

	    	   
	       }
	      
	public static void main(String[] args) 
	{
		Both();
	}
}
