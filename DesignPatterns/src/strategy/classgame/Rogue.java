package strategy.classgame;

public class Rogue extends Character{
	
	public Rogue() {
		this.description = "Here stands a wily rogue!";
		this.weaponBehavior = new DaggerBehavior();  
		this.specialAbility = new NoSpecialBehavior();
	}

}
