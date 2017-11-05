package decorator.starbuzz;

public class Espresso extends Beverage{

	public Espresso(){
		description = "This is an espresso";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
