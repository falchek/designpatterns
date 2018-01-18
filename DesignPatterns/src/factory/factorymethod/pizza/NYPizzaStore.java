package factory.factorymethod.pizza;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese"))
			pizza = new NYStyleCheesePizza();
		//TODO:  other types
		return pizza;
	}
	
}
