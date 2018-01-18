package factory.factorymethod.pizza;

public class ChicagoPizzaStore extends PizzaStore{

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese"))
			pizza = new ChicagoStyleCheesePizza();
		//TODO:  other types
		return pizza;
	}
	
}
