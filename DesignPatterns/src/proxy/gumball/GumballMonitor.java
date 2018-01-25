package proxy.gumball;

public class GumballMonitor {

	private GumballMachineRemote machine;
	
	public GumballMonitor(GumballMachineRemote machine) {
		this.setMachine(machine);  
		
	}
	
	public void report() {
		try {
			System.out.println("Gumball Machine: " + machine.getLocation());
			System.out.println("Current inventory: " + machine.getCount() + " Gumballs remaining");
			System.out.println("Current state: " + machine.getState().toString());
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public GumballMachineRemote getMachine() {
		return machine;
	}

	public void setMachine(GumballMachineRemote machine) {
		this.machine = machine;
	}
	
	
}
