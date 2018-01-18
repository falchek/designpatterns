package factory.factorymethod.pizza;

public class ClamPizza extends Pizza{
	public String description = "clam";
	
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
