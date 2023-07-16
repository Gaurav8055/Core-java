import java.util.Scanner;
class Method1
{
    
  
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Centemter value");
		double cm = sc.nextDouble();
		
		cmToinch();

	}
	  public static void cmToinch(int cm)
	{
		double inch = cm/2.25;
		
		System.out.println("Cm To Inches is : "+" "+inch);
		inchTofeet();

	}
	public static void inchTofeet(double inch)
	{
		double feet = inch/12;
		System.out.println("Inches To Feet Is : "+" "+feet);
		feetTometer ();
	}
	public static void feetTometer(double feet)
	{
		double meter = feet * 0.304;
		System.out.println("Feet To Meter Is"+" "+meter);
		meterToToken();
	}
	public static void meterToToken(double meter)
	{
		double km = meter/1000;
		System.out.println();

	}
	
	

}
