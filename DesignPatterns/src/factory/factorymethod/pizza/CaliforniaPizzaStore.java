package factory.factorymethod.pizza;

public class CaliforniaPizzaStore extends PizzaStore{

	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese"))
			pizza =  new CaliforniaStyleCheesePizza();
		return pizza;
	}

	
	
}
