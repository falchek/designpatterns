package factory.factorymethod.pizza;

public abstract class PizzaStore {
	
	Pizza pizza;  
	
	public Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare(); 
		pizza.bake(); 
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	//All responsibility for instantiating Pizzas has been moved into a method that acts as a factory.  
	protected abstract Pizza createPizza(String type);
	
}
