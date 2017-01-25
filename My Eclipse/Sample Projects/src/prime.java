import java.util.Scanner;

public class prime 
{

	public static void main(String[] args)
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num = sc.nextInt();
		boolean isprime= true;
		
		for(i = 2;i<num;i++)
		 {
			     if(num%i==0)
			       {
				      isprime = false;
				      break;
			       }	
		 }
		
			if(isprime)
			    {
				System.out.println("The number is prime");
		        }
			else
			    {   
				    System.out.println("The number is not prime");
				}
	}
}
