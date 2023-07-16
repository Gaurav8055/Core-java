import java.util.Scanner;
class  Disarium2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int ip = sc.nextInt();

		int count = Automorphic.count(ip);

		int sum = 0;

		for (int i = 0; i != 0 ;i/=10 )
		{
			int rem = i%10;
			sum = sum + TechNumber.power(rem,count --);
		}
		if (sum == ip)
		{
			System.out.println("Disarium ");

		}
		else
		{
			System.out.println("Not Disarium");
		}
	}
}
