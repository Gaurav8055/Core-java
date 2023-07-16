import java.util.Scanner;
class RangeTechNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  1sr Number");
		int start = sc.nextInt();

		System.out.println("Enter 2nd Number");
		int end = sc.nextInt();

		int i;
		for (i = start; i <= end ;i++ )
		{
			int ct = count(i);

				if (ct % 2 == 0)
				{
				  int last = i % power(10,ct/2);
				  int first = i / power(10,ct/2);
				  
				  int sum = first + last;
				  int ans = sum * sum;

				  if (ans  == i)
				  {
					  System.out.println(ans +" "+"It Is Tech Number");
				  }
				 
				}
				
		}


	}
	public static int count(int num)
	{
		int ct = 0;
		while (num != 0)
		{
			ct ++ ;
			num/=10;
		}
			return ct;
	}

	public static int power(int base,int raise)
	{
		int pow = 1;
		for (int i = 0;i < raise ;i++ )
		{
			pow =  pow * base;
		}
		return pow;
	}

}
