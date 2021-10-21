package game;

public class Main {
	public static void main(String[] args) {
		Character c1 = new Character();
		Character c2 = new Character();
		
		c1.attack(c2, new Damage());
		c1.attack(c2, new Damage());
		c1.attack(c2, new Damage());
		c1.attack(c2, new Damage());
		c1.attack(c2, new Damage());
		c1.heal(c2, new Heal());
		c1.attack(c2, new Damage());
		c1.attack(c2, new Damage());
		c1.attack(c2, new Damage());
		c1.attack(c2, new Damage());
		c1.attack(c2, new Damage());
		c1.attack(c2, new Damage());
		c1.heal(c2, new Heal());
		
		return;
	}
}
