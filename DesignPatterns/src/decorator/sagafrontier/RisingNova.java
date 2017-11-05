package decorator.sagafrontier;

public class RisingNova extends CombinationAttack{
	Attack attack; 
	private int damage = 1200; 
	
	public RisingNova(Attack attack){
		this.attack = attack; 
	}
	
	public void getDescription() {
		System.out.println("Lute unleashes a massive upper swing - the enemy is launched high in the air, and explodes with the force of a sun!");
	}

	@Override
	public int damage() {
		getDescription();  
		if(attack != null){
			return damage + attack.damage();
		}
		else
			return damage;
	}

}
