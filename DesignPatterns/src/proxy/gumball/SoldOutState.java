package proxy.gumball;

public class SoldOutState implements State {
	transient GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	
	@Override
	public void insertQuarter() {
		System.out.println("Sold outttt");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sold out - no quarter to eject");

	}

	@Override
	public void turnCrank() {
		System.out.println("Sold out - don't turn the crank");

	}

	@Override
	public void dispense() {
		System.out.println("Look there can't be negative gumballs, what do you want from me?  ");

	}

}
