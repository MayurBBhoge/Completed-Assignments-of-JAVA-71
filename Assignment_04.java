package assignments;

//Assignment 4 - Write a program on +,-,*,/ and % operators"

public class Assignment_04 {
	
	public static void add(int A, int B)          //addition with static method
	{
		int C= A+B;                               //declaration and initialization
		System.out.println("Addition is= "+ C);                    //utilization
	}
	
	void sub (double F, int Z)                    //subtraction with non static method
	{
	
		double D = F-Z;
		System.out.println("Substraction is= "+ D);
	}
	
	static void mul (int B, int X)                //multiplication with static method
	{
		int G = B*X;
		System.out.println("Multiplication is= " +G);
	}
	
	Assignment_04 (int Y, int Z)                    //Divide with constructor and this calling
	{
		this (12.12, 10);
		int P = Y/Z;
		System.out.println("Divided result is= " +P);
	}
	
	Assignment_04 (double Y, int Z)                 //Mod with constructor
	{
		double E =Y%Z;
		System.out.println("Mod is= " +E);
	}
	
	public static void main(String[] args) 
	{
		add(10,10);
		Assignment_04 O =new Assignment_04 (50,5);
		O.sub(50, 20);
		mul(30,60);
	    new Assignment_04 (50.5,5);
		
		
	}

}
