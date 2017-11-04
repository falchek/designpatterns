package strategy.classgame;

public class Mage extends Character {

	public Mage() {
		this.description = "A sweet wizard with flowy robes!";
		this.weaponBehavior = new StaffBehavior(); 
		this.specialAbility = new FireballBehavior();
	}
	
}
