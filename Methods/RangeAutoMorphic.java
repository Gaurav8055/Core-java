import java.util.Scanner;
class RangeAutoMorphic
{
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number");
		int start = sc.nextInt();

		System.out.println("Enter 2nd Number");
		int end = sc.nextInt();
		
		int i;
		for ( i = start; i < end ; i++)
		{
			int ct = count(i);
			int pow = power(10,ct);

			int ans = i * i;

			if (ans%pow==i)
			{
				System.out.println(ans+" "+"It Is AN Automorphic");
			}
		}


	}
	public static int count(int num)
	{
		int ct = 0;

		while (num != 0)
		{
			ct ++;
			num/=10;
		}
		return ct;

	}
	public static int power (int base, int raise)
	{
		int pow = 1;
		 for (int i = 0;i < raise ; i++  )
		 {
			 pow = pow * base;

		 }
		 return pow;
	}
}
