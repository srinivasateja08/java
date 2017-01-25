import java.util.Scanner;

public class reversenumber
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to reverse");
		int n = sc.nextInt();
		int reverse=0;
		int reminder;
		
		while(n!=0)                             //break
		{
			                                    //5678;567;56;5
			reminder = n % 10;                       //8;7;6;5
			reverse = reverse * 10 + reminder;           //8;87;876;8765;
			n = n / 10;                                 //567;56;5;0
		}
       System.out.println("The reverse number is:" + reverse);
	}

}
