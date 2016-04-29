
public class Stats
	{
		String name;
		String characterClass;
		int level;
		String race;
		int strength;
		int health;
		int damage;
		int dexterity;
		int charisma;
		int magic;
		double block;
		double dodge;
		
		public Stats (String n, String cc, int l, String ra, int st, int hp, int da, int dex, int ch, int ma, double bl, double dod)
		{
			name = n;
			characterClass = cc;
			level = l;
			race = ra;
			strength = st;
			health = hp;
			damage = da;
			dexterity = dex;
			charisma = ch;
			magic = ma;
			block = bl;
			dodge = dod;
			
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getCharacterClass()
			{
				return characterClass;
			}

		public void setCharacterClass(String characterClass)
			{
				this.characterClass = characterClass;
			}

		public int getLevel()
			{
				return level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}

		public String getRace()
			{
				return race;
			}

		public void setRace(String race)
			{
				this.race = race;
			}

		public int getStrength()
			{
				return strength;
			}

		public void setStrength(int strength)
			{
				this.strength = strength;
			}

		public int getHealth()
			{
				return health;
			}

		public void setHealth(int health)
			{
				this.health = health;
			}

		public int getDamage()
			{
				return damage;
			}

		public void setDamage(int damage)
			{
				this.damage = damage;
			}

		public int getDexterity()
			{
				return dexterity;
			}

		public void setDexterity(int dexterity)
			{
				this.dexterity = dexterity;
			}

		public int getCharisma()
			{
				return charisma;
			}

		public void setCharisma(int charisma)
			{
				this.charisma = charisma;
			}

		public int getMagic()
			{
				return magic;
			}

		public void setMagic(int magic)
			{
				this.magic = magic;
			}

		public double getBlock()
			{
				return block;
			}

		public void setBlock(double block)
			{
				this.block = block;
			}

		public double getDodge()
			{
				return dodge;
			}

		public void setDodge(double dodge)
			{
				this.dodge = dodge;
			}
		
		
	}


