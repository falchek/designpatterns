package decorator.sagafrontier;

public class SwallowSwing extends CombinationAttack{
	Attack attack; 
	private int damage = 700;
	
	public SwallowSwing(Attack attack){
		this.attack = attack; 
	}
	
	public void getDescription() {
		System.out.println("Lute's sword cuts the currents of air, attacking from long range with an energy disk!");
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
