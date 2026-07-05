package assignments;

//Assignment 11 = how to update the value of local and global variable
public class Assignment_11 
{

	static int A = 10;            //Static Global variable first value
	       int B = 30;            //Non Static Global variable first value
	
	public static void Local()
	{
		int C = 20;               //Local variable first value
		C=200;                   //Local variable updated value
		System.out.println(C);  
	}
	
	public static void main(String[] args) 
	{
		System.out.println(A=100);   //Static Global variable updated value
		Local();                     
		Assignment_11 obj5 = new Assignment_11();
		int X = obj5.B;
		X=300;
		System.out.println(X);  

	}
	
	
}
