package factory.factorymethod.pizza;

public class NYStyleCheesePizza extends Pizza{

	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese";
		dough = "Thing Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
	
}
