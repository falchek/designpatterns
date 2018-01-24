package command.complexremote;

public class CeilingFanHighCommand implements Command{
	CeilingFan ceilingFan; 
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		System.out.println("Old speed: " + Integer.toString(ceilingFan.getSpeed()));
		prevSpeed = ceilingFan.getSpeed(); 
		ceilingFan.high();  
		System.out.println("new speed: " + Integer.toString(ceilingFan.getSpeed()));
	}
	
	public void undo() {
		System.out.println("Old speed: " + Integer.toString(ceilingFan.getSpeed()));
		if(prevSpeed == CeilingFan.HIGH){
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.LOW){
			ceilingFan.low(); 
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();  
		}
		System.out.println("new speed: " + Integer.toString(ceilingFan.getSpeed()));
	}
	
}
