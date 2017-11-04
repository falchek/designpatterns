package strategy.ducks;

public class ModelDuck extends Duck {

	public void display() {
		System.out.println("This duck is a wooden decoy!");
	}
	
	public ModelDuck(){
		flyBehavior = new FlyNoWay(); 
		quackBehavior = new Quack(); 
	}
	

}
