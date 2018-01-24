package state.gumball;

public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
	
	private State state;
	private int count = 0;  
	
	public GumballMachine(int numberGumballs){
		setSoldState(new SoldState(this));
		setSoldOutState(new SoldOutState(this));
		setNoQuarterState(new NoQuarterState(this));
		setHasQuarterState(new HasQuarterState(this));
		setCount(numberGumballs);  
		setWinnerState(new WinnerState(this));
		setState(noQuarterState);
	}
	
	public String toString() {
		return "Gumball machine has " + getCount() + " gumballs left!";
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense(); 
	}
	
	void setState(State state){
		this.state = state; 
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0){
			count--;
		}
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(NoQuarterState noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return this.count;
	}
	
	public void setCount(int count){
		this.count = count; 
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

}
