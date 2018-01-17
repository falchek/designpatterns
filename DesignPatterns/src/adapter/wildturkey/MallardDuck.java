package adapter.wildturkey;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("The mallard duck quacks!");
		
	}

	@Override
	public void fly() {
		System.out.println("The mallard duck takes flight effortlessly!");
		
	}

}
