package strategy.classgame;

public class Warrior extends Character {
	
	public Warrior() {
		this.description = "Here stands a noble warrior!";
		this.weaponBehavior = new SwordBehavior(); 
		this.specialAbility = new NoSpecialBehavior();
	}

}
