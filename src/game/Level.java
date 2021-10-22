package game;

public class Level {
	private int value;
	
	public Level() {
		this.value = 1;
	}
	
	public void display() {
		System.out.print("Niveau " + this.value + " ");
	}
}
