import java.util.Scanner;
class HappyNum 
{

	public static void main(String[] args) 
{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");//19
		int num = sc.nextInt();
	//	boolean ok = false;
	//	while (true)
	//	{
	//	num = sqrtsum(num);
	//		if (num == 1)
	//		{
	//			ok = true;
	//			break;
	//		}
	//		else if (num == 4)
	//		{
	//			ok = false;
	//			break;
//
//			}
//		}
//		if (ok)
//		{
//			System.out.println("Happy Number");
//		}
//		else 
//		{
//			System.out.println("It IS Sad Number");
//		}
           int num1 = sqrtsum(num);

             if (num1 == 1)
             {
				 System.out.println("Happy");
             }
			 else if(num1 == 4)
	        { 
				 System.out.println("Sad");
			 }
			 else
	{
		
	}

    }

             public static int sqrtsum(int num)
		{
		    	int sum = 0;
			 while (num > 0)

			   {
			     int rem = num % 10;
			     sum = rem + num * num ; 
				 
				   num/=10;
			     }
				 
				
				  return num;
			    
		}
		

}

