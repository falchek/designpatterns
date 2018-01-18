package factory.factorymethod.pizza;

public class PepperoniPizza extends Pizza {
	
	public String description = "sweet 'roni";

	public void prepare() {
		System.out.println("Preparing " + description + " pizza");
	}
	
	public void bake(){
		System.out.println("Baking " + description + " pizza");
	}
	
	public void cut() {
		System.out.println("Cutting " + description + " pizza");
	}
	
	public void box() {
		System.out.println("Boxing " + description + " pizza");
		
	}
}
