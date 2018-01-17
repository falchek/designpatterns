package abstractmethod.coffee;

public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater(); 
		brew(); 
		pourInCup(); 
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	
	abstract void brew(); //these vary 
	abstract void addCondiments(); // these vary
	
	public void boilWater(){ // doesn't vary. 
		System.out.println("Bring water to a boil.");
	}
	
	public void pourInCup() { //doesn't vary.  
		System.out.println("Pouring the caffeing beverage into a cup");
	}
	
	public boolean customerWantsCondiments() {
		return true; 
	}
	
}
