package game;

public class Damage {
	private int value;
	
	public Damage() {
		this.value = 100;
	}
	
	public void apply(HealthPoints healthPoints) {		
		while (this.value > 0) {
			healthPoints.decrease();
			this.value--;
		}
	}
}
