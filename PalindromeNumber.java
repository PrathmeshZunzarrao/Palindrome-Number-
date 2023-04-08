import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		int rem, rev = 0;
		int org = num;

		while(num > 0)
		{
			rem = num % 10;
			rev = rem + rev * 10;
			num /= 10;
		}

		if(org == rev)
		{
			System.out.println("It's a Palindrome Number");
		}
		else
		{
			System.out.println("It's not a Palindrome Number");
		}
	}
}
