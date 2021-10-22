package game;

public class HealthPoints {
	private int value;
	
	public HealthPoints() {
		this.value = 1000;
	}
	
	public void decrease() {
		if (this.value == 0) {
			return;
		}
		this.value--;
	}
	
	public void increase() {
		if (this.value == 1000) {
			return;
		}
		
		this.value++;
	}
	
	public void checkIsDead(IsAlive isAlive) {
		if (this.value <= 0) {
			isAlive.kill();
		}
	}
	
	public void display() {
		System.out.print(this.value + " Points de Vie ");;
	}
}
