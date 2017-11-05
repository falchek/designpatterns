package decorator.sagafrontier;

public class BattleTest {
	public static void main (String[] args){
		System.out.println("Lute begins the battle against King Sei!");
		System.out.println("He decides to cheese Swallow Swing to conserve WP!!");
		Attack att1 = new SwallowSwing(null);
		Attack att2 = new SwallowSwing(att1);
		Attack att3 = new SwallowSwing(att2);
		Attack att4 = new SwallowSwing(att3);
		Attack att5 = new SwallowSwing(att4);
		
		int damage = att5.damage();  
		
		System.out.println("Lute's combination does " + Integer.toString(damage) + " damage to King Sei!!");
		System.out.println("Lute wins the battle");
		System.out.println(); 
		
		System.out.println("Lute squares off with the Earth Dragon");
		System.out.println("He needs more damageeee!");
		att1 = new LifeSprinkler(null);
		att2 = new RisingNova(att1);
		att3 = new LifeSprinkler(att2);
		att4 = new RisingNova(att3);
		att5 = new LifeSprinkler(att4);
		
		damage = att5.damage();  
		
		System.out.println("Lute's combination does " + Integer.toString(damage) + " damage to the Earth Dragon!!");
		System.out.println("Unfortunately the Earth Dragon is OP AF and stomps the shit out of Lute");
		System.out.println("Lute dies horribly");
	}
}
