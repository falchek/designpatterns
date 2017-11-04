package strategy.ducks;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("This duck is silent, and does not quack");

	}

}
