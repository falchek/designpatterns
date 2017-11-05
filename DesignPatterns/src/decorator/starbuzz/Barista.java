package decorator.starbuzz;

public class Barista {

	public static void main (String args[]){
		System.out.println("Order 1:  Espresso, whip, double mocha");
		
		Beverage espresso = new Espresso();
		Beverage whip = new Whip(espresso);
		Beverage mocha1 = new Mocha(whip);
		Beverage mocha2 = new Mocha(mocha1);
		
		System.out.println(mocha2.getDescription()); 
		System.out.println("Price: " + mocha2.cost());
		System.out.println();
		System.out.println("Order 2:  House blend, double whip, soy");
		
		Beverage house = new HouseBlend(); 
		Beverage whip2 = new Whip(house);
		Beverage whip3 = new Whip(whip2);
		Beverage soy = new Soy(whip3);
		
		System.out.println(soy.getDescription()); 
		System.out.println("Price: " + soy.cost());
		
		soy.getDescription();
		soy.cost();  
	}
	
}
