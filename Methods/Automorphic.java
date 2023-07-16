import java.util.Scanner;
class  Automorphic
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int ip = sc.nextInt();

		int ct = count(ip);
		int pow = power(10,ct);

		int ans = ip * ip;

		if (ans%pow == ip)
		{
			System.out.println("It Is Automorphic");
		}
		else
		{
			System.out.println("It is not Automorphic");
		}

	}

	public static int count (int num)
	{
		int ct = 0;

		while (num != 0)
		{
			ct ++;
			num /= 10;
		}
		return ct;
	}

	public static int power(int base ,int raise)
	{
		int pow = 1;
		for (int i = 0;i < raise  ;i++ )
		{
			pow = pow * base;
		}
			return pow;
	}
}
