package factory.factorymethod.pizza;

public class Main {

	public static void main (String[] args){
		PizzaStore nyStore = new NYPizzaStore(); 
		PizzaStore chicagoStore = new ChicagoPizzaStore(); 
		PizzaStore californiaStore = new CaliforniaPizzaStore(); 
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordred a " + pizza.getName());
		System.out.println();
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName()); 
		System.out.println();
		pizza = californiaStore.orderPizza("cheese");
		System.out.println("Isaac ordered a " + pizza.getName()); 
	}
}
