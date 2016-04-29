import java.util.Scanner;

public class Challenges
	{

		public static void main(String[] args)
			{
				OddEven();
				LeapYear();
				PrintThird();
				BuzzFizz();
			}
		public static void OddEven()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number and I will tell you if its even or odd.");
			int num = userInput.nextInt();
			if(num % 2 == 0)
				{
					System.out.println("The number is even.");
				}
			else
				{
					System.out.println("The number is odd.");
				}
		}
		
		public static void LeapYear()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a year and I'll tell you if its a leap year.");
			int year = userInput.nextInt();
			if(year % 4 == 0)
				{
					System.out.println("Thats a leap year.");
				}
			else
				{
					System.out.println("Thats not a leap year.");
				}
			
		}
		public static void PrintThird()
		{
			int [] num = {2, 5, -7, 1, 3, 12, 19, -16, 4, 20};
			for(int i = 0; i < num.length; i++)
				{
					if(i % 3 == 0)
						{
							System.out.println(num[i]);
						}
					else
						{
							
						}
				}
		}
		public static void BuzzFizz()
		{
			
			for(int i = 1; i <= 100; i++)
				{
					
					if(i % 3 == 0 && i % 5 == 0)
						{
							System.out.println("FizzBuzz");
						}
					else if(i % 3 == 0)
						{
							
							System.out.println("Fizz");
						}
					else if(i % 5 == 0)
						{
							System.out.println("Buzz");
						}
					else
						{
							System.out.println(i);
						}
				}
			
		}
	}
