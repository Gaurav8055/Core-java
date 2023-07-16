import java.util.Scanner;
class RangeOfUglyNumber  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number");
		int start = sc.nextInt();

		System.out.println("Enter 2nd Number");
		int end = sc.nextInt();
       
	   int i;
		for ( i = start ; i <= end ; )
		{
			while (i != 0)
			{
			
			if (i % 2 == 0)
			{
				i = i / 2;
			}
			else if (i % 3 == 0)
			{
				i = i / 3;
			}	
			else if (i % 5 == 0)
			{
				i = i / 5;
			}
			else
			{
				break;
			}
			
		}
		System.out.println(i);
		}
			
		
		if (i == 1)
		{
			System.out.println(i+" "+"It Is An Ugly Number");
			
		}
		else
		{
			System.out.println("It is Not Ugly Number");
		}
		
	}
}



	

