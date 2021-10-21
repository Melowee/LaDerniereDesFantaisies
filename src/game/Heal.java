package game;

public class Heal {
	private int value;
	
	public Heal() {
		this.value = 100;
	}
	
	public void apply(HealthPoints healthPoints) {		
		while (this.value > 0) {
			healthPoints.increase();
			this.value--;
		}
	}
}
