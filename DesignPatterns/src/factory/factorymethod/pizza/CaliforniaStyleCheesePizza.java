package factory.factorymethod.pizza;

public class CaliforniaStyleCheesePizza extends Pizza {

	public CaliforniaStyleCheesePizza () {
		name = "California Cheese Pizza";
		dough = "Crust made from ground up Skateboards";
		sauce = "Tomato's with Sunglasses Sauce";
			
		toppings.add("Sory-Free Gluten-Free Non-Dairy Imaginary Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting into thin strips I guess?.");
	}
	
}
