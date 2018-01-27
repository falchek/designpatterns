package compound.mvc.duck;

public class DuckSimulator {

	
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
		//Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable goose = new GooseAdapter(new Goose()); // NOT A QUACKKKK 
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(goose);
		
		Quackable mallard1 = duckFactory.createMallardDuck();
		Quackable mallard2 = duckFactory.createMallardDuck();
		Quackable mallard3 = duckFactory.createMallardDuck();
		Quackable mallard4 = duckFactory.createMallardDuck();
		
		Flock flockOfMallards = new Flock();
		flockOfMallards.add(mallard1);
		flockOfMallards.add(mallard2);
		flockOfMallards.add(mallard3);
		flockOfMallards.add(mallard4);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("Duck Simulator with Quackologist Observer:");
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		System.out.println("Simulating Flock of Ducks:");
		simulate(flockOfDucks);
		System.out.println("Simulating Flock of Mallards");
		simulate(flockOfMallards);

		System.out.println("Total number of quacks: " + QuackCounter.getQuacks());
		
	}
	
	void simulate(Quackable duck){
		duck.quack();
	}
	
}
