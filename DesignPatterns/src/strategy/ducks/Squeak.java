package strategy.ducks;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("This duck squeaaaaks!");

	}

}