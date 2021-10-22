package game;

public class Heal {
	private int value;
	
	public Heal() {
		this.value = 100;
	}
	
	public void apply(HealthPoints healthPoints) {	
		if (this.value == 0) {
			return;
		}
		healthPoints.increase();
		this.value--;
		this.apply(healthPoints);
	}
}
