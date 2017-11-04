package strategy.classgame;

public class MainGame {

	public static void main (String[] args){
		//mike comes equipped with a sword automatically
		Character mike = new Warrior(); 
		mike.display();
		mike.fight();
		System.out.println("Mike tries his special ability!");
		mike.useSpecialAbility();
		
		//adam comes with a dagger because he's a rogue.  
		Character adam = new Rogue();
		adam.display();
		adam.fight();
		System.out.println("Adam realizes daggers are stupid!");
		adam.setWeapon(new SwordBehavior()); //Dynamically set a new algorithm for fighting!
		adam.fight();  
		
		//kertne casts fireball and uses a staff. 
		Character kertne = new Mage(); 
		kertne.display();
		kertne.fight();
		System.out.println("KERTNE LOVES FIRE THO");
		kertne.useSpecialAbility();
		System.out.println("Kertne is good at everything tho, so she switches to a sword instead");
		kertne.setWeapon(new SwordBehavior());
		kertne.fight();  
	}
	
}
