package assignments;
import java.util.Scanner;
//Write a java program which takes 2 numbers a and b from user at run time and perform below operation:
//Please use methods from Math class
//1.square root of a, 2.maximum, 3.minimum, 4.a*b, 5.a+b, 6.a-b, 7.Absolute value of a
public class Assignment_20 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value to perfom square root");
        double SquareRoot = Math.sqrt(scan.nextDouble());
	    System.out.println("Square root value is =" +SquareRoot);
	    
		System.out.println("Please enter Two values to perfom maximum value operation");
	    int Maximum = Math.max(scan.nextInt(), scan.nextInt());
		System.out.println("Maximum value is =" + Maximum);
		
		System.out.println("Please enter Two values to perfom minimum operation");
	    int Minimum = Math.min(scan.nextInt(), scan.nextInt());
		System.out.println("Minimum value is =" + Minimum);
		
		System.out.println("Please enter Two values to perfom Multiplication operation");
	    int Multiplication = Math.multiplyExact(scan.nextInt(), scan.nextInt());
		System.out.println("Multiplication value is =" + Multiplication);
		
		System.out.println("Please enter Two values to perfom addition operation");
	    int Addition = Math.addExact(scan.nextInt(), scan.nextInt());
		System.out.println("Addition value is =" + Addition);
		
		System.out.println("Please enter Two values to perfom Subtraction operation");
	    int Subtraction = Math.subtractExact(scan.nextInt(), scan.nextInt());
		System.out.println("Addition value is =" + Subtraction);
		
		System.out.println("Please enter Two values to perfom Absolute value operation");
	    int Absolute = Math.abs(scan.nextInt());
		System.out.println("Absolute value is =" + Absolute);


		
	}
	
}
