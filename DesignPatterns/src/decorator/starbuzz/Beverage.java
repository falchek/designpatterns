package decorator.starbuzz;

public abstract class Beverage {

	public String description = "Unknown Beverage";
	private float cost;
	
	public String getDescription(){
		return this.description;
	};
	
	public abstract double cost();
	
	
}
