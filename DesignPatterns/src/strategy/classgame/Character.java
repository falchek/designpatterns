package strategy.classgame;

public abstract class Character {
	WeaponBehavior weaponBehavior;
	SpecialAbility specialAbility;
	String description; 
	
	public void display(){
		System.out.println(description);
	}
	
	public void fight(){
		weaponBehavior.useWeapon();   
	}
	
	public void useSpecialAbility(){
		specialAbility.special();  
	}
	
	public void setWeapon(WeaponBehavior wb){
		weaponBehavior = wb;  
	}
	
	public void setSpecialAbility(SpecialAbility sp){
		this.specialAbility = sp;   
	}
	
}
