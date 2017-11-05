package decorator.combinations;

public class LifeSprinkler extends CombinationAttack{
	Attack attack; 
	private int damage = 2100; 
	
	public LifeSprinkler(Attack attack){
		this.attack = attack; 
	}
	
	public void getDescription() {
		System.out.println("Lute's form divides into 4 - the clones surround the enemy and slash wildly, spraying life everywhere!");
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
