package game;

public class Character {
	private Level level;
	private HealthStatus healthStatus;
	
	public Character() {
		this.level = new Level();
		this.healthStatus = new HealthStatus();
	}
	
	public void recieveDamage(Damage damage) {
		this.healthStatus.apply(damage);
	}
	
	public void recieveHeal(Heal heal) {
		this.healthStatus.apply(heal);
	}
	
	public void attack(Character target, Damage damage) {
		target.recieveDamage(damage);
	}
	
	public void heal(Character target, Heal heal) {
		target.recieveHeal(heal);
	}
	
	public void display() {
		System.out.print("Personnage : ");
		this.level.display();
		this.healthStatus.display();
	}
}
