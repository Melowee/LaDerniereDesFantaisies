package game;

public class HealthStatus {
	private HealthPoints healthPoints;
	private IsAlive isAlive;
	
	public HealthStatus() {
		this.healthPoints = new HealthPoints();
		this.isAlive = new IsAlive();
	}
	
	public void apply(Damage damage) {
		damage.apply(this.healthPoints);
		this.healthPoints.checkIsDead(this.isAlive);
	}
	
	public void apply(Heal heal) {
		this.isAlive.applyHealIfPossible(heal, this.healthPoints);
	}
	
	public void display() {
		this.isAlive.display();
		this.healthPoints.display();
	}
}
