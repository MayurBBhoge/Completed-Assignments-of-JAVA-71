package assignments;

//Assignment 2 - Declare and initilize the variables for all datatypes
/*

Data Type | Category                 | Size      | Default  | Example Literal
--------------------------------------------------------------------------------
byte      | Integer (Whole number)   | 1 byte    | 0        | 120
short     | Integer (Whole number)   | 2 bytes   | 0        | 30000
int       | Integer (Whole number)   | 4 bytes   | 0        | 150000
long      | Integer (Whole number)   | 8 bytes   | 0L       | 9000000000L
float     | Floating-point (Decimal) | 4 bytes   | 0.0f     | 3.14f
double    | Floating-point (Decimal) | 8 bytes   | 0.0      | 2.71828
char      | Text (Single character)  | 2 bytes   | \u0000   | 'A'
boolean   | Logical value            | 1 bit     | false    | true
String    | Object (Text sequence)   | Varies    | null     | "Hello"

1. Whole Number Integers
   - byte: Saves memory in large arrays. Range: -128 to 127.
   - short: Used for small numbers. Range: -32,768 to 32,767.
   - int: The standard choice for whole numbers. Range: ~ -2.1B to 2.1B.
   - long: Used for massive numbers. Requires an 'L' suffix.
2. Fractional Decimal Numbers
   - float: Provides 6 to 7 digits of precision. Requires an 'f' suffix.
   - double: Default choice for decimals. Provides 15 digits of precision.
3. Characters & Logic
   - char: Stores a single Unicode character in single quotes.
   - boolean: Stores only two states: true or false.
4. The String Class
   - String: A sequence of characters enclosed in double quotes. 
   - It is a class and includes built-in methods like .length() and .toLowerCase().

*/

public class Assignment_02 {
	
	public static void main(String[] args) 
	{
	
		byte A = 127;             //Declaration and initilization
		System.out.println(A);    //Utilization
		
		short B  = 2000;  
		System.out.println(B);
		
		int C = 23543;
	    System.out.println(C);
	    
	    long D = 1134124l;
	    System.out.println(D);
	    
	    float E = 1.54f;
	    System.out.println(E);
	    
	    double F = 23.65;
	    System.out.println(F);
	    
	    char G = 'A';
	    System.out.println(G);
	    
	    boolean H = true; 
	    System.out.println(H);
	    
	    String I = "Above all are data types";
	    System.out.println(I);	
		
	}

}
