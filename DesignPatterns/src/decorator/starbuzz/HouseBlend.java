package decorator.starbuzz;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description = "This is a House Blend coffee";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}

}
