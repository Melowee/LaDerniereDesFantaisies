package game;

public class Damage {
	private int value;
	
	public Damage() {
		this.value = 100;
	}
	
	public void apply(HealthPoints healthPoints) {				
		if (this.value == 0) {
			return;
		}
		
		healthPoints.decrease();
		this.value--;
		this.apply(healthPoints);
	}
}
