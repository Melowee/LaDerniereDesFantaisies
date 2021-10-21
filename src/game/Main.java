package game;

public class Main {
	public static void main(String[] args) {
		Character character1 = new Character();
		Character character2 = new Character();
		Character character3 = new Character();
		Character character4 = new Character();
		
		character1.attack(character2, 500);
		character1.attack(character2, 500);
		character1.attack(character3, 500);
		character1.attack(character4, 300);
		character1.heal(character2, 100);
		character1.heal(character4, 5000);
		character1.attack(character4, 500);
		
		System.out.println(character1);
		System.out.println(character2);
		System.out.println(character3);
		System.out.println(character4);
		
	}
}
