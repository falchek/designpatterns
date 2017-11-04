package strategy.ducks;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("This duck can't fly.  Not sure what good it is");
	}

}
