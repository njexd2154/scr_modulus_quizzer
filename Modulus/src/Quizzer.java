import java.util.Scanner;
//test
public class Quizzer
	{

		public static void main(String[] args)
			{
				PartC();

			}
		
		public static void PartC()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello, I'm going to quiz you over Mods.");
			System.out.println("How many questions do you want");
			int userQuestions = userInput.nextInt();
			int userQuestionAmount = (int)(Math.random()*userQuestions);
			int counter = 0;
			for(int i = 0; i < userQuestions; i++)
			{
				int firstMod = (int)(Math.random()*10)+1;
				int secondMod = (int)(Math.random()*10)+1;
				
			
				if(firstMod < secondMod)
					{
						firstMod += 10;
					}
				
				else if(i % 5 == 0)
					{
						firstMod -= 9;
						
					}
				else if(i % 4 == 0)
					{
						firstMod = secondMod;
					}

				System.out.println("What is " +firstMod+ " % " +secondMod);
				int userAnswer = userInput.nextInt();
				if(userAnswer == firstMod % secondMod)
					{
						System.out.println("Thats right!");
						counter++;
					}
				else
					{
						System.out.println("Thats wrong!");
						System.out.println("The correct answer is "+ firstMod % secondMod);
						counter--;
					}
			
			}
			System.out.println("Your score is " +counter);
			
		
		}

	}

