package game;

public class IsAlive {
	private boolean value;
	
	public IsAlive() {
		this.value = true;
	}
	
	public void applyHealIfPossible(Heal heal, HealthPoints healthPoints) {
		if (this.value) {
			heal.apply(healthPoints);
		}
	}
	
	public void kill() {
		this.value = false;
	}
	
	public void display() {
		if (!this.value) {
			System.out.print("(Décédé) ");
		}
	}
}
