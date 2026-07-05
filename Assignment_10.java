package assignments;

//Assignment 10 = WAP on Local Variable, Global Variable

public class Assignment_10 
{

	static int A= 10;
	       int B =20;
	       
    public static Assignment_10 obj4 = new Assignment_10();

	       
	public static void LocalVariableAddition()
	{

		int C = 30;
		int D = 40;
		int E = C+D;
		
		System.out.println("Addition of Local variable                              = " + E);
	}
	
	public static void GlobalVariableAddition()
	{
		int Z = obj4.B;
		int O = A+Z;
		
		System.out.println("Addition of static Global and Non-static globalvariable = " + O);

	}
	
	public static void GlobalAndLocalAddition()
	{
		int Y = 50;
	    int I = Y+A;
		
		System.out.println("Addition of Global and local variable                   = " + I);
	}
	
	
	public static void main(String[] args) 
	{
		LocalVariableAddition();
		GlobalVariableAddition();
		GlobalAndLocalAddition();
		
	}
}
