package proxy.gumball;

import java.rmi.Naming;

public class GumballMachineTestDrive {
	
	public static void main(String[] args){
		int count = 0; 
		GumballMachine gumballMachine = null; 
		if(args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		count = Integer.parseInt(args[1]);
		
		try {
			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballMachine", gumballMachine);
		} catch(Exception e) {
			e.printStackTrace();
		}
		//GumballMonitor monitor = new GumballMonitor(gumballMachine);
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		//monitor.report();
	}
}

