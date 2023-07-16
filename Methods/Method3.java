import java.util.Scanner;
class Method3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int ip = sc.nextInt();

		boolean ans1 = checkEven(ip);

		if (ans1)
		{
			int rot = rotate(ip);

			boolean ans2 = checkEven(rot);

			if (ans2)
			{
				System.out.println("It Is Twisted Even Number");
			}
			else
			{
				System.out.println("It Is Not Twisted  Even Number");
			}
		}
	
	else 
	{
		System.out.println("It Is Not Even Number");
	}
	}

	public static boolean checkEven(int num)
	{
		boolean ans = num%2 == 0 ? true : false;
		return ans;
	
	}
	
	public static int rotate(int num)
	{
		int rev = 0;
		while (num != 0)
		{
			int rem = num % 10;
			rev = (rev * 10)+rem;
			num/=10;
		}
		return  rev;

	}
	}



