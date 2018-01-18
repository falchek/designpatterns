package factory.factorymethod.pizza;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza () {
		name = "Chicago Style Sauce and Cheese";
		dough = "Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
			
		toppings.add("Grated Mozzerella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices because people from Chicago have bizzarre geometric tastes.");
	}

}
