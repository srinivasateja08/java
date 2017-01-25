import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) 
	{
		String original;
		String reverse=" ";
		
		System.out.println("enter the string to reverse");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		int len = original.length();
		for(int i= len - 1;i>=0;i--)
	     	{
		    	reverse = reverse + original.charAt(i);
		    }
//        System.out.println("original string" + original);
        System.out.println("reverse string :" + reverse);
	}

}

