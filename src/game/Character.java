package game;

public class Character {
	private int health;
	private int level;
	private boolean isAlive;
	
	public Character() {
		this.health = 1000;
		this.level = 1;
		this.isAlive = true;
	}
	
	public void attack(Character target, int amount) {
		target.receiveDamage(amount);
	}
	
	public void heal(Character target, int amount) {
		target.recieveHealing(amount);
	}
	
	public void receiveDamage(int amount) {
		System.out.println("Dégâts reçus : " + amount + " PV");
		if (amount >= this.health) {
			this.health = 0;
			this.isAlive = false;
			
			System.out.println("Le personnage est décédé");
			return;
		}
		
		this.health -= amount;
	}
	
	public void recieveHealing(int amount) {
		if (!this.isAlive) {
			System.out.println("Le personnage est décédé et ne peut donc pas être soigné");
			return;
		}
		
		System.out.println("Soins reçus : " + amount + " PV");
		this.health += amount;
		
		if (this.health > 1000) {
			this.health = 1000;
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	@Override
	public String toString() {
		return "Personnage" + (this.isAlive ? " " : " (Décédé) ") + ": Niveau = " + this.level + ", Santé = " + this.health;
	}
}
