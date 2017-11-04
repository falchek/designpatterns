package strategy.ducks;

public class MiniDuckSimulator{
	public static void main (String[] args) {
		System.out.println("In simulator");
		
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		
		Duck model = new ModelDuck();
		model.performFly();
		System.out.println("Model duck needs rockets.  Let's add some!");
		model.setFlyBehavior(new FlyRocketPowered()); 
		model.performFly();   
		
		
	}	

}