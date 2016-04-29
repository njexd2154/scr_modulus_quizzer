import java.util.ArrayList;
import java.util.Scanner;
public class characterGeneration
	{
		static Stats playerCharacter;
		static ArrayList<Stats> arena = new ArrayList<Stats>();
		
		public static void main(String[] args)
			{
				FillBaseCamp();
				selectCharacter();
				Fight();
				
			}
		
		public static void FillBaseCamp()
		{
			arena.add(new Stats("Guy", "Warrior", 5, "Human", 27, 30, 15, 3, 2, 1, 8.0, 5.5));
			arena.add(new Stats("Bob", "Mage", 5, "Human", 10, 15, 10, 4, 5, 10, 2.0, 7.0));
			arena.add(new Stats("Tim", "Archer", 5, "Human", 8, 20, 10, 20, 6, 3, 1.5, 10.5));
			arena.add(new Stats("Scott", "Rouge", 5, "Human", 10, 20, 10, 21, 8, 5, 5.0, 12.0));
			arena.add(new Stats("Noah", "Peasent", 1, "Human", 20, 5, 2, 4, 1, 1, 5.9, 3.0));
		}
		
		
		public static void selectCharacter()
		{
			
			System.out.println("Hello, who do you want to be your fighter?");
			for(Stats i : arena)
				{
					System.out.println("Do you want to be " +i.getName()+ " "+i.getCharacterClass()+ " "+i.getLevel()+" "+i.getRace()+" "+i.getStrength()+" "+i.getHealth()+" "+i.getDamage()+" "+i.getDexterity()+" "+i.getCharisma()+" "+i.getMagic()+" "+i.getBlock()+" "+i.getDodge());
				}

			Scanner userInput = new Scanner(System.in);
			System.out.println("Type the first letter of the character you want to be.");
			String userCharacter = userInput.nextLine();			
						
			if(userCharacter.equals("G") || userCharacter.equals("g"))
				{
					System.out.println("You have picked Guy");
					playerCharacter = arena.get(0);
				}
			else if(userCharacter.equals("B") || userCharacter.equals("b"))
				{
					System.out.println("You have picked Bob");
					playerCharacter = arena.get(1);

				}
			else if(userCharacter.equals("T") || userCharacter.equals("t"))
				{
					System.out.println("You have picked Tim");
					playerCharacter = arena.get(2);

				}
			else if(userCharacter.equals("S") || userCharacter.equals("s"))
				{
					System.out.println("You have picked Scott");
					playerCharacter = arena.get(3);

				}
			else if(userCharacter.equals("N") || userCharacter.equals("n"))
				{
					System.out.println("You have picked Noah");
					playerCharacter = arena.get(4);

				}
			else
				{
					System.out.println("please enter a name that is available");
					selectCharacter();
				}
			

		}
		public static void Fight()
			{
				Scanner userInput = new Scanner(System.in);
				int healthPoints = playerCharacter.getHealth();
				int generateEnemy = (int)(Math.random()*4);
				Stats enemy = arena.get(generateEnemy);
				int enemyHp = enemy.getHealth();
				System.out.println("You will fight " +enemy.getName()+ " This match!");
				System.out.println("Press a to attack, b to block, and d to dodge!");
				System.out.println(" ");
				System.out.println("BEGIN");
				
				while(healthPoints != 0 && enemyHp != 0)
				{
					String userAttack = userInput.nextLine();
					if(userAttack.equals("A") || userAttack.equals("a"))
					{
						healthPoints =- playerCharacter.getDamage();
						System.out.println("You did "+playerCharacter.getDamage());
					}
				else if(userAttack.equals("B") || userAttack.equals("b"))
					{
						int blockChance = (int)(Math.random()*4)+1;
						if(blockChance == 1 || blockChance == 3)
							{
								System.out.println("You block the attack");
								
								
							}
						else
							{
								healthPoints =- enemy.getDamage();
								System.out.println("Enemy did "+enemy.getDamage());
							}
					}
				else if(userAttack.equals("D") || userAttack.equals("d"))
					{
						int dodgeChance = (int)(Math.random()*4)+1;
						if(dodgeChance == 1 || dodgeChance == 4)
							{
								System.out.println("You dodge the attack");
							}
						else
							{
								
							}
					}
				else
					{
					System.out.println("Enter a valid letter");
					}
			}
				if(healthPoints == 0)
					{
						System.out.println("You have died");
					}
				else if(enemyHp == 0)
					{
					System.out.println("You have killed your opponent");
					}
				else
					{
						
					}
			}		
	}
