import java.util.Scanner;
class Sir 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int ip = sc.nextInt();

		int ct = count(ip);
			if (ct % 2 == 0)
			{
			  int first = ip / power(10,ct/2);
			  int rev1 = reverse(first);
			  

			   System.out.println(rev1);

			  int end = ip % power(10,ct/2);
			  int rev2 = reverse(end);

			  System.out.println(rev2);

                     int ans = rev1 * power(10,ct/2) + rev2;			 

				  System.out.println(ans);


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

	public static int reverse(int num)
	{
		int rev = 0;
		
		
         while (num != 0)
         {
             int rem = num % 10;
		      rev = (rev * 10) + rem;

			  num/=10;

		    
		 }
	            return rev;
	}

	public static int power(int base,int raise)
	{
		int pow = 1;
		for (int i = 0;i < raise ; i++ )
		{
			pow = pow * base;
		}
		return pow;
	}
		

}
