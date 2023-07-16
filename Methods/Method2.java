import java.util.Scanner;
class  Method2
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);

	  System.out.println("Enter Ruppes");
	  double inr = sc.nextFloat();

	  System.out.println("Ruppes is "+" "+inr);
	  inrToUsd(inr);
	  	

	}
	public static void inrToUsd(double inr)
	{
		double usd = inr * 0.012;

		System.out.println("Rupes To Usd Conversion Is "+" "+usd);

	      usdToEuro(usd);
		  euroToYen(euro);


		
	}
	public static void usdToEuro(double usd)
	{
		double euro = usd * 0.92;

		System.out.println("Usd To Euro Conversion Is "+" "+euro);
	//	euroToYen(euro);

	}
	public static void euroToYen(double euro)
	{
		double yen = euro * 140.28;

		System.out.println("Euro To Yean Conversion is "+" "+yen);
	}
}
