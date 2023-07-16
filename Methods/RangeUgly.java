import java.util.Scanner;
class RangeUgly 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter Number");
		int start = sc.nextInt();

		System.out.println("Enter 2 nd number");
		int end = sc.nextInt();

         int i;
		for (i = start;i <= end ; i++ )
		{
			int cu = ugly(i);

			if (cu == 1)
			{
				System.out.println(i+" "+"It Is An Uglu Number");
			}
			else
			{
				System.out.println(i+" "+"Not Ugly Number");
			}
		}
		


	}
	public static int ugly(int num)
	{
		while (num != 0)
		{
			if (num % 2 == 0)
			{
                num /= 2;
			}
			else if (num % 3 == 0)
			{
				num /= 3;
			}
			else if (num % 5 == 0)
			{
				num /= 5;
			}
			else 
			{
				break;
			}
			
		}
		return num;
	}
}
